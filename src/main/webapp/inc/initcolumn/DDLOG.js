/**
 * 初始化栏位 -------- //交期变更记录表
 */
 initcolumn=function(){	
	return
	[{
	    "field": "pmn01",
	    "title": "采购单号",
	    "width": 100
	  }, {
		    "field": "pmn02",
		    "title": "项次",
		    "width": 100
		  },
	  {
	    "field": "accid",
	    "title": "需求变更发起人",
	    "width": 100
	  },
	  {
	    "field": "replydd",
	    "title": "供应商回复交期",
	    "width": 100
	  },
	  {
	    "field": "launchtime",
	    "title": "发起时间",
	    "width": 100
	  },
	  {
	    "field": "chgid",
	    "title": "变更理由",
	    "width": 100
	  },
	  
	  {
	    "field": "ddid",
	    "title": "流水号",
	    "width": 100,
	    "hidden":true
	  },
	  {
	    "field": "status",
	    "title": "状态(0:不同意;1:同意)",
	    "width": 100
	  },
	  
	  {
	    "field": "requirementdd",
	    "title": "采购方需求交期",
	    "width": 100
	  } ,
	  {
		    "field": "memo",
		    "title": "备注",
		    "width": 100
		  }
	];

}




