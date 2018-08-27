<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<script type="text/javascript" src="inc/js/eps.js"></script>
<script type="text/javascript" src="inc/initcolumn/InspectRegulation.js"></script>

<link rel="stylesheet" type="text/css" href="inc/css/baseCss.css"></link>
<title>来料检验</title>
<script type="text/javascript">
	var InspectRegulation = $.extend({}, InspectRegulation);/* 全局对象 */
	var selectedrow;
	var editIndex = undefined;
	var type="ir";
	$(function() {
		var column_InspectRegulation = []; //采购主明细档

		column_InspectRegulation = initcolumn();
		var datagrid; //定义全局变量  
		var editRow = "";//定义当前编辑的行  
		datagrid = $("#dataGrid").datagrid({
					border : false,
					rownumbers : true,
					multiSort :true,
					locale : "zh_CN",
					striped : true,
					sortOrder : "desc",
					collapsible : false,
					columns : [ column_InspectRegulation ],
					toolbar : "#toolstb",
					pagination : true,//表示在datagrid设置分页              
					rownumbers : true,
					//singleSelect : true,
				});
		  $('#dataGrid').datagrid('getPager').pagination({
			pageSize : 20,
			pageNumber : 1,
			pageList : [ 20, 50, 100, 200, 500 ],
			buttons : [ {
				iconCls : 'icon-save',
				handler : function() {
					//eps.download(type );
				}
			} ],
			beforePageText : '第',//页数文本框前显示的汉字   
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
		}); 
		  
		 $('#update').on('click',function(){
			 var row = $("#dataGrid").datagrid("getSelected");
			 if(!row)
				 $.messager.alert("信息","请查询并选择一条记录","info");
			 else
			 {
				 $("#EDIT_DELLOTMIN").textbox("setValue",row.DELLOTMIN);
				 $("#EDIT_DELLOTMAX").textbox("setValue",row.DELLOTMAX);
				 $("#EDIT_SAMPLES").textbox("setValue",row.SAMPLES);
				 $("#EDIT_AC").textbox("setValue",row.AC);
				 $("#EDIT_RE").textbox("setValue",row.RE);
				 
				 $('#wdcgd_lc_m_dialog').dialog('open');
			 }
		});
		 
		$('#addregbutton').on('click',function(){
			$('#addregdiv').dialog('open');
		});		 
		$("#edit_save_btn").click(function(){
			 var row = $("#dataGrid").datagrid("getSelected");
			var json = {};
			json.REGULATIONID = row.REGULATIONID;
			json.DELLOTMIN = $("#EDIT_DELLOTMIN").textbox("getValue");
			json.DELLOTMAX = $("#EDIT_DELLOTMAX").textbox("getValue");
			json.SAMPLES = $("#EDIT_SAMPLES").textbox("getValue");
			json.AC = $("#EDIT_AC").textbox("getValue");
			json.RE = $("#EDIT_RE").textbox("getValue");
			$.ajax({
				async : false,
				cache : false,
				url : "inspection/update",
				data : json,
				dataType: "JSON",
				success: function(data){
					if(data.extend.msg == "SomeInputIsNull")
						$.messager.alert("信息","规则不能有空","info");
					if(data.extend.msg == "SomeInputIsNotNumber")
						$.messager.alert("信息","输入必须为正整数","info");
					if(data.extend.msg == "DELLOTMAXLessThanDELLOTMIN")
						$.messager.alert("信息","来料上限小于来料下限","info");
					if(data.extend.msg == "ACorRELargerThanSAMPLES")
						$.messager.alert("信息","接受或拒绝箱数不能大于抽样箱数","info");
					if(data.extend.msg == "ACLargerOrEqualThanRE")
						$.messager.alert("信息","拒绝箱数必须大于接受箱数","info");
					if(data.extend.msg == "SAMPLESLargerThanDELLOTMAX")
						$.messager.alert("信息","样品数量不能大于来料上限","info");
					if(data.extend.msg == "MaxOrMinInExistedRange")
						$.messager.confirm('Confirm','除本条记录外数据库中已存在记录为'
								+data.extend.min+"~"+data.extend.max+"的数据，是否修改",
								function(r){
								    if(r)
									{
								    	json.CONFIRM = "true";
								    	$.ajax({
											async: false,
											cache: false,
											url: "inspection/update",
											data: json,
											dataType: "JSON",
											success: function(data){
												if(data.extend.msg == "updatesuccess")
												{
													$.messager.alert("信息","规则修改成功","info");
													InspectRegulation.doSearch();
												}
												else
													$.messager.alert("信息","规则有误","info");
											},
								    		error: function(data){
								    			
								    		}
										});
									}
								    
								});
					if(data.extend.msg == "updatesuccess")
					{
						$.messager.alert("信息","规则修改成功","info");
						$('#wdcgd_lc_m_dialog').dialog('close');
						InspectRegulation.doSearch();
					}
				},
				error: function(data){
					
				}
			});
		});
	}); 
	
	InspectRegulation.doSearch = function() {
		var opts = $("#dataGrid").datagrid("options");
		var ob = {
			INPUTDATE : $('#INPUTDATE').val(), //  建立日期
			DELLOTMIN : $('#DELLOTMIN').val(), //来料下限
			DELLOTMAX : $('#DELLOTMAX').val(), //来料上限
			INPUTTER : $('#INPUTTER').val(), //建立者
			SAMPLES : $('#SAMPLES').val(), //抽样数量
			AC : $('#AC').val(), //接受箱数
			RE : $('#RE').val(), //拒绝箱数
		};
		opts.url = "${pageContext.request.contextPath }/inspectjson";
		$("#dataGrid").datagrid("load", ob);
	};
	InspectRegulation.remove = function() {
		$("#searchform").form('clear');
	};
	
	InspectRegulation.addRegulation = function(){
		var json = {};
		json.DELLOTMIN = $("#add_DELLOTMIN").textbox("getValue");
		json.DELLOTMAX = $("#add_DELLOTMAX").textbox("getValue");
		json.SAMPLES = $("#add_SAMPLES").textbox("getValue");
		json.AC = $("#add_AC").textbox("getValue");
		json.RE = $("#add_RE").textbox("getValue");
		$.ajax({
			async: false,
			cache: false,
			url: "inspection/insert",
			data: json,
			dataType: "JSON",
			success: function(data){
				if(data.extend.msg == "SomeInputIsNull")
					$.messager.alert("信息","规则不能有空","info");
				if(data.extend.msg == "SomeInputIsNotNumber")
					$.messager.alert("信息","输入必须为正整数","info");
				if(data.extend.msg == "DELLOTMAXLessThanDELLOTMIN")
					$.messager.alert("信息","来料上限小于来料下限","info");
				if(data.extend.msg == "ACorRELargerThanSAMPLES")
					$.messager.alert("信息","接受或拒绝箱数不能大于抽样箱数","info");
				if(data.extend.msg == "ACLargerOrEqualThanRE")
					$.messager.alert("信息","拒绝箱数必须大于接受箱数","info");
				if(data.extend.msg == "SAMPLESLargerThanDELLOTMAX")
					$.messager.alert("信息","样品数量不能大于来料上限","info");
				if(data.extend.msg == "MaxOrMinInExistedRange")
					$.messager.confirm('Confirm','数据库中已存在记录为'
							+data.extend.min+"~"+data.extend.max+"的数据，是否添加",
						function(r){
						    if(r)
							{
						    	json.CONFIRM = "true";
						    	$.ajax({
									async: false,
									cache: false,
									url: "inspection/insert",
									data: json,
									dataType: "JSON",
									success: function(data){
										if(data.extend.msg == "insertsuccess")
										{
											$.messager.alert("信息","规则添加成功","info");
											$('#addregdiv').dialog('close');
											InspectRegulation.doSearch();
										}
										else
											$.messager.alert("信息","规则有误","info");
									},
						    		error: function(data){
						    			
						    		}
								});
							}
						    
						});
				if(data.extend.msg == "insertsuccess")
				{
					$.messager.alert("信息","规则添加成功","info");
					$('#addregdiv').dialog('close');
					InspectRegulation.doSearch();
				}
			},
			error: function(data){
				
			}
		});
	};
	function delete1(){
		var selRows = $('#dataGrid').datagrid('getChecked');
		if(selRows.length != 0)
			$.messager.confirm('Confirm',"确认删除所选规则吗？",
					function(r){
					    if(r)
						{
							$.each(selRows,function(i,row){
								var json = {};
								json.id=row.REGULATIONID;
								$.ajax({
									async: false,
									cache: false,
									url: "inspection/delete",
									data: json,
									dataType: "JSON",
									success: function(data){
									},
									error: function(data){
										alert("deleteError");
									}
								});
							});
							$.messager.alert("信息","规则删除成功","info");
							InspectRegulation.doSearch();
						}
					    
			});
		else
			$.messager.alert("信息","请查询并勾选需要删除的规则","info");
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
		<div style="width:100%">
			<form id="searchform"
				action="${pageContext.request.contextPath }/cgmxjson" method="post">
				<table class="tableForm">
					<tr>
							<td><span>来料下限</span></td>
							<td><input id="DELLOTMIN" name="DELLOTMIN" type="number"  
								min="0" step="1" class="easyui-textbox" /></td>
							<td><span>来料上限</span></td>
							<td><input id="DELLOTMAX" name="DELLOTMAX" type="number"  
								min="0" step="1" class="easyui-textbox" /></td>
							<td><span>建立日期</span></td>
							<td><input id="INPUTDATE" name="INPUTDATE" class="easyui-datebox"
								editable="false" /></td>
						<td>
							<div class="easyui-linkbutton" iconCls="icon-search"
								plain="true" onclick="InspectRegulation.doSearch()">查询</div>
						</td>
						<td>
							<div class="easyui-linkbutton" plain="true" id="addregbutton">添加</div>
						</td>
						<td>
							<div class="easyui-linkbutton" plain="true" id="update" onclick="">修改</div>
						</td>
						<td>
							<div class="easyui-linkbutton" plain="true" onclick="delete1()">删除</div>
						</td>
						<td><div class="easyui-linkbutton" iconCls="icon-clear"	
							onclick=" InspectRegulation.remove()">清空</div></td>
	 				</tr>
				</table>
			</form>
		</div>
	</div>	
	<div id="report_cgjdb_l" style="height: 100%; width: 100%">
		<table id="dataGrid" class="easyui-datagrid"
			style="width: 100%; height: 570px" rownumbers="true"
			pagination="true">
		</table>
	</div>
	<div id="wdcgd_lc_m_dialog" class="easyui-dialog" title="记录修改"
		data-options="modal:true,closed:true,iconCls:'icon-edit', resizable:true,
		buttons: '#dlg-buttons'" style="width: 20%; height: 30%;top:10%;left:35%">
		<table class="tableForm">
			<tr>
				<td><span>来料下限</span></td>
				<td><input id="EDIT_DELLOTMIN" type="number"  
					min="0" step="1" class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td><span>来料上限</span></td>
				<td><input id="EDIT_DELLOTMAX" type="number"  
					min="0" step="1" class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td><span>抽样箱数</span></td>
				<td><input id="EDIT_SAMPLES" name="SAMPLES"  type="number"  
					min="0" step="1" class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td><span>接受箱数</span></td>
				<td><input id="EDIT_AC" name="AC" type="number" 
					min="0" step="1" class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td><span>拒绝箱数</span></td>
				<td><input id="EDIT_RE" name="RE" type="number" 
					min="0" step="1" class="easyui-textbox" /></td>					
			</tr>
		</table>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton" 
			data-options="iconCls:'icon-ok'" id="edit_save_btn">保存</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" 
			onclick="javascript:$('#wdcgd_lc_m_dialog').dialog('close')">关闭</a>
	</div>
	<!-- 添加弹窗 -->
	<div id="addregdiv" class="easyui-dialog" title="记录添加"
		data-options="modal:true,closed:true,iconCls:'icon-edit', resizable:true,
		buttons: '#addregbuttons'" style="width: 20%; height: 40%;top:10%;left:35%">
		<table class="tableForm">
			<tr>
				<td><span>来料下限</span></td>
				<td><input id="add_DELLOTMIN" type="number"  
					min="0" step="1" class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td><span>来料上限</span></td>
				<td><input id="add_DELLOTMAX" type="number"  
					min="0" step="1" class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td><span>抽样箱数</span></td>
				<td><input id="add_SAMPLES" name="SAMPLES"  type="number"  
					min="0" step="1" class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td><span>接受箱数</span></td>
				<td><input id="add_AC" name="AC" type="number" 
					min="0" step="1" class="easyui-textbox" /></td>
			</tr>
			<tr>
				<td><span>拒绝箱数</span></td>
				<td><input id="add_RE" name="RE" type="number" 
					min="0" step="1" class="easyui-textbox" /></td>					
			</tr>
		</table>
	</div>
	<div id="addregbuttons">
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-ok'" 
			id="add_save_btn" onclick="InspectRegulation.addRegulation()">保存</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" 
			onclick="javascript:$('#addregdiv').dialog('close')">关闭</a>
	</div>
</body>
</html>