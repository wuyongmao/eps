package com.chenyuantech.eps.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chenyuantech.eps.bean.Chgreason;
import com.chenyuantech.eps.bean.EasyuiDataGridJson;
import com.chenyuantech.eps.bean.Msg;
import com.chenyuantech.eps.service.ChgreasonService;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;

@Controller
@RequestMapping("/chgreason")
public class ChgreasonController {

	@Autowired
	ChgreasonService chgreasonService;

	// 新增
	@RequestMapping("/insertchg")
	@ResponseBody
	public Msg insertChgreason(Chgreason chgreason, HttpServletRequest rq) {

		return chgreasonService.insertchgreason(chgreason) ? Msg.success() : Msg.fail();

	}

	/**
	 * 修改
	 * 
	 * @param chgreason
	 * @param rq
	 * @return
	 */
	@RequestMapping("/eidtchg")
	@ResponseBody
	public Msg updateChgreason(Chgreason chgreason, HttpServletRequest rq) {

		return chgreasonService.updatechgreason(chgreason) ? Msg.success() : Msg.fail();

	}

	/**
	 * 模糊查询
	 * 
	 * @param page
	 * @param rows
	 * @param rq
	 * @param chgreason
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/getchg")
	@ResponseBody
	public EasyuiDataGridJson getChgreasonByParam(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "15") Integer rows, HttpServletRequest rq, Chgreason chgreason) throws Exception {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		String sort = rq.getParameter("sort");
		String order = rq.getParameter("order");
		PageMethod.startPage(page, rows);

		// startPage后面紧跟的这个查询就是一个分页查询
		List<?> list = chgreasonService.findByParam(chgreason, sort, order);

		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo<?> pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

	/**
	 * 查询全部
	 * 
	 * @param page
	 * @param rows
	 * @param rq
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/getchgAll")
	@ResponseBody
	public EasyuiDataGridJson getChgreasonAll(@RequestParam(value = "page", defaultValue = "1") Integer page,
			@RequestParam(value = "rows", defaultValue = "10") Integer rows, HttpServletRequest rq) throws Exception {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageMethod.startPage(page, rows);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Chgreason> list = chgreasonService.findAll();

		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo pageinfo = new PageInfo(list);

		EasyuiDataGridJson EasyuiDataGridJson = new EasyuiDataGridJson();

		EasyuiDataGridJson.setTotal(pageinfo.getTotal());
		EasyuiDataGridJson.setRows(pageinfo.getList());

		return EasyuiDataGridJson;
	}

}
