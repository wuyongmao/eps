package com.chenyuantech.eps.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.eps.bean.Deliverylog;
import com.chenyuantech.eps.bean.EasyuiDataGridJson;
import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.service.DeliverylogService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;

/**
  * 
  * 
 */
@Controller
@RequestMapping("/deliverylog")
public class DeliverylogController {

	@Autowired
	DeliverylogService deliverylogService;

	
	 
	
	/**
	 * 
	 * @param deliverylog
	 * @param rq
	 * @return
	 */
	@RequestMapping("/eidtdeli")
	@ResponseBody
	public Msg saveUsers(Deliverylog deliverylog, HttpServletRequest rq) {

		return deliverylogService.updateDeliverylog(deliverylog) ? Msg.success() : Msg.fail();

	}

	@RequestMapping("/adddeli")
	@ResponseBody
	public Map<String, String> addTypeRemark(Deliverylog deliverylog, HttpServletRequest request) {
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(deliverylog.getDelid() + "========");
		System.out.println(deliverylogService.findByPrimaryKey(deliverylog.getDelid())
				+ "==deliverylogService.findByPrimaryKey(deliverylog.getDelid())======");

		if (deliverylogService.findByPrimaryKey(deliverylog.getDelid()) != null) {
			deliverylogService.updateDeliverylog(deliverylog);
 
			map.put("status", "success");
			return map;
		}

		System.out.println(deliverylog + "deliverylog=====");
		try {
			if (deliverylog != null) {
				deliverylogService.insertDeliverylog(deliverylog);

 
			}
			map.put("status", "success");
		} catch (Exception e) {
			e.printStackTrace();
			map.put("status", "fail");
		}
		return map;
	}

	/**
	 * 获取送货明细
	 * @param page
	 * @param rows
	 * @param rq
	 * @param PMN01
	 * @param PMN02
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getdeli")
	@ResponseBody
	public EasyuiDataGridJson getd2(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "10") Integer rows, HttpServletRequest rq, String PMN01,
			Integer PMN02) throws Exception {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageMethod.startPage(page, rows);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Deliverylog> list = deliverylogService.getDeliverylog(PMN01, PMN02);
 
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

}
