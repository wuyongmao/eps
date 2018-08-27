<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<script type="text/javascript" src="inc/js/eps.js"></script>
<script type="text/javascript" src="inc/initcolumn/report_cgjdb_y.js"></script>

<link rel="stylesheet" type="text/css" href="inc/css/baseCss.css"></link>



<title>采购进度表(研发)</title>

<script type="text/javascript">
	var report_cgjdb_y = $.extend({}, report_cgjdb_y);/* 全局对象 */
	var selectedrow;
	var type="ry";
	var editIndex = undefined;
	$(function() {
		var column_report_cgjdb_y_PMM_PMN = []; //采购主明细档

		column_report_cgjdb_y_PMM_PMN = initcolumn();
		var datagrid; //定义全局变量  
	//	var editRow = "";//定义当前编辑的行  
		datagrid = $("#dataGrid").datagrid(
				{
					//	title : "我的订单(供应商)",
					border : false,
					//fit : true,
					rownumbers : true,
					multiSort :true,

					locale : "zh_CN",
					//	iconCls : 'icon-sum',
					striped : true,
					sortOrder : "desc",
					collapsible : false,
					// url: "${pageContext.request.contextPath }/cgmxjson",  
					//   queryParams: { deptName:"", deptId: ""},
					// fitColumns:true,
					columns : [ column_report_cgjdb_y_PMM_PMN ],
					toolbar : "#toolstb",
					pagination : true,//表示在datagrid设置分页              
					rownumbers : true,
					singleSelect : true,
				});
		$('#dataGrid').datagrid('getPager').pagination({
			pageSize : 10,
			pageNumber : 1,
			pageList : [ 10, 50, 100, 200, 500 ],
			buttons : [ {
				iconCls : 'icon-save',
				handler : function() {
					eps.download(type);
				}
			} ],
			beforePageText : '第',//页数文本框前显示的汉字   
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
		});

	});
	report_cgjdb_y.doSearch = function() {
		var opts = $("#dataGrid").datagrid("options");
		var ob = {
			PMM01 : $('#PMM01').val(), //  采购单号
			PMM04 : $('#PMM04').val(), //采购日期
			PMMUD02 : $('#PMMUD02').val(), //采购厂商
			PMN041 : $('#PMN041').val(), //材料名称
			PMN04 : $('#PMN04').val(), //料件编号
			PMNUD05 : $('#PMNUD05').val(), //生产季节
			PMN24 : $('#PMN24').val(), //请购单号
			CJL : $('#CJL').val() ,  // 未交数量
			PMM12: $('#PMM12').val(),    //采购人员代码
			TA_PMM06 : 'RD',
			PMM02  :    '!SUB', 
			 ISAUTOJQ : $('#ISAUTOJQ').val()  //是否自动确认
		};
		opts.url = "${pageContext.request.contextPath }/cgmxjson";// "${pageContext.request.contextPath }/dtfo"; //ds
		$("#dataGrid").datagrid("load", ob);
	};
	report_cgjdb_y.remove = function() {
		$("#searchform").form('clear');
	};
	report_cgjdb_y.add = function() {
		var options = $('#dialog_m_dataGrid').datagrid('getPager').data(
				"pagination").options;
		var totalRowNum = options.total;
		 
		var aa = $('#dialog_m_dataGrid').datagrid('getSelected');
		//console.info(aa);
		if (editIndex) {
		}
		$('#dialog_m_dataGrid').datagrid('appendRow', {
		});

	} 
</script>
<style type="text/css">
input {
	width: 90px;
}
</style>
</head>



<body>


	<!-- 查询栏位 -->
	<div id="toolstb" style="padding: 5px">
		<form id="searchform"
			action="${pageContext.request.contextPath }/cgmxjson" method="post">
			<table class="tableForm">
				<tr>
					<td><span>采购日期</span></td>
					<td><input id="PMM04" name="PMM04" class="easyui-datebox"
						editable="false" /></td>
					<td><span>采购厂商</span></td>
					<td><input id="PMMUD02" name="PMMUD02" class="easyui-textbox" /></td>
					<td><span>品名</span></td>
					<td><input id="PMN041" name="PMN041" class="easyui-textbox" /></td>
					<td><span>料件编号</span></td>
					<td><input id="PMN04" name="PMN04" class="easyui-textbox" /></td>
					<td><span>采购单号</span></td>
					<td><input id="PMM01" name="PMM01" class="easyui-textbox" /></td>
					<td><span>采购人员代码</span></td>
					<td><input id="PMM12" name="PMM12" class="easyui-textbox" /></td>
	                <td><span>是否自动确认交期</span></td>

					<td><select id="ISAUTOJQ" name="ISAUTOJQ"
						class="easyui-combobox" editable="false" style="width: 100px"
						panelHeight="auto">
							<option value=""></option>

							<option value="N">否(N)</option>
							<option value="Y">是(Y)</option>
					</select></td>
					<td></td>
					<td><div class="easyui-linkbutton" iconCls="icon-search"
							plain="true" onclick="report_cgjdb_y.doSearch()">查询</div></td>
					<td><div class="easyui-linkbutton" iconCls="icon-clear"
							onclick=" report_cgjdb_y.remove()">清空</div></td>
				</tr>

			</table>
		</form>
	</div>





	<div id="report_cgjdb_y" style="height: 100%; width: 100%">
		<table id="dataGrid" class="easyui-datagrid"
			style="width: 100%; height: 570px" rownumbers="true"
			pagination="true">
			</thead>
		</table>
	</div>


</body>
</html>