package com.chenyuantech.eps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.IMAExample;
import com.chenyuantech.eps.dao.IMAMapper;

@Service
public class IMAService {

	@Autowired
	private IMAMapper imaMapper;

	@Autowired
	private IMAExample imaExample;

	public long getCountByima01(String ima01) {
		imaExample.clear();
		imaExample.createCriteria().andIMA01EqualTo(ima01);
		return imaMapper.countByExample(imaExample);

	}

	public String getIsSizeByima01(String ima01) {
		imaExample.clear();
		imaExample.createCriteria().andIMA01EqualTo(ima01)
				.andTA_IMA01EqualTo("Y");
		return imaMapper.countByExample(imaExample) > 0 ? "Y" : "N";

	}

}
