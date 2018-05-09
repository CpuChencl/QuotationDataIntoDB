package com.lion.redis.dao;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class MdRedisDao extends BaseRedisDao {
	private final String KEY = "Fetures_";
	public void saveFuturesInfo(Map<String, String> map){
		
		//存数据库
		mapPutAll(KEY + map.get("ContractNo"), map);
	}
	
}
