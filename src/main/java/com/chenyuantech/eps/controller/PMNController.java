package com.chenyuantech.eps.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.bean.PMN;
import com.chenyuantech.eps.service.PMNService;

@RequestMapping("/pmn")
@Controller
public class PMNController {
	@Autowired
	PMNService pmnService;
	
	
	@RequestMapping("/changeshdz")
	@ResponseBody
	public Msg   changeSHDZ(PMN pmn,HttpServletRequest rq){
 		if(pmn !=null){
		  
		  if( pmnService.updatePMN(pmn)){
			  return Msg.success().add("msg","修改成功");
			  
		  }else{
			  return Msg.success().add("msg","修改失败");

		  }
			
		}
		
		
		return Msg.fail().add("msg","修改失败");
	}

}
