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




<link rel="stylesheet" type="text/css" href="inc/css/baseCss.css"></link>
<style type="text/css">
input {
	width: 90px;
}

/* #tab tr td span { display:block; width: 65px;   text-align:right;}
 */
</style>
<title>外箱标</title>

<script type="text/javascript">
	var wddd_gys_z = $.extend({}, wddd_gys_z);/* 全局对象 */
	var selectedrow;
	var type = "rl";

	eps.ACC = "${sessionScope.username.ACC}";
	eps.ROLE = "${sessionScope.username.ROLE}";
	eps.ACCID = "${sessionScope.username.ACCID}";
	eps.NAME = "${sessionScope.username.NAME}";
	eps.PMMUD02_t = '${sessionScope.username.PMMUD02}';
	/* 	if(eps.ROLE !="GYS" && eps.ROLE !=''){
	 eps.PMMUD02_t = 'CY0001';
	
	
	 } 
	 if (eps.PMMUD02_t == '' || eps.PMMUD02_t.length == 0) {
	 eps.PMMUD02_t = 'CY0001';

	 } */
	/*我的订单外箱标栏位*/
	column_wxb = [

	{
		field : 'ck',
		checkbox : true
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "订单号",
		"sortable" : true,
		"width" : 150,
		"field" : "WXB01",
		editor : {
			type : 'combogrid',
			options : {
				required : true,
				panelWidth : 1300,
				idField : 'PMN01',
				textField : 'PMN01',
				url : 'wxb/getpmnlist?PMMUD02=' + eps.PMMUD02_t,
				method : 'get',
				columns : [ [ {
					field : 'PMN01',
					title : '订单号',
					width : 150
				}, {
					field : 'PMN02',
					title : '项次',
					width : 40,
					align : 'right'
				}, {
					field : 'PMN04',
					title : '料号',
					width : 100
				}, {
					field : 'PMN041',
					title : '品名',
					width : 260,
					align : 'left'
				}, {
					field : 'PMMUD02',
					title : '供应商',
					width : 10,
					"hidden" : true
				}, {
					field : 'PMN07',
					title : '单位',
					width : 10,
					"hidden" : true
				}, {
					field : 'YS',
					title : '颜色',
					width : 10,
					"hidden" : true
				}, {
					field : 'IMA021',
					title : '规格',
					width : 10,
					"hidden" : true
				}, ] ],
				fitColumns : true,
				onSelect : onSelect,
				onHidePanel : onHidePanel,
				onChange : function(newValue, oldValue) {
					//console.info(newValue);
					//console.info(eps.pmnselectrow);
				}
			}
		}
	}, {
		"align" : "right",
		"hidden" : false,
		"title" : "项次",
		"width" : 80,
		"sortable" : true,
		"field" : "WXB02",
		editor : {

			type : 'combobox',

			options : {
				valueField : 'PMN02',
				textField : 'PMN02',
				method : 'get',
				editable : true,
				/* onBeforeLoad : function(param) {
					param.PMN01 = 'C302-1709120001';
					 
				}, */
				dataType : "json",
				required : true,
			}
		},

	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "缸号",
		"width" : 170,
		"sortable" : true,
		"field" : "WXB04",
		editor : {
			type : 'validatebox',
			options : {
				valueField : 'WXB04',
				required : false
			}
		}
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "箱号",
		"width" : 160,
		"sortable" : true,
		"field" : "WXB05"
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "色号",
		"width" : 170,
		"field" : "WXB06",
		"sortable" : true,
		editor : {
			type : 'validatebox',
			options : {
				valueField : 'WXB06',
				required : false
			}
		}
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "送货日期",
		"width" : 100,
		"field" : "WXB07",
		editor : {
			type : 'datebox',
			options : {
				valueField : 'WXB07',
				required : true
			}
		}
	}, {
		"align" : "right",
		"hidden" : false,
		"title" : "毛重",
		"width" : 70,
		"field" : "WXB08",
		editor : {
			type : 'numberbox',
			options : {
				valueField : 'WXB08',
				required : false,
				min : 0,
				precision : 2
			}
		}
	}, {
		"align" : "right",
		"hidden" : false,
		"title" : "净重/数量",
		"width" : 70,
		"field" : "WXB09",
		editor : {
			type : 'numberbox',
			options : {
				valueField : 'WXB09',
				required : true,
				min : 0,
				precision : 2
			}
		}
	}, {
		"align" : "right",
		"hidden" : false,
		"title" : "管数",
		"width" : 70,
		"field" : "WXB10",
		editor : {
			type : 'numberbox',
			options : {
				valueField : 'WXB10',
				required : false
			}
		}
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "送货单号",
		"sortable" : true,
		"width" : 150,
		"field" : "WXB03"
	/*
	 * ,editor : { type : 'validatebox', options : { valueField : 'WXB03', required :
	 * true } }
	 */
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "录入日期",
		"width" : 80,
		"field" : "WXB11",
		formatter : function(value) {
			if (value != undefined) {
				var date = new Date(value);
				var y = date.getFullYear();
				var m = date.getMonth() + 1;
				var d = date.getDate();
				return y + '-' + m + '-' + d;
			} else {
				value = "";
			}

		}
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "修改日期",
		"width" : 70,
		"field" : "WXB12"
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "厂商",
		"width" : 70,
		"field" : "PMMUD02"
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "料号",
		"width" : 110,
		"field" : "PMN04"
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "规格",
		"width" : 110,
		"field" : "IMA021"
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "品名",
		"width" : 110,
		"field" : "PMN041"
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "颜色",
		"width" : 110,
		"field" : "YS"
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "单位",
		"width" : 70,
		"field" : "PMN07"
	}, {
		"align" : "left",
		"title" : "SIZE",
		"formatter" : eps.formatDilogColumn,
		"width" : 70,
		"field" : "SIZE"
	}

	];

	function onSelect(index, row) {
		eps.pmnselectrow = row;
		var row = $('#dg').datagrid('getSelected');
		var rowIndex = $('#dg').datagrid('getRowIndex', row);//获取行号

		var t = $('#dg').datagrid('getEditingRowIndexs'); //获取当前datagrid中在编辑状态的行编号列表

		rowIndex = t[0];
		$('#dg').datagrid('unselectAll');
		$('#dg').datagrid('selectRow', rowIndex);

		var thisTarget = $('#dg').datagrid('getEditor', {
			'index' : rowIndex,
			'field' : 'WXB01'
		}).target;
		var value = thisTarget.combobox('getValue');

		var target = $('#dg').datagrid('getEditor', {
			'index' : rowIndex,
			'field' : 'WXB02'
		}).target;
		target.combobox('clear'); //清除原来的数据
		var url = 'getpmn02?PMN01=' + value;
		target.combobox('reload', url);//联动下拉列表重载

		//alert(value);

	};

	function onHidePanel() {
		//	console.info(eps.pmnselectrow);
	};
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

			},
			rownumbers : true,
			singleSelect : false,
			pagination : true,
			toolbar : '#tb',
			method : 'post',
			onDblClickCell : onClickCell,
			onEndEdit : onEndEdit,
			pageSize : 20,
			pageList : [ 20, 50, 100, 150, 200 ]
		});

	});

	wddd_gys_z.doSearch = function() {

		var opts = $("#dg").datagrid("options");
		var ob = {
			PMN01 : $.trim($('#WXB01').val()), //  采购单号 
			//WXB03 : $.trim($('#WXB03').val()), //  送货单号 
			WXB04 : $.trim($('#WXB04').val()), //  箱号 
			ISSH : $.trim($('#ISSH').val()), //  存在送货
			WXB03 : $.trim($('#WXB03').val()), //  送货单号 
			PMN02 : $('#WXB02').val(),

			WXB11 : $('#WXB11').val(),
			PMMUD02 : eps.PMMUD02_t,
			ROLE : eps.ROLE

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
						<td><span>录入日期</span></td>
						<td><input id="WXB11" name="WXB11" style="width: 90px"  class="easyui-datebox" /></td>

						<!-- <td><span>送货单号</span></td>
						<td><input id="WXB03" name="WXB03" class="easyui-textbox" /></td>
						 -->
						<td><span>箱号</span></td>
						<td><input id="WXB04" name="WXB04" class="easyui-textbox" /></td>
						<td><span>送货单号</span></td>
						<td><input id="WXB03" name="WXB03" class="easyui-textbox" /></td>
						<td><span>是否送货</span></td>
						<td><select id="ISSH" name="ISSH" class="easyui-combobox"
							editable="false" style="width: 60px" panelHeight="auto">
								<option value="ALL"></option>

								<option value="N" selected="selected">否(N)</option>
								<option value="Y">是(Y)</option>
						</select></td>


						<td><span>订单单号</span></td>
						<td><input id="WXB01" name="WXB01" class="easyui-textbox" /></td>
						<td><span>项次</span></td>


						<td><input id="WXB02" name="WXB01" style="width: 40px" class="easyui-textbox" /></td>

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
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-remove',plain:true"
				onclick="deleterow()">删除</a> <a href="javascript:void(0)"
				class="easyui-linkbutton"
				data-options="iconCls:'icon-save',plain:true" onclick="accept()">保存</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-undo',plain:true" onclick="reject()">取消</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-print',plain:true" onclick="printwxb()">打印外箱标</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-print',plain:true" onclick="printwxb2()">打印外箱标(分SIZE)</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-filter',plain:true"
				onclick="createshd()">生成送货单</a><a href="javascript:void(0)"
				class="easyui-linkbutton"
				data-options="iconCls:'icon-man',plain:true" onclick="imp()">xls导入</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-lock',plain:true" onclick="getmb()">下载xls导入模板</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-lock',plain:true" onclick="getexe()">下载打印插件</a>

		</div>
	</div>
	<!-- 送货单Form弹窗-->
	<div id="wddd_gys_m_dialog_shd" class="easyui-dialog" title="送货单生成"
		data-options="modal:true,closed:true,iconCls:'icon-edit' ,fitColumns:true, footer:'#dlgft',
		buttons: '#wddd_gys_m_dialogbb',	 resizable : true  
		">
		<div class="easyui-panel"
			style="width: 100%; max-width: 400px; padding: 30px 60px;">
			<form id="ff" method="post">
				<div style="margin-bottom: 20px">
					<input id="SHD02" name="SHD02" type="text" style="width: 100%"
						class="easyui-datebox" data-options="label:'送货日期:',required:true">

				</div>
				<div style="margin-bottom: 20px">
					<input class="easyui-textbox" id="SHD03" name="SHD03"
						style="width: 100%" data-options="label:'开单人',required:true">
				</div>

				<div style="margin-bottom: 20px">
					<input class="easyui-textbox" id="SHD04" name="SHD04"
						style="width: 100%" data-options="label:'送货人',required:true">
				</div>

				<div style="margin-bottom: 20px">
					<input class="easyui-textbox" id="SHD08" name="SHD08"
						style="width: 100%" data-options="label:'备注',required:false">
				</div>
			</form>
			<div style="text-align: center; padding: 5px 0">
				<a href="javascript:void(0)" class="easyui-linkbutton"
					onclick="submitForm()" style="width: 80px">保存</a> <a
					href="javascript:void(0)" class="easyui-linkbutton"
					onclick="clearForm()" style="width: 80px">清除</a>
			</div>
		</div>
	</div>
	<!-- SIZE-->
	<div id="wddd_gys_m_dialog_size" class="easyui-dialog" title="SIZE"
		data-options="modal:true,closed:true,iconCls:'icon-edit' ,fitColumns:true, footer:'#dlgft',
		buttons: '#wddd_gys_m_dialogbb',	 resizable : true  
		"
		style="width: 80%; height: 60%;">

		<div id="wddd_gys_m_size" style="width: 100%; height: 100%;">
			<table id="dialog_m_dataGrid_size" class="easyui-datagrid"
				style="width: 100%; height: 100%" title="编辑" iconCls="icon-edit"
				pageSize=50 rownumbers="true" pagination="true">
			</table>
		</div>
	</div>



	<div id="dlgft" style="padding: 2px 5px;">
		<div class="easyui-linkbutton" iconCls="icon-add" plain="true"
			id='append'">新增</div>
		<div id='del' class="easyui-linkbutton" iconCls="icon-delete"
			plain="true">删除</div>
		<div class="easyui-linkbutton" iconCls="icon-save" plain="true"
			id='accept'>保存</div>
		<div class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			id='removeit'">取消</div>

	</div>

	<div id="wddd_gys_m_dialog_imp" class="easyui-dialog" title="xls导入"
		data-options="modal:true,closed:true,iconCls:'icon-man'  ,
		buttons: '#wddd_gys_m_dialogbb',	 resizable : true  
		">
		<div class="easyui-panel"
			style="width: 100%; max-width: 400px; padding: 30px 60px;">

			<form action="file/upload.htm" enctype="multipart/form-data"
				id="uploadf" method="post">
				<div style="margin-bottom: 20px">

					<input type="file" name="file"></input> <input type="submit"
						hidden="true" id="submitupload" value="上传Excel"></input>
				</div>
			</form>
			<div style="text-align: center; padding: 5px 0">
				<a href="javascript:void(0)" class="easyui-linkbutton"
					onclick="submitForm2()" style="width: 80px">上传</a> <a
					href="javascript:void(0)" class="easyui-linkbutton"
					onclick="closedialog()" style="width: 80px">取消</a>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		var editIndex = undefined;
		var singleflag = {
			"flag" : false
		};
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

		function getmb() {
			location.href = "外箱导入模板2.xls";
		};

		function getexe() {
			location.href = "lodop.exe";
		};

		function onClickCell(index, field) {
			selectedrow = $('#dg').datagrid('getData').rows[index];

			eps.openwdwddd_gys_dialog_size(index, field, selectedrow);
			eps.PMN01 = selectedrow.WXB01;
			eps.PMN02 = selectedrow.WXB02;

			//console.info(selectedrow);

			if (selectedrow.WXB03 != undefined) {
				$.messager.show({
					title : '提示',
					msg : '已送货单据不可编辑',
					timeout : 2000

				});

				return;
			} else {

			}

			if (editIndex != index) {
				if (endEditing()) {
					$('#dg').datagrid('unselectAll');
					$('#dg').datagrid('selectRow', editIndex);

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
				field : 'PMN01'
			});

			//row.productname = $(ed.target).combobox('getText');
		}
		function append() {
			if (endEditing()) {
				$('#dg').datagrid('appendRow', {

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

		function deleterow() {

			var row = {};

			$.messager.confirm('确认', '您确认想要删除记录吗？', function(r) {
				if (r) {

					if ($('#dg').datagrid('getSelections').length) {
						/* 新增 */
						row = $('#dg').datagrid('getSelections');
						deletedata("delete", row);
					}

				}
			});

		}

		function imp() {

			$("#uploadf").form('clear');
			$('#wddd_gys_m_dialog_imp').window('open'); // close a window  

		};

		function deletedata(op, ob) {
			var row = {};
			accepturl = "/eps/wxb/deletewxb";
			$.each(ob, function(i, n) {

				row.WXB05 = n.WXB05;
				//----------------------------提交新增/更新
				if (op == "delete") {
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

							} else {
								$.messager.show({
									title : '提示',
									msg : data.msg
								});
							}
							$('#dg').datagrid('reload');
						},
						error : function(data) {

							$.messager.confirm('确认', '登录状态超时，确认重新登录？', function(r) {
								parent.parent.location.reload();
							});
							;
							;
						}
					});
				}
				//----------------------------

			});

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

		function accept() {
			if (endEditing()) {
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

				}

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

		function createshd() {

			sw = $('#dg').datagrid('getSelections');

			if (sw == null) {
				//$.messager.alert('警告','请选择行'); 
				$.messager.show({
					title : '提示',
					msg : '请选择行！',
					timeout : 500,
					showType : 'show',
					style : {
						right : '',
						top : document.body.scrollTop + document.documentElement.scrollTop,
						bottom : ''
					}

				});
				return;
			}
			if (sw.length == 0) {
				//		$.messager.alert('警告','请选择行'); 
				$.messager.show({
					title : '提示',
					msg : '请选择行！',
					timeout : 500,
					showType : 'show',
					style : {
						right : '',
						top : document.body.scrollTop + document.documentElement.scrollTop,
						bottom : ''
					}

				});
				return;
			}

			$('#ff').form('clear');

			$('#SHD02').datebox('setValue', timetrans());

			if (singleflag.flag == false) {
				$('#wddd_gys_m_dialog_shd').dialog('open');
			}

			if (singleflag.flag == true) {

				$('#dg').datagrid({
					singleSelect : false
				});
			}
			singleflag.flag = false;

		}
		function printwxb() {

			sw = $('#dg').datagrid('getSelections');

			if (sw == null) {

				$.messager.show({
					title : '提示',
					msg : '请选择行！',
					timeout : 500,
					showType : 'show',
					style : {
						right : '',
						top : document.body.scrollTop + document.documentElement.scrollTop,
						bottom : ''
					}
				});

				return;
			}
			if (sw.length == 0) {

				$.messager.show({
					title : '提示',
					msg : '请选择行！',
					timeout : 500,
					showType : 'show',
					style : {
						right : '',
						top : document.body.scrollTop + document.documentElement.scrollTop,
						bottom : ''
					}

				});
				return;
			}

			wxbob = $('#dg').datagrid('getSelections');

			var wxb05s = new Array(0);

			if (wxbob != null) {
				$.each(wxbob, function(i, n) {

					if (n.WXB05 != undefined) {
						wxb05s.push(n.WXB05);
					}

				});
			}

			$.ajax({
				url : "wxb/printwxbs",
				type : 'POST',
				data : {
					"wxbls" : wxb05s
				},
				async : false, //注意：此处是同步，不是异步\

				success : function(data, status) {

					OpenWindow = null;
					OpenWindow = window.open();
					OpenWindow.document.write(data);

				}
			});

			/* 	users = null;
				users = $('#dg').datagrid('getSelected');
				if (users != null) {
					$.({
						type : "GET",
						url : "wxb/printwxb?WXB05=" + users.WXB05,
						success : function(msg) {
							// alert( "Data Saved: " + msg );
							//   location.href='wxb?WXB05='+users.WXB05;
							window.open('wxb/printwxb?WXB05=' + users.WXB05);

						}

					});

				} */

		};

		/*分SIZE打印*/

		function printwxb2() {

			wxbob = $('#dg').datagrid('getSelections');

			if (wxbob == null) {
				//	$.messager.alert('警告','请选择行'); 
				$.messager.show({
					title : '提示',
					msg : '请选择行！',
					timeout : 500,
					showType : 'show',
					style : {
						right : '',
						top : document.body.scrollTop + document.documentElement.scrollTop,
						bottom : ''
					}

				});
				return;
			}
			if (wxbob.length == 0) {
				//$.messager.alert('警告','请选择行'); 
				$.messager.show({
					title : '提示',
					msg : '请选择行！',
					timeout : 500,
					showType : 'show',
					style : {
						right : '',
						top : document.body.scrollTop + document.documentElement.scrollTop,
						bottom : ''
					}

				});
				return;
			}

			var wxb05s = new Array(0);

			if (wxbob != null) {
				$.each(wxbob, function(i, n) {

					if (n.WXB03 == null) {
						if (n.WXB05 != undefined) {
							wxb05s.push(n.WXB05);
						}

					}

				});
			}

			$.ajax({
				url : "wxb/printwxbs2",
				type : 'POST',
				data : {
					"wxbls" : wxb05s
				},
				async : false, //注意：此处是同步，不是异步\

				success : function(data, status) {

					OpenWindow = null;
					OpenWindow = window.open("1", '---');
					OpenWindow.document.write(data);
					OpenWindow.document.close();
				},
				error : function(data) {

					$.messager.confirm('确认', '登录状态超时，确认重新登录？', function(r) {
						parent.parent.location.reload();
					});
					;
					;
				}
			});

			/* 	users = null;
				users = $('#dg').datagrid('getSelected');
				if (users != null) {
					$.ajax({
						type : "GET",
						url : "wxb/printwxb?WXB05=" + users.WXB05,
						success : function(msg) {
							// alert( "Data Saved: " + msg );
							//   location.href='wxb?WXB05='+users.WXB05;
							window.open('wxb/printwxb?WXB05=' + users.WXB05);
							
							
						}

					});

				} */

		};

		function closedialog() {
			$('#wddd_gys_m_dialog_imp').window('close'); // close a window  

		}

		function submitForm2() {
			var formData = new FormData(document.getElementById("uploadf"));

			$.ajax({
				url : "wxb/upload",
				type : "POST",
				data : formData,
				dataType : "json",
				contentType : false,
				processData : false,
				success : function(data) {
					if (data.code == "100") {
						$.messager.show({
							title : '提示',
							msg : data.msg
						});

						row = {};

					} else {
						$.messager.show({
							title : '提示',
							msg : data.msg
						});
					}

					$('#wddd_gys_m_dialog_imp').window('close'); // close a window  
					$('#dg').datagrid('reload');

				},
				error : function() {
					$.messager.show({
						title : '提示',
						msg : "上传失败!"
					});
				}
			});

		}
		function submitForm() {
			var wxbob = {};
			var shd = {};
			shd.SHD02 = $("#SHD02").val();
			shd.SHD03 = $("#SHD03").val();
			shd.SHD04 = $("#SHD04").val();
			shd.SHD08 = $("#SHD08").val();

			wxbob = $('#dg').datagrid('getSelections');

			var wxb05s = new Array(0);
			var wxb01s = new Array(0);

			if (wxbob != null) {
				$.each(wxbob, function(i, n) {

					if (n.WXB03 == null) {
						if (n.WXB05 != undefined) {
							wxb05s.push(n.WXB05);
							wxb01s.push(n.WXB01);
						}

					}

				});
			}
			if (wxb05s.length == 0) {
				$.messager.show({
					title : '提示',
					msg : '选择的记录已存在送货单'
				});
				$('#wddd_gys_m_dialog_shd').dialog('close');

				return;
			}
			//	console.info("----wxb05s-------");
			//	console.info(wxb05s);
			$.ajax({
				url : "wxb/addshd",
				dataType : "json",
				type : 'POST',
				data : {
					"wxbls" : wxb05s,
					"wxb01s" : wxb01s,
					"SHD02" : shd.SHD02,
					"SHD03" : shd.SHD03,
					"SHD04" : shd.SHD04,
					"SHD08" : shd.SHD08,
					"PMMUD02" : eps.PMMUD02_t
				},
				success : function(data) {
					if (data.code == "100") {
						$.messager.show({
							title : '提示',
							msg : data.msg,
							timeout : 15000,
							width : '250px',
							height : '150px'

						});

					} else {
						$.messager.show({
							title : '提示',
							msg : data.msg,
							width : '250px',
							height : '150px'
						});
					}
					$('#wddd_gys_m_dialog_shd').dialog('close');
					$('#dg').datagrid('reload');
				},
				error : function(data) {

					$.messager.confirm('确认', '登录状态超时，确认重新登录？', function(r) {
						parent.parent.location.reload();
					});
					;
					;
				}

			});

		};

		function clearForm() {
			$('#ff').form('clear');
		};

		function acceptdata(op, ob) {
			var row = {};

			var accepturl = '';
			if (op == 'insert') {
				accepturl = "/eps/wxb/addwxb";

			} else if (op == 'update') {

				accepturl = "/eps/wxb/updatewxb";
			}

			$.each(ob, function(i, n) {

				if (n.WXB01 != undefined) {

					row.PMMUD02 = eps.PMMUD02_t;
					row.WXB01 = $.trim(n.WXB01);
					row.WXB02 = n.WXB02;
					row.WXB03 = $.trim(n.WXB03);
					row.WXB04 = $.trim(n.WXB04);
					row.WXB05 = n.WXB05;
					row.WXB06 = $.trim(n.WXB06);
					row.WXB07 = $.trim(n.WXB07);
					row.WXB08 = n.WXB08;
					row.WXB09 = n.WXB09;
					row.WXB10 = n.WXB10;
					row.op = op;

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

							} else if (data.code == "200") {
								$.messager.show({
									title : '提示',
									msg : data.msg
								});
							} else {
								$.messager.show({
									title : '提示',
									msg : "异常"
								});
							}

						},
						error : function(data) {

							$.messager.confirm('确认', '登录状态超时，确认重新登录？', function(r) {

								parent.parent.location.reload();

							});

						}
					});
					//----------------------------

				}

			});
			$('#dg').datagrid('reload');
		}
	</script>
</body>

</html>