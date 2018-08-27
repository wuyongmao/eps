<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<script type="text/javascript" src="inc/js/eps.js"></script>
<script type="text/javascript" src="./inc/js/column_cyb.js"></script>
<script type="text/javascript" src="inc/js/ext.js"></script>
<script type="text/javascript"
	src="inc/jquery.tmpl/1.4.2/jquery.tmpl.min.js"></script>
<script type="text/javascript" src="inc/js/qr.js"></script>

<link rel="stylesheet" type="text/css" href="inc/css/baseCss.css"></link>

<title>差异</title>

<script type="text/javascript">
	var wddd_gys_c = $.extend({}, wddd_gys_c);/* 全局对象 */
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
		var column_wddd_gys_c_PMM_PMN = []; //采购主明细档 
		column_wddd_gys_c_PMM_PMN = column_shd;
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
			columns : [ column_wddd_gys_c_PMM_PMN ],

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

	wddd_gys_c.doSearch = function() {
		  
		var opts = $("#dg").datagrid("options");
		var ob = {
			CYB01 : $('#CYB01').combobox('getValue')
		//  采购单号 

		};
		opts.url = "${pageContext.request.contextPath }/cyb/getcyb"; //ds
		$("#dg").datagrid("load", ob

		);

		//var queryParams = $('#dataGrid').datagrid('options').queryParams;

	};

	wddd_gys_c.remove = function() {
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
						<td><span>箱号</span></td>


<!-- 						<td><input id="SHD01" name="SHD01" class="easyui-textbox" /></td>
 -->
						<td><input id="CYB01" name="CYB01" /></td>

						<td><div class="easyui-linkbutton" iconCls="icon-search"
								plain="true" onclick="wddd_gys_c.doSearch()">查询</div></td>

						<td><div class="easyui-linkbutton" iconCls="icon-clear"
								onclick=" wddd_gys_c.remove()">清空</div></td>
					</tr>
				</table>
			</form>
  

		</div>
	</div>

	</script>


	<script type="text/javascript">
		$('#CYB01').combobox({
			url : 'cyb/cyblist',
			valueField : 'id',
			textField : 'text'
		});

		function onClickCell(index, field) {

		}
 
	</script>



</body>

</html>