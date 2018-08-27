package com.chenyuantech.eps.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.eps.bean.EasyuiDataGridJson;
import com.chenyuantech.eps.bean.INSPECTION;
import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.bean.USERS;
import com.chenyuantech.eps.service.InspectionService;
import com.chenyuantech.eps.utils.ExcelUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;

@Controller
public class InspectionController {

	@Autowired
	InspectionService IService;

	private List<Map<String, Object>> exportlist;

	public List<Map<String, Object>> getExportlist() {
		return exportlist;
	}

	public void setExportlist(List<Map<String, Object>> exportlist) {
		this.exportlist = exportlist;
	}

	@RequestMapping("inspection/insert")
	@ResponseBody
	public Msg insertInspection(INSPECTION insp, HttpSession session) {
		Msg msg = new Msg();
		USERS user = (USERS) session.getAttribute("username");
		insp.setINPUTTER(user.getNAME());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		insp.setINPUTDATE(sdf.format(new Date()));

		List<LinkedHashMap<String, Object>> maps = IService.getMinAndMax();
		if (insp.getDELLOTMAX() == "" || insp.getDELLOTMIN() == "" || insp.getSAMPLES() == "" || insp.getAC() == "" || insp.getRE() == "") {
			msg.add("msg", "SomeInputIsNull");
			return msg;
		}
		if (!isInteger(insp.getDELLOTMAX()) || !isInteger(insp.getDELLOTMIN()) || !isInteger(insp.getRE()) || !isInteger(insp.getAC())
				|| !isInteger(insp.getSAMPLES())) {
			msg.add("msg", "SomeInputIsNotNumber");
			return msg;
		}

		int min = Integer.parseInt(insp.getDELLOTMIN());
		int max = Integer.parseInt(insp.getDELLOTMAX());
		int ac = Integer.parseInt(insp.getAC());
		int re = Integer.parseInt(insp.getRE());
		int samples = Integer.parseInt(insp.getSAMPLES());

		if (max < min) {
			msg.add("msg", "DELLOTMAXLessThanDELLOTMIN");
			return msg;
		} else if ((ac > samples) || (re > samples)) {
			msg.add("msg", "ACorRELargerThanSAMPLES");
			return msg;
		} else if (re < ac) {
			msg.add("msg", "ACLargerThanRE");
			return msg;
		} else if (samples > max) {
			msg.add("msg", "SAMPLESLargerThanDELLOTMAX");
			return msg;
		} else if (insp.getCONFIRM() == null) {
			for (int i = 0; i < maps.size(); i++) {
				int mapsmin = Integer.parseInt(maps.get(i).get("DELLOTMIN").toString());
				int mapsmax = Integer.parseInt(maps.get(i).get("DELLOTMAX").toString());
				if (mapsmin <= min && mapsmax >= min || mapsmin <= max && mapsmax >= max) {
					msg.add("msg", "MaxOrMinInExistedRange");
					msg.add("min", maps.get(i).get("DELLOTMIN"));
					msg.add("max", maps.get(i).get("DELLOTMAX"));
					return msg;
				}
			}

		}
		IService.insertSelective(insp);
		msg.add("msg", "insertsuccess");
		return msg;
	}

	@RequestMapping("inspection/update")
	@ResponseBody
	public Msg UpdateInspection(INSPECTION insp, HttpSession session) {
		Msg msg = new Msg();
		USERS user = (USERS) session.getAttribute("username");
		insp.setINPUTTER(user.getNAME());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		insp.setINPUTDATE(sdf.format(new Date()));

		List<LinkedHashMap<String, Object>> maps = IService.getMinAndMaxExcSelf(insp.getREGULATIONID());
		if (insp.getDELLOTMAX() == "" || insp.getDELLOTMIN() == "" || insp.getSAMPLES() == "" || insp.getAC() == "" || insp.getRE() == "") {
			msg.add("msg", "SomeInputIsNull");
			return msg;
		}
		if (!isInteger(insp.getDELLOTMAX()) || !isInteger(insp.getDELLOTMIN()) || !isInteger(insp.getRE()) || !isInteger(insp.getAC())
				|| !isInteger(insp.getSAMPLES())) {
			msg.add("msg", "SomeInputIsNotNumber");
			return msg;
		}

		int min = Integer.parseInt(insp.getDELLOTMIN());
		int max = Integer.parseInt(insp.getDELLOTMAX());
		int ac = Integer.parseInt(insp.getAC());
		int re = Integer.parseInt(insp.getRE());
		int samples = Integer.parseInt(insp.getSAMPLES());

		if (max < min) {
			msg.add("msg", "DELLOTMAXLessThanDELLOTMIN");
			return msg;
		} else if ((ac > samples) || (re > samples)) {
			msg.add("msg", "ACorRELargerThanSAMPLES");
			return msg;
		} else if (re < ac) {
			msg.add("msg", "ACLargerThanRE");
			return msg;
		} else if (samples > max) {
			msg.add("msg", "SAMPLESLargerThanDELLOTMAX");
			return msg;
		} else if (insp.getCONFIRM() == null) {
			for (int i = 0; i < maps.size(); i++) {
				int mapsmin = Integer.parseInt(maps.get(i).get("DELLOTMIN").toString());
				int mapsmax = Integer.parseInt(maps.get(i).get("DELLOTMAX").toString());
				if (mapsmin <= min && mapsmax >= min || mapsmin <= max && mapsmax >= max) {
					msg.add("msg", "MaxOrMinInExistedRange");
					msg.add("min", maps.get(i).get("DELLOTMIN"));
					msg.add("max", maps.get(i).get("DELLOTMAX"));
					return msg;
				}
			}

		}
		IService.updateINSPECTION(insp);
		msg.add("msg", "updatesuccess");
		return msg;
	}

	@RequestMapping("inspection/delete")
	@ResponseBody
	public Msg DeleteInspection(String id) {
		Msg msg = new Msg();
		IService.deleteRegById(id);
		msg.add("msg", "deletesuccess");
		return msg;
	}

	@RequestMapping("inspection")
	public String download5(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fileName = "inspectregulation";

		String columnNames[] = { "来料下限", "来料上限", "样本数量", "接受箱数", "拒绝箱数", "建立者", "建立时间" };
		String keys[] = { "DELLOTMIN", "DELLOTMAX", "SAMPLES", "AC", "RE", "INPUTTER", "INPUTDATE" };

		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			ExcelUtil.createWorkBook(this.getExportlist(), keys, columnNames).write(os);
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte[] content = os.toByteArray();
		InputStream is = new ByteArrayInputStream(content);
		// 设置response参数，可以打开下载页面
		response.reset();
		response.setContentType("application/vnd.ms-excel;charset=utf-8");
		response.setHeader("Content-Disposition", "attachment;filename=" + new String((fileName + ".xls").getBytes(), "utf-8"));
		ServletOutputStream out = response.getOutputStream();
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(is);
			bos = new BufferedOutputStream(out);
			byte[] buff = new byte[2048];
			int bytesRead;
			// Simple read/write loop.
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
		} catch (final IOException e) {
			throw e;
		} finally {
			if (bis != null)
				bis.close();
			if (bos != null)
				bos.close();
		}
		return null;
	}

	@RequestMapping("/inspectjson")
	@ResponseBody
	public EasyuiDataGridJson getd2(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "10") Integer rows, INSPECTION insp, HttpServletRequest rq) throws Exception {

		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		String sort = rq.getParameter("sort");
		String order = rq.getParameter("order");

		PageMethod.startPage(page, rows);
		// startPage后面紧跟的这个查询就是一个分页查询
		System.out.println(this.concat(sort, order));

		List<Map<String, Object>> list = IService.getINSPECTIONList(insp, this.concat(sort, order));
		this.setExportlist(list);
		System.out.println(list);
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);
		System.out.println(pageinfo);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

	public static boolean isInteger(String str) {
		Pattern pattern = Pattern.compile("^[1-9]\\d*$");
		return pattern.matcher(str).matches();
	}

	public Map<String, Object> INSPECTIONtoMap(INSPECTION insp) {
		Map<String, Object> map = new HashMap();
		map.put("SAMPLES", insp.getSAMPLES());
		map.put("RE", insp.getRE());
		map.put("INPUTDATE", insp.getINPUTDATE());
		map.put("DELLOTMIN", insp.getDELLOTMIN());
		map.put("AC", insp.getAC());
		map.put("DELLOTMAX", insp.getDELLOTMAX());
		map.put("INPUTTER", insp.getINPUTTER());
		return map;

	}

	public String concat(String a, String b) {
		String s = "";
		if (a == null)
			return "dellotmin";
		String[] r1 = a.split(",");
		String[] r2 = b.split(",");
		for (int i = 0; i < r1.length; i++) {
			if (r1[i].equals("INPUTTER") || r1[i].equals("INPUTDATE")) {
				if (s.length() > 0) {
					s = s + "," + r1[i] + " " + r2[i];
				} else {
					s = s + r1[i] + " " + r2[i];

				}
			} else {
				if (s.length() > 0) {
					s = s + "," + "to_number(" + r1[i] + ")" + " " + r2[i];
				} else {
					s = s + "to_number(" + r1[i] + ")" + " " + r2[i];

				}
			}
		}
		return s;
	}
}
