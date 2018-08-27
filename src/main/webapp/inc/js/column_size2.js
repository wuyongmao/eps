/*我的订单外箱标栏位*/
column_size2 = [

{
	field : 'ck',
	checkbox : true
}, {
	"align" : "left",
	"title" : "箱号",
	"width" : 130,
	"field" : "WXB05"
}, {
	"align" : "left",
	"title" : "订单号",
	"width" : 130,
	"field" : "TC_RVBS01"
}, {
	"align" : "left",
	"title" : "料号",
	"width" : 110,
	"hidden" : true,
	"field" : "TC_RVBS06"
}, {
	"align" : "right",
	"title" : "项次",
	"width" : 70,
	"field" : "TC_RVBS02"
}, {
	"align" : "left",
	"title" : "size",
	"width" : 100,
	"field" : "TC_RVBS03",
	editor : {
		type : 'combobox',
		options : {
			valueField : 'id',
			textField : 'text',
			editable : false,
			url : 'wxbsize/size',
			onBeforeLoad : function(param) {
				param.PMN01 = eps.PMN01;
				param.PMN02 = eps.PMN02;
			},
			dataType : "json",
			required : true,
			onSelect : function(rec) {
				//alert($(this).parent().parent().parent().parent().parent().parent().parent()[0].cells[4].innerText);
				var preNum = $(this).parent().parent().parent().parent().parent().parent().parent()[0].cells[4].innerText;    
                //var result = rec.text + "";    //计算总计  
				var result = 10;    //计算总计  
            //    $(this).parent().parent().parent().parent().parent().parent().parent()[0].cells[6].innerText = result;    
			
			
			}

		}
	}
}, {
	"align" : "left",
	"title" : "数量",
	"width" : 100,
	"field" : "TC_RVBS04",
	editor : {
		type : 'numberbox',
		options : {
			valueField : 'TC_RVBS04',
			required : true,
			min : 0,
			precision : 2
		}
	}
}, {
	"align" : "right",
	"title" : "左脚数量",
	"width" : 110,
	"field" : "TC_RVBS16",
	editor : {
		type : 'numberbox',
		options : {
			valueField : 'TC_RVBS16',
			required : true,
			min : 0,
			precision : 2
		}
	}
}, {
	"align" : "right",
	"title" : "右脚数量",
	"width" : 110,
	"field" : "TC_RVBS17",
	editor : {
		type : 'numberbox',
		options : {
			valueField : 'TC_RVBS17',
			required : true,
			min : 0,
			precision : 2
		}
	}
}

];

function onSelect(index, row) {
	eps.pmnselectrow = row;

};
function onHidePanel() {
//	console.info(eps.pmnselectrow);
};