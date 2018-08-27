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
<link rel="shortcut icon" href="./inc/img/tlog.png" type="image/x-icon" />

<title>外箱标(TMP)</title>

<script type="text/javascript">
	var wddd_gys_z = $.extend({}, wddd_gys_z);/* 全局对象 */
	var selectedrow;
	var type = "rl";

	eps.ACC = "${sessionScope.username.ACC}";
	eps.ROLE = "${sessionScope.username.ROLE}";
	eps.ACCID = "${sessionScope.username.ACCID}";
	eps.NAME = "${sessionScope.username.NAME}";
	eps.PMMUD02_t = '${sessionScope.username.PMMUD02}';

	column_wxb = [

	{
		field : 'ck',
		checkbox : true
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "订单号",
		"width" : 150,
		"hidden" : true,
		"field" : "WXB01"
	}, {
		"align" : "right",
		"hidden" : false,
		"title" : "项次",
		"hidden" : true,
		"width" : 70,
		"field" : "WXB02"

	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "箱号",
		"width" : 160,
		"field" : "WXB05T"
	}, {
		"align" : "left",
		"hidden" : true,
		"title" : "已确认箱号",
		"width" : 160,
		"field" : "WXB05"
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "料号",
		"width" : 110,
		"field" : "WXB15",
		editor : {
			type : 'validatebox',
			msg : '料号不可为空',
			options : {
				valueField : 'WXB15',
				required : true
			}
		}
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "缸号",
		"width" : 170,
		"field" : "WXB04",
		editor : {
			type : 'validatebox',
			options : {
				valueField : 'WXB04',
				required : false
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
				required : false,
				min : 0 
			}
		}
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "录入日期",
		"width" : 80,
		"field" : "WDATE",
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
		"hidden" : true,
		"width" : 70,
		"field" : "WXB12"
	}, {
		"align" : "left",
		"title" : "规格",
		"width" : 110,
		"field" : "IMA021"
	}, {
		"align" : "left",
		"title" : "品名",
		"width" : 110,
		"field" : "PMN041"
	}, {
		"align" : "left",
		"hidden" : false,
		"title" : "单位",
		"width" : 70,
		"field" : "PMN07"
	}, {
		"align" : "left",
		"title" : "分SIZE否",
		"formatter" : eps.formatDilogColumn,
		"width" : 70,
		"field" : "SIZE"
	}, {
		"align" : "left",
		"title" : "已确认否",
		"formatter" : eps.formatDilogColumn,
		"width" : 70,
		"field" : "WTR"
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
			onEndEdit : onEndEdit
			,pageSize : 20,
			pageList : [20, 50, 100, 150, 200] 
		});

	});

	wddd_gys_z.doSearch = function() {

		var opts = $("#dg").datagrid("options");
		var ob = {
			WXB05T : $.trim($('#WXB05T').val()), //  箱号 
			WXB11 : $.trim($('#WXB11').val()), //  箱号 
			WTR : $('#WTR').val(),
			PMMUD02 : eps.PMMUD02_t,
			ROLE : eps.ROLE

		};

		//console .info("1111+-${pageContext.request.contextPath }----${paramValues.PMM01}");
		opts.url = "${pageContext.request.contextPath }/wxbtmp/getwxbtmp"; //ds
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
	 <td><input id="WXB11" name="WXB11" class="easyui-datebox" /></td>
						
						<td><span>箱号</span></td>
						<td><input id="WXB05T" name="WXB05T" class="easyui-textbox" /></td>
						<td><span>是否确认</span></td>

						<td><select id="WTR" name="WTR" class="easyui-combobox"
							editable="false" style="width: 100px" panelHeight="auto">
								<option value="N">否(N)</option>
								<option value="Y">是(Y)</option>
						</select></td>
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
				data-options="iconCls:'icon-lock',plain:true" onclick="getmb()">下载模板</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-man',plain:true" onclick="printwxb2()">xls导入</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-ok',plain:true" onclick="confirmdata()">确认数据</a>

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
					onclick="submitForm()" style="width: 80px">上传</a> <a
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

		function closedialog() {
			$('#wddd_gys_m_dialog_imp').window('close'); // close a window  

		}

		function submitForm() {
			var formData = new FormData(document.getElementById("uploadf"));

			$.ajax({
				url : "wxbtmp/upload",
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

			selectedrow = $('#dg').datagrid('getData').rows[index];
			console.info(selectedrow);
			if (selectedrow.SIZE == 'Y') {
				eps.openwdwddd_gys_dialog_sizetmp(index, field, selectedrow);
			}

			eps.PMN01 = selectedrow.WXB01;
			eps.PMN02 = selectedrow.WXB02;

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

		function confirmdata() {

			var row = {};

			$.messager.confirm('确认', '是否确认数据？', function(r) {
				if (r) {

					if ($('#dg').datagrid('getSelections').length) {
						/* 新增 */
						row = $('#dg').datagrid('getSelections');
						deletedata("confirm", row);
					}

				}
			});
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

		function getmb() {
			location.href = "外箱导入模板.xls";
		};
 

		function printwxb2() {

			$("#uploadf").form('clear');
			$('#wddd_gys_m_dialog_imp').window('open'); // close a window  

		};

		function deletedata(op, ob) {
			var row = {};

			var accepturl = '';
			if (op == "delete") {
				accepturl = "/eps/wxbtmp/deletewxbtmp";

			} else if (op == "confirm") {
				accepturl = "/eps/wxbtmp/confirmwxb";

			}
			var wxb05s = new Array(0);
			var conflag = 'N';
			$.each(ob, function(i, n) {
				row.PMMUD02 = eps.PMMUD02_t;
				row.WXB01 = '-';
				row.WXB02 = 0;
				row.WID = n.WID;
				row.WXB03 = n.WXB03;
				row.WXB04 = n.WXB04;
				row.WXB05T = n.WXB05T;
				row.WXB05 = n.WXB05;
				row.WXB06 = n.WXB06;
				row.WXB07 = n.WXB07;
				row.WXB08 = n.WXB08;
				
				
				row.WXB09 = n.WXB09;
				row.WXB10 = n.WXB10;
				row.WXB15 = n.WXB15;
				row.op = op;
				row.ROLE = eps.ROLE;
				row.flag = 'imp';
				if (n.WXB05T) {

					wxb05s.push(n.WXB05T);

				}
				if (n.WTR == 'Y') {
					conflag = 'Y';
				}
				
				if (conflag == 'Y' && op == "delete") {
					var msg = "已确认数据不可删除";
					$.messager.alert('提示', msg);
					return;
				}
			
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
						}
					});
				}  
				//----------------------------

			});
			if (op == "confirm") {

				if (conflag == 'Y') {
					var msg = "数据不可重复确认";
					$.messager.alert('提示', msg);
					return;
				}
				$.ajax({
					url : "wxbtmp/confirmwxb",
					type : 'POST',
					data : {
						"wxbls" : wxb05s
					},
					async : false, //注意：此处是同步，不是异步\
					dataType : "json",
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

					}
				});

			}

		}
		function acceptdata(op, ob) {
			var row = {};

			var accepturl = '';
			if (op == 'insert') {
				accepturl = "/eps/wxbtmp/addwxbtmp";

			} else if (op == 'update') {

				accepturl = "/eps/wxbtmp/updatewxbtmp";
			}

			$.each(ob, function(i, n) {
				row.PMMUD02 = eps.PMMUD02_t;
				row.WXB01 = '-';
				row.WXB02 = 0;
				row.WID = n.WID;
				row.WXB03 = n.WXB03;
				row.WXB04 = n.WXB04;
				row.WXB05T = n.WXB05T;
				row.WXB05 = n.WXB05;
				row.WXB06 = n.WXB06;
				row.WXB07 = n.WXB07;
				row.WXB08 = n.WXB08;
				row.WXB09 = n.WXB09;
				row.WXB10 = n.WXB10;
				row.WXB15 = n.WXB15;
				row.op = op;
				row.ROLE = eps.ROLE;
				row.flag = 'imp';
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

						} else {
							$.messager.show({
								title : '提示',
								msg : data.msg
							});
						}
						$('#dg').datagrid('reload');
					}
				});
				//----------------------------

			});

		}
	</script>
</body>

</html>