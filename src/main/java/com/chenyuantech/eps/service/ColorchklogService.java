package com.chenyuantech.eps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.Colorchklog;
import com.chenyuantech.eps.bean.ColorchklogExample;
import com.chenyuantech.eps.dao.ColorchklogMapper;

/**
 * 批色记录业务
 * @author yongmao.wu
 *
 */
@Service
public class ColorchklogService {
 

	@Autowired
	ColorchklogMapper ColorchklogMapper;
 
	@Autowired
	ColorchklogExample ColorchklogExample;
	
 

	// 新增
	public boolean insertColorchklog(Colorchklog record) {
		return ColorchklogMapper.insertSelective(record) >0   ? true : false;

	}

	// 根据主键修改
	public boolean updateColorchklog(Colorchklog record) {
		return ColorchklogMapper.updateByPrimaryKeySelective(record)  >0 ? true : false;
	}

	// 删除
	public boolean deleteColorchklog(String chgid) {
		return ColorchklogMapper.deleteByPrimaryKey(chgid)  >0 ? true : false;
	}

	// 查询所有
	public List<Colorchklog> findAll() {
		return ColorchklogMapper.selectByExample(null);

	}
	
	
	//根据主键查询
	public  Colorchklog findByPrimaryKey(String chgid){
		return ColorchklogMapper.selectByPrimaryKey(chgid);
		
	}
	
	 
	/**
	 * 查询是否存在已一条批色OK记录
	 * @param PMN01
	 * @param PMN02
	 * @return
	 */
	public boolean getCountColorchklog(String PMN01, Integer PMN02){
		ColorchklogExample.clear();
		ColorchklogExample.createCriteria().andPmn01EqualTo(PMN01).andPmn02EqualTo(PMN02).andQcresultEqualTo("Y");
		if( ColorchklogMapper.selectByExample(ColorchklogExample) ==null){
			return false;
		}else{
		  return	ColorchklogMapper.selectByExample(ColorchklogExample).size()>0 ? true:false;
			
		}
		
		    
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
	public List<Colorchklog> getColorchklog(String PMN01, Integer PMN02) {
		ColorchklogExample.clear();

		ColorchklogExample.createCriteria().andPmn01EqualTo(PMN01).andPmn02EqualTo(PMN02);
		ColorchklogExample.setOrderByClause( "chktime");
		return ColorchklogMapper.selectByExample(ColorchklogExample);

	}

}
