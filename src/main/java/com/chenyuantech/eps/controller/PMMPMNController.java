package com.chenyuantech.eps.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.eps.bean.EasyuiDataGridJson;
import com.chenyuantech.eps.bean.PMM;
import com.chenyuantech.eps.bean.PMN;
import com.chenyuantech.eps.bean.Project;
import com.chenyuantech.eps.service.PMMPMNService;
import com.chenyuantech.eps.utils.ExcelUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * 处理和部门有关的请求
 *
 */
@Controller
public class PMMPMNController {

	@Autowired
	private PMMPMNService pMMPMNService;

	private List<Map<String, Object>> exportlist;

	public List<Map<String, Object>> getExportlist() {
		return exportlist;
	}

	public void setExportlist(List<Map<String, Object>> exportlist) {
		this.exportlist = exportlist;
	}

	
	public  String concat(String  a, String  b) {  
		  String s = "";
		  if( a ==null)
			  return "";
	      String[] r1=a.split(",");
	      String[] r2=b.split(",");
        for( int i=0;i<r1.length;i++){
      	  if(s.length()>0)
      	  {
      		  s=s+","+r1[i]+" "+ r2[i];
      	  }else{
      		  s=s +r1[i]+" "+ r2[i];

      	  }
        }
		return s;
		
		}  
	 
	@RequestMapping("/getpmn02")
	@ResponseBody
	public List<Map<String, Object>> getPMNPMN02ByPMN01(String PMN01){
		return pMMPMNService.getPMNPMN02ByPMN01(PMN01);
	}
	
	
	@RequestMapping("/cgmxjson")
	@ResponseBody
	public EasyuiDataGridJson getd2(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "10") Integer rows, PMM pmm, PMN pmn,String ISAUTOJQ, HttpServletRequest rq)
					throws Exception {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		String sort = rq.getParameter("sort");
		String order = rq.getParameter("order");
		
		 
		
		PageHelper.startPage(page, rows);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<?> list = pMMPMNService.getPMMPMN(pmm, pmn,this.concat( sort,  order),ISAUTOJQ);
		this.setExportlist(pMMPMNService.getPMMPMN(pmm, pmn,this.concat( sort,  order),ISAUTOJQ) );
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo<?> pageinfo = new PageInfo (list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

	@RequestMapping(value = "exportpmmlc")
	public String download(HttpServletRequest request, HttpServletResponse response ) throws IOException {
		String fileName = "exportpmm";
		 
			String  columnNames []= { "采购日期", "采购厂商", "供应商简称", "生产季节", "采购单号", "项次", "料件编号", "品名","型体", "状况码"
					, "采购量", "送货总数量","未交货数量",
					"采购单位", "备注", "采购人员代号", "采购人姓名","需求交期","厂商回复交期","是否自动确认交期" };
			String	  keys [] = { "PMM04", "PMMUD02", "PMC03", "PMNUD05", "PMM01", "PMN02", "PMN04", "PMN041", "TC_TQA03","PMN16",
					"PMN20", "SHZNUM","CJL", "PMN07", "PMNUD04", "PMM12", "GEN021","REQUIREMENTDD","REPLYDD" ,"ISAUTOJQ"

			}; 
		   

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
		response.setHeader("Content-Disposition",
				"attachment;filename=" + new String((fileName + ".xls").getBytes(), "utf-8"));
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
	@RequestMapping(value = "exportpmmyf")
	public String download2(HttpServletRequest request, HttpServletResponse response ) throws IOException {
		String fileName = "exportpmm";
		 
		String columnNames[] = { "采购日期", "采购厂商", "供应商简称", "采购单号", "项次", "请购单号", "阶段", "阶段中文说明", "料件编号", "品名","型体",
				"状况码", "采购量", "送货总数量", "未交数量",
				"采购单位", "原始交货日期", "原始到厂日期", "原始到库日期", "备注","需求交期","厂商回复交期" ,"是否自动确认交期"};
		String keys[] = { "PMM04", "PMMUD02", "PMC03", "PMM01", "PMN02", "PMN24", "TA_PMN05", "TA_PMN05_DS",
				"PMN04", "PMN041", "TC_TQA03","PMN16", "PMN20", "SHZNUM", "CJL"
				, "PMN07", "PMN33", "PMN34", "PMN35", "PMNUD04","REQUIREMENTDD","REPLYDD","ISAUTOJQ"

		};
		   

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
		response.setHeader("Content-Disposition",
				"attachment;filename=" + new String((fileName + ".xls").getBytes(), "utf-8"));
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

	
	
	
	@RequestMapping(value = "exportpmmddyf")
	public String download3(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fileName = "exportpmm";

		String columnNames[] = { "采购厂商", "供应商简称", "订单号码", "项次", "采购日期", "材料名称", "规格", "生产季节", "生产季节说明", "原始交货日期",
				"原始到厂日期", "原始到库日期", "采购量", "采购单位", "送货总数量", "收货地址", "是否批色", "营运组织代号","是否自动确认交期" };
		String keys[] = { "PMMUD02", "PMC03", "PMM01", "PMN02", "PMM04", "PMN041", "IMA021", "PMNUD05", "PMNUD05_DS",
				"PMN33", "PMN34", "PMN35", "PMN20", "PMN07", "SHZNUM", "SHDZ", "PSFLAG", "TA_PMM06","ISAUTOJQ" };

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
		response.setHeader("Content-Disposition",
				"attachment;filename=" + new String((fileName + ".xls").getBytes(), "utf-8"));
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
	
	@RequestMapping(value = "exportpmmddyl")
	public String download4(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fileName = "exportpmm";

		String columnNames[] = { "采购厂商", "供应商简称", "订单号码", "项次", "采购日期", "材料名称", "规格", "生产季节", "生产季节说明", "原始交货日期",
				"原始到厂日期", "原始到库日期", "采购量", "采购单位", "送货总数量", "收货地址",  "营运组织代号" ,  "是否自动确认交期"};
		String keys[] = { "PMMUD02", "PMC03", "PMM01", "PMN02", "PMM04", "PMN041", "IMA021", "PMNUD05", "PMNUD05_DS",
				"PMN33", "PMN34", "PMN35", "PMN20", "PMN07", "SHZNUM", "SHDZ", "TA_PMM06" ,"ISAUTOJQ"};

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
		response.setHeader("Content-Disposition",
				"attachment;filename=" + new String((fileName + ".xls").getBytes(), "utf-8"));
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
}
