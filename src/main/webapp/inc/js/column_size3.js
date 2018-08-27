/*外箱标tmp栏位*/
column_size3 = [

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
	"title" : "项次",
	"hidden" :true,
	"width" : 1,
	"field" : "TC_RVBS02"
}, {
	"align" : "left",
	"title" : "单号",
	"hidden" :true,
	"width" : 130,
	"field" : "TC_RVBS01"
},   {
	"align" : "left",
	"title" : "料号",
	"width" : 110,
	"hidden" : true,
	"field" : "TC_RVBS06"
} , {
	"align" : "left",
	"title" : "size",
	"width" : 100,
	"field" : "TC_RVBS03",
	editor : { 
		type : 'validatebox',
		options : {
			valueField : 'TC_RVBS03',
			required : false
			 
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