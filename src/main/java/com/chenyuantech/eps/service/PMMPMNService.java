package com.chenyuantech.eps.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.PMM;
import com.chenyuantech.eps.bean.PMMExample;
import com.chenyuantech.eps.bean.PMN;
import com.chenyuantech.eps.dao.PMMMapper;
import com.chenyuantech.eps.dao.PMM_PMNExtMapper;

@Service
public class PMMPMNService {

	
	@Autowired
	PMM_PMNExtMapper  pMM_PMNExtMapper;
	
	@Autowired
	PMMMapper pmmMapper;
	
	 
	@Autowired
	PMMExample example;
	
	public List<Map<String, Object>>  getPMMPMN(PMM pmm,PMN pmn,String sort,String ISAUTOJQ) throws Exception{
		
 
 		
		 return pMM_PMNExtMapper.findPMMPMNLinkList(pmm, pmn, sort,ISAUTOJQ);
		
		 
		 
	}
	
	
	public List<Map<String, Object>> getPMNListbyPMMUD02(String PMMUD02){
		return pMM_PMNExtMapper.getPMNListbyPMMUD02(PMMUD02);
	}
	
	public List<Map<String, Object>> getPMNPMN02ByPMN01(String PMMUD02){
		return pMM_PMNExtMapper.getPMNPMN02ByPMN01(PMMUD02);
	}
	 
	
	
	
}
