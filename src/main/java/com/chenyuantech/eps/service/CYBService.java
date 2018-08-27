package com.chenyuantech.eps.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.CYB;
import com.chenyuantech.eps.bean.CYBExample;
import com.chenyuantech.eps.dao.CYBMapper;
import com.chenyuantech.eps.dao.CYB_ExtMapper;

@Service
public class CYBService {

	@Autowired
	private CYBMapper cybMapper;
	@Autowired
	private CYB_ExtMapper cyb_ExtMapper;
	@Autowired
	private CYBExample cybExample;

	/**
	 * 新增
	 * 
	 * @param record
	 */

	public boolean insertCYB(CYB record) {
		return cybMapper.insertSelective(record) > 0 ? true : false;

	}

	public List<LinkedHashMap<String, Object>> selectCYBRecoder(String CYB01) {
		return cyb_ExtMapper.selectCYBRecoder(CYB01);
	}

	/**
	 * 更新
	 */
	public boolean updteCYB(CYB record) {
		cybExample.clear();
		cybExample.createCriteria().andCYB01EqualTo(record.getCYB01()).andCYB02EqualTo(record.getCYB02());

		return cybMapper.updateByExampleSelective(record, cybExample) > 0 ? true : false;

	}

	public long getCYB02ByCYB01(String CYB01) {
		cybExample.clear();
		cybExample.createCriteria().andCYB01EqualTo(CYB01);
		return cybMapper.countByExample(cybExample) + 1;
	}

	public boolean existsCYB(CYB record) {
		cybExample.clear();
		cybExample.createCriteria().andCYB01EqualTo(record.getCYB01()).andCYB02EqualTo(record.getCYB02());
		return cybMapper.selectByPrimaryKey(record) != null;
	}

	/**
	 * 根据 采购单号 项次删除记录
	 * 
	 * @param CYB01
	 * @param CYB02
	 * @return
	 */
	public boolean deleteCYB(String CYB01, int CYB02) {
		cybExample.clear();
		cybExample.createCriteria().andCYB01EqualTo(CYB01).andCYB02EqualTo(CYB02);

		return cybMapper.deleteByExample(cybExample) > 0 ? true : false;
	}
	
	public List<LinkedHashMap<String, Object>> getCYBList( ) {

		return cyb_ExtMapper.getCYBList();

	}

}
