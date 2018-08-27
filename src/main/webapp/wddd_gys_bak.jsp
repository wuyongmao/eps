<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<script type="text/javascript" src="inc/js/eps.js"></script>
<script type="text/javascript" src="./inc/js/column_wxb.js"></script>
<script type="text/javascript" src="inc/js/ext.js"></script>
<script type="text/javascript" src="inc/jquery.tmpl/1.4.2/jquery.tmpl.min.js"></script>
<script type="text/javascript" src="inc/js/qr.js"></script>

<link rel="stylesheet" type="text/css" href="inc/css/baseCss.css"></link>

<title>送货单</title>

<script type="text/javascript">
	var wddd_gys_z = $.extend({}, wddd_gys_z);/* 全局对象 */
	var selectedrow;
	var type = "rl";

	eps.ACC = "${sessionScope.username.ACC}";
	eps.ACCID = "${sessionScope.username.ACCID}";
	eps.NAME = "${sessionScope.username.NAME}";
	eps.PMMUD02_t = '${sessionScope.username.PMMUD02}';
	if (eps.PMMUD02_t == '' || eps.PMMUD02_t.length == 0) {
		eps.PMMUD02_t = 'lll';

	}

	$(function() {
		var column_wddd_gys_z_PMM_PMN = []; //采购主明细档 
		column_wddd_gys_z_PMM_PMN = column_wxb;
		var datagrid; //定义全局变量  
		datagrid = $("#dg").datagrid({
			border : false,
			fit : true,
			rownumbers : true,
			locale : "zh_CN",
			striped : true,
			multiSort : true,
			sortOrder : "desc",
			collapsible : false,
			queryParams : {
				PMMUD02 : eps.PMMUD02_t
			},
			columns : [ column_wddd_gys_z_PMM_PMN ],

			toolbar : "#tb",
			onDblClickRow : function(index, row) {
			//console.info(row);
			},
			rownumbers : true,
			singleSelect : true,
			pagination : true,
			toolbar : '#tb',
			method : 'post',
			onDblClickCell : onClickCell,
			onEndEdit : onEndEdit

		});

	});

	wddd_gys_z.doSearch = function() {
		var opts = $("#dg").datagrid("options");
		var ob = {
			PMN01 : $('#WXB01').val(), //  采购单号 
			WXB03 : $('#WXB03').val(), //  送货单号 
			WXB04 : $('#WXB04').val(), //  箱号 
			PMN02 : $('#WXB02').val(),
			PMMUD02 : eps.PMMUD02_t

		};

		//console .info("1111+-${pageContext.request.contextPath }----${paramValues.PMM01}");
		opts.url = "${pageContext.request.contextPath }/wxb/getwxb"; //ds
		$("#dg").datagrid("load", ob

		);

		//var queryParams = $('#dataGrid').datagrid('options').queryParams;

	};

	wddd_gys_z.remove = function() {
		$("#searchform").form('clear');
	};
</script>
<style type="text/css">
#searchform input {
	width: 150px;
}

#tableForm input {
	width: 200px;
	hidden: true;
}

#wxbdiv {
	border: 2px solid #a1a1a1;
	padding: 10px 10px;
	width: 98%;
	border-radius: 15px;
}

/* #tab tr td span { display:block; width: 65px;   text-align:right;}
 */
</style>
</head>



<body>
 



	<div id="shdcx" style="height: 100%; width: 100%">
		<table id="dg" class="easyui-datagrid"
			style="width: 100%; height: 570px" pagination="true">
		</table>
	</div>

	<div id="tb" style="height: auto">

		<!-- 查询栏位 -->
		<div id="tb" style="padding: 5px">
			<form id="searchform"
				action="${pageContext.request.contextPath }/cgmxjson" method="post">

				<table class="tableForm">
					<tr>
						<td><span>送货单号</span></td>
						<td><input id="WXB03" name="WXB03" class="easyui-textbox" /></td>
						<td><span>箱号</span></td>
						<td><input id="WXB04" name="WXB04" class="easyui-textbox" /></td>
						<td><span>订单单号</span></td>
						<td><input id="WXB01" name="WXB01" class="easyui-textbox" /></td>
						<td><span>项次</span></td>
						<td><input id="WXB02" name="WXB01" class="easyui-textbox" /></td>

						<td><div class="easyui-linkbutton" iconCls="icon-search"
								plain="true" onclick="wddd_gys_z.doSearch()">查询</div></td>

						<td><div class="easyui-linkbutton" iconCls="icon-clear"
								onclick=" wddd_gys_z.remove()">清空</div></td>
					</tr>
				</table>
			</form>
			<hr
				style="height: 2px; border: none; border-top: 2px dotted #185598;" />
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-add',plain:true" onclick="append()">新增</a>
			<!-- 	<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-remove',plain:true" onclick="removeit()">删除</a> -->
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-save',plain:true" onclick="accept()">保存</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-undo',plain:true" onclick="reject()">取消</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-print',plain:true" onclick="printshd()">打印送货单</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-search',plain:true"
				onclick="getChanges()">Get</a> <a href="javascript:void(0)"
				class="easyui-linkbutton"
				data-options="iconCls:'icon-print',plain:true" onclick="printwxb()">打印外箱标</a>
		</div></div>
<div id="div_demo"></div>	
<script id="demo" type="text/x-jquery-tmpl">
<div id="ttable" style="width:550px; height:595px; ">
<table  border="1" bordercolor="#a0c6e5" style="border-collapse:collapse;"  > 
<tr><td><labal>厂商：</labal><span>{{= PMMUD02}}</span></td><td  rowspan="2"><labal>箱号：</labal><span>{{= WXB05}}</span></td></tr>
<tr><td><labal>料号：</labal><span>{{= PMN04}}</span></td> </tr>
<tr><td style="WORD-WRAP: break-word" width="100">规格： {{= IMA021}}</td><td  rowspan="6"  align="center"  > <div id="qr"></div></td></tr>
<tr><td><labal>品名：</labal><span>{{= PMN041}}</span></td> </tr>
<tr><td><labal>色号：</labal><span>{{= WXB06}}</span></td></tr>
<tr><td><labal>缸号：</labal><span>{{= WXB04}}</span></td></tr>
<tr><td><labal>颜色/客户色号：</labal><span>${YS}</span></td> </tr>
<tr><td><labal>日期：</labal><span>{{= WXB07}}</span></td> </tr>
<tr><td><labal>客户订单号：</labal><span>{{= WXB01}}</span></td><td><labal>项次：</labal><span>{{= WXB02}}</span></td></tr>
<tr><td><labal>毛重：</labal><span>{{= WXB08}}</span></td><td><labal>管数：</labal></td></tr>
<tr><td><labal>净重：</labal><span>{{= WXB09}}</span></td><td><labal>单位：</labal><span>{{= WXB01}}</span></td></tr>
<tr><td><labal>SIZE 合计：</labal></td><td></td></tr>
<tr><td><labal>&nbsp;&nbsp;左：</labal><span>{{= TC_RVBS16}}</span></td><td></td></tr>
<tr><td><labal>&nbsp;&nbsp;右：</labal><span>{{= TC_RVBS17}}</span></td><td></td></tr>

</table></div>


</script> 
    
<script>
var users = {};


function printTable()
{   
   $.tableToPrint = $("#div_demo");//将要被打印的表格
  var newWin= window.open("");//新打开一个空窗口
  newWin.document.write($.tableToPrint.html());//将表格添加进新的窗口
  newWin.document.close();//在IE浏览器中使用必须添加这一句
  newWin.focus();//在IE浏览器中使用必须添加这一句
  $.tableToPrint.empty();  
//  newWin.print();//打印
//  newWin.close();//关闭窗口
}
</script>


		<script type="text/javascript">
			var editIndex = undefined;
			function endEditing() {
				if (editIndex == undefined) {
					return true;
				}
				;
				if ($('#dg').datagrid('validateRow', editIndex)) {
					$('#dg').datagrid('endEdit', editIndex);
					editIndex = undefined;
					return true;
				} else {
					return false;
				}
			}
			function onClickCell(index, field) {
				if (editIndex != index) {
					if (endEditing()) {
						$('#dg').datagrid('selectRow', index).datagrid('beginEdit', index);
						var ed = $('#dg').datagrid('getEditor', {
							index : index,
							field : field
						});
						if (ed) {
							($(ed.target).data('textbox') ? $(ed.target).textbox('textbox') : $(ed.target)).focus();
						}
						editIndex = index;
					} else {
						setTimeout(function() {
							$('#dg').datagrid('selectRow', editIndex);
						}, 0);
					}
				}
			}
			function onEndEdit(index, row) {
				var ed = $(this).datagrid('getEditor', {
					index : index,
					field : 'productid'
				});
				//row.productname = $(ed.target).combobox('getText');
			}
			function append() {
				if (endEditing()) {
					$('#dg').datagrid('appendRow', {
						status : 'P'
					});
					editIndex = $('#dg').datagrid('getRows').length - 1;
					$('#dg').datagrid('selectRow', editIndex).datagrid('beginEdit', editIndex);
				}
			}
			function removeit() {
				if (editIndex == undefined) {
					return;
				}
				;
				$('#dg').datagrid('cancelEdit', editIndex).datagrid('deleteRow', editIndex);
				editIndex = undefined;
			}
			function accept() {
				if (endEditing()) {
					//console.info($('#dg').datagrid('getChanges').length);
					if ($('#dg').datagrid('getChanges').length > 0) {

						var row = {};
						if ($('#dg').datagrid('getChanges', "inserted").length) {
							/* 新增 */
							row = $('#dg').datagrid('getChanges', "inserted");
							$('#dg').datagrid('acceptChanges');
							acceptdata("insert", row);
						}

						if ($('#dg').datagrid('getChanges', "updated").length) {
							/* 新增 */
							row = $('#dg').datagrid('getChanges', "updated");
							$('#dg').datagrid('acceptChanges');
							acceptdata("update", row);

						}

						//console.log(row);

					}
					/*
					alert("------保存");
					console.info($('#dg').datagrid('acceptChanges'));
					var row = $('#dg').datagrid('getSelected');
					if (row){
						$.messager.alert('Info', row.itemid+":"+row.productid+":"+row.attr1);
					}
					
					
					 */
				}
			}
			function reject() {
				$('#dg').datagrid('rejectChanges');
				editIndex = undefined;
			}
			function getChanges() {
				var rows = $('#dg').datagrid('getChanges');
				alert(rows.length + ' rows are changed!');
			}

			function printwxb() {

				$('#dg').datagrid({
					singleSelect : true
				});
				users=null;
				users=$('#dg').datagrid('getSelected');
				
				$.ajax(function(){
					 
				});	
				
				 {
						
						
				
				if( users !=null )
				
					
				$("#demo").tmpl(users).appendTo('#div_demo');
				console.info($("#div_demo"));
				
				var t=users.WXB05;
				  new QRCode('qr', { 
					  text: t, 
					  width: 260, 
					  height: 260, 
					  colorDark : '#000000', 
					  colorLight : '#ffffff', 
					  correctLevel : QRCode.CorrectLevel.H 
					}); 
				
				printTable();
				 }
			};
			function printshd() {

				$('#dg').datagrid({
					singleSelect : false
				});
			};
			function acceptdata(op, ob) {
				var row = {};

				var accepturl = '';
				if (op == 'insert') {
					accepturl = "/eps/wxb/addwxb";

				} else if (op == 'update') {

					accepturl = "/eps/wxb/updatewxb";
				}
				// accepturl = "/eps/wxb/addwxb";
				console.info(op);

				$.each(ob, function(i, n) {

					if (n.WXB01 != undefined) {

						row.PMMUD02 = eps.PMMUD02_t;
						row.WXB01 = n.WXB01;
						row.WXB02 = n.WXB02;
						row.WXB03 = n.WXB03;
						row.WXB04 = n.WXB04;
						row.WXB05 = n.WXB05;
						row.WXB06 = n.WXB06;
						row.WXB07 = n.WXB07;
						row.WXB08 = n.WXB08;
						row.WXB09 = n.WXB09;
						row.WXB10 = n.WXB10;
						row.op = op;
						//----------------------------
						console.info("Ajax---row");
						console.info(row);

						//----------------------------提交新增/更新
						$.ajax({
							url : accepturl,
							type : "POST",
							dataType : "json",
							data : row,
							async : false,
							success : function(data) {

								if (data.code == "100") {
									$.messager.show({
										title : '提示',
										msg : data.msg
									});

									row = {};
									$('#dg').datagrid('reload');
								} else {
									$.messager.show({
										title : '提示',
										msg : data.msg
									});
								}
							}
						});
						//----------------------------

					}

				});

			}
			 
			
			
			
		</script> 
  
		
	
</body>

</html>