package com.chenyuantech.eps.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.WXBSIZETMP;
import com.chenyuantech.eps.bean.WXBSIZETMPExample;
import com.chenyuantech.eps.dao.WXBSIZETMPMapper;
import com.chenyuantech.eps.dao.WXBSIZETMP_ExtMapper;

/**
 * WXBSIZETMP service
 * 
 * @author yongmao.wu
 *
 */
@Service
public class WXBSIZETMPService {

	@Autowired
	private WXBSIZETMP_ExtMapper wxbsizetmp_ExtMapper;

	@Autowired
	private WXBSIZETMPMapper wxbsizetmpMapper;

	@Autowired
	private WXBSIZETMPExample wxbsizetmpExample;

	public boolean updateWXBTMPSIZE2(WXBSIZETMP wxbsizetmp) {
		return wxbsizetmp_ExtMapper.updateWXBTMPSIZE2(wxbsizetmp.getWXB05T(), wxbsizetmp.getWXB05())>0;
	} 
	
	public boolean insertWXBSIZETMP(WXBSIZETMP wxbsizetmp) {
		return wxbsizetmpMapper.insertSelective(wxbsizetmp) > 0;
	}

	public boolean deleteWXBSIZETMP(String WXB05T) {
		return wxbsizetmpMapper.deleteByPrimaryKey(WXB05T) > 0;
	}

	public boolean updateWXBSIZETMP(WXBSIZETMP wxbsizetmp) {
		return wxbsizetmpMapper.updateByPrimaryKeySelective(wxbsizetmp) > 0;
	}

	public List<LinkedHashMap<String, Object>> getWXBSIZETMP(String WXB05T) {
		return wxbsizetmp_ExtMapper.getWXBSIZETMP(WXB05T);
	}

	public int getcountWXB05(String WXB05T) {
		return wxbsizetmp_ExtMapper.getcountWXB05(WXB05T);
	}

	public boolean deleteWXBSIZETMPByWXB05T03(WXBSIZETMP wxbsizetmp) {
		wxbsizetmpExample.clear();
		wxbsizetmpExample.createCriteria()
				.andWXB05TEqualTo(wxbsizetmp.getWXB05T())
				.andTC_RVBS03EqualTo(wxbsizetmp.getTC_RVBS03());

		return wxbsizetmpMapper.deleteByExample(wxbsizetmpExample)>0;
	}

}
