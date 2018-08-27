package com.chenyuantech.eps.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.PMN;
import com.chenyuantech.eps.bean.PMNExample;
import com.chenyuantech.eps.dao.PMNMapper;

@Service
public class PMNService {

	@Autowired
	PMNMapper pmnMapper;

	@Autowired
	PMNExample example;

	public boolean updatePMN(PMN pmn) {
		example.clear();
		example.createCriteria().andPMN01EqualTo(pmn.getPMN01()).andPMN02EqualTo(pmn.getPMN02());

		return pmnMapper.updateByExampleSelective(pmn, example) > 0 ? true : false;

	}
	
	
	public List<PMN> getpPmn(String pmn01,int pmn02){
		example.clear();
		example.createCriteria().andPMN01EqualTo(pmn01 ).andPMN02EqualTo(pmn02);
        
		return pmnMapper.selectByExample(example);

	}
	
	
	public boolean checkps( PMN pmn){
		example.clear();
		example.createCriteria().andPMN01EqualTo(pmn.getPMN01()).andPMN02EqualTo(pmn.getPMN02())
		.andPSFLAGEqualTo("Y");
		
		if (pmnMapper.selectByExample(example) == null){
			return false;
		}
		
		  return 	 	pmnMapper.selectByExample(example).size()>0 ;
  
	 	
	}
	
	public boolean checkps( String PMN01, Integer PMN02){
		example.clear();
		example.createCriteria().andPMN01EqualTo( PMN01).andPMN02EqualTo(PMN02)
		.andPSFLAGEqualTo("Y");
		
		if (pmnMapper.selectByExample(example) == null){
			return false;
		}
		
		  return 	 	pmnMapper.selectByExample(example).size()>0 ;
  
	 	
	}

}
