<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<script type="text/javascript" src="inc/js/eps.js"></script>
<script type="text/javascript" src="./inc/js/column_shd.js"></script>
<script type="text/javascript" src="inc/js/ext.js"></script>
<script type="text/javascript"
	src="inc/jquery.tmpl/1.4.2/jquery.tmpl.min.js"></script>
<script type="text/javascript" src="inc/js/qr.js"></script>

<link rel="stylesheet" type="text/css" href="inc/css/baseCss.css"></link>

<title>送货单</title>

<script type="text/javascript">
	var wddd_gys_z = $.extend({}, wddd_gys_z);/* 全局对象 */
	var selectedrow;
	var type = "rl";
	eps.ROLE = "${sessionScope.username.ROLE}";

	eps.ACC = "${sessionScope.username.ACC}";
	eps.ACCID = "${sessionScope.username.ACCID}";
	eps.NAME = "${sessionScope.username.NAME}";
	eps.PMMUD02_t = '${sessionScope.username.PMMUD02}';
	if (eps.PMMUD02_t == '' || eps.PMMUD02_t.length == 0) {
		eps.PMMUD02_t = 'lll';

	}

	$(function() {
		var column_wddd_gys_z_PMM_PMN = []; //采购主明细档 
		column_wddd_gys_z_PMM_PMN = column_shd;
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
			onDblClickCell : onClickCell
			,pageSize : 20,
			pageList : [20, 50, 100, 150, 200] 
		});

	});

	wddd_gys_z.doSearch = function() {

		var opts = $("#dg").datagrid("options");
		var ob = {
			SHD01 : $('#WXB03').combobox('getValue'),
			SHD02 : $('#SHD02').val(),
			PMMUD02 : eps.PMMUD02_t,
			ROLE : eps.ROLE
		//  采购单号 

		};
		opts.url = "${pageContext.request.contextPath }/wxb/getwxbshd2"; //ds
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
						<td><span>送货日期</span></td>
						<td><input id="SHD02" name="SHD02" class="easyui-datebox" /></td>
						
					
						<td><span>送货单号</span></td>


						<!--  <td><input id="SHD01" name="SHD01" class="easyui-textbox" /></td>
 -->
						<td><input id="WXB03" name="WXB03" /></td>

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
				data-options="iconCls:'icon-print',plain:true" onclick="printshd()">打印送货单</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				data-options="iconCls:'icon-delete',plain:true" onclick="invalid()">作废送货单</a>

		</div>
	</div>


	<script type="text/javascript">
		$('#WXB03').combobox({
			url : 'wxb/shdlist',
			valueField : 'id',
			textField : 'text',
			onBeforeLoad : function(param) {
				param.PMMUD02 = eps.PMMUD02_t;
				param.ROLE = eps.ROLE;
			},
			dataType : "json"
		});

		function onClickCell(index, field) {

		}
		
		function invalid(){

			  
			users = null;
			users = $('#dg').datagrid('getSelected');
			console.info(users);
			if (users != null) {
				$.ajax({ 
					type : 'POST',
					dataType : "json",
					data: {"SHD01":users.SHD01},
					async : false,   
					url : "wxb/deleteshd",
					success : function(data) { 

						if (data.code == "100") {
							$.messager.show({
								title : '提示',
								msg : data.msg,
								timeout:2000,
								width: '250px',
								height: '150px'


							});  
					    $('#dg').datagrid('reload');
						} else {
							$.messager.show({
								title : '提示',
								msg : data.msg,
								timeout:2000 
							});
						}

					}

				});
     
			}else{
				$.messager.show({
					title : '提示',
					msg : '请选择行！',
					timeout : 500,
					showType : 'show',
					style : {
						right : '',
						top : document.body.scrollTop
								+ document.documentElement.scrollTop,
						bottom : ''
					}

				});
				return;
			}

		};

		function printshd() {
			  
			users = null;
			users = $('#dg').datagrid('getSelected');
			console.info(users);
			if (users != null) {
				$.ajax({
					type : "GET",
					url : "wxb/printshd?SHD01=" + users.SHD01,
					async : false,   
					success : function(msg) {
						// alert( "Data Saved: " + msg );
						//   location.href='wxb?WXB05='+users.WXB05;
						window.open('wxb/printshd?SHD01=' + users.SHD01);

					}

				});
     
			}else{
				$.messager.show({
					title : '提示',
					msg : '请选择行！',
					timeout : 500,
					showType : 'show',
					style : {
						right : '',
						top : document.body.scrollTop
								+ document.documentElement.scrollTop,
						bottom : ''
					}

				});
				return;
			}

		};
	</script>



</body>

</html>