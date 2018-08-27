package com.chenyuantech.eps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.PMC;
import com.chenyuantech.eps.bean.PMCExample;
import com.chenyuantech.eps.dao.PMCMapper;


@Service
public class PMCService {
	
	@Autowired
	PMCMapper pMCMapper;
	
	public List<PMC> getAllPMC() {
		return pMCMapper.selectByExample(null);
	}

	
	public List<PMC>  getByPMC(String pmc01 ){
		PMCExample example=new PMCExample();
		
		if(pmc01==null)
			return null;
		example.createCriteria().andPMC01EqualTo(pmc01);
		
		
		return   pMCMapper.selectByExample(example);
		
	}
	
	
	
	
}
