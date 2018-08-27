package com.chenyuantech.eps.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.apache.commons.collections.map.LinkedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.Ddlog;
import com.chenyuantech.eps.bean.DdlogExample;
import com.chenyuantech.eps.dao.DdlogExtMapper;
import com.chenyuantech.eps.dao.DdlogMapper;

/**
 * 交期变更业务
 * @author yongmao.wu
 *
 */
@Service
public class DdlogService {
 

	@Autowired
	DdlogMapper DdlogMapper;
 
	@Autowired
	DdlogExample ddlogExample;
	
	@Autowired
	DdlogExtMapper ddlogExtMapper;
	
	// 新增
	public boolean insertDdlog(Ddlog record) {
		return DdlogMapper.insertSelective(record) >0   ? true : false;

	}
	
	
	/**
	 * 两天之内供应商没有回复交期
	 * @return
	 */
	public List<LinkedHashMap<String, Object>>  getddlogsendmail(){
		 
	 return	ddlogExtMapper.getddlogsendmail();
		
	}
	

	// 根据主键修改
	public boolean updateDdlog(Ddlog record) {
		return DdlogMapper.updateByPrimaryKeySelective(record)  >0 ? true : false;
	}

	// 删除
	public boolean deleteDdlog(String chgid) {
		return DdlogMapper.deleteByPrimaryKey(chgid)  >0 ? true : false;
	}

	// 查询所有
	public List<Ddlog> findAll() {
		return DdlogMapper.selectByExample(null);

	}
	
	
	//根据主键查询
	public  Ddlog findByPrimaryKey(String chgid){
		return DdlogMapper.selectByPrimaryKey(chgid);
		
	}
	

	/**
	 * 根据采购单号和项次查询所有记录
	 * 
	 * @param PMN01
	 *            采购单号
	 * @param PMN02
	 *            项次
	 * @return
	 */
	public List<Ddlog> getDdlog(String PMN01, Integer PMN02) {
		ddlogExample.clear();

		ddlogExample.createCriteria().andPmn01EqualTo(PMN01).andPmn02EqualTo(PMN02);

		return DdlogMapper.selectByExample(ddlogExample);

	}

	
	/**
	 * 根据采购单号和项次查询所有记录
	 * 
	 * @param PMN01
	 *            采购单号
	 * @param PMN02
	 *            项次
	 * @return
	 */
	public List<?> getDdlog2(String PMN01, Integer PMN02) {
		 
		return ddlogExtMapper.selectPMCByPMN01PMN02(PMN01, PMN02);

	}
	
	public int updateReplydd(String REPLYDD,String DDID){
		
		return ddlogExtMapper.updateReplydd(REPLYDD, DDID);

	}

	
	
	
}
