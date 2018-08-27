package com.chenyuantech.eps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.eps.service.TableColumsService;

@Controller
public class TableColumsController {
	
	@Autowired
	TableColumsService tableColumsService;
	
	
	
	
	@RequestMapping("/table")
	@ResponseBody
	public List getTableColumns(@RequestParam(value = "tablename") String tablename ){
		 
 		return  tableColumsService.getTableColums(tablename);
		
	}
	
	

}
