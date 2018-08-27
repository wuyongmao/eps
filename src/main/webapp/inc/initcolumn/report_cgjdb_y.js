/**
 *   初始化栏位  --------》采购进度表(研发)
 */
initcolumn = function() {

	return [ {
		"field" : "PMM04",
		"title" : "采购日期",
		"width" : 140,
		"sortable" : true
	}, {
		"field" : "PMMUD02",
		"title" : "采购厂商",
		"width" : 80,
		"sortable" : true
	}, {
		"field" : "PMC03",
		"title" : "供应商简称",
		"width" : 120,
		"sortable" : true
	}, {
		"field" : "PMM01",
		"title" : "采购单号",
		"width" : 130,
		"sortable" : true
	}, {
		"field" : "PMN02",
		"title" : "项次",
		"width" : 50,
		"sortable" : true
	}, {
		"field" : "PMN24",
		"title" : "请购单号",
		"width" : 150,
		"sortable" : true
	}, {
		"field" : "TA_PMN05",
		"title" : "阶段",
		"width" : 100,
		"sortable" : true
	}, {
		"field" : "TA_PMN05_DS",
		"title" : "阶段中文说明",
		"width" : 100,
		"sortable" : true
	}, {
		"field" : "PMN04",
		"title" : "料件编号",
		"width" : 100,
		"sortable" : true
	}, {
		"field" : "PMN041",
		"title" : "品名",
		"width" : 250,
		"sortable" : true
	}, {
		"field" : "TC_TQA03",
		"title" : "型体名称",
		"width" : 100,
		"sortable":true
	},{
		"field" : "PMN16",
		"title" : "状况码",
		"width" : 60,
		"sortable" : true
	}, {
		"field" : "PMN20",
		"title" : "采购量",
		"width" : 100,
		"align" : "right",
		"sortable" : true
	}, {
		"field" : "SHZNUM",
		"title" : "送货总数量",
		"width" : 100 ,
		"align" : "right" 
	}, {
		"field" : "CJL",
		"title" : "未交数量",
		"width" : 60,
		"hidden" :false
	}, {
		"field" : "PMN07",
		"title" : "采购单位",
		"width" : 80
	}, {
		"field" : "PMN33",
		"title" : "原始交货日期",
		"width" : 140,
		"sortable" : true
	}, {
		"field" : "PMN34",
		"title" : "原始到厂日期",
		"width" : 140,
		"sortable" : true
	}, {
		"field" : "PMN35",
		"title" : "原始到库日期",
		"width" : 140,
		"sortable" : true
	}, {
		"field" : "REQUIREMENTDD",
		"title" : "需求交期",
		"width" : 140,
		"sortable" : true
	}, {
		"field" : "REPLYDD",
		"title" : "厂商回复交期",
		"width" : 140,
		"sortable" : true
	}

	, {
		"field" : "PMNUD04",
		"title" : "备注",
		"width" : 200,
		"sortable" : true
	}, {
		"field" : "PMM12",
		"title" : "采购人员代号",
		"width" : 90,
		"sortable" : true
	}, {
		"field" : "GEN021",
		"title" : "采购人姓名",
		"width" : 80,
		"sortable" : true
	}, {
		"field" : "ISAUTOJQ",
		"title" : "是否自动确认交期",
		"width" : 140,
		"sortable" : true,
		"formatter" : function(value, rowData, rowIndex) {

			if (value == undefined || value == null || value == '') {
				value = "";
			} else if (value == "Y") {
				value = "是";
			} else if (value == "N") {
				value = "否";
			}

			return '<span  >'
					+ value + '</span>';

		}}
	 

	];
};
