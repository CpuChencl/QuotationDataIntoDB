package com.lion.redis.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class BaseRedisDao {

	@Autowired
	private RedisTemplate<Serializable, Serializable> redisTemplate;
	
	final protected <K extends Serializable,V extends Serializable> void set(final K key,final V value){
		redisTemplate.opsForValue().set(key, value);
	}
	
	@SuppressWarnings("unchecked")
	final protected <K extends Serializable,V extends Serializable> V get(final K key){
		return (V) redisTemplate.opsForValue().get(key);
	}
	
	final protected <K extends Serializable,V extends Serializable> void setList(final K key, V...ks){
		if (ks != null) {
			redisTemplate.opsForList().rightPushAll(key, ks);
		}
	}
	
	@SuppressWarnings("unchecked")
	final protected <K extends Serializable,V extends Serializable> V getList(final K key){
		return (V) redisTemplate.opsForList().range(key, 0, -1);
	}
	
	final protected <K extends Serializable,V extends Serializable> void setSet(final K key, V...ks){
		if (ks != null) {
			redisTemplate.opsForSet().add(key, ks);
		}
	}
	final protected <K extends Serializable> void getSet(final K key){
		redisTemplate.opsForSet().members(key);
	}
	
//	final protected <K extends Serializable,V extends Serializable> void setSortSet(final K key, V...ks){
//		if (ks != null) {
//			redisTemplate.opsForZSet().
//		}
//	}
//	final protected <K extends Serializable> void getSortSet(final K key){
//		redisTemplate.opsForZSet().
//	}
	
	final protected <K extends Serializable, F, V> void mapPut(final K key, final F field, final V value){
		if (key != null && field != null && value != null) {
			redisTemplate.opsForHash().put(key, field, value);
		}
	}
	final protected <K extends Serializable> void mapPutAll(final K key, Map<String, String> data){
		if (key != null && data != null) {
			Map<String, String> map = new HashMap<String, String>();
			for (Entry<String, String> en : data.entrySet()) {
				if (en.getKey() != null && en.getValue() != null) {
					map.put(en.getKey(), en.getValue());
				}
			}
			redisTemplate.opsForHash().putAll(key, map);
			data.put("redisKey", key.toString());
		}
	}
	@SuppressWarnings("unchecked")
	final protected String mapGet(final String key,final String field){
		return (String) redisTemplate.opsForHash().get(key, field);
	}
	@SuppressWarnings("unchecked")
	final protected <K extends Serializable, F extends Collection<Object>, V extends List<Object>> V mapMultiGet(final K key,final F field){
		return (V) redisTemplate.opsForHash().multiGet(key, field);
	}
	
}
