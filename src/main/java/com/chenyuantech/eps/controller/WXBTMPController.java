package com.chenyuantech.eps.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.chenyuantech.eps.bean.EasyuiDataGridJson;
import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.bean.WXBSIZETMP;
import com.chenyuantech.eps.bean.WXBTMP;
import com.chenyuantech.eps.service.IMAService;
import com.chenyuantech.eps.service.WXBSIZETMPService;
import com.chenyuantech.eps.service.WXBTMPService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;

@Controller
@RequestMapping("/wxbtmp")
public class WXBTMPController {

	@Autowired
	private WXBTMPService WXBTMPService;
	@Autowired
	private IMAService imaService;
	@Autowired
	private WXBSIZETMPService wxbsizetmpService;

	@RequestMapping(value = "confirmwxb", method = RequestMethod.POST)
	@ResponseBody
	public Msg getwxbprintMult(@RequestParam(value = "wxbls[]") String[] wxbls, String flag) {
		if (wxbls != null) {

			if (wxbls.length > 0) {
				if (WXBTMPService.confirmdata(wxbls)) {

					return Msg.success("处理成功");
				} else {
					Msg.fail("处理失败！");
				}
				;

			} else {
				Msg.fail("请选择行");
			}
		} else {
			Msg.fail("请选择行");
		}

		return Msg.fail();
	}

	@RequestMapping(value = "/updatewxbtmp")
	@ResponseBody
	public Msg updateWXBTMP(WXBTMP WXBTMP, String PMMUD02, String op, String flag, HttpServletRequest request) {

		if (WXBTMP == null) {
			return Msg.fail("为空");

		}
		if (WXBTMP.getWXB05T() == null) {
			return Msg.fail("临时箱号不可为空");

		}
		if (WXBTMP.getWXB15() == null) {
			return Msg.fail("料号不可为空");

		}
		if ((WXBTMP.getWXB15().substring(0, 2).equalsIgnoreCase("40")
				|| WXBTMP.getWXB15().substring(0, 2).equalsIgnoreCase("50") || WXBTMP.getWXB15().substring(0, 2)
				.equalsIgnoreCase("46")) == false) {
			if (WXBTMP.getWXB04() == null) {
				return Msg.fail("缸号不可为空");
			} else {
				if (WXBTMP.getWXB04().trim().equals("")) {
					return Msg.fail("缸号不可为空");
				}

			}

		}
		if (WXBTMPService.updateWXBTMP(WXBTMP)) {
			return Msg.success();
		}

		return Msg.fail();

	}

	/**
	 * Excel文件上传处理
	 * 
	 * @param file
	 * @return
	 */
	@RequestMapping("/upload")
	@ResponseBody
	public Msg uploadExcel(@RequestParam("file") MultipartFile file) {
		List<WXBTMP> wxbtmps = new ArrayList<WXBTMP>();
		List<WXBSIZETMP> wxbtsizetmps = new ArrayList<WXBSIZETMP>();
		String WXB15 = null;
		try {
			Workbook wb = new HSSFWorkbook(file.getInputStream());
			Sheet sheet = wb.getSheetAt(0);
			CellReference cellReference = new CellReference("A4");
			boolean flag = false;
			for (int i = cellReference.getRow(); i <= sheet.getLastRowNum();) {
				Row r = sheet.getRow(i);
				if (r == null) {
					// 如果是空行（即没有任何数据、格式），直接把它以下的数据往上移动
					sheet.shiftRows(i + 1, sheet.getLastRowNum(), -1);
					continue;
				}
				flag = false;
				for (Cell c : r) {
					if (c.getCellType() != Cell.CELL_TYPE_BLANK) {
						flag = true;
						break;
					}
				}
				if (flag) {
					i++;
					continue;
				} else {// 如果是空白行（即可能没有数据，但是有一定格式）
					if (i == sheet.getLastRowNum())// 如果到了最后一行，直接将那一行remove掉
						sheet.removeRow(r);
					else
						// 如果还没到最后一行，则数据往上移一行
						sheet.shiftRows(i + 1, sheet.getLastRowNum(), -1);
				}
			}
			System.out.println("总行数：" + (sheet.getLastRowNum() + 1));

			for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				WXBTMP wxbtmp = new WXBTMP();

				if (row.getCell(0) == null) {
					return Msg.fail("临时箱号不可为空");

				} else {
					row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
					wxbtmp.setWXB05T((row.getCell(0).getStringCellValue()));

				}
				if (row.getCell(1) == null) {

					return Msg.fail("料号不可为空");

				} else {
					row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);

					wxbtmp.setWXB15((row.getCell(1).getStringCellValue()));

				}
				if (row.getCell(2) == null) {

				} else {
					row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
					wxbtmp.setWXB04((row.getCell(2).getStringCellValue()));

				}
				if (row.getCell(3) == null) {

				} else {
					row.getCell(3).setCellType(Cell.CELL_TYPE_NUMERIC);
					wxbtmp.setWXB08((new BigDecimal(row.getCell(3).getNumericCellValue())));
				}
				if (row.getCell(4) == null) {

				} else {
					row.getCell(4).setCellType(Cell.CELL_TYPE_NUMERIC);
					wxbtmp.setWXB09((new BigDecimal(row.getCell(4).getNumericCellValue())));
				}
				if (row.getCell(5) == null) {

				} else {
					row.getCell(5).setCellType(Cell.CELL_TYPE_NUMERIC);
					wxbtmp.setWXB10((int) row.getCell(5).getNumericCellValue());
				}

				wxbtmps.add(wxbtmp);

				if ((wxbtmp.getWXB15().substring(0, 2).equalsIgnoreCase("40")
						|| wxbtmp.getWXB15().substring(0, 2).equalsIgnoreCase("50") || wxbtmp.getWXB15()
						.substring(0, 2).equalsIgnoreCase("46")) == false) {
					if (wxbtmp.getWXB04() == null) {
						return Msg.fail(wxbtmp.getWXB15() + "---缸号不可为空");
					}

				}

				if (wxbtmp.getWXB15().trim() == "") {

					return Msg.fail("料号不可为空");

				}

				if (imaService.getCountByima01(wxbtmp.getWXB15()) == 0) {
					return Msg.fail(wxbtmp.getWXB15() + "不存在");
				}

				wxbtmp.setWSIZE(imaService.getIsSizeByima01(wxbtmp.getWXB15()));

				WXBTMPService.insertWXBTMP(wxbtmp);
				System.out.println(wxbtmp);
			}

			try {
				sheet = wb.getSheetAt(1);
				flag = false;
				System.out.println("总行数：" + (sheet.getLastRowNum() + 1));
				for (int i = cellReference.getRow(); i <= sheet.getLastRowNum();) {
					Row r = sheet.getRow(i);
					if (r == null) {
						// 如果是空行（即没有任何数据、格式），直接把它以下的数据往上移动
						sheet.shiftRows(i + 1, sheet.getLastRowNum(), -1);
						continue;
					}
					flag = false;
					for (Cell c : r) {
						if (c.getCellType() != Cell.CELL_TYPE_BLANK) {
							flag = true;
							break;
						}
					}
					if (flag) {
						i++;
						continue;
					} else {// 如果是空白行（即可能没有数据，但是有一定格式）
						if (i == sheet.getLastRowNum())// 如果到了最后一行，直接将那一行remove掉
							sheet.removeRow(r);
						else
							// 如果还没到最后一行，则数据往上移一行
							sheet.shiftRows(i + 1, sheet.getLastRowNum(), -1);
					}
				}
				for (int i = 1; i <= sheet.getLastRowNum(); i++) {
					Row row = sheet.getRow(i);

					row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
					row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
					row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
					row.getCell(3).setCellType(Cell.CELL_TYPE_NUMERIC);
					row.getCell(4).setCellType(Cell.CELL_TYPE_NUMERIC);
					row.getCell(5).setCellType(Cell.CELL_TYPE_NUMERIC);
					WXBSIZETMP wxbsizetmp = new WXBSIZETMP();
					wxbsizetmp.setTC_RVBS01("-");
					wxbsizetmp.setTC_RVBS02(0);
					if (row.getCell(2).getStringCellValue() == null) {
						return Msg.success("成功导入" + wxbtmps.size() + "笔!");
					}

					wxbsizetmp.setTC_RVBS03((row.getCell(2).getStringCellValue()));
					wxbsizetmp.setTC_RVBS04((new BigDecimal(row.getCell(5).getNumericCellValue())));
					wxbsizetmp.setTC_RVBS06((row.getCell(1).getStringCellValue()));
					wxbsizetmp.setWXB05T((row.getCell(0).getStringCellValue()));
					wxbsizetmp.setTC_RVBS16((new BigDecimal(row.getCell(3).getNumericCellValue())));
					wxbsizetmp.setTC_RVBS17((new BigDecimal(row.getCell(4).getNumericCellValue())));

					wxbtsizetmps.add(wxbsizetmp);
					// System.out.println(wxbsizetmp);

					wxbsizetmpService.insertWXBSIZETMP(wxbsizetmp);
				}

			} catch (Exception e) {
			}

		} catch (IOException e) {
			return Msg.fail("上传失败，发生异常");
		}
		if (wxbtmps.size() > 0) {
			return Msg.success("成功导入" + wxbtmps.size() + "笔!");
		} else {
			return Msg.fail("上传解析为空");
		}

	}

	@RequestMapping(value = "addwxbtmp")
	@ResponseBody
	public Msg addWXBTMP(WXBTMP WXBTMP, String PMMUD02, String op, String flag, HttpServletRequest request) {
		boolean b = false;
		String wxb05t = null;
		if (WXBTMP == null) {
			return Msg.fail("输入为空");
		}
		wxb05t = WXBTMPService.getWXB05T("CY0001");
		WXBTMP.setWXB05T(wxb05t);

		if (WXBTMP.getWXB15() == null) {

			return Msg.fail("料号不可为空");

		}

		if ((WXBTMP.getWXB15().substring(0, 2).equalsIgnoreCase("40")
				|| WXBTMP.getWXB15().substring(0, 2).equalsIgnoreCase("50") || WXBTMP.getWXB15().substring(0, 2)
				.equalsIgnoreCase("46")) == false) {
			if (WXBTMP.getWXB04() == null) {
				return Msg.fail("缸号不可为空");
			} else {
				if (WXBTMP.getWXB04().trim().equals("")) {
					return Msg.fail("缸号不可为空");
				}

			}

		}

		b = WXBTMPService.insertWXBTMP(WXBTMP);
		if (b) {
			return Msg.success();

		} else {
			return Msg.fail();
		}

	}

	@RequestMapping(value = "deletewxbtmp")
	@ResponseBody
	public Msg deleteWXBTMP(WXBTMP WXBTMP, String PMMUD02, String op, String flag, HttpServletRequest request) {
		boolean b = false;
		if (WXBTMP == null) {
			return Msg.fail("输入为空");
		}

		b = WXBTMPService.deleteWXBTMP(WXBTMP.getWID());
		if (b) {
			wxbsizetmpService.deleteWXBSIZETMP(WXBTMP.getWXB05T());

			return Msg.success();

		} else {
			return Msg.fail();
		}

	}

	/**
	 * 
	 * 查询送货维护数据
	 * 
	 * @param page
	 * @param rows
	 * @param rq
	 * @param PMN01
	 * @param PMN02
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getwxbtmp")
	@ResponseBody
	public EasyuiDataGridJson getWXBTMP(@RequestParam(value = "page", defaultValue = "1") Integer page,
		String WXB11,	@RequestParam(value = "rows", defaultValue = "50") Integer rows, HttpServletRequest rq, WXBTMP wxbtmp)
			throws Exception {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageMethod.startPage(page, rows);

		// startPage后面紧跟的这个查询就是一个分页查询
		List<?> list = WXBTMPService.get(wxbtmp,WXB11);
		// List<WXBTMP> list = WXBTMPService.getWXBTMP(PMN01, PMN02);

		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

}
