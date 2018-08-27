package com.chenyuantech.eps.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import org.springframework.web.servlet.ModelAndView;

import com.chenyuantech.eps.bean.EasyuiDataGridJson;
import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.bean.PMC;
import com.chenyuantech.eps.bean.SHD;
import com.chenyuantech.eps.bean.WXB;
import com.chenyuantech.eps.bean.WXBSIZETMP;
import com.chenyuantech.eps.bean.WXB;
import com.chenyuantech.eps.service.PMMPMNService;
import com.chenyuantech.eps.service.SHDService;
import com.chenyuantech.eps.service.WXBSIZESService;
import com.chenyuantech.eps.service.WXBService;
import com.chenyuantech.eps.utils.Dateutil;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;

@Controller
@RequestMapping("/wxb")
public class WXBController {

	@Autowired
	private WXBService wxbService;
	private ModelAndView views = new ModelAndView("error404");

	@Autowired
	private WXBSIZESService wxbsizesService;

	@Autowired
	private SHDService shdservice;

	@Autowired
	private PMMPMNService pmmpmnService;

	@RequestMapping(value = "/updatewxb")
	@ResponseBody
	public Msg updatewxb(WXB wxb, String PMMUD02, String op, String PMM03, String ROLE, String flag,
			HttpServletRequest request) {

		if (LoginController.islogin(request) == false) {
			return Msg.error();
		}

		if (flag == null) {
			flag = "p";
		}
		if (wxb != null) {
			try {
				if (flag.equalsIgnoreCase("imp") == true && ROLE != null) {
					if ((wxb.getWXB15().substring(0, 2).equalsIgnoreCase("40")
							|| wxb.getWXB15().substring(0, 2).equalsIgnoreCase("50") || wxb.getWXB15().substring(0, 2)
							.equalsIgnoreCase("46")) == false) {
						if (wxb.getWXB04() == null) {
							return Msg.fail("缸号不可为空");
						} else {
							if (wxb.getWXB04().trim().equals("")) {
								return Msg.fail("缸号不可为空");
							}

						}
						if (wxb.getWXB08() == null) {
							return Msg.fail("毛重不可为空");
						} else {

						}
					}

				} else {

					if (wxbService.getcountPMN(wxb) == false) {
						return Msg.fail("处理失败!" + "单据/项次:" + wxb.getWXB01() + "/" + wxb.getWXB02() + "不存在");
					}

					if (wxbService.getcountFL(wxb) == false) {
						if (wxb.getWXB04() == null) {
							return Msg.fail("缸号不可为空");
						}
						if (wxb.getWXB10() == null) {
							return Msg.fail("管数不可为空");
						}
						if (wxb.getWXB08() == null) {
							return Msg.fail("毛重不可为空");
						}
						if (wxb.getWXB04() == "") {
							return Msg.fail("缸号不可为空");
						}

					}

				}
			} catch (Exception e) {
				return Msg.fail("处理失败!" + e.getMessage());
			}

			if (wxbService.updateWXB(wxb)) {
				return Msg.success();
			}

		}

		return Msg.fail();

	}

	@RequestMapping(value = "/deleteshd")
	@ResponseBody
	public Msg deleteSHD(HttpServletRequest request, String SHD01) {

		if (SHD01 != null) {
			try {
				if (shdservice.deleteSHD(SHD01)) {
					return Msg.success();
				}
			} catch (Exception e) {
				return Msg.fail(e.getMessage() + "\r\n 请联系管理员处理");
			}

		} else {
			return Msg.fail("送货单号为空");
		}

		return Msg.fail();

	}

	@RequestMapping(value = "getpmnlist", method = RequestMethod.GET)
	@ResponseBody
	public List<?> getPMNListbyPMMUD02(HttpServletRequest rq, String PMMUD02) {
		return pmmpmnService.getPMNListbyPMMUD02(PMMUD02);
	}

	/**
	 * 列印外箱标
	 * 
	 * @param WXB05
	 * @return
	 */
	@RequestMapping(value = "printwxb", method = RequestMethod.GET)
	public ModelAndView getwxbprint(String WXB05) {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		ModelAndView view = new ModelAndView("wxb");
		List<LinkedHashMap<String, Object>> lMaps = wxbService.getWXBByWXB05(WXB05);
		if (lMaps.size() > 0) {
			map = lMaps.get(0);
		} else {

			return views;
		}

		view.addObject("wxb", map);
		return view;
	}

	/*
	 * @RequestMapping(value = "printwxbs", method = RequestMethod.GET) public
	 * ModelAndView getwxbprints(String WXB05) { LinkedHashMap<String, Object>
	 * map = new LinkedHashMap<>(); ModelAndView view = new
	 * ModelAndView("wxbs"); List<LinkedHashMap<String, Object>> lMaps =
	 * wxbService.getWXBByWXB05(WXB05); if (lMaps.size() > 0) { map =
	 * lMaps.get(0); } else {
	 * 
	 * return views; }
	 * 
	 * view.addObject("wxb", map); return view; }
	 */
	/**
	 * 列印外箱标 . 不分SIZE打印
	 * 
	 * @param WXB05
	 * @return
	 */
	@RequestMapping(value = "printwxbs", method = RequestMethod.POST)
	public ModelAndView getwxbprintMult(@RequestParam(value = "wxbls[]") String[] wxbls, String flag) {
		List<LinkedHashMap<String, Object>> listmap = null;
		ModelAndView view = new ModelAndView("wxbs");
		if (wxbls == null) {
			return views;
		}
		if (flag == null) {
			flag = "-";
		}
		if (wxbls.length > 0) {
			if (flag.equalsIgnoreCase("imp")) {

				listmap = wxbService.getWXBByWXB05s2(wxbls);
			} else {
				listmap = wxbService.getWXBByWXB05s(wxbls);
			}
			if (listmap.size() > 0) {
				view.addObject("wxbs", listmap);
				return view;
			} else {

				return views;
			}

		} else {
			return views;
		}

	}

	/**
	 * 列印外箱标 . 不分SIZE打印
	 * 
	 * @param WXB05
	 * @return
	 */
	@RequestMapping(value = "printwxbs2", method = RequestMethod.POST)
	public ModelAndView getwxbprintMult2(@RequestParam(value = "wxbls[]") String[] wxbls, String flag) {
		List<LinkedHashMap<String, Object>> listmap = null;
		ModelAndView view = new ModelAndView("wxbs2");
		String WXB05 = null;
		if (flag == null) {
			flag = "-";
		}
		if (wxbls == null) {
			return views;
		}

		if (wxbls.length > 0) {
			if (flag.equalsIgnoreCase("imp")) {

				listmap = wxbService.getWXBByWXB05s2(wxbls);
			} else {
				listmap = wxbService.getWXBByWXB05s(wxbls);
			}
			if (listmap.size() > 0) {

				for (int i = 0; i < listmap.size(); i++) {
					WXB05 = listmap.get(i).get("WXB05").toString();
					if (wxbsizesService.getcountWXB05(WXB05) > 0) {
						if (wxbsizesService.getWXBSIZEByWXB05(WXB05).size() > 0) {
							listmap.get(i).put("SZS", wxbsizesService.getWXBSIZEByWXB05(WXB05));
						}

					}

				}

				view.addObject("wxbs", listmap);
				return view;
			} else {

				return views;
			}

		} else {
			return views;
		}

	}

	/*
	 * @RequestMapping(value = "addshd")
	 * 
	 * @ResponseBody public Msg createshd(HttpServletRequest request, SHD shd,
	 * 
	 * @RequestParam(value = "wxbs") String[] wxbs) { System.out.println("--" +
	 * shd);
	 * 
	 * 
	 * 
	 * }
	 */
	@RequestMapping(value = "addshd", method = RequestMethod.POST)
	@ResponseBody
	public Msg createshd(@RequestParam(value = "wxbls[]") String[] wxbs,
			@RequestParam(value = "wxb01s[]") String[] wxb01s, SHD shd, String PMMUD02) {

		for (int i = 0; i < wxb01s.length - 1; i++) {
			wxb01s[i].substring(0, 1);
			if (wxb01s[i].substring(0, 1).equals(wxb01s[i + 1].substring(0, 1)) == false) {
				return Msg.fail("处理失败!单据首字母不一致");
			}

		}
		if (wxbService.getCountPmm02(wxb01s) > 1) {
			return Msg.fail("处理失败!一般采购与委外采购不能产生同一张送货清单");

		}

		if (shd != null) {
			shd.setSHD01(wxbService.getWXB03(PMMUD02));
		} else {
			return Msg.fail("送货单录入不全");
		}
		if (PMMUD02 == null) {
			return Msg.fail("登录超时");
		}
		if (wxbs == null) {
			return Msg.fail("选择箱号送货");
		}
		if (wxbs.length == 0) {
			return Msg.fail("选择项送货单不为空");
		}

		if (wxbService.updateWXB03(wxbs, shd)) {

			return Msg.success("处理成功！送货单号为：" + shd.getSHD01());
		} else {
			return Msg.fail();
		}

	}

	@RequestMapping("shdlist")
	@ResponseBody
	public List<?> getSHDList(String PMMUD02, String ROLE) {
		return wxbService.getSHDList(PMMUD02, ROLE);
	}

	@RequestMapping(value = "printshd", method = RequestMethod.GET)
	public ModelAndView getshdprint(String SHD01, HttpServletRequest rq) {
		PMC pmc = new PMC();
		// SHD s = new SHD();
		// s=shdservice.getshdbyshd01(SHD01);

		Object o = rq.getSession().getAttribute("company");
		if (o != null) {
			pmc = (PMC) o;

		}

		ModelAndView view = null;
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		List<LinkedHashMap<String, Object>> lMaps = wxbService.getWXBBySHD01(SHD01);
		if (lMaps.size() > 0) {
			map = lMaps.get(0);
			// System.out.println(lMaps.get(0).get("SHD08") + "=======");
		} else {

			return views;
		}
		view = new ModelAndView("shd");
		view.addObject("shd", map);
		view.addObject("shds", lMaps);
		view.addObject("pmc", pmc);
		// view.addObject("s", s);

		for (int i = 0; i < lMaps.size() - 1; i++) {
			if (lMaps.get(i + 1).get("PMN04").toString().equals(lMaps.get(i).get("PMN04").toString())
					&& lMaps.get(i + 1).get("WXB04").toString().equals(lMaps.get(i).get("WXB04").toString())) {
				lMaps.get(i + 1).put("CQ", "0");
			}

		}

		return view;
	}

	@RequestMapping(value = "deletewxb")
	@ResponseBody
	public Msg deletewxb(WXB wxb, HttpServletRequest request) {
		boolean b = false;
		if (wxb == null) {
			return Msg.fail("输入为空");
		}
		try {
			if (wxbService.exitshd(wxb.getWXB05())) {
				b = wxbService.deleteWXB(wxb.getWXB05());
			} else {
				return Msg.fail("处理失败!箱号：" + wxb.getWXB05() + "已送货");
			}
			if (b) {
				return Msg.success();
			} else {
				return Msg.fail("处理失败!");
			}
		} catch (Exception e) {
			return Msg.fail("处理失败!");
		}

	}

	@RequestMapping(value = "addwxb")
	@ResponseBody
	public Msg addwxb(WXB wxb, String PMMUD02, String op, String PMM03, String ROLE, String flag,
			HttpServletRequest request) {

		if (flag == null) {
			flag = "p";
		}
		if (wxb == null) {
			return Msg.fail("输入为空");
		}
		try {
			if (flag.equalsIgnoreCase("imp") == true && ROLE != null) {

				if ((wxb.getWXB15().substring(0, 2).equalsIgnoreCase("40")
						|| wxb.getWXB15().substring(0, 2).equalsIgnoreCase("50") || wxb.getWXB15().substring(0, 2)
						.equalsIgnoreCase("46")) == false) {
					if (wxb.getWXB04() == null) {
						return Msg.fail("缸号不可为空");
					} else {
						if (wxb.getWXB04().trim().equals("")) {
							return Msg.fail("缸号不可为空");
						}

					}
					if (wxb.getWXB08() == null) {
						return Msg.fail("毛重不可为空");
					} else {

					}

				}

				PMMUD02 = wxbService.getWXB05("CY0001");
				wxb.setWXB05(PMMUD02);

			} else {

				if (PMMUD02 != null && wxb != null) {
					PMMUD02 = wxbService.getWXB05(PMMUD02);
					wxb.setWXB05(PMMUD02);
				}

				if (wxbService.getcountPMN(wxb) == false) {
					return Msg.fail("处理失败!" + "单据/项次:" + wxb.getWXB01() + "/" + wxb.getWXB02() + "不存在");
				}

				if (wxbService.getcountFL(wxb) == false) {
					if (wxb.getWXB04() == null) {
						return Msg.fail("缸号不可为空");
					}

					if (wxb.getWXB10() == null) {
						return Msg.fail("管数不可为空");
					}
					if (wxb.getWXB04() == "") {
						return Msg.fail("缸号不可为空");
					}

				}
			}

			if (wxbService.insertWXB(wxb)) {

				return Msg.success();

			} else {
				return Msg.fail();
			}

		} catch (Exception e) {
			return Msg.fail("处理失败!" + e.getMessage());
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
	@RequestMapping("/getwxb1")
	@ResponseBody
	public EasyuiDataGridJson getwxb1(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "50") Integer rows, String PMMUD02, HttpServletRequest rq,
			String WXB03, String WXB04, String WXB11, String WXB05, String PMN01, Integer PMN02, String ROLE)
			throws Exception {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageMethod.startPage(page, rows);

		// startPage后面紧跟的这个查询就是一个分页查询
		List<?> list = wxbService.selectWXBByWXB05T(WXB05, WXB11);
		// List<WXB> list = wxbService.getWXB(PMN01, PMN02);

		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

	public String concat(String a, String b) {
		String s = "";
		if (a == null)
			return "";
		String[] r1 = a.split(",");
		String[] r2 = b.split(",");
		for (int i = 0; i < r1.length; i++) {
			if (s.length() > 0) {
				s = s + "," + r1[i] + " " + r2[i];
			} else {
				s = s + r1[i] + " " + r2[i];

			}
		}
		return s;

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
	@RequestMapping("/getwxb")
	@ResponseBody
	public EasyuiDataGridJson getwxb(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "50") Integer rows, String PMMUD02, HttpServletRequest rq,
			String WXB03, String WXB04, String WXB11, String WXB05, String PMN01, Integer PMN02, String ROLE,
			String ISSH) throws Exception {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		String sort = rq.getParameter("sort");
		String order = rq.getParameter("order");

		// System.out.println("-------ISSH"+ISSH+"sort--"+sort);

		PageMethod.startPage(page, rows);

		// startPage后面紧跟的这个查询就是一个分页查询
		List<?> list = wxbService.getWXB2(PMN01, PMN02, WXB03, WXB04, WXB05, WXB11, ISSH, this.concat(sort, order),
				PMMUD02, ROLE);
		// List<WXB> list = wxbService.getWXB(PMN01, PMN02);

		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

	@RequestMapping("/upload")
	@ResponseBody
	public Msg uploadExcel(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
		List<WXB> wxbs = new ArrayList<WXB>();

		HttpSession session = request.getSession();
		String pmmud02 = ((PMC) session.getAttribute("company")).getPMC01();
		System.out.println("-------" + pmmud02);
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
				WXB wxb = new WXB();

				if (row.getCell(0) == null) {
					return Msg.fail("单号不可为空");

				} else {
					row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
					wxb.setWXB01((row.getCell(0).getStringCellValue()));

				}
				if (row.getCell(1) == null) {

					return Msg.fail("项次不可为空");

				} else {
					row.getCell(1).setCellType(Cell.CELL_TYPE_NUMERIC);

					wxb.setWXB02((int) (row.getCell(1).getNumericCellValue()));

				}
				if (row.getCell(2) == null) {

				} else {
					// 缸号
					row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
					wxb.setWXB04((row.getCell(2).getStringCellValue()));

				}
				if (row.getCell(3) == null) {

				} else {
					// 色号
					row.getCell(3).setCellType(Cell.CELL_TYPE_STRING);
					wxb.setWXB06((row.getCell(3).getStringCellValue()));

				}

				if (row.getCell(4) == null) {

				} else {
					row.getCell(4).setCellType(Cell.CELL_TYPE_NUMERIC);
					wxb.setWXB08((new BigDecimal(row.getCell(4).getNumericCellValue())));
				}
				if (row.getCell(5) == null) {

				} else {
					row.getCell(5).setCellType(Cell.CELL_TYPE_NUMERIC);
					wxb.setWXB09((new BigDecimal(row.getCell(5).getNumericCellValue())));
				}
				if (row.getCell(6) == null) {

				} else {
					row.getCell(6).setCellType(Cell.CELL_TYPE_NUMERIC);
					wxb.setWXB10((int) row.getCell(6).getNumericCellValue());
				}
				if (row.getCell(7) == null) {
					wxb.setWXB07(Dateutil.getCurrentDate("yyyy-MM-dd"));

				} else {
					row.getCell(7).setCellType(Cell.CELL_TYPE_STRING);
					wxb.setWXB07(row.getCell(7).getStringCellValue());

				}
				wxbs.add(wxb);

			}

		} catch (IOException e) {
			return Msg.fail("上传失败，发生异常");
		}
		for (WXB w : wxbs) {
			System.out.println("------>:" + w.toString());
		}

		if (wxbs.size() > 0) {
			return wxbService.insertimpWxb(wxbs, pmmud02);
		} else {
			return Msg.fail(" 记录 0");
		}

	}

	/**
	 * 查询送货单
	 * 
	 * @param page
	 * @param rows
	 * @param PMMUD02
	 * @param rq
	 * @param SHD01
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getwxbshd2")
	@ResponseBody
	public EasyuiDataGridJson getwxbSHD2(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "50") Integer rows, String PMMUD02, String ROLE,
			HttpServletRequest rq, String SHD01, String SHD02) throws Exception {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageMethod.startPage(page, rows);

		// startPage后面紧跟的这个查询就是一个分页查询
		List<?> list = shdservice.getSHDList(SHD01, SHD02, PMMUD02, ROLE);
		// List<WXB> list = wxbService.getWXB(PMN01, PMN02);

		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

	/**
	 * 查询送货单
	 * 
	 * @param page
	 * @param rows
	 * @param PMMUD02
	 * @param rq
	 * @param SHD01
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getwxbshd")
	@ResponseBody
	public EasyuiDataGridJson getwxbSHD(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "50") Integer rows, String PMMUD02, HttpServletRequest rq,
			String SHD01) throws Exception {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageMethod.startPage(page, rows);

		// startPage后面紧跟的这个查询就是一个分页查询
		List<?> list = wxbService.getWXBBySHD01(SHD01);
		// List<WXB> list = wxbService.getWXB(PMN01, PMN02);

		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}
}
