package com.chenyuantech.eps.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.INSPECTION;
import com.chenyuantech.eps.bean.INSPECTIONExample;
import com.chenyuantech.eps.bean.INSPECTIONExample.Criteria;
import com.chenyuantech.eps.dao.INSPECTIONMapper;
import com.chenyuantech.eps.dao.INSPECTION_ExtMapper;

@Service
public class InspectionService {
	@Autowired
	INSPECTIONMapper IMapper;
	@Autowired
	INSPECTION_ExtMapper IMapperext;
	
	public int insertSelective(INSPECTION insp){
		return IMapper.insertSelective(insp);
	}
	
	public List<LinkedHashMap<String, Object>> getMinAndMax(){
		return IMapperext.selectMinAndMax();
	}
	
	public List<LinkedHashMap<String, Object>> getMinAndMaxExcSelf(String regid){
		return IMapperext.selectMinAndMaxExcSelf(regid);
	}
	public List<INSPECTION> getAllRegulation(INSPECTION insp,String sort){
		
		INSPECTIONExample example = new INSPECTIONExample();
		System.out.println(sort);
		Criteria criteria = example.createCriteria();
		if(insp.getDELLOTMIN() != null && insp.getDELLOTMIN() != "")
		{
			criteria.andDELLOTMINEqualTo(insp.getDELLOTMIN());
		}
		if(insp.getDELLOTMAX() != null && insp.getDELLOTMAX() != "")
		{
			criteria.andDELLOTMAXEqualTo(insp.getDELLOTMAX());
		}
		if(insp.getSAMPLES() != null && insp.getSAMPLES() != "")
		{
			criteria.andSAMPLESEqualTo(insp.getSAMPLES());
		}
		if(insp.getAC() != null && insp.getAC() != "")
		{
			criteria.andACEqualTo(insp.getAC());
		}
		if(insp.getRE() != null && insp.getRE() != "")
		{
			criteria.andREEqualTo(insp.getRE());
		}
		if(insp.getINPUTTER() != null && insp.getINPUTTER() != "")
		{
			criteria.andINPUTTEREqualTo(insp.getINPUTTER());
		}
		if(insp.getINPUTDATE() != null && insp.getINPUTDATE() != "")
		{
			criteria.andINPUTDATEEqualTo(insp.getINPUTDATE());
		}
		example.setOrderByClause(sort);
		return IMapper.selectByExample(example);
	}

	public List<Map<String,Object>> getINSPECTIONList(INSPECTION insp,String sort){
		
		return IMapperext.selectINSPECTIONList(insp, sort);
	}
	
	public int updateINSPECTION(INSPECTION insp){
		INSPECTIONExample example = new INSPECTIONExample();
		Criteria criteria = example.createCriteria();
		criteria.andREGULATIONIDEqualTo(insp.getREGULATIONID());
		return IMapper.updateByExample(insp, example);
	}
	
	public int deleteRegById(String id){
		INSPECTIONExample example = new INSPECTIONExample();
		Criteria criteria = example.createCriteria();
		criteria.andREGULATIONIDEqualTo(id);
		return IMapper.deleteByExample(example);
	}
}
