package com.chenyuantech.eps.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenyuantech.eps.dao.TableColumsMapper;

@Service
public class TableColumsService {
	
	
	@Autowired
	TableColumsMapper tableColumsMapper;
	
	
	public  List<LinkedHashMap<String, Object>> getTableColums(String tablename){
		
		return tableColumsMapper.getTableColums(tablename);
		
	}
	
	
	
	
	

}
