<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<script type="text/javascript" src="inc/js/eps.js"></script>
<script type="text/javascript" src="inc/js/ext.js"></script>

<link rel="stylesheet" type="text/css" href="inc/css/baseCss.css"></link>
<script type="text/javascript">
	var xtsd_bglymwh = $.extend({}, xtsd_bglymwh);/* 全局对象 */
	var suburl;
	var selectedrow;
	$(function() {

		var datagrid; //定义全局变量  
		//var editRow = ""; 定义当前编辑的行  
		datagrid = $("#reasondatagrid").datagrid({
			border : false,
			rownumbers : true,
			locale : "zh_CN",
			striped : true,
			sortOrder : "desc",
			footer : "#ft",
			collapsible : false,
			columns : [ [ {
				field : 'chgid',
				title : '流水号',
				width : 80,
				hidden : true
			}, {
				field : 'gs',
				title : '归属',
				width : 80,
				sortable : true
			}, {
				field : 'reason',
				title : '变更理由码',
				width : 140,
				sortable : true
			}, {
				field : 'reasondesc',
				title : '变更理由描述',
				width : 180
			}, {
				field : 'status',
				title : '有效标识(Y-有效)',
				width : 120
			} ] ],

			//url: "data.json",  
			//   queryParams: { deptName:"", deptId: ""},
			fitColumns : true,
			toolbar : "#tb",
			onDblClickCell : function(index, field, value) { //双击单元格事件
				//console.info('{index:' + index + '}{field:' + field + '}{value:' + value + '}');
			},
			onDblClickRow : function(index, row) {
				//console.info(row);

			},
			onSelect : function(index, row) {
				selectedrow = index;

				////console.info(selectedrow);
			},
			onLoadSuccess : function(data) {
				if (selectedrow != -1) {
					$('#reasondatagrid').datagrid('selectRow', selectedrow);
				} //有选中行时加载数据后设置选中行  
			},
			pagination : true,//表示在datagrid设置分页              
			rownumbers : true,
			singleSelect : true,
		});

		$('#reasondatagrid').datagrid('getPager').pagination({
			pageSize : 15,
			pageNumber : 1,
			pageList : [ 15, 30, 60, 120, 240 ],
			/* buttons : [ {
				iconCls : 'icon-save',
				handler : function() {
					eps.download();
				}
			} ], */
			beforePageText : '第',//页数文本框前显示的汉字   
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
		});

	});

	xtsd_bglymwh.add = function() {
		$('#dlg').dialog('open').dialog('setTitle', '新增');
		$('#dlgfm').form('clear');
		suburl = "${pageContext.request.contextPath }/chgreason/insertchg";
	};

	xtsd_bglymwh.clear = function() {
		$("#reasonform").form('clear');
	};

	xtsd_bglymwh.edit = function() {
		var row = $('#reasondatagrid').datagrid('getSelected');

		if (row) {

			$('#dlg').dialog('open').dialog('setTitle', '信息修改');

			var obj = {};
			obj.row = row;
			$("#dlgfm").form('clear');

			//console.info(obj.row);
			$('#dlgfm').form('load', row);

			suburl = '${pageContext.request.contextPath }/chgreason/eidtchg';
		}
	};

	xtsd_bglymwh.doSearch = function() {

		var opts = $("#reasondatagrid").datagrid("options");
		var ob = {
			gs : $('#reasonform #gs').val(),
			chgid : $('#reasonform #chgid').val(),
			reason : $('#reasonform #reason').val(),
			reasondesc : $('#reasonform #reasondesc').val()

		};
		//console.info(ob);
		opts.url = "${pageContext.request.contextPath }/chgreason/getchg"; //ds
		$("#reasondatagrid").datagrid("load", ob

		);

	};

	xtsd_bglymwh.save = function() {
		$.messager.progress(); // 显示进度条

		var isValid = $('#dlgfm').form('validate');
		if (!isValid) {

			$.messager.progress('close'); // 如果表单是无效的则隐藏进度条
			$.messager.alert('提示', '请核实输入数据', 'info');
			return isValid;
		}

		$.ajax({
			type : "POST",
			timeout : 10000, //超时时间设置，单位毫秒       1000ms=1s
			dataType : 'json', //返回的数据格式
			data : $('#dlgfm').serialize(),
			url : suburl,
			complete : function(XMLHttpRequest, status) {
				if (status == 'timeout' || status == 'error' || status == 'parsererror') //超时,status还有success,error等值的情况
				{
					$.messager.progress('close');

					if (status == 'parsererror' || status == 'error') {
						$.messager.alert('警告', '请求错误', 'error');
					} else {
						$.messager.alert('警告', '请求超时', 'error');
					}

					$('#dlg').dialog('close');
				}
			},
			success : function(msg) {
				//console.info("=================>msg");
				//console.info(msg);
				$.messager.progress('close'); // 如果提交成功则隐藏进度条
				$('#dlg').dialog('close');
				$('#reasondatagrid').datagrid('reload');
				$.messager.alert('提示', msg.msg, 'warning');

				$('#reasondatagrid').datagrid('selectRow', selectedrow);

				suburl = "";

				//console.info(msg);
			}
		});

	};
</script>
<title>变更理由码维护</title>
</head>
<body>

	<div id="xtsd_bglymwh" style="height: 100%; width: 100%">
		<table style="width: 100%; height: 570px" id="reasondatagrid">

		</table>
	</div>



	<div id="tb" style="padding: 2px 5px;">
		<form action="" id="reasonform" method="get">
			变更理由码 : <input id="reason" name="reason" class="easyui-textbox"
				style="width: 110px"> 变更理由描述: <input id="reasondesc"
				name="reasondesc" class="easyui-textbox" style="width: 110px">
			归属: <select id="gs" name="gs" class="easyui-combobox"
				panelHeight="auto" style="width: 100px">
				<option value=""></option>
				<option value="研发">研发</option>
				<option value="量产">量产</option>
			</select>
			<div class="easyui-linkbutton" iconCls="icon-search"
				onclick="xtsd_bglymwh.doSearch()">查询</div>
			<div class="easyui-linkbutton" iconCls="icon-clear"
				onclick="xtsd_bglymwh.clear()">清空</div>
		</form>
	</div>
	<div id="ft" style="padding: 2px 5px;">
		<div class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="xtsd_bglymwh.add()"></div>
		<div class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="xtsd_bglymwh.edit()"></div>
		<div class="easyui-linkbutton" iconCls="icon-save" plain="true"
			onclick="xtsd_bglymwh.save()"></div>
	</div>
	<div id="dlg" class="easyui-dialog" title="变更理由码维护"
		style="width: 400px; height: 280px; padding: 10px 20px; background: #d1eeee"
		closed="true" buttons="#dlg-buttons">
		<form id="dlgfm" method="post">
			<table style="width: 100%; height: 100%;">
				<tr>
					<td><input class="easyui-validatebox" type="hidden"
						name="chgid" id="chgid" /></td>
				</tr>

				<tr>
					<td align="right"><label for="gs">归属:</label></td>
					<td><input class="easyui-validatebox" type="text" name="gs"
						id="gs" data-options="required:true" /></td>
				</tr>
				<tr>
					<td align="right"><label for="reason">变更理由码:</label></td>
					<td><input class="easyui-validatebox" type="text"
						name="reason" id="reason" data-options="required:true" /></td>
				</tr>
				<tr>
					<td align="right"><label for="reasondesc">变更理由描述:</label></td>
					<td><input class="easyui-validatebox" type="text"
						name="reasondesc" id="reasondesc" data-options="required:true" /></td>
				</tr>
				<tr>
					<td align="right"><label for="reasondesc">有效标识:</label></td>
					<td><select id="status" name="status" class="easyui-combobox"
						panelHeight="auto" style="width: 100px">
							<option value="Y">有效(Y)</option>
							<option value="N">无效(N)</option>
					</select></td>
				</tr>
			</table>
		</form>
	</div>
	<div id="dlg-buttons">
		<div class="easyui-linkbutton" iconCls="icon-ok"
			onclick="xtsd_bglymwh.save()">保存</div>
		<div class="easyui-linkbutton" iconCls="icon-cancel"
			onclick="javascript:$('#dlg').dialog('close')">取消</div>
	</div>

</body>
</html>