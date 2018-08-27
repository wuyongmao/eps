package com.chenyuantech.eps.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.eps.bean.Colorchklog;
import com.chenyuantech.eps.bean.EasyuiDataGridJson;
import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.bean.USERS;
import com.chenyuantech.eps.service.ColorchklogService;
import com.chenyuantech.eps.service.PMNService;
import com.chenyuantech.eps.service.USERSService;
import com.chenyuantech.eps.utils.MailUtil;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;

/**
 * 批色相关处理
 * 
 */
@Controller
@RequestMapping("/colorchklog")
public class ColorchklogController {

	@Autowired
	ColorchklogService colorchklogService;

	@Autowired
	USERSService usersService;

	@Autowired
	private MailUtil mailUtil;

	@Autowired
	PMNService pmnService;

	/**
	 * 
	 * @param Colorchklog
	 * @param rq
	 * @return
	 */
	@RequestMapping("/eidtcolor")
	@ResponseBody
	public Msg saveUsers(Colorchklog Colorchklog, HttpServletRequest rq) {

		return colorchklogService.updateColorchklog(Colorchklog) ? Msg.success() : Msg.fail();

	}

	@RequestMapping("/addcolor")
	@ResponseBody
	public Map<String, String> addTypeRemark(Colorchklog Colorchklog, HttpServletRequest request, String PMMUD02,
			String PMM03) {
		Map<String, String> map = new HashMap<String, String>();
		Map<String, Object> emap = new HashMap<String, Object>();
		Map<String, Object> gmap = new HashMap<String, Object>();
		String Flag = "F";
		String email = null;

		if (colorchklogService.findByPrimaryKey(Colorchklog.getChkid()) != null) {
			colorchklogService.updateColorchklog(Colorchklog);

			map.put("status", "success");
			map.put("mng", "数据修改");
		}

		boolean b1 = pmnService.checkps(Colorchklog.getPmn01(), Colorchklog.getPmn02());
		boolean b2 = colorchklogService.getCountColorchklog(Colorchklog.getPmn01(), Colorchklog.getPmn02());

		try {
			if (Colorchklog != null && Flag.equals("F")) {
				colorchklogService.insertColorchklog(Colorchklog);
				if (Colorchklog.getQcresult().equalsIgnoreCase("Y") && b1 && (b2 == false)) {
					Flag = "T";
				}

				map.put("mng", "数据新增");

				map.put("status", "success");
			}

		} catch (Exception e) {
			// e.printStackTrace();
			Flag = "F";

			map.put("status", "fail");
		}

		if (Flag.equals("T")) {

			USERS u = usersService.getUsers(PMM03);
			List<USERS> list = usersService.getUsersList(PMMUD02); // 获取所有的供应商用户
			List<String> lists = new ArrayList<>();
			gmap.put("date", u.getCHGTIME());
			emap.put("date", u.getCHGTIME());
			gmap.put("pmn01", Colorchklog.getPmn01());
			gmap.put("pmn02", Colorchklog.getPmn02());

			if (Colorchklog.getQcresult().equals("Y")) {
				emap.put("ddstatus", "OK");
				gmap.put("ddstatus", "OK");

			} else if (Colorchklog.getQcresult().equals("N")) {
				emap.put("ddstatus", "NG");
				gmap.put("ddstatus", "NG");

			}

			if (list.size() > 0)
				for (int i = 0; i < list.size(); i++) {

					if (list.get(i).getEMAIL() != null) {
						lists.add(list.get(i).getEMAIL());
						gmap.put("username", list.get(i).getNAME());
						try {
							mailUtil.sendTempEmail(  list.get(i).getEMAIL(), "批色确认函", gmap,
									"/mailvm/批色信息确认函.vm");

							map.put("msg1", "邮件发送供应商成功");

						} catch (Exception e) {
							map.put("msg1", "邮件发送供应商失败");

						}

					}

				}

			if (u != null) {
				email = usersService.getUsers(PMM03).getEMAIL();

				if (email != null && email.length() > 0) {
					emap.put("username", u.getNAME());

				}

				try {
					if (email != null) {
						mailUtil.sendTempEmail(   email, "批色确认函", emap, "/mailvm/批色信息确认函2采购.vm");

					}
					map.put("msg", "邮件发送采购成功");
				} catch (Exception e1) {
					map.put("msg", "邮件地址发送的地址为空");

				}

			}
		} else {
			if (Colorchklog.getQcresult().equalsIgnoreCase("Y")
					&& pmnService.checkps(Colorchklog.getPmn01(), Colorchklog.getPmn02()))
				map.put("msg", "历史记录已发送过邮件");

		}
		return map;

	}

	/**
	 * 获取批色情况
	 * 
	 * @param page
	 * @param rows
	 * @param rq
	 * @param PMN01
	 * @param PMN02
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getcolor")
	@ResponseBody
	public EasyuiDataGridJson getd2(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "50") Integer rows, HttpServletRequest rq, String PMN01,
			Integer PMN02) throws Exception {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageMethod.startPage(page, rows);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Colorchklog> list = colorchklogService.getColorchklog(PMN01, PMN02);
	 

		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

}
