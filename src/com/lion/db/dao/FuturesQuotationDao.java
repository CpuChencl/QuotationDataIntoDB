package com.lion.db.dao;

import java.util.Map;

import com.lion.db.bean.FuturesQuotation;

@MyBatisDao
public interface FuturesQuotationDao extends BaseMyBatisDao<FuturesQuotation,Long> {
	
	public int insert(Map<String, String> params);
	
}
