package com.lion.mq;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.lion.db.dao.FuturesQuotationDao;
import com.lion.flatbuffers.FbEsTapAPIQuoteWhole;
import com.lion.frame.logger.Log4jManager;
import com.lion.frame.mq.IMqCallInterface;
import com.lion.frame.mq.MqConfig;
import com.lion.frame.mq.ZmqRcver;
import com.lion.redis.dao.MdRedisDao;
import com.lion.sp.mqprocess.MdData;
import com.lion.sp.mqprocess.ProcessRtnMdMsg;

@Lazy(false)
@Component
public class MdMqRcver {
	private static final Logger log = Log4jManager.get();
	@Value("${mdRcvMq.addr}")
	private String addr;
	
	@Value("${mdRcvMq.port}")
	private int port;
	
	@Value("${mdRcvMq.model}")
	private String model;
	
	@Value("${mdRcvMq.type}")
	private String type;
	
	@Autowired
	private FuturesQuotationDao futuresQuotationDao;
	
	private ZmqRcver mdRcver;
	
	private ExecutorService executor;
	
	private Thread thread;
	
	private Map<String, MdData> mdMap = new HashMap<String, MdData>();
	
	@Autowired
	private MdRedisDao mdRedisDao;
	
	@PostConstruct
	public void init(){
		MqConfig mdRcverConfig = new MqConfig();
		mdRcverConfig.setAddr(addr);
		mdRcverConfig.setPort(port);
		mdRcverConfig.setModel(model);
		mdRcverConfig.setMqType(type);
		executor = Executors.newFixedThreadPool(8);
		mdRcver = new ZmqRcver(mdRcverConfig, new IMqCallInterface() {
			@Override
			public void onMessage(byte[] req) {
				ByteBuffer bb = ByteBuffer.wrap(req);
				FbEsTapAPIQuoteWhole marketData = FbEsTapAPIQuoteWhole.getRootAsFbEsTapAPIQuoteWhole(bb);
				ProcessRtnMdMsg process = new ProcessRtnMdMsg(mdRedisDao,futuresQuotationDao, req);
			    executor.submit(process);
			    MdData mdData = mdMap.get(marketData.Contract().Commodity().CommodityNo() + marketData.Contract().ContractNo1());
			    long time = System.currentTimeMillis();
			    String contructNo = marketData.Contract().Commodity().CommodityNo() + marketData.Contract().ContractNo1();
			    if (mdData == null) {
			    	mdData = new MdData(marketData, time);
			    	mdMap.put(contructNo, mdData);
				} else {
					mdData.setData(marketData);
					mdData.setTime(time);
					if (mdData.getFlushed()) {
						mdData.setFlushed(false);
					}
				}
			}
		});
	}
	
	
}