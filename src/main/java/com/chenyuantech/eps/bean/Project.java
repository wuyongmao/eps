package com.chenyuantech.eps.bean;


/**
 * 测试Excel导出
 * @author yongmao.wu
 *
 */
public class Project {
	private Integer id;

	private String name;

	private String technology;// 所用技术

	private String remarks;// 备注
	// 省略setter/getter

	public Integer getId() {
		return id;
	}

	public Project(Integer id, String name, String technology, String remarks) {
		super();
		this.id = id;
		this.name = name;
		this.technology = technology;
		this.remarks = remarks;
	}

	public String getName() {
		return name;
	}

	public String getRemarks() {
		return remarks;
	}

	public String getTechnology() {
		return technology;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
}
