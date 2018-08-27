package com.chenyuantech.eps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.Deliverylog;
import com.chenyuantech.eps.bean.DeliverylogExample;
import com.chenyuantech.eps.dao.DeliverylogMapper;

/**
 * 送货详细记录处理
 * 
 * @author yongmao.wu
 *
 */ 
@Service
public class DeliverylogService {

	@Autowired
	private DeliverylogMapper deliverylogMapper;

	@Autowired
	DeliverylogExample deliverylogExample;

	/**
	 * 新增记录
	 * 
	 * @param users
	 * @return
	 */
	public boolean insertDeliverylog(Deliverylog deliverylog) {
		return deliverylogMapper.insertSelective(deliverylog) > 0 ? true : false;

	}

	/**
	 * 修改
	 * 
	 * @param deliverylog
	 * @return
	 */
	public boolean updateDeliverylog(Deliverylog deliverylog) {
		// dELIVERYLOGExample.createCriteria().

		return deliverylogMapper.updateByPrimaryKey(deliverylog) > 0 ? true : false;

	}

	/**
	 * 根据主键查找
	 * 
	 * @param delid
	 * @return
	 */
	public Deliverylog findByPrimaryKey(String delid) {

		return deliverylogMapper.selectByPrimaryKey(delid);

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
	public List<Deliverylog> getDeliverylog(String PMN01, Integer PMN02) {
		deliverylogExample.clear();

		deliverylogExample.createCriteria().andPmn01EqualTo(PMN01).andPmn02EqualTo(PMN02);

		return deliverylogMapper.selectByExample(deliverylogExample);

	}
	
	
	
	/**
	 * 查询全部
	 * @return
	 */
	public  List<Deliverylog>  findAll(){
		return deliverylogMapper.selectByExample(null);

	}

}
