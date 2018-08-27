package com.chenyuantech.eps.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.WXBSIZE;
import com.chenyuantech.eps.bean.WXBSIZEExample;
import com.chenyuantech.eps.bean.WXBSIZEKey;
import com.chenyuantech.eps.dao.WXBSIZEMapper;
import com.chenyuantech.eps.dao.WXBSIZE_ExtMapper;

/**
 * WXBSIZE service
 * @author yongmao.wu
 *
 */
@Service
public class WXBSIZESService {
 

	@Autowired
	WXBSIZEMapper WXBSIZEMapper;

	@Autowired
	WXBSIZE_ExtMapper WXBSIZE_ExtMapper;
 
	@Autowired
	WXBSIZEExample WXBSIZEExample;
     
	 
	public int getcountWXB05(String WXB05){
		
		return WXBSIZE_ExtMapper.getWXBSIZECount(WXB05);
	}
	
	
	public boolean saveWXBSIZE(WXBSIZE record) throws Exception{
		return WXBSIZEMapper.insertSelective(record)>0;
	}
	
	
	public boolean updateWXBSIZE(WXBSIZE record){
		return WXBSIZEMapper.updateByPrimaryKeySelective(record)>0;
	}
	
	public boolean deleteWXBSIZE(WXBSIZEKey record){
		return WXBSIZEMapper.deleteByPrimaryKey(record)>0;

	}
	
	 
	 /**
	  * 根据 箱号 所有记录
	  * @param WXB05
	  * @return
	  */
	 public List<LinkedHashMap<String, Object>> getWXBSIZE(String WXB05) {
		 
		return WXBSIZE_ExtMapper.getWXBSIZE(WXB05);

	}
	 /**
	  * 根据 箱号 所有记录2
	  * @param WXB05
	  * @return
	  */
	 public List<LinkedHashMap<String, Object>> getWXBSIZEByWXB05(String WXB05) {
		 
		return WXBSIZE_ExtMapper.getWXBSIZEByWXB05 (WXB05);

	}


	public List<?> getSIZEList(String PMN01, Integer PMN02) {
		return WXBSIZE_ExtMapper.getSIZEList(PMN01,PMN02);
	} 
}
