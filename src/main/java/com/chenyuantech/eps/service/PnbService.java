package com.chenyuantech.eps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.Pnb;
import com.chenyuantech.eps.bean.PnbExample;
import com.chenyuantech.eps.dao.PnbMapper;

/**
 * 采购单变更明细记录业务
 * @author yongmao.wu
 *
 */
@Service
public class PnbService {
 

	@Autowired
	PnbMapper PnbMapper;
	 
	@Autowired
	PnbExample pnbExample;
     
	// 查询所有
	public List<Pnb> findAll() {
		return PnbMapper.selectByExample(null);

	}
	
	 

	 /**
	  * 根据采购单号和项次查询所有记录
	  * @param PMN01
	  * @param PMN02
	  * @return
	  */
	public List<Pnb> getPnb(String PMN01, Integer PMN02) {
		pnbExample.clear();
        pnbExample.createCriteria().andPnb01EqualTo(PMN01).andPnb03EqualTo(PMN02);
		pnbExample.setOrderByClause( "pnasendd");
		return PnbMapper.selectByExample(pnbExample);

	}

}
