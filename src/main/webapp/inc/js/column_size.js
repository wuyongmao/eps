/*我的订单外箱标栏位*/
column_size = [

{
	field : 'ck',
	checkbox : true
}, {
	"align" : "left",
	"title" : "订单号",
	"width" : 130,
	"field" : "TC_RVBS01"
},{
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
	"field" : "TC_RVBS03"
}, {
	"align" : "right",
	"title" : "数量",
	"width" : 110,
	"field" : "TC_RVBS04"
}, {
	"align" : "right",
	"title" : "左脚数量",
	"width" : 110,
	"field" : "TC_RVBS16"
}, {
	"align" : "right",
	"title" : "右脚数量",
	"width" : 110,
	"field" : "TC_RVBS17"
}

];

function onSelect(index, row) {
	eps.pmnselectrow = row;

};
function onHidePanel() {
//	console.info(eps.pmnselectrow);
};