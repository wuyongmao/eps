package com.chenyuantech.eps.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chenyuantech.eps.bean.SHD;
import com.chenyuantech.eps.dao.SHDMapper;
import com.chenyuantech.eps.dao.SHD_ExtMapper;
import com.chenyuantech.eps.dao.WXB_ExtMapper;


@Transactional(rollbackFor=Exception.class) 
@Service
public class SHDService {

	@Autowired
	private SHDMapper shdMapper;
	@Autowired
	private SHD_ExtMapper shd_ExtMapper;
	
	@Autowired
	private WXB_ExtMapper wxb_ExtMapper;
	
	
	public SHD getshdbyshd01(String SHD01){
		return shdMapper.selectByPrimaryKey(SHD01);
	}
	
	public List<LinkedHashMap<String, Object>> getSHDList(String SHD01,String SHD02,String PMMUD02,String ROLE) {
		
		return shd_ExtMapper.selectSHDBySHD01SHD02(SHD01, SHD02,PMMUD02,ROLE);
		
	}
	
	public boolean updateSHD2(String SHD01){
		return shd_ExtMapper.updateSHD(SHD01)>0;
	}
	
	public boolean insertSHD(SHD shd){
		
		
		
		return shdMapper.insertSelective(shd)>0;
	}
	
	public boolean updateSHD(SHD shd){
		return shdMapper.updateByPrimaryKeySelective(shd)>0;
	}
	
	public boolean deleteSHD(String SHD01) throws Exception{
		boolean b=false;
		boolean s=false;
		 
		if(SHD01 !=null){ 
			b=wxb_ExtMapper.updateWxb(SHD01 )>0;
			
			s=shd_ExtMapper.updateSHD(SHD01)>0;
			 
		 
		}
		return b&&s;
		
	}
	
	
	
}
