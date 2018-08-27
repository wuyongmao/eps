var eps = $.extend({}, eps);/* 全局对象 */
var column_shxqcm = []; // 送货详情记录 columns
var column_jqxqcm = []; // 交期详情记录 columns
var column_jqxqcm2 = []; // 供应商 交期详情记录 columns
var column_size = []; // 供应商 交期详情记录 columns
var column_psqkcm = []; // 批色详情记录 columns
var column_exitsbg = []; // 是否有变更 columns
var column_exitsbg2 = []; // 是否有变更 columns

var column_psqkcm2 = []; // 供应商 批色详情记录 columns
var addflag = 0;
var column_ALLKIND = [];// 公用代码表
var column_CHGREASON = [];// 变更事由码
var column_COLORCHKLOG = [];// 批色历史记录档
var column_DDLOG = [];// 公用代码表
var column_DELIVERYLOG = []; // 送货记录表
var column_PMC = []; // 供应商主档
var column_PMM = [];// 采购主档
var column_PMN = [];// 采购明细
var column_RIGHTS = [];// 用户菜单权限档
var column_USERS = [];// 用户主档
var column_PMM_PMN = []; // 采购主明细档
eps.pmnselectrow = {};
eps.PMMUD02_t = '';
eps.rowDate = {};
eps.PMMUD02 = ''; // 供应商id
eps.PMM03 = ''; // 采购员id
eps.ROLE = "";
eps.PMN01 = "";
eps.PMN02 = ""; 



document.write("<script language='javascript' src='./inc/js/column_size.js'></script>");
document.write("<script language='javascript' src='./inc/js/column_size2.js'></script>");
document.write("<script language='javascript' src='./inc/js/column_size3.js'></script>");
document.write("<script language='javascript' src='./inc/js/column_size4.js'></script>");

eps.status = "";

eps.PMM03_t = '';

eps.gbclickfield = '';
eps.ACC = ''; // 登录用户账户
eps.currenttime = '';
eps.currentdate = '';
eps.ACCID = ''; // 登录用户账户
eps.NAME = ''; // 登录用户账户
eps.urlvalue = '';
eps.dqdate = '';

// columns定义初始化 ----我的订单，我的采购单
eps.columnsinit = function() {
	var column_exitsbg_t = [{
				"field" : "pnb01",
				"title" : "采购单号",
				"width" : 100
			}, {
				"field" : "pnb03",
				"title" : "采购项次",
				"width" : 100
			}, {
				"field" : "pnb20b",
				"title" : "变更前数量",
				"width" : 100
			}, {
				"field" : "pnb20a",
				"title" : "变更后数据",
				"width" : 100
			}, {
				"field" : "pnasendd",
				"title" : "发出日期",
				"width" : 100
			}, {
				"field" : "pnb02",
				"title" : "变更版本",
				"width" : 100
			}];

	var column_shxqcm_t = [{
				"field" : "RVB04",
				"title" : "采购单号",
				"width" : 10,
				"hidden" : true
			}, {
				"field" : "RVB03",
				"title" : "采购单项次",
				"width" : 10,
				"hidden" : true
			},

			{
				"field" : "RVB01",
				"title" : "收货单号",
				"width" : 180
			}, {
				"field" : "RVB02",
				"title" : "收货单项次",
				"width" : 90,
				"align" : "right"
			}, {
				"field" : "RVB38",
				"title" : "批号",
				"width" : 100
			}, {
				"field" : "RVA06",
				"title" : "收货日期",
				"width" : 190
			}, {
				"field" : "RVACONF",
				"title" : "确认码",
				"width" : 160,
				formatter : function(val, rowData, rowIndex) {

					if (val == undefined) {

						val = '';
					} else if (val == "X") {

						return '<span>' + '作废' + '</span>';

					} else if (val == "Y") {

						return '<span>' + '已确认' + '</span>';

					} else if (val == "N") {

						return '<span>' + '未确认' + '</span>';

					}
				}
			}, {
				"field" : "RVA32",
				"title" : "签核状况",
				"width" : 100,
				formatter : function(val, rowData, rowIndex) {

					if (val == undefined) {

						val = '';
					} else if (val == "1") {

						return '<span>' + '已核准' + '</span>';

					} else if (val == "2") {

						return '<span>' + '发出采购单' + '</span>';

					} else if (val == "6") {

						return '<span>' + '结案' + '</span>';

					} else if (val == "9") {

						return '<span>' + '取消' + '</span>';

					}
				}
			}, {
				"field" : "RVB07",
				"title" : "实收数量",
				"width" : 100,
				"align" : "right"
			}, {
				"field" : "RVB30",
				"title" : "本次入库量",
				"width" : 100,
				"align" : "right"
			}, {
				"field" : "RVB29",
				"title" : "本次验退量",
				"width" : 110,
				"align" : "right"
			}, {
				"field" : "RVV17",
				"title" : "本次仓退量",
				"width" : 110,
				"align" : "right"
			}, {
				"field" : "JINDU",
				"title" : "进度",
				"width" : 100,
				formatter : function(val, rowData, rowIndex) {

					if (val == undefined) {
						val = '';
					} else if (val == "1") {
						return '<span>' + '仓库点收(' + val + ')</span>';
					} else if (val == "2") {
						return '<span>' + '品质在验(' + val + ')</span>';
					} else if (val == "3") {
						return '<span>' + '待办入库(' + val + ')</span>';
					} else if (val == "4") {
						return '<span>' + '入库(' + val + ')</span>';

					}
				}

			}, {
				"field" : "RVB39",
				"title" : "检验否",
				"width" : 100
			}, {
				"field" : "RVB36",
				"title" : "仓库代号",
				"width" : 100,
				"align" : "right"
			}];

	var column_jqxqcm_t = [{
				"field" : "pmn01",
				"title" : "采购单号",
				"width" : 180
			}, {
				"field" : "pmn02",
				"title" : "项次",
				"width" : 40
			}, {
				"field" : "accid",
				"title" : "需求变更发起人",
				"width" : 140,
				"hidden" : true

			}, {
				"field" : "name",
				"title" : "需求变更发起人",
				"width" : 140

			}, {
				"field" : "replydd",
				"title" : "供应商回复交期",
				"width" : 140
				// ,
			// editor : {
			// type : 'datebox',
			// options : {
			// valueField : 'replydd',
			// required : true
			// }
			// }
		}	, {
				"field" : "launchtime",
				"title" : "发起时间",
				"width" : 160
			}, {
				"field" : "chgid",
				"title" : "变更理由码ID",
				"width" : 40,
				editor : {
					type : 'combogrid',
					options : {
						idField : 'chgid',
						textField : 'reasondesc',
						method : 'get',
						editable : false,
						fitColumns : true,
						labelPosition : 'top',
						panelWidth : 400,
						url : 'chgreason/getchgAll',
						columns : [[{
									field : 'chgid',
									title : 'chgid',
									width : 60,
									hidden : true
								}, {
									field : 'gs',
									title : '归属',
									width : 100
								}, {
									field : 'reason',
									title : '变更理由代码',
									width : 100
								}, {
									field : 'reasondesc',
									title : '变更理由描述',
									width : 100
								}]]
					}
				}
			}, {
				"field" : "reasondesc",
				"title" : "变更理由描述",
				"width" : 140

			}, {
				"field" : "ddid",
				"title" : "流水号",
				"width" : 10,
				"hidden" : true
			},

			{
				"field" : "requirementdd",
				"title" : "采购方需求交期",
				"width" : 180,
				editor : {
					type : 'datebox',
					options : {
						valueField : 'requirementdd',
						required : true
					}
				}
			}, {
				"field" : "memo",
				"title" : "备注",
				"width" : 100,
				editor : {
					type : 'textbox',
					options : {
						valueField : 'memo',
						required : false
					}
				}
			}, {
				"field" : "status",
				"title" : "状态",
				"width" : 180,
				formatter : function(val, rowData, rowIndex) {

					if (val == undefined) {

						val = '';
					} else if (val == "0") {
						return '<span>' + '不同意' + '</span>';
					} else if (val == "1") {
						return '<span>' + '同意' + '</span>';
					} else if (val == "2") {
						return '<span>' + '待确认' + '</span>';
					}
				}
			}, {
				"field" : "status1",
				"title" : "状态修改",
				"width" : 100,

				formatter : function(value, rowData, rowIndex) {
				 
					if (rowIndex + 1 == $('#dialog_m_dataGrid')
							.datagrid('getRows').length) {

 
						eps.rowDate = rowData;
 						return '<span  onclick="changeStatus()"  style="color:red; text-decoration:underline;  text-decoration-color: #f06d06;    "   >修改状态</span>';
					} else {

						eps.rowDate = {};

					}
				}
			}];

	var column_jqxqcm_t2 = [{
				"field" : "pmn01",
				"title" : "采购单号",
				"width" : 180
			}, {
				"field" : "pmn02",
				"title" : "项次",
				"width" : 40
			}, {
				"field" : "accid",
				"title" : "需求变更发起人",
				"width" : 140,
				"hidden" : true

			}, {
				"field" : "name",
				"title" : "需求变更发起人",
				"width" : 140

			}, {
				"field" : "replydd",
				"title" : "供应商回复交期",
				"width" : 140,
				editor : {
					type : 'datebox',
					options : {
						valueField : 'replydd',
						required : true
					}
				}
			}, {
				"field" : "launchtime",
				"title" : "发起时间",
				"width" : 160
			}, {
				"field" : "chgid",
				"title" : "变更理由码ID",
				"width" : 40,
				editor : {
					type : 'combogrid',
					options : {
						idField : 'chgid',
						textField : 'reasondesc',
						method : 'get',
						editable : false,
						fitColumns : true,
						labelPosition : 'top',
						panelWidth : 400,
						url : 'chgreason/getchgAll',
						columns : [[{
									field : 'chgid',
									title : 'chgid',
									width : 60,
									hidden : true
								}, {
									field : 'gs',
									title : '归属',
									width : 100
								}, {
									field : 'reason',
									title : '变更理由代码',
									width : 100
								}, {
									field : 'reasondesc',
									title : '变更理由描述',
									width : 100
								}]]
					}
				}
			}, {
				"field" : "reasondesc",
				"title" : "变更理由描述",
				"width" : 140

			}, {
				"field" : "ddid",
				"title" : "流水号",
				"width" : 10,
				"hidden" : true
			},

			{
				"field" : "requirementdd",
				"title" : "采购方需求交期",
				"width" : 180 
		}	, {
				"field" : "memo",
				"title" : "备注",
				"width" : 100,
				editor : {
					type : 'textbox',
					options : {
						valueField : 'memo',
						required : false
					}
				}
			}, {
				"field" : "status",
				"title" : "状态",
				"width" : 180,
				formatter : function(val, rowData, rowIndex) {

					if (val == undefined) {

						val = '';
					} else if (val == "0") {
						return '<span>' + '不同意' + '</span>';
					} else if (val == "1") {
						return '<span>' + '同意' + '</span>';
					} else if (val == "2") {
						return '<span>' + '待确认' + '</span>';
					}
				}
			}, {
				"field" : "status1",
				"title" : "状态修改",
				"width" : 100,

				formatter : function(value, rowData, rowIndex) {
				 
					if (rowIndex + 1 == $('#dialog_m_dataGrid')
							.datagrid('getRows').length) {

						// console.info("rowData----------->");

						eps.rowDate = rowData;
						// console.info(rowData);
						return '<span  onclick="changeStatus()"  style="color:red; text-decoration:underline;  text-decoration-color: #f06d06;    "   >修改状态</span>';
					} else {

						eps.rowDate = {};

					}
				}
			}];

	var column_psqkcm_t = [{
				"field" : "accid",
				"title" : "用户accid",
				"width" : 10,
				"hidden" : true
			}, {
				"field" : "chkid",
				"title" : "流水号",
				"width" : 100,
				"hidden" : true
			}, {
				"field" : "pmn01",
				"title" : "采购单号",
				"width" : 150
			}, {
				"field" : "pmn02",
				"title" : "采购项次",
				"width" : 80
			}, {
				"field" : "seq",
				"title" : "检验项次",
				"width" : 100,
				editor : {
					type : 'numberbox',
					options : {
						valueField : 'seq',
						required : true
					}
				}
			}, {
				"field" : "qcresult",
				"title" : "品检检验结果",
				"width" : 80,

				editor : {
					type : 'combobox',
					options : {
						valueField : 'qcresult',
						required : true,
						valueField : 'value',
						textField : 'qcresult',
						editable : false,
						panelHeight : 'auto',
						data : [{
									qcresult : '通过',
									value : 'Y'
								}, {
									qcresult : '不通过',
									value : 'N'
								}]
					}
				}
			}, {
				"field" : "chktime",
				"title" : "检验时间",
				"width" : 120
			}, {
				"field" : "rdresult",
				"title" : "确发检验结果",
				"hidden" : true,
				"width" : 100,
				editor : {
					type : 'textbox',
					options : {
						valueField : 'rdresult',
						required : false
					}
				}
			}, {
				"field" : "attr",
				"title" : "附件",
				"width" : 100,
				editor : {
					type : 'textbox',
					options : {
						editable : false,
						valueField : 'attr',
						required : false,
						buttonText : 'choose file',
						iconCls : 'icon-search',
						onChange : function(newValue, oldValue) {
							if (newValue == oldValue)
								alert("==");

							else {
								// alert("！=");

							}
						},
						onClickButton : function() {
							opendlg();
						}
					}

				}
			}, {
				"field" : "attr1",
				"title" : "附件1",
				"width" : 100,

				formatter : function(value, rowData, rowIndex) {
					eps.urlvalue = value;
					return '<span  style="color:red; text-decoration:underline;  text-decoration-color: #f06d06;    "   >查看</span>';
				}
			}, {
				"field" : "memo",
				"title" : "备注",
				"width" : 100,
				editor : {
					type : 'textbox',
					options : {
						valueField : 'memo',
						required : false
					}
				}
			}];

	var column_psqkcm_t2 = [{
				"field" : "accid",
				"title" : "用户accid",
				"width" : 10,
				"hidden" : true
			}, {
				"field" : "chkid",
				"title" : "流水号",
				"width" : 100,
				"hidden" : true
			}, {
				"field" : "pmn01",
				"title" : "采购单号",
				"width" : 150
			}, {
				"field" : "pmn02",
				"title" : "采购项次",
				"width" : 80
			}, {
				"field" : "seq",
				"title" : "检验项次",
				"width" : 100
			}, {
				"field" : "qcresult",
				"title" : "品检检验结果",
				"width" : 80
			}, {
				"field" : "chktime",
				"title" : "检验时间",
				"width" : 120
			}, {
				"field" : "rdresult",
				"title" : "确发检验结果",
				"hidden" : true,
				"width" : 100
			}, {
				"field" : "attr",
				"title" : "附件",
				"width" : 100,
				"hidden" : true
			}, {
				"field" : "attr1",
				"title" : "附件1",
				"width" : 100,

				formatter : function(value, rowData, rowIndex) {
					eps.urlvalue = value;
					return '<span  style="color:red; text-decoration:underline;  text-decoration-color: #f06d06;    "   >查看</span>';
				}
			}, {
				"field" : "memo",
				"title" : "备注",
				"width" : 100,
				editor : {
					type : 'textbox',
					options : {
						valueField : 'memo',
						required : false
					}
				}
			}];
	column_jqxqcm = column_jqxqcm_t; // 交期详情记录 columns
	column_jqxqcm2 = column_jqxqcm_t2; // 交期详情记录 columns
	column_shxqcm = column_shxqcm_t; // 送货详情记录 columns
	column_psqkcm = column_psqkcm_t; // 批色详情记录 columns
	column_psqkcm2 = column_psqkcm_t2; // 批色详情记录 columns

	column_existbg = column_exitsbg_t;

};

// datagrid 列样式
eps.formatDilogColumn = function(val, row) {
	if (val == undefined) {

		val = '';
	}

	return '<span style="color:red; text-decoration:underline;  text-decoration-color: #f06d06;    ">'
			+ val + '</span>';

};

/**
 * 获取项目主机和port
 */
eps.getRootPath_web = function() {
	// 获取当前网址，如: http://localhost:7070/eps/meun.jsp
	var curWwwPath = window.document.location.href;
	// 获取主机地址之后的目录，如: uimcardprj/share/meun.jsp
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	// 获取主机地址，如: http://localhost:8083
	var localhostPaht = curWwwPath.substring(0, pos);
	// 获取带"/"的项目名，如:/uimcardprj
	// var projectName = pathName .substring(0, pathName.substr(1).indexOf('/')
	// + 1);
	// return (localhostPaht + projectName);
	return localhostPaht;
};

/**
 * 收货明细弹窗展示
 */
eps.openshmx_dialog = function(selectedrow) {
	var qp = {
		PMN01 : "",
		PMN02 : 0
	};
	if (selectedrow) {

		qp.PMN01 = selectedrow.PMM01;
		qp.PMN02 = selectedrow.PMN02;

	};
	columnset = column_shxqcm;
	$("#shmx__dg").datagrid({
				border : false,
				fit : true,
				rownumbers : true,
				locale : "zh_CN",
				iconCls : 'icon-sum',
				striped : true,
				collapsible : false,
				url : "/eps/rva/getrva",
				queryParams : qp,
				width : "80%",
				height : "40%",
				fitColumns : true,
				columns : [columnset],
				pagination : true,
				rownumbers : true,
				singleSelect : true

			});
	$('#shmx__dialog').panel({
				title : "收货记录明细"
			});
	$('#shmx__dialog').dialog('open');

};

/**
 * 采购单变更明细弹窗展示
 */
eps.openpmmbg_dialog = function(selectedrow) {
	var qp = {
		PMN01 : "",
		PMN02 : 0
	};
	if (selectedrow) {

		qp.PMN01 = selectedrow.PMM01;
		qp.PMN02 = selectedrow.PMN02;

	};
	columnset = column_existbg;
	$("#shmx__dg").datagrid({

				border : false,
				fit : true,
				rownumbers : true,
				locale : "zh_CN",
				iconCls : 'icon-sum',
				striped : true,
				collapsible : false,
				url : "/eps/pnb/getpnb",
				queryParams : qp,
				width : "80%",
				height : "40%",
				fitColumns : true,
				columns : [columnset],
				pagination : true,
				rownumbers : true,
				singleSelect : true

			});
	$('#shmx__dialog').panel({
				title : "采购单变更明细"
			});
	$('#shmx__dialog').dialog('open');

};


/**
 * 采购单SIZE明细
 */
eps.opensize_dialog = function(selectedrow) {
	var qp = {
		PMN01 : "",
		PMN02 : 0
	};
	if (selectedrow) {

		qp.PMN01 = selectedrow.PMM01;
		qp.PMN02 = selectedrow.PMN02;

	};
    columnset = column_size;
	$("#size__dg").datagrid({

				border : false,
				fit : true,
				rownumbers : true,
				locale : "zh_CN",
				iconCls : 'icon-sum',
				striped : true,
				collapsible : false,
				url : "rvbs/getrvbs",
				queryParams : qp,
				width : "80%",
				height : "50%",
				fitColumns : true,
				columns : [columnset],
				pagination : true,
				rownumbers : true,
				singleSelect : true,
				pageSize : 20,
				pageList : [20, 40, 30, 40, 50],

			});
	$('#size__dialog').panel({
				title : "采购单SIZE明细"
			});
	$('#size__dialog').dialog('open');

};

// 我的采购单 量产---明细弹窗修改
eps.openwdwdcgd_lc_dialog = function(index, field, selectedrow) {
	var flag = 0;
	var dialog;
	var title;
	var footer;
	var yfurl = "";
	var qp = {
		PMN01 : "",
		PMN02 : 0
	};
	if (selectedrow) {

		qp.PMN01 = selectedrow.PMM01;
		qp.PMN02 = selectedrow.PMN02;

	};
	var datagrid; // 定义全局变量
	// var editRow = "";// 定义当前编辑的行
	var columnset = [];
	if (field == 'shznum' || field == 'SHZNUM') {
		eps.columnsinit();
		flag = 0;
		columnset = column_shxqcm;
		eps.openshmx_dialog(selectedrow);

	} else if (field == 'xqdate' || field == 'cshfdate' || field == 'bgdate'
			|| field == 'PMN33') {
		eps.columnsinit();
		flag = 1;
		columnset = column_jqxqcm;
		title = '交期详情记录';

		yfurl = "/eps/ddlog/getddlog"

		footer = '#dlgft';
	} else if (field == 'PSQK') {
		eps.columnsinit();
		flag = 1;
		columnset = column_psqkcm;
		title = '批色情况记录';

		footer = '#dlgft';
		yfurl = "/eps/colorchklog/getcolor";

	} else if (field == 'EXITSBG') {
		eps.columnsinit();
		flag = 0;
		columnset = column_existbg;
		eps.openpmmbg_dialog(selectedrow);

	} else if (field == 'SIZE') {
		eps.columnsinit();
		flag = 0;
		columnset = column_size;
		eps.opensize_dialog(selectedrow);

	} else {

		flag = 0;

	}

	if (flag == 0) {
		return;
	}
	$('#wdcgd_lc_m_dialog').dialog('open');
	$('#dialog_m_dataGrid').datagrid('reload');

	datagrid = $("#dialog_m_dataGrid").datagrid({
				title : title,
				border : false,
				fit : true,
				rownumbers : true,
				locale : "zh_CN",
				iconCls : 'icon-sum',
				striped : true,
				collapsible : false,
				url : yfurl,
				width : "80%",
				height : "30%",
				queryParams : qp,
				footer : footer,
				fitColumns : true,
				pageSize : 20,
				pageList : [20, 40, 30, 40, 50],

				columns : [columnset],
				onDblClickCell : function(index, field, value) {
					 
					var vurl = '';
					var getrow = $('#dialog_m_dataGrid')
							.datagrid('getSelected');
					if (getrow) {
						vurl = getrow.attr; 
					}

					if (field == "attr1") { 
						show(vurl);
					}

				},

				onEndEdit : onEndEdit,
				pagination : true, // 表示在datagrid设置分页
				rownumbers : true,
				singleSelect : true

			});
	$('#dialog_m_dataGrid').datagrid('getPager').pagination({
				pageSize : 50,
				pageNumber : 1,
				pageList : [50, 100, 150, 200, 500],
				beforePageText : '第',// 页数文本框前显示的汉字
				afterPageText : '页    共 {pages} 页',
				displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
			});

	$('#append').unbind('click').click(function() {
				append();
			});

	$("#accept").unbind('click').click(function() {

				accept(eps.gbclickfield);

			});

	$("#edit").unbind('click').click(function() {
				edit();
			});

	$("#removeit").unbind('click').click(function() {
				removeit();
			});

	function getChanges() {
		var rows = $('#dialog_m_dataGrid').datagrid('getChanges');
		return rows.length;
	}

	var editIndex = undefined;
	function endEditing() {
		if (editIndex == undefined) {
			return true
		}
		if ($('#dialog_m_dataGrid').datagrid('validateRow', editIndex)) {
			$('#dialog_m_dataGrid').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}

	function edit() {
		// 获取选定行index
		var index = $('#dialog_m_dataGrid').datagrid('getRowIndex',
				$('#dialog_m_dataGrid').datagrid('getSelected'));

		// 获取分页属性对象 pagination
		var options = $('#dialog_m_dataGrid').datagrid('getPager')
				.data("pagination").options;
		var totalRowNum = options.total;

		// 设定只能编辑最后一行
		if (index < totalRowNum - 1) {
			return false;
		}
		// 判断只能开编辑一行
		if (editIndex != index) {
			if (endEditing()) {
				$('#dialog_m_dataGrid').datagrid('selectRow', index).datagrid(
						'beginEdit', index);
				var ed = $('#dialog_m_dataGrid').datagrid('getEditor', {});
				// console.info(ed);
				if (ed) {
					// console.info(ed);
					($(ed.target).data('textbox') ? $(ed.target)
							.textbox('textbox') : $(ed.target)).focus();
				}
				editIndex = index;
			} else {
				setTimeout(function() {
							$('#dialog_m_dataGrid').datagrid('selectRow',
									editIndex);
						}, 0);
			}
		}
		// $("#dialog_m_dataGrid").datagrid('removeEditor','memo');

	};

	function onClickCell(index, field) {
		// console.info("--onClickCell(index, field):---index----" + index);

		var options = $('#dialog_m_dataGrid').datagrid('getPager')
				.data("pagination").options;
		var totalRowNum = options.total;

		if (index < totalRowNum - 1) {

			return false;

		}

		if (editIndex != index) {
			if (endEditing()) {
				$('#dialog_m_dataGrid').datagrid('selectRow', index).datagrid(
						'beginEdit', index);
				var ed = $('#dialog_m_dataGrid').datagrid('getEditor', {
							index : index,
							field : field
						});
				// console.info(ed);
				if (ed) {
					// console.info(ed);
					($(ed.target).data('textbox') ? $(ed.target)
							.textbox('textbox') : $(ed.target)).focus();
				}
				editIndex = index;
			} else {
				setTimeout(function() {
							$('#dialog_m_dataGrid').datagrid('selectRow',
									editIndex);
						}, 0);
			}
		}
	}
	function onEndEdit(index, row) {
		var ed = $(this).datagrid('getEditor', {
					index : index,
					field : 'accid'
				});
		// row.accid = $(ed.target).textbox('getText');
		// //console.info("===row.accid=================" + row.accid);
	}

	var editIndex;
	function append() {

		// console.info("+=====selectedrow.PMM01=========>>>>>>>" +
		// selectedrow.PMM01);

		var o = {
			pmn01 : selectedrow.PMM01,
			pmn02 : selectedrow.PMN02,
			accid : eps.ACCID,
			name : eps.NAME,
			launchtime : eps.getDatetime(),
			chktime : eps.getDatetime()
		};

		if (endEditing()) {
			$('#dialog_m_dataGrid').datagrid('appendRow', o);
			editIndex = $('#dialog_m_dataGrid').datagrid('getRows').length - 1;
			$('#dialog_m_dataGrid').datagrid('selectRow', editIndex).datagrid(
					'beginEdit', editIndex);
		}
	}
	function removeit() {
		if (editIndex == undefined) {
			return
		}
		$('#dialog_m_dataGrid').datagrid('cancelEdit', editIndex).datagrid(
				'deleteRow', editIndex);
		editIndex = undefined;
	}

	function accept(field) {
		// console.info(field);
		var accepturl = '';
		if (field == 'PMN33') {
			accepturl = "/eps/ddlog/addddlog";

		} else if (field == 'PSQK') {
			accepturl = "/eps/colorchklog/addcolor";

		}

		if (endEditing()) {
			var row = $('#dialog_m_dataGrid').datagrid('getSelected');
			// console.info("=====row========");
			row["PMMUD02"] = eps.PMMUD02; // 供应商id
			row["PMM03"] = eps.PMM03; // 采购员id
			row["currentdate"] = eps.getDate();

			var remarkid = row.id;
			var typeid = $("#typeid").val();

			if (getChanges() > 0)

				$.ajax({
					url : accepturl,
					type : "post",

					dataType : "json",
					data : row,
					success : function(data) {
						// console.info("======data================");
						// console.info(data);

						if (data.status == "success") {
							$.messager.show({
										title : '提示',
										msg : '操作成功!' + data.msg
									});

							row = {};
							$('#dialog_m_dataGrid').datagrid('reload');
						} else {
							$.messager.show({
										title : '提示',
										msg : 'success data.status 操作失败，请联系管理员 ------'
									});
						}
					},
					error : function() {
						$.messager.show({
									title : '提示',
									msg : 'error系统错误，请联系管理员------'
								});
					}
				});
		}
	}

};

// 我的采购单 研发---明细弹窗修改
eps.openwdwdcgd_yf_dialog = function(index, field, selectedrow) {
	var flag = 0;
	var dialog;
	var title;
	var footer;
	var yfurl = "";
	var qp = {
		PMN01 : "",
		PMN02 : 0
	};
	if (selectedrow) {

		qp.PMN01 = selectedrow.PMM01;
		qp.PMN02 = selectedrow.PMN02;

	};
	var datagrid; // 定义全局变量
	var editRow = "";// 定义当前编辑的行
	var columnset = [];
	if (field == 'shznum' || field == 'SHZNUM') {
		eps.columnsinit();
		flag = 0;
		columnset = column_shxqcm;
		eps.openshmx_dialog(selectedrow);

	} else if (field == 'xqdate' || field == 'cshfdate' || field == 'bgdate'
			|| field == 'PMN33') {
		eps.columnsinit();
		flag = 1;
		columnset = column_jqxqcm;
		title = '交期详情记录';

		yfurl = "/eps/ddlog/getddlog";

		footer = '#dlgft';
	} else if (field == 'PSQK') {
		eps.columnsinit();
		flag = 1;
		columnset = column_psqkcm;
		title = '批色情况记录';

		footer = '#dlgft';
		yfurl = "/eps/colorchklog/getcolor";

	} else if (field == 'EXITSBG') {
		eps.columnsinit();
		flag = 0;
		columnset = column_existbg;
		eps.openpmmbg_dialog(selectedrow);

	} 
	 else if (field == 'SIZE') {
			eps.columnsinit();
			flag = 0;
			columnset = column_size;
			eps.opensize_dialog(selectedrow);

		}
	else {

		flag = 0;

	}
	// console.info(columnset);

	if (flag == 0) {
		return;
	}
	$('#wdcgd_yf_m_dialog').dialog('open');
	$('#dialog_m_dataGrid').datagrid('reload');

	datagrid = $("#dialog_m_dataGrid").datagrid({
				title : title,
				border : false,
				fit : true,
				rownumbers : true,
				locale : "zh_CN",
				iconCls : 'icon-sum',
				striped : true,
				collapsible : false,
				url : yfurl,
				width : "80%",
				height : "30%",
				queryParams : qp,
				footer : footer,
				fitColumns : true,
				columns : [columnset],
				onDblClickCell : function(index, field, value) {

					var vurl = '';
					var getrow = $('#dialog_m_dataGrid')
							.datagrid('getSelected');
					if (getrow) {
						vurl = getrow.attr;
					}

					if (field == "attr1") {
						show(vurl);
					}

				},

				onEndEdit : onEndEdit,
				pagination : true, // 表示在datagrid设置分页
				rownumbers : true,
				singleSelect : true

			});

	$('#dialog_m_dataGrid').datagrid('getPager').pagination({
				pageSize : 50,
				pageNumber : 1,
				pageList : [50, 100, 150, 200, 500],
				beforePageText : '第',// 页数文本框前显示的汉字
				afterPageText : '页    共 {pages} 页',
				displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
			});

	$('#append').unbind('click').click(function() {
				append();
			});

	$("#accept").unbind('click').click(function() {
				// console.info(eps.gbclickfield+"=========?>>>.");

				accept(eps.gbclickfield);

			});

	$("#edit").unbind('click').click(function() {
				edit();
			});

	$("#removeit").unbind('click').click(function() {
				removeit();
			});

	function getChanges() {
		var rows = $('#dialog_m_dataGrid').datagrid('getChanges');
		return rows.length;
	}

	var editIndex = undefined;
	function endEditing() {
		if (editIndex == undefined) {
			return true
		}
		if ($('#dialog_m_dataGrid').datagrid('validateRow', editIndex)) {
			$('#dialog_m_dataGrid').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}

	function edit() {
		// 获取选定行index
		var index = $('#dialog_m_dataGrid').datagrid('getRowIndex',
				$('#dialog_m_dataGrid').datagrid('getSelected'));

		// 获取分页属性对象 pagination
		var options = $('#dialog_m_dataGrid').datagrid('getPager')
				.data("pagination").options;
		var totalRowNum = options.total;

		// 设定只能编辑最后一行
		if (index < totalRowNum - 1) {
			return false;
		}
		// 判断只能开编辑一行
		if (editIndex != index) {
			if (endEditing()) {
				$('#dialog_m_dataGrid').datagrid('selectRow', index).datagrid(
						'beginEdit', index);
				var ed = $('#dialog_m_dataGrid').datagrid('getEditor', {});
				// console.info(ed);
				if (ed) {
					// console.info(ed);
					($(ed.target).data('textbox') ? $(ed.target)
							.textbox('textbox') : $(ed.target)).focus();
				}
				editIndex = index;
			} else {
				setTimeout(function() {
							$('#dialog_m_dataGrid').datagrid('selectRow',
									editIndex);
						}, 0);
			}
		}
		// $("#dialog_m_dataGrid").datagrid('removeEditor','memo');

	};

	function onClickCell(index, field) {
		// console.info("--onClickCell(index, field):---index----" + index);

		var options = $('#dialog_m_dataGrid').datagrid('getPager')
				.data("pagination").options;
		var totalRowNum = options.total;

		if (index < totalRowNum - 1) {

			return false;

		}

		if (editIndex != index) {
			if (endEditing()) {
				$('#dialog_m_dataGrid').datagrid('selectRow', index).datagrid(
						'beginEdit', index);
				var ed = $('#dialog_m_dataGrid').datagrid('getEditor', {
							index : index,
							field : field
						});
				// console.info(ed);
				if (ed) {
					// console.info(ed);
					($(ed.target).data('textbox') ? $(ed.target)
							.textbox('textbox') : $(ed.target)).focus();
				}
				editIndex = index;
			} else {
				setTimeout(function() {
							$('#dialog_m_dataGrid').datagrid('selectRow',
									editIndex);
						}, 0);
			}
		}
	}
	function onEndEdit(index, row) {
		var ed = $(this).datagrid('getEditor', {
					index : index,
					field : 'accid'
				});
		// row.accid = $(ed.target).textbox('getText');
		// //console.info("===row.accid=================" + row.accid);
	}

	var editIndex;
	function append() {

		// console.info("+=====selectedrow.PMM01=========>>>>>>>" +
		// selectedrow.PMM01);

		var o = {
			pmn01 : selectedrow.PMM01,
			pmn02 : selectedrow.PMN02,
			accid : eps.ACCID,
			name : eps.NAME,
			launchtime : eps.getDatetime(),
			chktime : eps.getDatetime()
		};

		if (endEditing()) {
			$('#dialog_m_dataGrid').datagrid('appendRow', o);
			editIndex = $('#dialog_m_dataGrid').datagrid('getRows').length - 1;
			$('#dialog_m_dataGrid').datagrid('selectRow', editIndex).datagrid(
					'beginEdit', editIndex);
		}
	}
	function removeit() {
		if (editIndex == undefined) {
			return
		}
		$('#dialog_m_dataGrid').datagrid('cancelEdit', editIndex).datagrid(
				'deleteRow', editIndex);
		editIndex = undefined;
	}

	function accept(field) {
		var accepturl = '';
		if (field == 'PMN33') {
			accepturl = "/eps/ddlog/addddlog";

		} else if (field == 'PSQK') {
			accepturl = "/eps/colorchklog/addcolor";

		}

		if (endEditing()) {
			var row = $('#dialog_m_dataGrid').datagrid('getSelected');
			var text = row.text;
			// console.info("=====row========");
			row["PMMUD02"] = eps.PMMUD02; // 供应商id
			row["PMM03"] = eps.PMM03; // 采购员id
			row["currentdate"] = eps.getDate();

			// console.info(row);
			// console.info("===row==========");

			var remarkid = row.id;
			var typeid = $("#typeid").val();

			if (getChanges() > 0)

				$.ajax({
					url : accepturl,
					type : "post",
					dataType : "json",
					data : row,
					success : function(data) {

						if (data.status == "success") {
							$.messager.show({
										title : '提示',
										msg : '操作成功!' + data.msg
									});

							row = {};
							$('#dialog_m_dataGrid').datagrid('reload');
						} else {
							$.messager.show({
										title : '提示',
										msg : 'success data.status 操作失败，请联系管理员 ------'
									});
						}
					},
					error : function() {
						$.messager.show({
									title : '提示',
									msg : 'error系统错误，请联系管理员------'
								});
					}
				});
		}
	}

};

/**
 * 我的订单 供应商---明细弹窗修改
 */
eps.openwdwddd_gys_dialog = function(index, field, selectedrow) {
	var flag = 0;
	var dialog;
	var title;
	var footer;
	var yfurl = "";
	var qp = {
		PMN01 : "",
		PMN02 : 0
	};
	if (selectedrow) {

		qp.PMN01 = selectedrow.PMM01;
		qp.PMN02 = selectedrow.PMN02;

	};
	var datagrid; // 定义全局变量
	var editRow = "";// 定义当前编辑的行
	var columnset = [];
	if (field == 'shznum' || field == 'SHZNUM') {
		eps.columnsinit();
		flag = 0;
		columnset = column_shxqcm;
		eps.openshmx_dialog(selectedrow);

	} else if (field == 'xqdate' || field == 'cshfdate' || field == 'bgdate'
			|| field == 'PMN33') {
		eps.columnsinit();
		flag = 1;
		columnset = column_jqxqcm2;
		title = '交期详情记录';

		yfurl = "/eps/ddlog/getddlog"

		$("#dlgft").css('display', 'block');

		footer = '#dlgft';

		$("#dlgft").removeAttr("hidden");
		// $("#dlgft").attr("hidden","true");

	} else if (field == 'PSQK') {
		eps.columnsinit();
		flag = 1;
		columnset = column_psqkcm2;
		title = '批色情况记录';
		$("#dlgft").attr("hidden", "true");
		footer = '#dlgft';
		yfurl = "/eps/colorchklog/getcolor"
		$("#dlgft").css('display', 'none');

	} else if (field == 'EXITSBG') {
		eps.columnsinit();
		flag = 0;
		columnset = column_existbg;
		eps.openpmmbg_dialog(selectedrow);

	}  else if (field == 'SIZE') {
		eps.columnsinit();
		flag = 0;
		columnset = column_size;
		eps.opensize_dialog(selectedrow);

	}else {

		flag = 0;

	}
	// console.info(columnset);

	if (flag == 0) {
		return;
	}
	$('#wddd_gys_m_dialog').dialog('open');
	$('#dialog_m_dataGrid').datagrid('reload');

	datagrid = $("#dialog_m_dataGrid").datagrid({
				title : title,
				border : false,
				fit : true,
				rownumbers : true,
				locale : "zh_CN",
				iconCls : 'icon-sum',
				striped : true,
				collapsible : false,
				url : yfurl,
				width : "80%",
				height : "30%",
				queryParams : qp,
				footer : footer,
				fitColumns : true,
				columns : [columnset],
				onDblClickCell : function(index, field, value) {
					// console.info(field);
					// console.info(index);
					// console.info(value);
					var vurl = '';
					var getrow = $('#dialog_m_dataGrid')
							.datagrid('getSelected');
					if (getrow) {
						vurl = getrow.attr;
						// console.info(getrow);
					}

					if (field == "attr1") {
						// console.info("====");
						// console.info(value);
						show(vurl);
					}

				},

				onEndEdit : onEndEdit,
				pagination : true, // 表示在datagrid设置分页
				rownumbers : true,
				singleSelect : true

			});
	$('#dialog_m_dataGrid').datagrid('getPager').pagination({
				pageSize : 50,
				pageNumber : 1,
				pageList : [50, 100, 150, 200, 500],
				beforePageText : '第',// 页数文本框前显示的汉字
				afterPageText : '页    共 {pages} 页',
				displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
			});

	$('#append').unbind('click').click(function() {
				append();
			});

	$("#accept").unbind('click').click(function() {
				// console.info(eps.gbclickfield+"=========?>>>.");

				accept(eps.gbclickfield);

			});

	$("#edit").unbind('click').click(function() {
				edit();
			});

	$("#removeit").unbind('click').click(function() {
				removeit();
			});

	function getChanges() {
		var rows = $('#dialog_m_dataGrid').datagrid('getChanges');
		return rows.length;
	}

	var editIndex = undefined;
	function endEditing() {
		if (editIndex == undefined) {
			return true
		}
		if ($('#dialog_m_dataGrid').datagrid('validateRow', editIndex)) {
			$('#dialog_m_dataGrid').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}

	function edit() {
		// 获取选定行index
		var index = $('#dialog_m_dataGrid').datagrid('getRowIndex',
				$('#dialog_m_dataGrid').datagrid('getSelected'));

		// 获取分页属性对象 pagination
		var options = $('#dialog_m_dataGrid').datagrid('getPager')
				.data("pagination").options;
		var totalRowNum = options.total;

		// 设定只能编辑最后一行
		if (index < totalRowNum - 1) {
			return false;
		}
		// 判断只能开编辑一行
		if (editIndex != index) {
			if (endEditing()) {
				$('#dialog_m_dataGrid').datagrid('selectRow', index).datagrid(
						'beginEdit', index);
				var ed = $('#dialog_m_dataGrid').datagrid('getEditor', {});
				// console.info(ed);
				if (ed) {
					// console.info(ed);
					($(ed.target).data('textbox') ? $(ed.target)
							.textbox('textbox') : $(ed.target)).focus();
				}
				editIndex = index;
			} else {
				setTimeout(function() {
							$('#dialog_m_dataGrid').datagrid('selectRow',
									editIndex);
						}, 0);
			}
		}
		// $("#dialog_m_dataGrid").datagrid('removeEditor','memo');

	};

	function onClickCell(index, field) {
		// console.info("--onClickCell(index, field):---index----" + index);

		var options = $('#dialog_m_dataGrid').datagrid('getPager')
				.data("pagination").options;
		var totalRowNum = options.total;

		if (index < totalRowNum - 1) {

			return false;

		}

		if (editIndex != index) {
			if (endEditing()) {
				$('#dialog_m_dataGrid').datagrid('selectRow', index).datagrid(
						'beginEdit', index);
				var ed = $('#dialog_m_dataGrid').datagrid('getEditor', {
							index : index,
							field : field
						});
				// console.info(ed);
				if (ed) {
					// console.info(ed);
					($(ed.target).data('textbox') ? $(ed.target)
							.textbox('textbox') : $(ed.target)).focus();
				}
				editIndex = index;
			} else {
				setTimeout(function() {
							$('#dialog_m_dataGrid').datagrid('selectRow',
									editIndex);
						}, 0);
			}
		}
	}
	function onEndEdit(index, row) {
		var ed = $(this).datagrid('getEditor', {
					index : index,
					field : 'accid'
				});
		// row.accid = $(ed.target).textbox('getText');
		// //console.info("===row.accid=================" + row.accid);
	}

	var editIndex;
	function append() {

		// console.info("+=====selectedrow.PMM01=========>>>>>>>" +
		// selectedrow.PMM01);

		var o = {
			pmn01 : selectedrow.PMM01,
			pmn02 : selectedrow.PMN02,
			accid : eps.ACCID,
			name : eps.NAME,
			launchtime : eps.getDatetime(),
			chktime : eps.getDatetime()
		};

		if (endEditing()) {
			$('#dialog_m_dataGrid').datagrid('appendRow', o);
			editIndex = $('#dialog_m_dataGrid').datagrid('getRows').length - 1;
			$('#dialog_m_dataGrid').datagrid('selectRow', editIndex).datagrid(
					'beginEdit', editIndex);
		}
	}
	function removeit() {
		if (editIndex == undefined) {
			return
		}
		$('#dialog_m_dataGrid').datagrid('cancelEdit', editIndex).datagrid(
				'deleteRow', editIndex);
		editIndex = undefined;
	}

	function accept(field) {
		// console.info(field);
		var accepturl = '';
		if (field == 'PMN33') {
			accepturl = "/eps/ddlog/addddlog";

		} else if (field == 'PSQK') {
			accepturl = "/eps/colorchklog/addcolor";

		}

		if (endEditing()) {
			var row = $('#dialog_m_dataGrid').datagrid('getSelected');
			var text = row.text;
			// console.info("=====row========");
			row["PMMUD02"] = eps.PMMUD02; // 供应商id
			row["PMM03"] = eps.PMM03; // 采购员id
			row["currentdate"] = eps.getDate();

			// console.info(row);
			// console.info("===row==========");

			var remarkid = row.id;
			var typeid = $("#typeid").val();

			if (getChanges() > 0)

				$.ajax({
					url : accepturl,
					type : "post",
					dataType : "json",
					data : row,
					success : function(data) {
						// console.info("======data================");
						// console.info(data);

						if (data.status == "success") {
							$.messager.show({
										title : '提示',
										msg : '操作成功!' + data.msg
									});

							row = {};
							$('#dialog_m_dataGrid').datagrid('reload');
						} else {
							$.messager.show({
										title : '提示',
										msg : 'success data.status 操作失败，请联系管理员 ------'
									});
						}
					},
					error : function() {
						$.messager.show({
									title : '提示',
									msg : 'error系统错误，请联系管理员------'
								});
					}
				});
		}
	}

};
/**
 * WXB SIZE
 */
eps.openwdwddd_gys_dialog_size = function(index, field, selectedrow) {
	var flag = 0;
	var dialog;
	var title;
	var footer;
	var yfurl = "";
	var qp = {
		PMN01 : "",
		PMN02 : 0
	};
	var selectedrow_t=selectedrow;
	if (selectedrow) {

		qp.WXB05 = selectedrow.WXB05;

	}
	;
	console.info(selectedrow);
	var datagrid; // 定义全局变量
	var editRow = "";// 定义当前编辑的行
	var columnset = [];
	if (field == 'SIZE') {
		eps.columnsinit();
		flag = 1;
		columnset = column_size2;
		title = 'SIZE明细';

		yfurl = "wxbsize/getsize";

		$("#dlgft").css('display', 'block');

		footer = '#dlgft';

		$("#dlgft").removeAttr("hidden");
		// $("#dlgft").attr("hidden","true");

	} else {

		flag = 0;

	} 

	if (flag == 0) {
		return;
	}
	$('#wddd_gys_m_dialog_size').dialog('open');
	$('#dialog_m_dataGrid_size').datagrid('reload');

	datagrid = $("#dialog_m_dataGrid_size").datagrid({
		title : '',
		border : false,
		fit : true,
		rownumbers : true,
		locale : "zh_CN",
		iconCls : 'icon-sum',
		striped : true,
		collapsible : false,
		url : yfurl,
		width : "80%",
		height : "30%",
		queryParams : qp,
	    
		fitColumns : true,
		columns : [ columnset ],
		onDblClickCell : onClickCell, 
		onEndEdit : onEndEdit,
		pagination : true, // 表示在datagrid设置分页
		rownumbers : true,
		singleSelect : true

	});
	$('#dialog_m_dataGrid_size').datagrid('getPager').pagination({
		pageSize : 50,
		pageNumber : 1,
		pageList : [ 50, 100, 150, 200, 500 ],
		beforePageText : '第',// 页数文本框前显示的汉字
		afterPageText : '页    共 {pages} 页',
		displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
	});
	

	$('#append').unbind('click').click(function() {
				append(selectedrow);
			});

	$("#accept").unbind('click').click(function() {
                
				accept( );

	});	
	
	$("#del").unbind('click').click(function() {
		
		Selectedrow = $('#dialog_m_dataGrid_size').datagrid('getSelected');
		if(Selectedrow ==null){
			$.messager.alert('警告','请选择行'); 
		} else{
			
			
			$.messager.confirm('确认','您确认想要删除记录吗？',function(r){    
			    if (r){    
			       
			    	//----------------------------提交新增/更新
					$.ajax({
						url : "/eps/wxbsize/delwxbsize",
						type : "POST",
						dataType : "json",
						data : Selectedrow,
						async : false,
						success : function(data) {
 
							if (data.code == "100") {
								$.messager.show({
									title : '提示',
									msg : data.msg
								});

								Selectedrow = {};
								$('#dialog_m_dataGrid_size').datagrid('reload');
							} else {
								$.messager.show({
									title : '提示',
									msg : data.msg
								});
								$('#dialog_m_dataGrid_size').datagrid('reload');
							}
						}
					});
					//----------------------------   
			        
			        
			        
			    }    
			});  
	 
			
			
			
		}  
		
		 
		
 });	
	
	$("#removeit").unbind('click').click(function() {
	 
		reject();
 
});	
	
	
	

	var editIndex = undefined;
 
	function endEditing() {
		if (editIndex == undefined) {
			return true;
		}
		;
		if ($('#dialog_m_dataGrid_size').datagrid('validateRow', editIndex)) {
			$('#dialog_m_dataGrid_size').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}
	function onClickCell(index, field) {
		selectedrow = $('#dialog_m_dataGrid_size').datagrid('getData').rows[index];

		

		
		//eps.openwdwddd_gys_dialog_size(index, field, selectedrow);

		if (editIndex != index) {
			if (endEditing()) {
				$('#dialog_m_dataGrid_size').datagrid('selectRow', index).datagrid('beginEdit', index);
				var ed = $('#dialog_m_dataGrid_size').datagrid('getEditor', {
					index : index,
					field : field
				});
				if (ed) {
					($(ed.target).data('textbox') ? $(ed.target).textbox('textbox') : $(ed.target)).focus();
				}
				editIndex = index;
			} else {
				setTimeout(function() {
					$('#dialog_m_dataGrid_size').datagrid('selectRow', editIndex);
				}, 0);
			}
		}
	}
	function onEndEdit(index, row) {
		var ed = $(this).datagrid('getEditor', {
			index : index,
			field : 'WXB05'
		});
 
	}
	function append(selectedrow) {
		
		Selectedrows = $('#dialog_m_dataGrid_size').datagrid('getData');
		if(Selectedrows.total  >= 4 ){
			$.messager.alert('警告','一箱最多只能录入4个SIZE'); 
			return ;
		}  
		
		
		
		if (endEditing()) {
			$('#dialog_m_dataGrid_size').datagrid('appendRow', {
				WXB05 : selectedrow.WXB05,
				TC_RVBS01 : selectedrow.WXB01,
				TC_RVBS02 : selectedrow.WXB02 ,
				TC_RVBS06 : selectedrow.PMN04  
				
				
			});
			editIndex = $('#dialog_m_dataGrid_size').datagrid('getRows').length - 1;
			$('#dialog_m_dataGrid_size').datagrid('selectRow', editIndex).datagrid('beginEdit', editIndex);
		}
	}
	function removeit() {
		if (editIndex == undefined) {
			return;
		}
		;
		$('#dialog_m_dataGrid_size').datagrid('cancelEdit', editIndex).datagrid('deleteRow', editIndex);
		editIndex = undefined;
	}

	function timetrans() {
		var date = new Date(); //如果date为13位不需要乘1000
		var Y = date.getFullYear() + '-';
		var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
		var D = (date.getDate() < 10 ? '0' + (date.getDate()) : date.getDate()) + ' ';
		var h = (date.getHours() < 10 ? '0' + date.getHours() : date.getHours()) + ':';
		var m = (date.getMinutes() < 10 ? '0' + date.getMinutes() : date.getMinutes()) + ':';
		var s = (date.getSeconds() < 10 ? '0' + date.getSeconds() : date.getSeconds());
		return Y + M + D;
	}

	function acceptdata(op, ob) {
		var rowt = {};
        console.info(ob);
		var accepturl = '';
		if (op == 'insert') {
			accepturl = "/eps/wxbsize/addwxbsize";

		} else if (op == 'update') {

			accepturl = "/eps/wxbsize/updatewxbsize";
		}

		$.each(ob, function(i, n) {

			if (n.WXB05 != undefined) {
	 
				rowt.WXB05 = n.WXB05;
				rowt.TC_RVBS01 = n.TC_RVBS01;
				rowt.TC_RVBS02 = n.TC_RVBS02;
				rowt.TC_RVBS03 = n.TC_RVBS03;
				rowt.TC_RVBS04 = n.TC_RVBS04;
				rowt.TC_RVBS06 = n.TC_RVBS06;
				rowt.TC_RVBS16 = n.TC_RVBS16;
				rowt.TC_RVBS17 = n.TC_RVBS17;  
				rowt.op = op;

				//----------------------------提交新增/更新
				$.ajax({
					url : accepturl,
					type : "POST",
					dataType : "json",
					data : rowt,
					async : false,
					success : function(data) {
									 
						if(data.extend.sum !=undefined){
							console.info(data.extend.sum);
							if(selectedrow_t.WXB09 != data.extend.sum){
								 
								$.messager.show({
									title : '提示',
									msg : 'SIZE数量与SIZE总数不相等！',
									timeout : 3500,
									showType : 'show',
									style : {
										right : '',
										top : document.body.scrollTop
												+ document.documentElement.scrollTop,
										bottom : ''
									}

								});
								
								
								
								
							}
							
						}
						if (data.code == "100") {
							$.messager.show({
								title : '提示',
								msg : data.msg,
								width : '250px',
								height : '150px'
								 
							});

							rowt = {};
							$('#dialog_m_dataGrid_size').datagrid('reload');
						} else {
							$.messager.show({
								title : '提示',
								msg : data.msg
							});
							$('#dialog_m_dataGrid_size').datagrid('reload');
						}
					}
				});
				//----------------------------

			}

		});
	};	
	
	
	
	function accept() {
		if (endEditing()) {
			if ($('#dialog_m_dataGrid_size').datagrid('getChanges').length > 0) {

				var row = {};
				if ($('#dialog_m_dataGrid_size').datagrid('getChanges', "inserted").length) {
					/* 新增 */
					row = $('#dialog_m_dataGrid_size').datagrid('getChanges', "inserted");
					$('#dialog_m_dataGrid_size').datagrid('acceptChanges');
 					acceptdata("insert", row);
					console.info(row);
				}

				if ($('#dialog_m_dataGrid_size').datagrid('getChanges', "updated").length) {
					/* 新增 */
					row = $('#dialog_m_dataGrid_size').datagrid('getChanges', "updated");
					$('#dialog_m_dataGrid_size').datagrid('acceptChanges');
				    console.info(row);
					 acceptdata("update", row);

				}

			}

		}
	}
	function reject() {
		$('#dialog_m_dataGrid_size').datagrid('rejectChanges');
		editIndex = undefined;
	}
	function getChanges() {
		var rows = $('#dialog_m_dataGrid_size').datagrid('getChanges');
		alert(rows.length + ' rows are changed!');
	}

};
/**
 * WXB SIZE
 */
eps.openwdwddd_gys_dialog_size2 = function(index, field, selectedrow) {
	var flag = 0;
	var dialog;
	var title;
	var footer;
	var yfurl = "";
	var qp = {
		PMN01 : "",
		PMN02 : 0
	};
	var selectedrow_t=selectedrow;
	if (selectedrow) {

		qp.WXB05 = selectedrow.WXB05;

	}
	;
	console.info(selectedrow);
	var datagrid; // 定义全局变量
	var editRow = "";// 定义当前编辑的行
	var columnset = [];
	if (field == 'SIZE') {
		eps.columnsinit();
		flag = 1;
		columnset = column_size3;
		title = 'SIZE明细';

		yfurl = "wxbsize/getsize";

		$("#dlgft").css('display', 'block');

		footer = '#dlgft';

		$("#dlgft").removeAttr("hidden");
		// $("#dlgft").attr("hidden","true");

	} else {

		flag = 0;

	} 

	if (flag == 0) {
		return;
	}
	$('#wddd_gys_m_dialog_size').dialog('open');
	$('#dialog_m_dataGrid_size').datagrid('reload');

	datagrid = $("#dialog_m_dataGrid_size").datagrid({
		title : '',
		border : false,
		fit : true,
		rownumbers : true,
		locale : "zh_CN",
		iconCls : 'icon-sum',
		striped : true,
		collapsible : false,
		url : yfurl,
		width : "80%",
		height : "30%",
		queryParams : qp,
	    
		fitColumns : true,
		columns : [ columnset ],
		onDblClickCell : onClickCell, 
		onEndEdit : onEndEdit,
		pagination : true, // 表示在datagrid设置分页
		rownumbers : true,
		singleSelect : true

	});
	$('#dialog_m_dataGrid_size').datagrid('getPager').pagination({
		pageSize : 50,
		pageNumber : 1,
		pageList : [ 50, 100, 150, 200, 500 ],
		beforePageText : '第',// 页数文本框前显示的汉字
		afterPageText : '页    共 {pages} 页',
		displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
	});
	

	$('#append').unbind('click').click(function() {
				append(selectedrow);
			});

	$("#accept").unbind('click').click(function() {
                
				accept( );

	});	
	
	$("#del").unbind('click').click(function() {
		
		Selectedrow = $('#dialog_m_dataGrid_size').datagrid('getSelected');
		if(Selectedrow ==null){
			$.messager.alert('警告','请选择行'); 
		} else{
			
			
			$.messager.confirm('确认','您确认想要删除记录吗？',function(r){    
			    if (r){    
			       
			    	//----------------------------提交新增/更新
					$.ajax({
						url : "/eps/wxbsize/delwxbsize",
						type : "POST",
						dataType : "json",
						data : Selectedrow,
						async : false,
						success : function(data) {
 
							if (data.code == "100") {
								$.messager.show({
									title : '提示',
									msg : data.msg
								});

								Selectedrow = {};
								$('#dialog_m_dataGrid_size').datagrid('reload');
							} else {
								$.messager.show({
									title : '提示',
									msg : data.msg
								});
								$('#dialog_m_dataGrid_size').datagrid('reload');
							}
						}
					});
					//----------------------------   
			        
			        
			        
			    }    
			});  
	 
			
			
			
		}  
		
		 
		
 });	
	
	$("#removeit").unbind('click').click(function() {
	 
		reject();
 
});	
	
	
	

	var editIndex = undefined;
 
	function endEditing() {
		if (editIndex == undefined) {
			return true;
		}
		;
		if ($('#dialog_m_dataGrid_size').datagrid('validateRow', editIndex)) {
			$('#dialog_m_dataGrid_size').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}
	function onClickCell(index, field) {
		selectedrow = $('#dialog_m_dataGrid_size').datagrid('getData').rows[index];

		

		
		//eps.openwdwddd_gys_dialog_size(index, field, selectedrow);

		if (editIndex != index) {
			if (endEditing()) {
				$('#dialog_m_dataGrid_size').datagrid('selectRow', index).datagrid('beginEdit', index);
				var ed = $('#dialog_m_dataGrid_size').datagrid('getEditor', {
					index : index,
					field : field
				});
				if (ed) {
					($(ed.target).data('textbox') ? $(ed.target).textbox('textbox') : $(ed.target)).focus();
				}
				editIndex = index;
			} else {
				setTimeout(function() {
					$('#dialog_m_dataGrid_size').datagrid('selectRow', editIndex);
				}, 0);
			}
		}
	}
	function onEndEdit(index, row) {
		var ed = $(this).datagrid('getEditor', {
			index : index,
			field : 'WXB05'
		});
 
	}
	function append(selectedrow) {
		
		Selectedrows = $('#dialog_m_dataGrid_size').datagrid('getData');
		if(Selectedrows.total  >= 4 ){
			$.messager.alert('警告','一箱最多只能录入4个SIZE'); 
			return ;
		}  
		
		
		
		if (endEditing()) {
			$('#dialog_m_dataGrid_size').datagrid('appendRow', {
				WXB05 : selectedrow.WXB05,
				TC_RVBS01 : '-',
				TC_RVBS02 : 0 ,
				TC_RVBS06 : selectedrow.WXB14  
				
				
			});
			editIndex = $('#dialog_m_dataGrid_size').datagrid('getRows').length - 1;
			$('#dialog_m_dataGrid_size').datagrid('selectRow', editIndex).datagrid('beginEdit', editIndex);
		}
	}
	function removeit() {
		if (editIndex == undefined) {
			return;
		}
		;
		$('#dialog_m_dataGrid_size').datagrid('cancelEdit', editIndex).datagrid('deleteRow', editIndex);
		editIndex = undefined;
	}

	function timetrans() {
		var date = new Date(); //如果date为13位不需要乘1000
		var Y = date.getFullYear() + '-';
		var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
		var D = (date.getDate() < 10 ? '0' + (date.getDate()) : date.getDate()) + ' ';
		var h = (date.getHours() < 10 ? '0' + date.getHours() : date.getHours()) + ':';
		var m = (date.getMinutes() < 10 ? '0' + date.getMinutes() : date.getMinutes()) + ':';
		var s = (date.getSeconds() < 10 ? '0' + date.getSeconds() : date.getSeconds());
		return Y + M + D;
	}

	function acceptdata(op, ob) {
		var rowt = {};
        console.info(ob);
		var accepturl = '';
		if (op == 'insert') {
			accepturl = "/eps/wxbsize/addwxbsize";

		} else if (op == 'update') {

			accepturl = "/eps/wxbsize/updatewxbsize";
		}

		$.each(ob, function(i, n) {

			if (n.WXB05 != undefined) {
	 
				rowt.WXB05 = n.WXB05;
				rowt.TC_RVBS01 = n.TC_RVBS01;
				rowt.TC_RVBS02 = n.TC_RVBS02;
				rowt.TC_RVBS03 = n.TC_RVBS03;
				rowt.TC_RVBS04 = n.TC_RVBS04;
				rowt.TC_RVBS06 = n.TC_RVBS06;
				rowt.TC_RVBS16 = n.TC_RVBS16;
				rowt.TC_RVBS17 = n.TC_RVBS17;  
				rowt.op = op;

				//----------------------------提交新增/更新
				$.ajax({
					url : accepturl,
					type : "POST",
					dataType : "json",
					data : rowt,
					async : false,
					success : function(data) {
									 
						if(data.extend.sum !=undefined){
							console.info(data.extend.sum);
							if(selectedrow_t.WXB08 != data.extend.sum){
								 
								$.messager.show({
									title : '提示',
									msg : 'SIZE数量与SIZE总数不相等！',
									timeout : 3500,
									showType : 'show',
									style : {
										right : '',
										top : document.body.scrollTop
												+ document.documentElement.scrollTop,
										bottom : ''
									}

								});
								
								
								
								
							}
							
						}
						if (data.code == "100") {
							$.messager.show({
								title : '提示',
								msg : data.msg,
								width : '250px',
								height : '150px'
								 
							});

							rowt = {};
							$('#dialog_m_dataGrid_size').datagrid('reload');
						} else {
							$.messager.show({
								title : '提示',
								msg : data.msg
							});
							$('#dialog_m_dataGrid_size').datagrid('reload');
						}
					}
				});
				//----------------------------

			}

		});
	};	
	
	
	
	function accept() {
		if (endEditing()) {
			if ($('#dialog_m_dataGrid_size').datagrid('getChanges').length > 0) {

				var row = {};
				if ($('#dialog_m_dataGrid_size').datagrid('getChanges', "inserted").length) {
					/* 新增 */
					row = $('#dialog_m_dataGrid_size').datagrid('getChanges', "inserted");
					$('#dialog_m_dataGrid_size').datagrid('acceptChanges');
 					acceptdata("insert", row);
					console.info(row);
				}

				if ($('#dialog_m_dataGrid_size').datagrid('getChanges', "updated").length) {
					/* 新增 */
					row = $('#dialog_m_dataGrid_size').datagrid('getChanges', "updated");
					$('#dialog_m_dataGrid_size').datagrid('acceptChanges');
				    console.info(row);
					 acceptdata("update", row);

				}

			}

		}
	}
	function reject() {
		$('#dialog_m_dataGrid_size').datagrid('rejectChanges');
		editIndex = undefined;
	}
	function getChanges() {
		var rows = $('#dialog_m_dataGrid_size').datagrid('getChanges');
		alert(rows.length + ' rows are changed!');
	}

};

/**
 * WXBTMP SIZE
 */
eps.openwdwddd_gys_dialog_sizetmp = function(index, field, selectedrowt) {
	var flag = 0;
	var dialog;
	var title;
	var footer;
	var yfurl = "";
	var qp = {
		WXB05T : "",
		PMN02 : 0
	};
	var selectedrow_t=selectedrowt;
	if (selectedrow) {

		qp.WXB05T = selectedrowt.WXB05T;

	}
	; 
	var datagrid; // 定义全局变量
	var editRow = "";// 定义当前编辑的行
	var columnset = [];
	if (field == 'SIZE') {
		eps.columnsinit();
		flag = 1;
		columnset = column_size4;
		title = 'SIZE明细';

		yfurl = "wxbsizetmp/getsizetmp";

		$("#dlgft").css('display', 'block');

		footer = '#dlgft';

		$("#dlgft").removeAttr("hidden");
		// $("#dlgft").attr("hidden","true");

	} else {

		flag = 0;

	} 

	if (flag == 0) {
		return;
	}
	$('#wddd_gys_m_dialog_size').dialog('open');
	$('#dialog_m_dataGrid_size').datagrid('reload');

	datagrid = $("#dialog_m_dataGrid_size").datagrid({
		title : '',
		border : false,
		fit : true,
		rownumbers : true,
		locale : "zh_CN",
		iconCls : 'icon-sum',
		striped : true,
		collapsible : false,
		url : yfurl,
		width : "80%",
		height : "30%",
	 	queryParams : qp,
	    
		fitColumns : true,
		columns : [ columnset ],
	 	onDblClickCell : onClickCell, 
 		onEndEdit : onEndEdit,
		pagination : true, // 表示在datagrid设置分页
		rownumbers : true,
		singleSelect : true

	});
	$('#dialog_m_dataGrid_size').datagrid('getPager').pagination({
		pageSize : 50,
		pageNumber : 1,
		pageList : [ 50, 100, 150, 200, 500 ],
		beforePageText : '第',// 页数文本框前显示的汉字
		afterPageText : '页    共 {pages} 页',
		displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
	});
	

	$('#append').unbind('click').click(function() {
				append(selectedrow);
			});

	$("#accept").unbind('click').click(function() {
                
				accept( );

	});	
	
	$("#del").unbind('click').click(function() {
		
		Selectedrow = $('#dialog_m_dataGrid_size').datagrid('getSelected');
		if(Selectedrow ==null){
			$.messager.alert('警告','请选择行'); 
		} else{
			
			
			$.messager.confirm('确认','您确认想要删除记录吗？',function(r){    
			    if (r){    
			       
			    	//----------------------------提交新增/更新
					$.ajax({
						url : "/eps/wxbsizetmp/delwxbsizetmp",
						type : "POST",
						dataType : "json",
						data : Selectedrow,
						async : false,
						success : function(data) {
 
							if (data.code == "100") {
								$.messager.show({
									title : '提示',
									msg : data.msg
								});

								Selectedrow = {};
								$('#dialog_m_dataGrid_size').datagrid('reload');
							} else {
								$.messager.show({
									title : '提示',
									msg : data.msg
								});
								$('#dialog_m_dataGrid_size').datagrid('reload');
							}
						}
					});
					//----------------------------   
			        
			        
			        
			    }    
			});  
	 
			
			
			
		}  
		
		 
		
 });	
	
	$("#removeit").unbind('click').click(function() {
	 
		reject();
 
});	
	
	
	

	var editIndex = undefined;
 
	function endEditing() {
		if (editIndex == undefined) {
			return true;
		}
		;
		if ($('#dialog_m_dataGrid_size').datagrid('validateRow', editIndex)) {
			$('#dialog_m_dataGrid_size').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}
	function onClickCell(index, field) {
		selectedrow = $('#dialog_m_dataGrid_size').datagrid('getData').rows[index];

		

		
		//eps.openwdwddd_gys_dialog_size(index, field, selectedrow);

		if (editIndex != index) {
			if (endEditing()) {
				$('#dialog_m_dataGrid_size').datagrid('selectRow', index).datagrid('beginEdit', index);
				var ed = $('#dialog_m_dataGrid_size').datagrid('getEditor', {
					index : index,
					field : field
				});
				if (ed) {
					($(ed.target).data('textbox') ? $(ed.target).textbox('textbox') : $(ed.target)).focus();
				}
				editIndex = index;
			} else {
				setTimeout(function() {
					$('#dialog_m_dataGrid_size').datagrid('selectRow', editIndex);
				}, 0);
			}
		}
	}
	function onEndEdit(index, row) {
		var ed = $(this).datagrid('getEditor', {
			index : index,
			field : 'WXB05'
		});
 
	}
	function append(selectedrow) {
		
		Selectedrows = $('#dialog_m_dataGrid_size').datagrid('getData');
		if(Selectedrows.total  >= 4 ){
			$.messager.alert('警告','一箱最多只能录入4个SIZE'); 
			return ;
		}  
		
		
		
		if (endEditing()) {
			$('#dialog_m_dataGrid_size').datagrid('appendRow', {
				WXB05T : selectedrow.WXB05T ,
				TC_RVBS06 : selectedrow.WXB15 
				 
			});
			editIndex = $('#dialog_m_dataGrid_size').datagrid('getRows').length - 1;
			$('#dialog_m_dataGrid_size').datagrid('selectRow', editIndex).datagrid('beginEdit', editIndex);
		}
	}
	function removeit() {
		if (editIndex == undefined) {
			return;
		}
		;
		$('#dialog_m_dataGrid_size').datagrid('cancelEdit', editIndex).datagrid('deleteRow', editIndex);
		editIndex = undefined;
	}

	function timetrans() {
		var date = new Date(); //如果date为13位不需要乘1000
		var Y = date.getFullYear() + '-';
		var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1) + '-';
		var D = (date.getDate() < 10 ? '0' + (date.getDate()) : date.getDate()) + ' ';
		var h = (date.getHours() < 10 ? '0' + date.getHours() : date.getHours()) + ':';
		var m = (date.getMinutes() < 10 ? '0' + date.getMinutes() : date.getMinutes()) + ':';
		var s = (date.getSeconds() < 10 ? '0' + date.getSeconds() : date.getSeconds());
		return Y + M + D;
	}

	function acceptdata(op, ob) {
		var rowt = {};
        console.info(ob);
		var accepturl = '';
		if (op == 'insert') {
			accepturl = "/eps/wxbsizetmp/addwxbsizetmp";

		} else if (op == 'update') {

			accepturl = "/eps/wxbsizetmp/updatewxbsizetmp";
		}

		$.each(ob, function(i, n) {

			if (n.WXB05T != undefined) {
	 
				rowt.WXB05T = n.WXB05T;
				rowt.TC_RVBS01 = '-';
				rowt.TC_RVBS02 = 0;
				rowt.TC_RVBS03 = n.TC_RVBS03;
				rowt.TC_RVBS04 = n.TC_RVBS04;
				rowt.TC_RVBS06 = n.TC_RVBS06;
				rowt.TC_RVBS16 = n.TC_RVBS16;
				rowt.TC_RVBS17 = n.TC_RVBS17;  
				rowt.op = op;

				//----------------------------提交新增/更新
				$.ajax({
					url : accepturl,
					type : "POST",
					dataType : "json",
					data : rowt,
					async : false,
					success : function(data) {
									 
						if(data.extend.sum !=undefined){
							console.info(data.extend.sum);
							if(selectedrow_t.WXB08 != data.extend.sum){
								 
								$.messager.show({
									title : '提示',
									msg : 'SIZE数量与SIZE总数不相等！',
									timeout : 3500,
									showType : 'show',
									style : {
										right : '',
										top : document.body.scrollTop
												+ document.documentElement.scrollTop,
										bottom : ''
									}

								});
								
								
								
								
							}
							
						}
						if (data.code == "100") {
							$.messager.show({
								title : '提示',
								msg : data.msg,
								width : '250px',
								height : '150px'
								 
							});

							rowt = {};
							$('#dialog_m_dataGrid_size').datagrid('reload');
						} else {
							$.messager.show({
								title : '提示',
								msg : data.msg
							});
							$('#dialog_m_dataGrid_size').datagrid('reload');
						}
					}
				});
				//----------------------------

			}

		});
	};	
	
	
	
	function accept() {
		if (endEditing()) {
			if ($('#dialog_m_dataGrid_size').datagrid('getChanges').length > 0) {

				var row = {};
				if ($('#dialog_m_dataGrid_size').datagrid('getChanges', "inserted").length) {
					/* 新增 */
					row = $('#dialog_m_dataGrid_size').datagrid('getChanges', "inserted");
					$('#dialog_m_dataGrid_size').datagrid('acceptChanges');
 					acceptdata("insert", row);
					console.info(row);
				}

				if ($('#dialog_m_dataGrid_size').datagrid('getChanges', "updated").length) {
					/* 新增 */
					row = $('#dialog_m_dataGrid_size').datagrid('getChanges', "updated");
					$('#dialog_m_dataGrid_size').datagrid('acceptChanges');
				    console.info(row);
					 acceptdata("update", row);

				}

			}

		}
	}
	function reject() {
		$('#dialog_m_dataGrid_size').datagrid('rejectChanges');
		editIndex = undefined;
	}
	function getChanges() {
		var rows = $('#dialog_m_dataGrid_size').datagrid('getChanges');
		alert(rows.length + ' rows are changed!');
	}

};

eps.PreviewImage = function(fileObj, imgPreviewId, divPreviewId) {
	var allowExtention = ".jpg,.bmp,.gif,.png";// 允许上传文件的后缀名document.getElementById("hfAllowPicSuffix").value;
	var extention = fileObj.value.substring(fileObj.value.lastIndexOf(".") + 1)
			.toLowerCase();
	var browserVersion = window.navigator.userAgent.toUpperCase();
	if (allowExtention.indexOf(extention) > -1) {
		if (fileObj.files) {// HTML5实现预览，兼容chrome、火狐7+等
			if (window.FileReader) {
				var reader = new FileReader();
				reader.onload = function(e) {
					document.getElementById(imgPreviewId).setAttribute("src",
							e.target.result);
				}
				reader.readAsDataURL(fileObj.files[0]);
			} else if (browserVersion.indexOf("SAFARI") > -1) {
				alert("不支持Safari6.0以下浏览器的图片预览!");
			}
		} else if (browserVersion.indexOf("MSIE") > -1) {
			if (browserVersion.indexOf("MSIE 6") > -1) {// ie6
				document.getElementById(imgPreviewId).setAttribute("src",
						fileObj.value);
			} else {// ie[7-9]
				fileObj.select();
				if (browserVersion.indexOf("MSIE 9") > -1)
					fileObj.blur();// 不加上document.selection.createRange().text在ie9会拒绝访问
				var newPreview = document.getElementById(divPreviewId + "New");
				if (newPreview == null) {
					newPreview = document.createElement("div");
					newPreview.setAttribute("id", divPreviewId + "New");
					newPreview.style.width = document
							.getElementById(imgPreviewId).width
							+ "px";
					newPreview.style.height = document
							.getElementById(imgPreviewId).height
							+ "px";
					newPreview.style.border = "solid 1px #d2e2e2";
				}
				newPreview.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale',src='"
						+ document.selection.createRange().text + "')";
				var tempDivPreview = document.getElementById(divPreviewId);
				tempDivPreview.parentNode.insertBefore(newPreview,
						tempDivPreview);
				tempDivPreview.style.display = "none";
			}
		} else if (browserVersion.indexOf("FIREFOX") > -1) {// firefox
			var firefoxVersion = parseFloat(browserVersion.toLowerCase()
					.match(/firefox\/([\d.]+)/)[1]);
			if (firefoxVersion < 7) {// firefox7以下版本
				document.getElementById(imgPreviewId).setAttribute("src",
						fileObj.files[0].getAsDataURL());
			} else {// firefox7.0+
				document.getElementById(imgPreviewId).setAttribute("src",
						window.URL.createObjectURL(fileObj.files[0]));
			}
		} else {
			document.getElementById(imgPreviewId).setAttribute("src",
					fileObj.value);
		}
	} else {
		alert("仅支持" + allowExtention + "为后缀名的文件!");
		fileObj.value = "";// 清空选中文件
		if (browserVersion.indexOf("MSIE") > -1) {
			fileObj.select();
			document.selection.clear();
		}
		fileObj.outerHTML = fileObj.outerHTML;
	}
}

// 获取当前时间
eps.getDatetime = function() {

	function p(s) {
		return s < 10 ? '0' + s : s;
	}
	var myDate = new Date();
	// 获取当前年
	var year = myDate.getFullYear();
	// 获取当前月
	var month = myDate.getMonth() + 1;
	// 获取当前日
	var date = myDate.getDate();
	var h = myDate.getHours(); // 获取当前小时数(0-23)
	var m = myDate.getMinutes(); // 获取当前分钟数(0-59)
	var s = myDate.getSeconds();

	var now = year + '-' + p(month) + "-" + p(date) + " " + p(h) + ':' + p(m)
			+ ":" + p(s);

	return now;
}

// 获取当前日期
eps.getDate = function() {
	function p(s) {
		return s < 10 ? '0' + s : s;
	}
	var myDate = new Date();
	// 获取当前年
	var year = myDate.getFullYear();
	// 获取当前月
	var month = myDate.getMonth() + 1;
	// 获取当前日
	var date = myDate.getDate();
	var h = myDate.getHours(); // 获取当前小时数(0-23)
	var m = myDate.getMinutes(); // 获取当前分钟数(0-59)
	var s = myDate.getSeconds();

	var now = year + '-' + p(month) + "-" + p(date);

	return now;
}

eps.currenttime = eps.getDatetime();
eps.currentdate = eps.getDate();

eps.serializeObject = function(form) {
	var o = {};
	$.each(form.serializeArray(), function(index) {
				if (o[this['name']]) {
					o[this['name']] = o[this['name']] + "," + this['value'];
				} else {
					o[this['name']] = this['value'];
				}
			});
	return o;
};

// 添加tabs
eps.addTab = function(title, url) {
	if ($('#tabs').tabs('exists', title)) {
		$('#tabs').tabs('select', title);
	} else {
		var content = '<iframe scrolling="auto" frameborder="0" src="' + url
				+ '" style="width:100%;height:100%;"></iframe>';
		$('#tabs').tabs('add', {
					title : title,
					content : content,
					closable : true
				});
	}
};

// 删除选择tabs
eps.removeTab = function() {
	var tab = $('#tabs').tabs('getSelected');
	if (tab) {
		var index = $('#tabs').tabs('getTabIndex', tab);
		$('#tabs').tabs('close', index);
	}

}

// 删除所有tabs
eps.removeAllTab = function() {

	var tiles = new Array();
	var tabs = $('#tabs').tabs('tabs');
	var len = tabs.length;
	if (len > 0) {
		for (var j = 0; j < len; j++) {
			var a = tabs[j].panel('options').title;
			tiles.push(a);
		}
		for (var i = 0; i < tiles.length; i++) {
			$('#tabs').tabs('close', tiles[i]);
		}
	}

}

// 初始化tabs
eps.tabs = function() {

	// 初始化tabs
	$('#tabs').tabs({
				fit : true, // 自动适应大小
				// plain:true, //不显示控制面板背景
				border : false, // tabs容器边框

				pill : true, // 气泡
				tools : '#tabs_tb'

			});

};

// 关闭tabs时提示
// 关闭tabls时触发
eps.closetabs = function() {

	$('#tabs').tabs({
				onBeforeClose : function(title, index) {
					var target = this;
					$.messager.confirm('确认', '你确认想要关闭' + title, function(r) {
								if (r) {
									var opts = $(target).tabs('options');
									var bc = opts.onBeforeClose;
									opts.onBeforeClose = function() {
									}; // 允许现在关闭
									$(target).tabs('close', index);
									opts.onBeforeClose = bc; // 还原事件函数
								}
							});
					return false; // 阻止关闭
				}
			});

}

// 初始化菜单
// 加载菜单node
eps.node = function() {
	$('#treenode').tree({
				data : [{
							id : "gysxxgl1",
							text : '供应商信息管理',
							state : 'closed',
							children : [{
										id : "w_stock_inout_01",
										text : '供应商信息维护',
										attributes : {
											"url" : "gysxxgl_xxwh.jsp"
										}

									}]
						}, {
							id : "wdcgd2",
							text : '我的采购单',
							state : 'closed',
							children : [{
										id : "w_stock_inout_02",
										text : '我的采购单(量产)',
										attributes : {
											"url" : "wdcgd_lc_z.jsp"
										}
									}, {
										id : "w_stock_inout_03",
										text : '我的采购单(研发)',
										attributes : {
											"url" : "wdcgd_yf_z.jsp"
										}
									}]
						},

						{
							id : "wddd3",
							text : '我的订单',
							state : 'closed',
							children : [{
										id : "w_stock_inout_04",
										text : '我的订单(供应商)',
										attributes : {
											"url" : "wddd_gys_z.jsp"
										}

									}]
						},

						{
							id : "xxsd4",
							text : '系统设定',
							state : 'closed',
							children : [{
										id : "w_stock_inout_07",
										text : '变更理由码维护',
										attributes : {
											"url" : "xtsd_bglymwh.jsp"
										}
									}]
						}, {
							id : "report5",
							text : '报表',
							state : 'closed',
							children : [{
										id : 'cg_f',
										text : '采购进度表(量产)',
										attributes : {
											"url" : "report_cgjdb_l.jsp"
										}
									}, {
										id : 'cg_y',
										text : '采购进度表(研发)',
										attributes : {
											"url" : "report_cgjdb_y.jsp"
										}
									}]
						}]
			});

};

// 点击菜单时触发
eps.nodeclick = function() {
	$('#treenode').tree({
		onClick : function(node) {
			// alert(node.text); // 在用户点击的时候提示
			// //console.info(node);
			$(this).tree(node.state === 'closed' ? 'expand' : 'collapse',
					node.target);
			node.state = node.state === 'closed' ? 'open' : 'closed';

			try {
				window.parent.frames["positionFrame"].eps.addTab(node.text,
						node.attributes.url);

			} catch (exception) {

			}

		}
	});

};

eps.JudgeBroswer = function() {
	if ($.browser.msie) {
		// alert("this is msie!"); //IE
		return "IE"
	} else if ($.browser.safari) {
		// alert("this is safari!"); //Safari
	} else if ($.browser.mozilla) {
		// alert("this is mozilla!"); //Firefox
	} else if ($.browser.opera) {
		// alert("this is opera"); //Opera
	}
}

/**
 * 导出excel
 */
eps.download = function(type) {
	if (type == "lc") {
		var url = "exportpmmlc"; // "download_project"; 采购进度表量产

	} else if (type == "yf") {
		var url = "exportpmmyf"; // "download_project"; 采购进度表研发

	} else if (type == "ry") {
		var url = "exportpmmddyf"; // "download_project"; 采购进度表研发

	} else if (type == "rl") {
		var url = "exportpmmddyl"; // "download_project"; 采购进度表研发

	}
	// window.open(url);
	location.href = url; // 无刷新请求

};

 