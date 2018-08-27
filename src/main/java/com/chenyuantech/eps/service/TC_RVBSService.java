package com.chenyuantech.eps.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.TC_RVBS;
import com.chenyuantech.eps.bean.TC_RVBSExample;
import com.chenyuantech.eps.dao.TC_RVBSMapper;
import com.chenyuantech.eps.dao.TC_RVBS_ExtMapper;

/**
 * 采购单变更明细记录业务
 * @author yongmao.wu
 *
 */
@Service
public class TC_RVBSService {
 

	@Autowired
	TC_RVBSMapper TC_RVBSMapper;

	@Autowired
	TC_RVBS_ExtMapper TC_RVBS_extMapper;
	@Autowired
	TC_RVBSExample tc_rvbsExample;
     
	// 查询所有
	public List<TC_RVBS> findAll() {
		return TC_RVBSMapper.selectByExample(null);

	}
	
	
	public List  < LinkedHashMap<String, Object>> getTcRVBS(String PMN01, Integer PMN02){
		return TC_RVBS_extMapper.getTcRVBS(PMN01, PMN02);
	}
	 

	 /**
	  * 根据采购单号和项次查询所有记录
	  * @param PMN01
	  * @param PMN02
	  * @return
	  */
	public List<TC_RVBS> getTC_RVBS(String PMN01, Integer PMN02) {
		tc_rvbsExample.clear();
        tc_rvbsExample.createCriteria().andTC_RVBS01EqualTo(PMN01).andTC_RVBS02EqualTo(PMN02);
		tc_rvbsExample.setOrderByClause( "tc_rvbs02");
		return TC_RVBSMapper.selectByExample(tc_rvbsExample);

	}

}
