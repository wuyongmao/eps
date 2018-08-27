package com.chenyuantech.eps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.eps.service.PMCService;

@Controller
@RequestMapping("/pmc")

public class PMCController {

	@Autowired
	PMCService  pmcService;
	
	
	@RequestMapping("/getallpmc")
	@ResponseBody
	public List<?> getallPMC(){
		
	  return	pmcService.getAllPMC();
	  
	}
}
