package com.chenyuantech.eps.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.dao.RvaExtMapper;

/**
 * 送货详细记录处理
 * 
 * @author yongmao.wu
 *
 */
@Service
public class RvaService {

	@Autowired
	private RvaExtMapper rvaExtMapper;

	/**
	 * 标记邮件发送成功记录
	 * 
	 * @param RVB01
	 * @param RVB02
	 * @param FLAG
	 * @return
	 */
	public boolean updateRvb(String RVB01, int RVB02, String FLAG) {

		return rvaExtMapper.updateFlag(RVB01, RVB02, FLAG) > 0 ? true : false;

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
	public List<?> getRva(String PMN01, Integer PMN02) {

		return rvaExtMapper.selectPMCByPMN01PMN02(PMN01, PMN02);
	}

	public 	List<	LinkedHashMap<String, Object>>  getsendmail() {

		return rvaExtMapper.getsendmail();
	}

}
