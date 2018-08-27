package com.chenyuantech.eps.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.eps.bean.Ddlog;
import com.chenyuantech.eps.bean.EasyuiDataGridJson;
import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.service.DdlogService;
import com.chenyuantech.eps.service.USERSService;
import com.chenyuantech.eps.utils.MailUtil;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;

/**
  * 
  * 
 */
@Controller
@RequestMapping("/ddlog")
public class DdlogController {

	@Autowired
	DdlogService ddlogService;

	@Autowired
	MailUtil mailUtil;

	@Autowired
	USERSService usersService;

	boolean tocg = false;
	boolean togys = false;
	LinkedHashMap<String, Object> linkedHashMap;

	private String mail = "";

	/**
	 * 
	 * @param Ddlog
	 * @param rq
	 * @return
	 */
	@RequestMapping("/eidtddlog")
	@ResponseBody
	public Msg saveUsers(Ddlog Ddlog, HttpServletRequest rq) {

		return ddlogService.updateDdlog(Ddlog) ? Msg.success() : Msg.fail();

	}

	@RequestMapping("/addddlog")
	@ResponseBody
	public Map<String, String> addddlog(Ddlog ddlog, String PMMUD02, String currentdate, String PMM03,
			HttpServletRequest request) {
		Map<String, String> map = new HashMap<String, String>();
		linkedHashMap = new LinkedHashMap<>();
		boolean f = false;

		List<String> jqemaillist;
		String mail = "";
		////// //System.out.println("------------>" + PMMUD02);
		linkedHashMap.put("PMN01", ddlog.getPmn01());
		linkedHashMap.put("PMN02", ddlog.getPmn02());
		linkedHashMap.put("NOW", currentdate);
		if (ddlogService.findByPrimaryKey(ddlog.getDdid()) != null) {

			ddlogService.updateDdlog(ddlog);

			map.put("status", "success");
			return map;
		}

		try {
			if (ddlog != null) {

				ddlogService.insertDdlog(ddlog);

				if (ddlog.getReplydd() == null) // 采购发起
				{
					togys = true;

				}

				if (ddlog.getRequirementdd() == null) // 供应商发起
				{

					tocg = true;
				}

			}
			map.put("status", "success");
		} catch (Exception e) {
			e.printStackTrace();
			map.put("status", "fail");
		}
		if (tocg) {
			// System.out.println("----to-->采购");
			linkedHashMap.put("PMC03", usersService.getUSERSByKey(ddlog.getAccid()).getNAME());

			usersService.getUSERSByKey(ddlog.getAccid()).getEMAIL(); // ----发送邮件给采购
																		// ---判断邮件地址不为null
			if (PMM03 != null)
				mail = usersService.getUsers(PMM03).getEMAIL();

			if (mail != null) { 

					f = mailUtil.sendTempEmail(   mail, "交期信息确认函", linkedHashMap,
							"/mailvm/交期信息确认函2采购.vm");
			 

			}

		}
		if (togys) {
			// System.out.println("----to-->供应商");
			linkedHashMap.put("PMC03", usersService.getPMC03(PMMUD02));
			// System.out.println("linkedHashMap------->" + linkedHashMap);
			jqemaillist = new ArrayList<>();
			jqemaillist = usersService.getPMCEmaillist(PMMUD02);
			// System.out.println("jqemaillist------->" + jqemaillist);

			if (jqemaillist != null)
				if (jqemaillist.size() > 0)

					for (String m : jqemaillist) { 
                          mailUtil.sendTempEmail(   m, "交期信息确认函", linkedHashMap,
									"/mailvm/交期信息确认函.vm");
 
						
						
					}

		}
		togys = false;
		tocg = false;
		return map;
	}

	@RequestMapping(value = "/changestatus")
	@ResponseBody
	public Map<String, String> changestatus(String PMMUD02, String PMM03, Ddlog ddlog, String currentdate,
			HttpServletRequest request, HttpServletResponse response) {
		// response.setContentType("text/plain;charset=UTF-8");
		linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("PMN01", ddlog.getPmn01());
		linkedHashMap.put("PMN02", ddlog.getPmn02());
		linkedHashMap.put("NOW", currentdate);
        Ddlog d=ddlogService.findByPrimaryKey(ddlog.getDdid()) ;
		Map<String, String> map = new HashMap<String, String>();
		if (ddlogService.findByPrimaryKey(ddlog.getDdid()) != null) {

			if (ddlog.getStatus().equals("1") ) {

				if (ddlog.getReplydd() == null || ddlog.getReplydd() == "") {
					ddlog.setReplydd(ddlog.getRequirementdd());
					ddlogService.updateDdlog(ddlog);
					map.put("status", "success");
					tocg = true;
					togys = false;

				} else if (ddlog.getRequirementdd() == null || ddlog.getRequirementdd() == "") {
					ddlog.setRequirementdd(ddlog.getReplydd());
					ddlogService.updateDdlog(ddlog);
					map.put("status", "success");
					tocg = false;
					togys = true;

				} else if (ddlog.getReplydd() != null && ddlog.getRequirementdd() == null
						&& ddlog.getRequirementdd() != "" && ddlog.getReplydd() == "") {

					if (ddlog.getReplydd().equals(ddlog.getRequirementdd())) {
						ddlogService.updateDdlog(ddlog);
						map.put("status", "success");

					} else {
						map.put("status", "fail");
					}
				}
			} else {
				ddlogService.updateDdlog(ddlog);
				map.put("status", "success");

			}

		}

		if (tocg) {

			linkedHashMap.put("PMC03", usersService.getPMC03(PMMUD02));
			if (PMM03 != null)

				if (usersService.getUSERSByKey(ddlog.getAccid()).getEMAIL() != null)
					mail = usersService.getUSERSByKey(ddlog.getAccid()).getEMAIL();
			if (mail != null) { 

					mailUtil.sendTempEmail(   mail, "交期信息确认函", linkedHashMap,
							"/mailvm/交期信息确认函2采购.vm");
				 
			}
		}
		if (togys) {
			//////// //System.out.println("----to-->供应商");
			linkedHashMap.put("PMC03", usersService.getPMC03(PMMUD02));

			List<String> jqemaillist = new ArrayList<String>();
			jqemaillist = usersService.getPMCEmaillist(PMMUD02);
			if (jqemaillist != null)
				if (jqemaillist.size() > 0)
					for (String m : jqemaillist) { 
                          mailUtil.sendTempEmail(   m, "交期信息确认函", linkedHashMap,
									"/mailvm/交期信息确认函.vm");
 
						
					}

		}

		togys = false;
		tocg = false;

		return map;

	}

	/**
	 * 获取交期明细
	 * 
	 * @param page
	 * @param rows
	 * @param rq
	 * @param PMN01
	 * @param PMN02
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getddlog")
	@ResponseBody
	public EasyuiDataGridJson getddlog(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "50") Integer rows, HttpServletRequest rq, String PMN01,
			Integer PMN02) throws Exception {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageMethod.startPage(page, rows);

		// startPage后面紧跟的这个查询就是一个分页查询
		List<?> list = ddlogService.getDdlog2(PMN01, PMN02);
		// List<Ddlog> list = ddlogService.getDdlog(PMN01, PMN02);

		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());
        
		return EasyuiDataGridJson;
	}

}
