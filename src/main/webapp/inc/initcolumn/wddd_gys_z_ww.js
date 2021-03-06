 /**
 *   初始化栏位  --------》供应商
 */
initcolumn = function() {

	return [
 {
		"field" : "PMMUD02",
		"title" : "采购厂商",
		"width" : 80,
		"sortable":true
	}, {
		"field" : "PMC03",
		"title" : "供应商简称",
		"width" : 120,
		"sortable":true
	}, {
		"field" : "PMM01",
		"title" : "订单号码",
		"width" : 130,
		"sortable":true
	}, {
		"field" : "PMN02",
		"title" : "项次",
		"width" : 80,
		"sortable":true
	},

	{
		"field" : "PMN41",
		"title" : "工单号",
		"width" : 120,
		"sortable":true
	},
	{
		"field" : "SFB02",
		"title" : "工单类型",
		"width" : 100,
		"formatter" : function(value, rowData, rowIndex) {

			if (value == undefined || value == null || value == '') {
				value = " "

			} else if (value == "7") {
				value = "委外工单(7)"
			}   else if (value == "8") {
				value = "返工委外工单(8)"
			}  else{
				value=" ";
			}

			return '<span>' + value + '</span>';

		},
		"sortable":true
	}
	,   {
		"field" : "PMMCOND",
		"title" : "审核日期",
		"width" : 140,
		"hidden" : true
	}, {
		"field" : "PMM04",
		"title" : "采购日期",
		"width" : 140,
		"sortable":true
	}, {
		"field" : "PMM12",
		"title" : "采购人员代号",
		"width" : 90,
		"sortable":true,
		"hidden" : true
	}, {
		"field" : "GEN021",
		"title" : "采购人姓名",
		"width" : 80,
		"sortable":true,
		"hidden" : true
	},

	{
		"field" : "PMM13",
		"title" : "采购部门代号",
		"width" : 90,
		"sortable":true,
		"hidden" : true
	}, {
		"field" : "GEM02",
		"title" : "部门名称",
		"width" : 110,
		"sortable":true,
		"hidden" : true
	}, {
		"field" : "PMM18",
		"title" : "确认码",
		"width" : 60,
		"formatter" : function(value, rowData, rowIndex) {

			if (value == undefined || value == null || value == '') {
				value = " "

			} else if (value == "Y") {
				value = "已审核(Y)"
			} else if (value == "N") {
				value = "未审核(N)"

			} else if (value == "X") {
				value = "作废(X)"
			}

			return '<span>' + value + '</span>';

		},
		"sortable":true,
		"hidden" : true
	},
	{
		"field" : "PMM25",
		"title" : "状况码",
		"width" : 70,
		"formatter" : function(value, rowData, rowIndex) {

			if (value == undefined || value == null || value == '') {
				value = " "

			} else if (value == "2") {
				value = "发出采购单(2)"
			} else if (value == "6") {
				value = "结案(6)"

			} else if (value == "9") {
				value = "取消(9)"
			}else if (value == "S") {
				value = "送签中(S)"
			}else if (value == "1") {
				value = "已核准(1)"
			}

			return '<span>' + value + '</span>';

		},
		"sortable":true,
		"hidden" : true
	}, {
		"field" : "TA_PMM10",
		"title" : "结案人员",
		"width" : 80,
		"sortable":true,
		"hidden" : true
	}, {
		"field" : "PMMUD13",
		"title" : "结案日期",
		"width" : 140,
		"sortable":true,
		"hidden" : true
	}, {
		"field" : "PMN04",
		"title" : "料件编号",
		"width" : 100,
		"hidden" : true
	}, {
		"field" : "PMN041",
		"title" : "材料名称",
		"width" : 220,
		"sortable":true,
		"sortable":true
	}, {
		"field" : "IMA021",
		"title" : "规格",
		"width" : 100,
		"sortable":true
	},{
		"field" : "TC_TQA03",
		"title" : "型体名称",
		"width" : 100
	}, {
		"field" : "PMNUD05",
		"title" : "生产季节",
		"width" : 60,
		"sortable":true
	}, {
		"field" : "PMNUD05_DS",
		"title" : "生产季节说明",
		"width" : 100,
		"sortable":true
	},    {
		"field" : "PMN33",
		"title" : "原始交货日期",
		"width" : 140,
 		"formatter" : eps.formatDilogColumn,
		"sortable":true
	}, {
		"field" : "REPLYDD",
		"title" : "已确认交期",
		"width" : 140,
		"sortable" : true
	},{
		"field" : "PMN34",
		"title" : "原始到厂日期",
		"width" : 140
	}, {
		"field" : "PMN35",
		"title" : "原始到库日期",
		"width" : 140
	}, {
		"field" : "PMN20",
		"title" : "采购量",
		"width" : 100,
		"align" : "right"
	}, {
		"field" : "EXITSBG",
		"title" : "是否有变更",
		"width" : 80,
 		"formatter" : eps.formatDilogColumn,
		"sortable":true
	},{
		"field" : "PMN07",
		"title" : "采购单位",
		"width" : 80
	}, {
		"field" : "SHZNUM",
		"title" : "送货总数量",
		"width" : 100 ,
		"align" : "right",
 		"formatter" : eps.formatDilogColumn
	},
	{
		"field" : "SHDZ",
		"title" : "收货地址",
		"width" : 100,
		"formatter" : function(value, rowData, rowIndex) {

			if(value== undefined || value==null || value==''){
				 value="--"
			} else if(value == "A102"){
				value="总厂(A102)"
			}else if(value == "A202"){
				value="白石(A202)"
			}
			
			 
      return '<span>'+value+'</span>';
			 
		}
	},{
		"field" : "CJL",
		"title" : "未交数量",
		"width" : 60,
		"hidden" :false
	}
 ,   {
		"field" : "PMN86",
		"title" : "计价单位",
		"width" : 60,
		"hidden" : true
	}, {
		"field" : "TA_PMN05",
		"title" : "阶段",
		"width" : 60,
		"hidden" : true
	}, {
		"field" : "TA_PMN05_DS",
		"title" : "阶段中文说明",
		"width" : 80,
		"hidden" : true
	} 
 	, {
		"field" : "PMNUD04",
		"title" : "备注",
		"width" : 100,
		"hidden" : true
	}, {
		"field" : "PMMCONU",
		"title" : "审核人员",
		"width" : 60,
		"hidden" : true
	}, {
		"field" : "GEN02",
		"title" : "审核人姓名",
		"width" : 80,
		"hidden" : true
	},
	{
		"field" : "TA_PMM06",
		"title" : "营运组织代号",
		"width" : 100
	},{
		"field" : "PMM909",
		"title" : "资料来源",
		"width" : 100,
		"formatter" : function(value, rowData, rowIndex) {

			if (value == undefined || value == null || value == '') {
				value = " "

			} else if (value == "1") {
				value = "人工录入(1)"
			} else if (value == "2") {
				value = "请购单转入(2)"
			} else if (value == "3") {
				value = "订单转入(3)"
			} else if (value == "4") {
				value = "调拨(4)"
			} else if (value == "5") {
				value = "工单转入(5)"
			} else if (value == "6") {
				value = "需求分配(6)"
			} else if (value == "7") {
				value = "配送分货(7)"
			} else if (value == "8") {
				value = "电子采购(8)"
			} else if (value == "9") {
				value = "配送不同(9)"
			}

			return '<span>' + value + '</span>';

		},
		"sortable":true,
		"hidden" : true
	},
	{
		"field" : "PMM02",
		"title" : "采购单性质",
		"width" : 80,
		"formatter" : function(value, rowData, rowIndex) {

			if (value == undefined || value == null || value == '') {
				value = " "

			} else if (value == "REG") {
				value = "原物料(REG)"
			} else if (value == "EXP") {
				value = "费用(EXP)"

			} else if (value == "CAP") {
				value = "资产(CAP)"
			} else if (value == "TRI") {
				value = "多角贸易(TRI)"
			} else if (value == "TRP") {
				value = "多角贸易代采购(TRP)"
			}else if ( value =="SUB"){
				value ="厂外加工采购";
			}else if (value == "TAP") {
				value = "采购性多角贸易采购";
			}

			return '<span>' + value + '</span>';

		},
		"sortable":true,
		"hidden" : true
	},
	{
		"field" : "PMM07",
		"title" : "采购类型",
		"width" : 80,
		"formatter" : function(value, rowData, rowIndex) {

			if (value == undefined || value == null || value == '') {
				value = " "

			} else if (value == "1") {
				value = "开发采购(1)"
			} else if (value == "2") {
				value = "量产采购(2)"

			} else if (value == "3") {
				value = "后勤采购(3)"
			}

			return '<span>' + value + '</span>';

		},
		"sortable":true,
		"hidden" : true
	},
	{
		"field" : "TA_PMM05",
		"title" : "采购方式",
		"width" : 75,
		"formatter" : function(value, rowData, rowIndex) {

			if (value == undefined || value == null || value == '') {
				value = " "

			} else if (value == "1") {
				value = "国内采购(1)"
			} else if (value == "2") {
				value = "合约转厂(2)"

			} else if (value == "3") {
				value = "境外进口(3)"
			}

			return '<span>' + value + '</span>';

		},
		"sortable":true,
		"hidden" : true
	},
	{
		"field" : "PMMDATE",
		"title" : "最近更改日期",
		"width" : 140,
		"hidden" : true
	},
	{
		"field" : "SIZE",
		"title" : "SIZE",
		"width" : 80,
 		"formatter" : eps.formatDilogColumn,
		"sortable":true
	}

	];
}
