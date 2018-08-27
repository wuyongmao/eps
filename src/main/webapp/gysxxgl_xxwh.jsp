<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<script type="text/javascript" src="inc/js/eps.js"></script>
<script type="text/javascript" src="inc/initcolumn/gysxxgl_xxwh.js"></script>
<script type="text/javascript" src="inc/js/ext.js"></script>

<link rel="stylesheet" type="text/css" href="inc/css/baseCss.css"></link>


<script type="text/javascript">
	var gysxxgl_xxwh = $.extend({}, gysxxgl_xxwh);/* 全局对象 */
	var nameStr;
	eps.ROLE = '${sessionScope.username.ROLE}';

	$(function() {
		if (eps.ROLE != "admin") {
			//$('#ROLE').combo('readonly');	

			$('#ROLE').combobox({
				url : 'rolecomb.json',
				valueField : 'id',
				textField : 'text'
			});
		} else if (eps.ROLE == "admin") {
			$('#ROLE').combobox({
				url : 'rolecomb2.json',
				valueField : 'id',
				textField : 'text'
			});
		}

		$('#PMC081').combobox({
			prompt : '请输入或选择供应商名称',
			url : '${pageContext.request.contextPath }/pmc/getallpmc',
			valueField : 'pMC01', 
			textField : 'pMC081',
			onClick : function(node) {
				$("#PMC081").val($("#PMC081").combotree("getValue"));

			},
			filter : function(q, row) {
				var opts = $(this).combobox('options');
				//return row[opts.textField].indexOf(q) == 0;
				//   ////console.info(row[opts.textField]);
				return row[opts.textField].indexOf(q) > -1;//将从头位置匹配改为任意匹配
			},
			formatter : function(row) {
				var opts = $(this).combobox('options');
				nameStr += row[opts.textField] + ",";
				//  ////console.info(nameStr);
				return row[opts.textField];
			}
		});

		var column_gysxxgl_xxwh = []; //供应商信息

		column_gysxxgl_xxwh = initcolumn();
		var datagrid; //定义全局变量  
		//	var editRow = "";//定义当前编辑的行  
		datagrid = $("#dataGrid").datagrid({
			border : false,
			rownumbers : true,
			locale : "zh_CN",
			striped : true,
			sortOrder : "desc",
			collapsible : false,
			//url: "data.json",  
			//   queryParams: { deptName:"", deptId: ""},
			//  fitColumns:true,
			columns : [ column_gysxxgl_xxwh ],
			toolbar : "#toolstb",
			onDblClickCell : function(index, field, value) { //双击单元格事件
				////console.info('{index:' + index + '}{field:' + field + '}{value:' + value + '}');
				//	eps.openwdcgd_lc_dialog(field);
			},
			onDblClickRow : function(index, row) {
				////console.info(row);
				gysxxgl_xxwh.edit();

			},

			pagination : true,//表示在datagrid设置分页              
			rownumbers : true,
			singleSelect : true
		});
		$('#dataGrid').datagrid('getPager').pagination({
			pageSize : 10,
			pageNumber : 1,
			pageList : [ 10, 50, 100, 200, 500 ],

			beforePageText : '第',//页数文本框前显示的汉字   
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
		});

	});

	gysxxgl_xxwh.doSearch = function() {

		var opts = $("#dataGrid").datagrid("options");
		var ob = {
			PMMUD02 : $('#PMC081').val(), // $('#PMMUD02').val(), 
			NAME : $('#NAME').val(),
			ACC : $('#ACC').val(),
			DEPT : $('#DEPT').val()
		};
		opts.url = "${pageContext.request.contextPath }/users/getusers"; //ds
		$("#dataGrid").datagrid("load", ob

		);

	};

	gysxxgl_xxwh.remove = function() {
		$("#searchform").form('clear');
	};

	gysxxgl_xxwh.dialogclose = function() {

		$('#gysxxgl_xxwh_dialog').dialog('close');

	};

	//弹出编辑窗口
	gysxxgl_xxwh.edit = function() {
		var row = $('#dataGrid').datagrid('getSelected');
		if (row) {

			$('#gysxxgl_xxwh_dialog').dialog('open').dialog('setTitle', '信息修改');

			var obj = {};

			row["ownrole"] = eps.ROLE;

			obj.row = row;
			$("#ff").form('clear');

			$('#ff').form('load', row);

			//    url = 'feedback/reply';
		}
	};

	//提交保存
	gysxxgl_xxwh.save = function() {
		$.messager.progress(); // 显示进度条

		var isValid = $('#ff').form('validate');
		if (!isValid) {

			$.messager.progress('close'); // 如果表单是无效的则隐藏进度条
			$.messager.alert('提示', '请核实输入数据', 'info');
			return isvalid;
		}

		$.ajax({
			type : "POST",
			timeout : 10000, //超时时间设置，单位毫秒       1000ms=1s
			dataType : 'json', //返回的数据格式
			data : $('#ff').serialize(),
			url : "${pageContext.request.contextPath}/users/saveuser",
			complete : function(XMLHttpRequest, status) {
				if (status == 'timeout') //超时,status还有success,error等值的情况
				{
					$.messager.progress('close');
					$.messager.alert('警告', '请求超时', 'error');
					gysxxgl_xxwh.dialogclose();
				}
			},
			success : function(msg) {
				$.messager.progress('close'); // 如果提交成功则隐藏进度条
				gysxxgl_xxwh.dialogclose();
				$('#dataGrid').datagrid('reload');
				$.messager.alert('提示', msg.msg, 'warning');
				////console.info(msg);
			}
		});

	};
</script>



<style type="text/css">
input {
	width: 120px;
}

/* #tab tr td span { display:block; width: 65px;   text-align:right;}
 */
</style>
<title>供应商信息维护</title>

</head>


<body>

	<div id="toolstb" style="padding: 10px">

		<form id="searchform"
			action="${pageContext.request.contextPath }/users/getusers">
			<table class="tableForm">
				<tr>

					<!-- <td><span style="width: 125px; text-align: right">供应商</span></td>
               <td><input id="PMMUD02" name="PMMUD02" class="easyui-textbox" /></td> -->
					<td><span>姓名</span></td>
					<td><input id="NAME" name="NAME" class="easyui-textbox" /></td>
					<td><span>帐号</span></td>
					<td><input id="ACC" name="ACC" class="easyui-textbox" /></td>
					<td><span style="width: 125px; text-align: right">供应商名称</span></td>
					<td><input class="easyui-combobox" name="PMC081" id="PMC081"
						data-options="valueField:'id',textField:'text',panelHeight:'auto',panelMaxHeight:200,panelMinHeight:100"
						style="width: 200px; height: 29px" /></td>
					<td><div class=" easyui-linkbutton" iconCls="icon-search"
							plain="true" onclick="gysxxgl_xxwh.doSearch()">查询</div></td>
					<td><div class="easyui-linkbutton" iconCls="icon-clear"
							plain="true" onclick="gysxxgl_xxwh.remove()">清空</div></td>

				</tr>

			</table>


		</form>



	</div>


	<div id="gysxxgl_xxwh" style="height: 100%; width: 100%">
		<table id="dataGrid" class="easyui-datagrid"
			style="width: 100%; height: 570px" rownumbers="true"
			pagination="true">
		</table>
	</div>



	<!--  明细修改弹窗-->
	<div id="gysxxgl_xxwh_dialog" class="easyui-dialog" title="用户信息修改"
		data-options="modal:true , closed:true,iconCls:'icon-edit',
		buttons: '#gysxxgl_xxwh_dialogbb' "
		style="width: 350px; height: 300px;">

		<div style="padding: 5px; background: #D1EEEE">
			<form id="ff" method="post">
				<table style="width: 100%; height: 100%;">
					<tr>
						<td align="right"><label for="NAME">姓名</label></td>
						<td><input class="easyui-validatebox" type="text" name="NAME"
							style="background: #CFCFCF" id="NAME" editable=false
							data-options="required:true" /></td>
					</tr>
					<tr>
						<td align="right"><label for="EMAIL">邮件地址</label></td>
						<td><input class="easyui-validatebox" type="text"
							name="EMAIL" id="EMAIL"
							data-options="required:true ,validType:'email' " /></td>
					</tr>
					<tr>
						<td align="right"><label for="TEL">座机</label></td>
						<td><input class="easyui-validatebox" type="text" name="TEL"
							id="TEL" /></td>
					</tr>
					<tr>
						<td align="right"><label for="HP">手机号码</label></td>
						<td><input class="easyui-validatebox" type="text" name="HP"
							id="HP" /></td>
					</tr>
					<tr>
						<td align="right"><label for="QQ">QQ</label></td>
						<td><input class="easyui-validatebox" type="text" name="QQ"
							id="QQ" /></td>
					</tr>
					<tr>
						<td align="right"><label for="WECHAT">微信</label></td>
						<td><input class="easyui-validatebox" type="text"
							name="WECHAT" id="WECHAT" /></td>
					</tr>
					<tr>
						<td align="right"><label for="ROLE">角色</label></td>
						<td><select id="ROLE" name="ROLE" class="easyui-combobox"
							editable="false" style="width: 125px" panelHeight="auto"
							data-options="
					valueField: 'id',    
              textField: 'text',
					url: 'rolecomb.json' 
					
					">



								<!-- 						<option value="LC">量产采购(LC)</option>
								<option value="YF">研发采购(YF)</option>
								<option value="PG">研发品管(PG)</option>
								<option value="GYS">供应商(GYS)</option>
								<option value="YW">业务(YW)</option>
								<option value="admin">系统管理员</option>

								<option value="-">--</option>
								 -->
						</select></td>

					</tr>
					<tr>
						<td align="right"><label for="STATUS">有效标识</label></td>
						<td><select id="STATUS" name="STATUS" class="easyui-combobox"
							style="width: 125px" panelHeight="auto">
								<option value="N">无效(N)</option>
								<option value="Y">有效(Y)</option>
						</select></td>
					</tr>
					<tr>
						<td><input class="easyui-validatebox" type="hidden"
							name="ACCID" id="ACCID" /></td>
						<td><input class="easyui-validatebox" type="hidden"
							name="ownrole" id="ownrole" /></td>
					</tr>


				</table>

			</form>

		</div>

	</div>

	<div id="gysxxgl_xxwh_dialogbb">
		<div class="easyui-linkbutton" onclick="gysxxgl_xxwh.save()">保存</div>
		<div class="easyui-linkbutton" onclick="gysxxgl_xxwh.dialogclose()">关闭</div>
	</div>

</body>





</html>