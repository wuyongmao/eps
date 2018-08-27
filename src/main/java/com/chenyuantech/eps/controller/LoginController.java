package com.chenyuantech.eps.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.eps.bean.Children;
import com.chenyuantech.eps.bean.EasyuiDataGridJson;
import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.bean.PMC;
import com.chenyuantech.eps.bean.USERS;
import com.chenyuantech.eps.service.PMCService;
import com.chenyuantech.eps.service.USERSService;
import com.chenyuantech.eps.utils.CusAccessObjectUtil;
import com.chenyuantech.eps.utils.Dateutil;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;

/**
  * 
  * 
 */
@Controller
@RequestMapping("/users")
public class LoginController {

	@Autowired
	USERSService usersService;

	@Autowired
	PMCService pmcService;

	public static boolean islogin(HttpServletRequest rq) {

		HttpSession session = rq.getSession();

		try {
			USERS user = (USERS) session.getAttribute("username");

			if (user == null) {
				return false;
			} else {

				return true;
			}

		} catch (Exception e) {

			return false;

		}

	}

	/**
	 * 登录验证
	 * 
	 * @return
	 */
	@RequestMapping("/checklogin1")
	@ResponseBody
	public Msg Login(USERS user, HttpServletRequest rq) {

		if (user == null) {
			return Msg.fail().add("msg", "用户或密码为空");
		}

		USERS loguser = usersService.getUSERSByACCPWD(user);

		if (loguser != null) {
			SecurityUtils.getSubject().login(new UsernamePasswordToken(user.getACC(), user.getPWD()));

			HttpSession session = rq.getSession();
			session.setAttribute("username", loguser);

			session.setMaxInactiveInterval(7200);
			session.setAttribute("ip", CusAccessObjectUtil.getIpAddress(rq));

			if (loguser.getROLE() == null) {
				return Msg.fail().add("msg", "用户没有分配角色");

			}
			session.setAttribute("ROLE", loguser.getROLE());

			if (loguser.getROLE().equalsIgnoreCase("GYS")) {
				List<PMC> pmc = pmcService.getByPMC(loguser.getPMMUD02());

				if (pmc == null) {
					pmc = pmcService.getByPMC("CY0001");

				}

				if (pmc.size() > 0) {
					session.setAttribute("company", pmc.get(0));
				}
			} else {

				List<PMC> pmc = pmcService.getByPMC("CY0001");

				if (pmc.size() > 0) {
					session.setAttribute("company", pmc.get(0));
				}

			}

			return Msg.success().add(loguser.getACCID(), loguser);

		}

		return Msg.fail();

	}

	@RequestMapping("/checkrole1")
	@ResponseBody
	public Msg checkRole1(@RequestParam(value = "accid1", defaultValue = "--") String accid1,
			@RequestParam(value = "accid2", defaultValue = "--") String accid2) {

		if ((int) (usersService.checkRole1(accid1, accid2).get("status")) == 200) {

			return Msg.fail().add("msg", usersService.checkRole1(accid1, accid2).get("msg"));

		}
		;
		return Msg.success();

	}

	@RequestMapping("/checkrole2")
	@ResponseBody
	public Msg checkRole2(@RequestParam(value = "accid1", defaultValue = "--") String accid1,
			@RequestParam(value = "accid2", defaultValue = "--") String accid2) {

		if ((int) (usersService.checkRole2(accid1, accid2).get("status")) == 200) {

			Msg.fail().add("msg", usersService.checkRole1(accid1, accid2).get("msg"));
			return Msg.fail();

		}
		;
		return Msg.success();

	}

	/**
	 * 修改用户信息
	 * 
	 * @param user
	 * @param rq
	 * @return
	 */
	@RequestMapping("/saveuser")
	@ResponseBody
	public Msg saveUsers(USERS user, String ownrole, HttpServletRequest rq) {

		if (user.getACCID() == null) {
			return Msg.fail();
		} else {

			user.setCHGTIME(Dateutil.getCurrentDate("yyyy-MM-dd"));
			return usersService.updateUSER(user) ? Msg.success() : Msg.fail();
		}

	}

	/**
	 * 修改用户信息
	 * 
	 * @param user
	 * @param rq
	 * @return
	 */
	@RequestMapping("/saveuser2")
	@ResponseBody
	public Msg saveUsers2(USERS user, HttpServletRequest rq) {

		// System.out.println(user);
		if (user.getACCID() == null) {
			return Msg.fail();
		} else {
			user.setCHGTIME(Dateutil.getCurrentDate("yyyy-MM-dd"));

			if (usersService.updateUSER(user)) {

				rq.getSession().setAttribute("username", usersService.getUSERSByKey(user.getACCID()));

				return Msg.success();

			}

			return Msg.fail();
		}

	}

	@RequestMapping(value = "/checkACC")
	@ResponseBody
	public Map<Object, Object> checkUsersAcc(@RequestParam(value = "ACC", defaultValue = "--") String ACC,
			HttpServletRequest rq) {
		Map<Object, Object> map = new HashMap<>();
		if (usersService.checkUSERS(ACC) == false) {
			// System.out.println("=====usersService.checkUSERS(acc)====>>" +
			// usersService.checkUSERS(ACC));

			map.put("valid", true);
			return map;
		}
		// System.out.println("=====usersService.checkUSERS(acc)====>>" +
		// usersService.checkUSERS(ACC));

		map.put("valid", false);
		return map;
	}

	@RequestMapping("/adduser")
	@ResponseBody
	public Msg addUsers(USERS user, HttpServletRequest rq) {
		// System.out.println("======>users>" + user);
		if (user == null) {
			return Msg.fail().add("msg", "user null");

		} else {
			if (user.getACC() == null || user.getPWD() == null) {
				return Msg.fail().add("msg", "user property is null");
			} else

			{
				if (usersService.checkUSERS(user.getACC())) {

					return Msg.fail().add("msg", "账户已经存在");

				} else {

					user.setCHGTIME(Dateutil.getCurrentDate("yyyy-MM-dd"));
					return usersService.addUSERS(user) ? Msg.success() : Msg.fail();

				}

			}

		}

	}

	@RequestMapping("/checklogin")
	@ResponseBody
	public Msg getEmpsWithJson(@RequestParam(value = "USERname", defaultValue = "") String USERname

	, @RequestParam(value = "password", defaultValue = "") String password) {

		List<USERS> USERs = usersService.getAllUSERS();
		for (USERS USER : USERs) {
			if (USER.getNAME().equals(USERname)) {
				return Msg.success();

			}
		}
		return Msg.fail();

	}

	/**
	 * 获取用户信息
	 * 
	 * @param page
	 * @param rows
	 * @param user
	 * @param rq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getusers")
	@ResponseBody
	public EasyuiDataGridJson getd2(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "10") Integer rows, USERS user, HttpServletRequest rq)
			throws Exception {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageMethod.startPage(page, rows);
		// startPage后面紧跟的这个查询就是一个分页查询
		List list = usersService.getUSERSByObject(user);
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

	@RequestMapping("/getnode")
	@ResponseBody
	public List<Children> getNode(@RequestParam(value = "ROLE", defaultValue = "") String ROLE) {

		List<Children> ll = new ArrayList<>();
		Map<String, Object> map11 = new HashMap<>();
		Map<String, Object> map12 = new HashMap<>();
		Map<String, Object> map21 = new HashMap<>();
		Map<String, Object> map22 = new HashMap<>();
		Map<String, Object> map23 = new HashMap<>();
		Map<String, Object> map24 = new HashMap<>();
		Map<String, Object> map31 = new HashMap<>();
		Map<String, Object> map32 = new HashMap<>();
		Map<String, Object> map33 = new HashMap<>();
		Map<String, Object> map34 = new HashMap<>();
		Map<String, Object> map35 = new HashMap<>();
		Map<String, Object> map36 = new HashMap<>();

		Map<String, Object> map4 = new HashMap<>();
		Map<String, Object> map51 = new HashMap<>();
		Map<String, Object> map52 = new HashMap<>();
		Map<String, Object> map61 = new HashMap<>();
		Map<String, Object> map71 = new HashMap<>();
		Map<String, Object> map81 = new HashMap<>();
		Map<String, Object> map82 = new HashMap<>();
		List<Children> ll1 = new ArrayList<>();
		List<Children> ll2 = new ArrayList<>();
		List<Children> ll3 = new ArrayList<>();
		List<Children> ll4 = new ArrayList<>();
		List<Children> ll5 = new ArrayList<>();
		List<Children> ll6 = new ArrayList<>();
		List<Children> ll7 = new ArrayList<>();
		List<Children> ll8 = new ArrayList<>();

		Children c1 = new Children();
		Children c2 = new Children();
		Children c3 = new Children();
		Children c4 = new Children();
		Children c5 = new Children();
		Children c6 = new Children();
		Children c7 = new Children();
		Children c8 = new Children();

		Children c21 = new Children();
		Children c22 = new Children();
		Children c23 = new Children();
		Children c24 = new Children();

		map11.put("url", "gysxxgl_xxwh.jsp");
		map12.put("url", "user.jsp");
		Children c11 = new Children();
		Children c12 = new Children();
		c1.setText("用户信息管理");
		c11.setText("用户信息维护");
		c11.setAttributes(map11);

		c12.setText("个人信息维护");
		c12.setAttributes(map12);

		ll1.add(c11);
		ll1.add(c12);
		c1.setChildren(ll1);

		map21.put("url", "wdcgd_lc_z.jsp");
		map22.put("url", "wdcgd_yf_z.jsp");
		map23.put("url", "wdcgd_lc_z_ww.jsp");
		map24.put("url", "wdcgd_yf_z_ww.jsp");
		c2.setText("我的采购单");
		c21.setText("我的采购单(量产)");
		c21.setAttributes(map21);
		c22.setText("我的采购单(研发)");
		c22.setAttributes(map22);
		c23.setText("我的采购单(委外-量产)");
		c23.setAttributes(map23);
		c24.setText("我的采购单(委外-研发)");
		c24.setAttributes(map24);

		ll2.add(c21);
		ll2.add(c22);
		ll2.add(c23);
		ll2.add(c24);
		c2.setChildren(ll2);

		c3.setText("我的订单");
		Children c31 = new Children();
		Children c32 = new Children();
		Children c33 = new Children();
		Children c34 = new Children();
		Children c35 = new Children();
		Children c36 = new Children();

		c31.setText("我的订单(量产)");
		c32.setText("我的订单(研发)");

		c33.setText("我的订单(委外-量产)");
		c34.setText("我的订单(委外-研发)");
		c35.setText("外箱标维护");
		c36.setText("送货单查询");

		map31.put("url", "wddd_gys_z.jsp");
		c31.setAttributes(map31);

		map32.put("url", "wddd_gys_y.jsp");
		c32.setAttributes(map32);

		map33.put("url", "wddd_gys_z_ww.jsp");
		c33.setAttributes(map33);
		map34.put("url", "wddd_gys_y_ww.jsp");
		map35.put("url", "wddd_gys_s.jsp");
		c34.setAttributes(map34);
		c35.setAttributes(map35);

		map36.put("url", "wddd_gys_d.jsp");
		c36.setAttributes(map36);

		ll3.add(c31);
		ll3.add(c32);
		ll3.add(c33);
		ll3.add(c34);
		ll3.add(c35);
		ll3.add(c36);
		c3.setChildren(ll3);

		c4.setText("系统设定");

		Children c41 = new Children();
		c41.setText("变更理由码维护");
		map4.put("url", "xtsd_bglymwh.jsp");
		c41.setAttributes(map4);
		ll4.add(c41);
		c4.setChildren(ll4);

		c5.setText("报表");

		Children c51 = new Children();
		c51.setText("采购进度表(量产)");
		map51.put("url", "report_cgjdb_l.jsp");
		c51.setAttributes(map51);

		Children c52 = new Children();
		c52.setText("采购进度表(研发)");
		map52.put("url", "report_cgjdb_y.jsp");
		c52.setAttributes(map52);
		ll5.add(c51);
		ll5.add(c52);
		c5.setChildren(ll5);

		c6.setText("来料目测检验");
		Children c61 = new Children();
		c61.setText("规则录入");
		map61.put("url", "InspectRegulation.jsp");
		c61.setAttributes(map61);
		ll6.add(c61);
		c6.setChildren(ll6);

		c7.setText("我的收货单");
		Children c71 = new Children();
		c71.setText("箱重差异查询");
		map71.put("url", "wddd_gys_c.jsp");
		c71.setAttributes(map71);
		ll7.add(c71);
		c7.setChildren(ll7);

		c8.setText("外箱表维护");
		Children c81 = new Children();
		c81.setText("外箱标(导入)");
		map81.put("url", "wddd_gys_sws.jsp");
		c81.setAttributes(map81);

		Children c82 = new Children();
		c82.setText("外箱标(已确认)");
		map82.put("url", "wddd_gys_sw.jsp");
		c82.setAttributes(map82);

		ll8.add(c81);
		ll8.add(c82);
		c8.setChildren(ll8);

		ll.add(c1);
		ll.add(c2);
		ll.add(c3);
		ll.add(c4);
		ll.add(c5);
		ll.add(c6);
		ll.add(c7);
		ll.add(c8);

		if (ROLE.equalsIgnoreCase("LC")) {
			ll.remove(c3);
		} else if (ROLE.equalsIgnoreCase("YF")) {
			ll.remove(c3);

		} else if (ROLE.equalsIgnoreCase("GYS")) {
			ll.clear();
			ll1.remove(c11);
			ll.add(c1);
			ll.add(c3);

		} else if (ROLE.equalsIgnoreCase("PG")) {
			ll.clear();
			ll1.remove(c11);
			ll.add(c1);
			ll2.remove(c21);
			ll.add(c2);
		} else if (ROLE.equalsIgnoreCase("P")) {
			ll.clear();
			ll1.remove(c11);
			ll.add(c1);
			ll.add(c6);
		} else if (ROLE.equalsIgnoreCase("YW")) {
			ll.clear();
			ll5.remove(c51);
			ll1.remove(c11);
			ll.add(c5);
			ll.add(c1);

		} else if (ROLE.equalsIgnoreCase("ADMIN")) {

		} else if (ROLE.equalsIgnoreCase("LEADER")) {

		} else if (ROLE.equalsIgnoreCase("ZC")) {
			ll.clear();
			ll1.remove(c11);
			ll.add(c1);
			ll.add(c8);

		} else {
			return null;
		}

		return ll;

	}

}
