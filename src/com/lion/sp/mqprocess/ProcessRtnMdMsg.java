package com.lion.sp.mqprocess;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

import org.apache.log4j.Logger;

import com.lion.db.dao.FuturesQuotationDao;
import com.lion.redis.dao.MdRedisDao;

public class ProcessRtnMdMsg implements Callable<String>
{

	private Logger log = Logger.getLogger(ProcessRtnMdMsg.class);
	
	private FuturesQuotationDao futuresQuotationDao;
	private MdRedisDao mdRedisDao;
	
	private byte[] b;
	
	public ProcessRtnMdMsg(MdRedisDao mdRedisDao, FuturesQuotationDao futuresQuotationDao, byte[] b){
		this.futuresQuotationDao = futuresQuotationDao;
		this.mdRedisDao = mdRedisDao;
		this.b = b;
	}
	
	@Override
	public String call() throws Exception {
		try {
			parseResp(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private void parseResp(byte[] req){
		Map<String, String> map = new HashMap<String, String>();
		mdRedisDao.saveFuturesInfo(map);
		futuresQuotationDao.insert(map);
	}
	
}