package com.chenyuantech.eps.utils;

import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.chenyuantech.eps.bean.WXBTMP;

public class ExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		@SuppressWarnings("unchecked")
		List<WXBTMP> wxbtmps = (List<WXBTMP>) model.get("wxbtmps");
		if (wxbtmps != null && wxbtmps.size() != 0) {
			int len = wxbtmps.size();
			Sheet sheet = workbook.createSheet();
			// 第一行文字说明
			Row row = sheet.createRow(0);
			Cell cell = row.createCell(0, Cell.CELL_TYPE_STRING);
			cell.setCellValue("临时箱号");
			cell = row.createCell(1, Cell.CELL_TYPE_STRING);
			cell.setCellValue("料号");
			cell = row.createCell(2, Cell.CELL_TYPE_STRING);
			cell.setCellValue("缸号");
			cell = row.createCell(3, Cell.CELL_TYPE_STRING);
			cell.setCellValue("单位");
			cell = row.createCell(4, Cell.CELL_TYPE_STRING);
			cell.setCellValue("毛重");
			cell = row.createCell(5, Cell.CELL_TYPE_STRING);
			cell.setCellValue("净重/数量");
			cell = row.createCell(6, Cell.CELL_TYPE_STRING);
			cell.setCellValue("分SIZE否");

			// 下面是具体内容
			for (int i = 0; i < len; i++) {
				row = sheet.createRow(i + 1);
				cell = row.createCell(0, Cell.CELL_TYPE_STRING);
				cell.setCellValue(wxbtmps.get(i).getWXB05T());
				cell = row.createCell(1, Cell.CELL_TYPE_STRING);
				cell.setCellValue(wxbtmps.get(i).getWXB14());
				cell = row.createCell(2, Cell.CELL_TYPE_STRING);
				cell.setCellValue(wxbtmps.get(i).getWXB04());
				cell = row.createCell(3, Cell.CELL_TYPE_STRING);
				cell.setCellValue(wxbtmps.get(i).getWXB15());
				cell = row.createCell(4, Cell.CELL_TYPE_NUMERIC);
				cell.setCellValue(wxbtmps.get(i).getWXB08().doubleValue());
				cell = row.createCell(5, Cell.CELL_TYPE_NUMERIC);
				cell.setCellValue(wxbtmps.get(i).getWXB09().doubleValue());
				cell = row.createCell(6, Cell.CELL_TYPE_STRING);
				cell.setCellValue(wxbtmps.get(i).getWSIZE());
			}

			response.setContentType("application/vnd.ms-excel");
			// 这里对文件名进行编码，保证下载时汉字显示正常
			String fileName = URLEncoder.encode("外箱标1.xls", "utf-8");
			// Content-disposition属性设置成以附件方式进行下载
			response.setHeader("Content-disposition", "attachment;filename="
					+ fileName);
			OutputStream os = response.getOutputStream();
			workbook.write(os);
	 		//os.flush();
		//	os.close();
		}
	}
}