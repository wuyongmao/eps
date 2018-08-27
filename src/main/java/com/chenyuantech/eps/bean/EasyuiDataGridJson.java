package com.chenyuantech.eps.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 后台向前台返回JSON，用于easyui的datagrid
 * 
 * 
 */
public class EasyuiDataGridJson implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long total=(long) 0;// 总记录数
	private List<?> rows  ;// 每行记录
 
	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getRows() {
		if(rows==null){
			rows=new ArrayList<>();
		}
		
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
