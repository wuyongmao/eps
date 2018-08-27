package com.chenyuantech.eps.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.bean.WXBSIZETMP;
import com.chenyuantech.eps.bean.WXBTMP;

@Controller
@RequestMapping("/file")
public class FileController {

	@RequestMapping("downloadExcel")
	public ResponseEntity<byte[]> downloadExcel(HttpServlet request) {
		String realPath = request.getServletContext().getRealPath("/");
		String filepath = realPath + "/tt.xls";
		System.out.println("-------------" + filepath);
		File file = new File(filepath);
		HttpHeaders headers = new HttpHeaders();
		String fileName = null;
		try {
			fileName = new String("订单模板文件.xls".getBytes("UTF-8"), "iso-8859-1");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// 为了解决中文名称乱码问题
		headers.setContentDispositionFormData("attachment", fileName);
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		try {
			return new ResponseEntity<byte[]>(
					FileUtils.readFileToByteArray(file), headers,
					HttpStatus.CREATED);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}


}