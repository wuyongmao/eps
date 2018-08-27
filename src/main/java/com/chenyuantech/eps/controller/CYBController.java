package com.chenyuantech.eps.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.eps.bean.EasyuiDataGridJson;
import com.chenyuantech.eps.bean.CYB;
import com.chenyuantech.eps.service.CYBService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;

/**
 * 采购变更相关数据获取
 * 
 */
@Controller
@RequestMapping("/cyb")
public class  CYBController {

	@Autowired
	CYBService cybService;
  
	  
	@RequestMapping("cyblist")
	@ResponseBody
	public List<?> getSHDList(){
		return cybService.getCYBList();
	}
	
	
	@RequestMapping("/getcyb")
	@ResponseBody
	public EasyuiDataGridJson getcyb(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "10") Integer rows, HttpServletRequest rq, String CYB01) throws Exception {
		if(CYB01 ==null)
		return new EasyuiDataGridJson();
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageMethod.startPage(page, rows);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<?> list = cybService.selectCYBRecoder(CYB01);
	 

		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

}
