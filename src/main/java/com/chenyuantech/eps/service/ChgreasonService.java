package com.chenyuantech.eps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.bean.Chgreason;
import com.chenyuantech.eps.dao.ChgreasonExtMapper;
import com.chenyuantech.eps.dao.ChgreasonMapper;

/**
 * 变更理由码
 * @author yongmao.wu
 *
 */
@Service
public class ChgreasonService {

	@Autowired
	ChgreasonExtMapper chgreasonExtMapper;
     
	
	
	@Autowired
	ChgreasonMapper chgreasonMapper;
 

	// 新增
	public boolean insertchgreason(Chgreason record) {
		return chgreasonMapper.insertSelective(record) >0   ? true : false;

	}

	// 根据主键修改
	public boolean updatechgreason(Chgreason record) {
		return chgreasonMapper.updateByPrimaryKeySelective(record)  >0 ? true : false;
	}

	// 删除
	public boolean deletechgreason(String chgid) {
		return chgreasonMapper.deleteByPrimaryKey(chgid)  >0 ? true : false;
	}

	// 查询所有
	public List<Chgreason> findAll() {
		return chgreasonMapper.selectByExample(null);

	}
	
	
	//根据主键查询
	public  Chgreason findByPrimaryKey(String chgid){
		return chgreasonMapper.selectByPrimaryKey(chgid);
		
	}
	

	// 根据条件查询
	public List<Chgreason> findByParam(Chgreason chgreason,String sort,String order ) {

		return chgreasonExtMapper.findChgreasonByParam(chgreason, sort, order );

	}

}
