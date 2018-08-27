package com.chenyuantech.eps.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.bean.USERS;
import com.chenyuantech.eps.bean.USERSExample;
import com.chenyuantech.eps.bean.USERSExample.Criteria;
import com.chenyuantech.eps.dao.USERSExtMapper;
import com.chenyuantech.eps.dao.USERSMapper;

/**
 * 用户
 * 
 * @author yongmao.wu
 *
 */
@Service
public class USERSService {

	@Autowired
	USERSMapper uSERSMapper;

	@Autowired
	USERSExtMapper uSERSExtMapper;
	@Autowired
	USERSExample uSERSExample;

	
	
	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	public List<USERS> getAllUSERS() {
		return uSERSMapper.selectByExample(null);
	}

	/**
	 * 根据用户参数查询用户
	 * 
	 * @param users
	 * @return
	 * @throws Exception
	 */
	public List<?> getUSERSByObject(USERS users) throws Exception {

		return uSERSExtMapper.findUsersByParam(users);

	}

	/**
	 * 新增用户
	 * 
	 * @param users
	 * @return
	 */
	public boolean addUSERS(USERS users) {
		return uSERSMapper.insertSelective(users) > 0 ? true : false;

	}

	/**
	 * 修改用户信息
	 * 
	 * @param users
	 * @return
	 */
	public boolean updateUSER(USERS users) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");// 设置日期格式
		users.setCHGTIME(df.format(new Date()));
		return uSERSMapper.updateByPrimaryKeySelective(users) > 0 ? true : false;

	}

	/**
	 * 判断账号 密码
	 * 
	 * @param users
	 * @return
	 */
	public boolean getUSERSByExample(USERS users) {
		uSERSExample.clear();
		uSERSExample.createCriteria().andACCEqualTo(users.getACC()).andPWDEqualTo(users.getPWD());

		return uSERSMapper.selectByExample(uSERSExample).size() > 0 ? true : false;

	}

	public USERS getUSERSByACCPWD(USERS users) {
		uSERSExample.clear();
		uSERSExample.createCriteria().andACCEqualTo(users.getACC()).andPWDEqualTo(users.getPWD());

		return uSERSMapper.selectByExample(uSERSExample).size() > 0 ? uSERSMapper.selectByExample(uSERSExample).get(0)
				: null;
	}

	/**
	 * 根据主键查询USERS
	 * 
	 * @param ACCID
	 * @return
	 */
	public USERS getUSERSByKey(String ACCID) {

		return uSERSMapper.selectByPrimaryKey(ACCID);

	}

	/**
	 * 检验用户名是否可用
	 * 
	 * @param empName
	 * @return true：代表当前姓名可用 fasle：不可用
	 */
	public boolean checkUSERS(String ACC) {
		// TODO Auto-generated method stub
		uSERSExample.clear();
		uSERSExample.createCriteria().andACCEqualTo(ACC);
		long count = uSERSMapper.countByExample(uSERSExample);
		return count > 0 ? true : false;
	}

	/**
	 * 根据账户查询USERS
	 * 
	 * @param ACC
	 * @return
	 */
	public USERS getUsers(String ACC) {
		uSERSExample.clear();
		uSERSExample.createCriteria().andACCEqualTo(ACC);

		return uSERSMapper.selectByExample(uSERSExample).size() > 0 ? uSERSMapper.selectByExample(uSERSExample).get(0)
				: null;
	}

	/**
	 * 
	 * yf cg
	 * 
	 * @param accid1
	 *            登录用户
	 * @param accid2
	 *            发起人
	 * @return
	 */
	public Map<String, Object> checkRole1(String accid1, String accid2) {
		USERS u1 = uSERSMapper.selectByPrimaryKey(accid1);
		USERS u2 = uSERSMapper.selectByPrimaryKey(accid2);
		Map<String, Object> map = new HashMap<String, Object>();
		if (u1 == null || u2 == null) {

			map.put("msg", "用户为空");
			// System.out.println( "===Msg.fail().add(用户为空)======");
			map.put("status", 200);
			return map;

		}
		
		if(u2.getROLE() !=null){
	   
		if ( u2.getROLE().equalsIgnoreCase("GYS") ==false) {

			map.put("msg", "不是供应商发起的");
			  System.out.println( "===Msg.fail().add(不是供应商发起的)======");
			map.put("status", 200);

			return map;

		}
		
		
		if (u1.getROLE().equalsIgnoreCase(u2.getROLE())  ) {

			map.put("msg", "用户角色相同");
			// System.out.println( "===Msg.fail().add(角色相同)======");
			map.put("status", 200);

			return map;

		}}else{
			
			map.put("msg", "不是供应商发起的变更");
			// System.out.println( "===Msg.fail().add(角色相同)======");
			map.put("status", 200);

			return map;
			
			
		}
		 
		map.put("status", 100);

		return map;

	}

	/**
	 * 
	 * yf cg
	 * 
	 * @param accid1
	 *            登录用户
	 * @param accid2
	 *            发起人
	 * @return
	 */
	public Map<String, Object> checkRole2(String accid1, String accid2) {
		USERS u1 = uSERSMapper.selectByPrimaryKey(accid1);
		USERS u2 = uSERSMapper.selectByPrimaryKey(accid2);
		Map<String, Object> map = new HashMap<String, Object>();
		if (u1 == null || u2 == null) {

			map.put("msg", "用户为空");
//			System.out.println("===Msg.fail().add(用户为空)======");
			map.put("status", 200);
			return map;
		}

		if(u2.getROLE() !=null)  
		{
		if (u1.getROLE().equalsIgnoreCase(u2.getROLE())) {

			map.put("msg", "用户角色相同");
			// System.out.println( "===Msg.fail().add(角色相同)======");
			map.put("status", 200);

			return map;

		}}else{
			
		}
		
		map.put("status", 100);

		return map;

	}

	/**
	 * 
	 * @param PMMUD02
	 * @return
	 */
	public List<USERS> getUsersList(String PMMUD02) {
		uSERSExample.clear();
		uSERSExample.createCriteria().andPMMUD02EqualTo(PMMUD02);
		return uSERSMapper.selectByExample(uSERSExample);
	}
	
	/**
	 * 查询供应商代号为PMMUD02的所有用户的邮箱
	 * @param PMMUD02
	 * @return
	 */
	public List<String> getPMCEmaillist(String PMMUD02){
		 
	  return uSERSExtMapper.getPMCEmaillist(PMMUD02) ;
	}
	
	
	public String getPMC03(String PMMUD02){
		  return uSERSExtMapper.getPMC03(PMMUD02);

	}
	
	
	
 

}
