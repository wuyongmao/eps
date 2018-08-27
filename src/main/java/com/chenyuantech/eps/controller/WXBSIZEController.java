package com.chenyuantech.eps.controller;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.eps.bean.EasyuiDataGridJson;
import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.bean.WXBSIZE;
import com.chenyuantech.eps.service.WXBSIZESService;
import com.chenyuantech.eps.service.WXBService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;

/**
 * 采购变更相关数据获取
 * 
 */
@Controller
@RequestMapping("/wxbsize")
public class WXBSIZEController {

	@Autowired
	WXBSIZESService wsService;

	@Autowired
	private WXBService wxbService;

	/**
	 * 获取外箱标SIZE
	 * 
	 * @param page
	 * @param rows
	 * @param rq
	 * @param WXB05
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getsize")
	@ResponseBody
	public EasyuiDataGridJson getrvbs(
			@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "10") Integer rows,
			HttpServletRequest rq, String WXB05) throws Exception {
		if (WXB05 == null)
			return new EasyuiDataGridJson();
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageMethod.startPage(page, rows);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<LinkedHashMap<String, Object>> list = wsService.getWXBSIZE(WXB05);

		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

	@RequestMapping(value = "/updatewxbsize")
	@ResponseBody
	public Msg updatewxbsize(WXBSIZE wxbsize, String PMMUD02, String op,
			String PMM03, HttpServletRequest request) {

		BigDecimal t;
		if (wxbsize != null) {
			if (wsService.updateWXBSIZE(wxbsize)) { 
				t = wxbService.getSumWxbSizeByWXB05(wxbsize.getWXB05());

				return Msg.success().add("sum", t); 
			}

		}

		return Msg.fail();

	}

	@RequestMapping(value = "addwxbsize")
	@ResponseBody
	public Msg addwxbsize(WXBSIZE wxbsize, String PMMUD02, String op,String ROLE,String flag,
			String PMM03, HttpServletRequest request) {

		BigDecimal t;
		if (wsService.getcountWXB05(wxbsize.getWXB05()) >= 4) {
			return Msg.fail("一箱最多只能录入4个SIZE");
		}

		try {
			if (wsService.saveWXBSIZE(wxbsize)) {

				t = wxbService.getSumWxbSizeByWXB05(wxbsize.getWXB05());

				return Msg.success().add("sum", t);

			} else {
				return Msg.fail();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block

			return Msg.fail("处理失败!" + e.getMessage());
		}

	}

	@RequestMapping("size")
	@ResponseBody
	public List<?> getSHDList(String PMN01, Integer PMN02) {
		return wsService.getSIZEList(PMN01, PMN02);
	}

	@RequestMapping(value = "delwxbsize")
	@ResponseBody
	public Msg delwxbsize(WXBSIZE wxbsize, String PMMUD02, String op,
			String PMM03, HttpServletRequest request) {

		if (wsService.deleteWXBSIZE(wxbsize)) {

			return Msg.success();

		} else {
			return Msg.fail();
		}

	}

}
