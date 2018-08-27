<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<script type="text/javascript" src="inc/js/eps.js"></script>
<script type="text/javascript" src="inc/initcolumn/wddd_gys_z_ww.js"></script>
<script type="text/javascript" src="inc/js/ext.js"></script>
<link rel="stylesheet" type="text/css" href="inc/css/baseCss.css"></link>


<title>我的订单(量产-委外)</title>

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
	//console.info(eps.PMMUD02_t);

	$(function() {
		var column_wddd_gys_z_PMM_PMN = []; //采购主明细档
		//console.info(eps.ACC);
		//console.info("=============>>>>.");
		column_wddd_gys_z_PMM_PMN = initcolumn();
		//	var parentrow;
		var datagrid; //定义全局变量  
		//var editRow = "";//定义当前编辑的行  
		datagrid = $("#dataGrid").datagrid({
			//title : "量产(我的采购单)",
			border : false,
			fit : true,
			rownumbers : true,
			locale : "zh_CN",
			//iconCls : 'icon-sum',
			striped : true,
			multiSort : true,
			sortOrder : "desc",
			collapsible : false,
			// url: "${pageContext.request.contextPath }/cgmxjson",  
			queryParams : {
				PMMUD02 : eps.PMMUD02_t
			},
			columns : [ column_wddd_gys_z_PMM_PMN ],

			toolbar : "#toolstb",
			onDblClickCell : function(index, field, value) {
				selectedrow = $("#dataGrid").datagrid('getSelected');
				eps.gbclickfield = field;
				eps.PMMUD02 = selectedrow.PMMUD02; //供应商id
				eps.PMM03 = selectedrow.PMM12; // 采购员id
				//console.info("=======供应商id=============");

				//	alert('{index:' + index + '}{field:' + field + '}{value:'+ value + '}');
				//console.info('{index:' + index + '}{field:' + field + '}{value:' + value + '}');
				eps.openwdwddd_gys_dialog(index, field, selectedrow);
				//console.info(parentrow);
			},
			onDblClickRow : function(index, row) {
				//console.info(row);
			},

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

	wddd_gys_z.doSearch = function() {
		var opts = $("#dataGrid").datagrid("options");
		var ob = {
			PMM01 : $('#PMM01').val(), //  采购单号
			PMM04 : $('#PMM04').val(), //采购日期
			PMN041 : $('#PMN041').val(), //材料名称
			PMN04 : $('#PMN04').val(), //料件编号
			PMN02 : $('#PMN02').val(), //项次
			PMMUD02 : eps.PMMUD02_t,
			TA_PMM06 : 'CY',
			PMN41 : $('#PMN41').val(), //工单号码
			SFB02 : $('#SFB02').val(), //工单类型
			PMM02 : 'SUB'
		};

		//console .info("1111+-${pageContext.request.contextPath }----${paramValues.PMM01}");
		opts.url = "${pageContext.request.contextPath }/cgmxjson"; //ds
		$("#dataGrid").datagrid("load", ob

		);

		//	var queryParams = $('#dataGrid').datagrid('options').queryParams;

	};

	wddd_gys_z.remove = function() {
		$("#searchform").form('clear');
	};

	function show(value) {
		//alert(eps.getRootPath_web());
		var simg = eps.getRootPath_web() + value;
		//simg=eps.urlvalue;
		$('#dlgimg').dialog({
			title : '预览',
			width : '70%',
			height : '70%',
			resizable : true,
			closed : false,
			cache : false,
			modal : true
		});
		$("#simg").attr("src", simg);

	}

	function change_photo() {
		eps.PreviewImage($("input[name='file']")[0], 'Img', 'Imgdiv');
	};
	function opendlg() {

		$('#upload_form').form('clear');

		$('#dialog_newfile').dialog('open');

	}

	function setValue(value) {

		var index = $('#dialog_m_dataGrid').datagrid('getRowIndex', $('#dialog_m_dataGrid').datagrid('getSelected'));

		var ed = $('#dialog_m_dataGrid').datagrid('getEditor', {
			index : index,
			field : 'attr'
		});
		$(ed.target).textbox('setValue', value);

	}

	function changeStatus() {
		var obj = {};

		//console.info("rowDate");
		//console.info(eps.rowDate);

		//console.info("发起人："+eps.rowDate.accid);
		//console.info("登录用户："+eps.ACCID);

		$('#statuschange').dialog({
			buttons : [ {
				text : '保存',
				handler : function() {

					$('#statuschangeform').form({
						url : "${pageContext.request.contextPath}/ddlog/changestatus",
						onSubmit : function(param) {

							param.PMMUD02 = eps.PMMUD02; // 供应商id
							param.PMM03 = eps.PMM03; // 采购员id
							param.currentdate = eps.getDate();

						},
						success : function(data) {
							var map = $.parseJSON(data);
							if (map.status == "success") {
								$.messager.show({
									title : '提示',
									msg : '操作成功!'
								});

								$('#statuschange').dialog('close');
								$('#dialog_m_dataGrid').datagrid('reload');

							} else {

								$.messager.show({
									title : '提示',
									msg : '操作失败!'
								});
								$('#statuschange').dialog('close');

							}

						}
					}

					);
					// submit the form    

					$.get("users/checkrole2", {
						accid1 : eps.ACCID,
						accid2 : eps.rowDate.accid
					}, function(data) {
						//console.info("=====>get.data");
						//console.info(data);
						if (data.code == 200) {

							$.messager.show({
								title : '提示',
								msg : data.msg,
								timeout : 5000,
								showType : 'slide'
							});
							$('#statuschange').dialog('close');

							return false;

						}
						$('#statuschangeform').submit();

					});

				}
			}, {
				text : '关闭',
				handler : function() {
					$('#statuschange').dialog('close');
					$("#statuschangeform").form('clear');
				}
			} ]

		});
		obj = eps.rowDate;
		$("#statuschangeform").form('clear');
		//console.info(obj);
		$('#statuschangeform').form('load', obj);
		$('#statuschange').dialog("open");
	}

	function upload() {

		/* 		$.ajax({
		 url:"uploadimg",
		 type : "post",
		 dataType : "json",
		 success : function(data) {
		 //console.info(data);
		
		 }  
		 } 
		
		 ); */

		$('#upload_form').form({
			url : "uploadimg",
			dataType : 'text',
			onSubmit : function() {
				// do some check    
				// return false to prevent submit;    
			},
			success : function(data) {
				map = $.parseJSON(data);
				//console.info(data);
				if (map.code == 100) {

					$.messager.show({
						title : '提示',
						msg : map.msg
					});
					//console.info(map);
					setValue(map.extend.url);
					$('#dialog_newfile').dialog('close');

				} else if (map.code == 200) {
					$.messager.show({
						title : '提示',
						msg : map.msg
					});

					$('#dialog_newfile').dialog('close');

				}

			}
		});
		// submit the form    
		$('#upload_form').submit();

	}
</script>
<style type="text/css">
input {
	width: 90px;
}

/* #tab tr td span { display:block; width: 65px;   text-align:right;}
 */
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

					<td><span>订单号码</span></td>
					<td><input id="PMM01" name="PMM01" class="easyui-textbox" /></td>
					<td><span>项次</span></td>
					<td><input id="PMN02" name="PMN02" class="easyui-textbox" /></td>
					<td><span>材料名称</span></td>
					<td><input id="PMN041" name="PMN041" class="easyui-textbox" /></td>
					<td><span>工单号</span></td>
					<td><input id="PMN41" name="PMN41" class="easyui-textbox" /></td>
					<td><span>工单类型</span></td>
					<td><select id="SFB02" name="SFB02" class="easyui-combobox"
						editable="false" style="width: 100px" panelHeight="auto">
							<option value=""></option>
							<option value="7">委外工单(7)</option>
							<option value="8">返工委外工单(8)</option>
					</select></td>

					<td><div class="easyui-linkbutton" iconCls="icon-search"
							plain="true" onclick="wddd_gys_z.doSearch()">查询</div></td>

					<td><div class="easyui-linkbutton" iconCls="icon-clear"
							onclick=" wddd_gys_z.remove()">清空</div></td>
				</tr>

			</table>


		</form>
	</div>



	<div id="dept_data" style="height: 100%; width: 100%">
		<table id="dataGrid" class="easyui-datagrid"
			style="width: 100%; height: 570px" rownumbers="true"
			pagination="true">
			</thead>
		</table>
	</div>
<!--  SIZE弹窗-->
	<div id="size__dialog" class="easyui-dialog" title="SIZE明细"
		data-options="modal:true,closed:true,iconCls:'icon-edit' ,fitColumns:true , resizable:true,
		buttons: '#size__dialogbb'
		"
		style="width: 80%; height: 40%;">

		<div id="size__dd" style="height: 100%; width: 100%">
			<table id="size__dg" class="easyui-datagrid"
				style="width: 100%; height: 100%" rownumbers="true"
				pagination="true">
			</table>
		</div> 
	</div>
	<div id="size__dialogbb">
		<div class="easyui-linkbutton"
			onclick="javascript:$('#size__dialog').dialog('close')">关闭</div>
	</div>




	<!-- ,footer:'#dlgft', -->


	<!--  收货 明细弹窗-->
	<div id="shmx__dialog" class="easyui-dialog" title="收货明细详情"
		data-options="modal:true,closed:true,iconCls:'icon-edit' ,fitColumns:true ,  
		buttons: '#shmx__dialogbb', resizable : true
		"
		style="width: 80%; height: 50%;">

		<div id="shmx__dd" style="height: 100%; width: 100%">
			<table id="shmx__dg" class="easyui-datagrid"
				style="width: 100%; height: 100%" rownumbers="true"
				pagination="true">
			</table>
		</div>

	</div>
	<div id="shmx__dialogbb">
		<div class="easyui-linkbutton"
			onclick="javascript:$('#shmx__dialog').dialog('close')">关闭</div>
	</div>








	<!--  明细修改弹窗-->
	<div id="wddd_gys_m_dialog" class="easyui-dialog" title="记录修改"
		data-options="modal:true,closed:true,iconCls:'icon-edit' ,fitColumns:true, footer:'#dlgft',
		buttons: '#wddd_gys_m_dialogbb',	 resizable : true 
		
		"
		style="width: 80%; height: 50%;">

		<div id="wddd_gys_m" style="height: 100%; width: 100%">
			<table id="dialog_m_dataGrid" class="easyui-datagrid"
				style="width: 100%; height: 100%" title="编辑" iconCls="icon-edit"
				pageSize=50 rownumbers="true" pagination="true">
			</table>
		</div>

	</div>

	<div id="wddd_gys_m_dialogbb">
		<div class="easyui-linkbutton"
			onclick="javascript:$('#wddd_gys_m_dialog').dialog('close')">关闭</div>
	</div>
	<div id="dlgft" style="padding: 2px 5px;">
		<div class="easyui-linkbutton" iconCls="icon-add" plain="true"
			id='append'">新增</div>
		<!-- <div id='edit' class="easyui-linkbutton" iconCls="icon-edit"
			plain="true">编辑</div> -->
		<div class="easyui-linkbutton" iconCls="icon-save" plain="true"
			id='accept'>保存</div>
		<div class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			id='removeit'">取消</div>
	</div>






	<!--  状态修改弹窗-->
	<div id="statuschange" class="easyui-dialog" title="状态修改"
		data-options="modal:true , closed:true,iconCls:'icon-edit' "
		style="width: 300px; height: 100px;">

		<div style="width: 100%; height: 100%;">
			<form id="statuschangeform" method="post">
				<table style="width: 100%; height: 100%;">
					<tr>
						<td><select id="status" name="status" class="easyui-combobox"
							editable=false panelHeight="auto" style="width: 250px">
								<option value="0">不同意(0)</option>
								<option value="1">同意(1)</option>
								<option value="2">待确认(2)</option>
						</select></td>
						<td><input class="easyui-validatebox" type="hidden"
							name="ddid" id="ddid" data-options="required:true" /> <input
							class="easyui-validatebox" type="hidden" name="replydd"
							id="replydd" /> <input class="easyui-validatebox" type="hidden"
							name="pmn01" id="pmn01" /> <input class="easyui-validatebox"
							type="hidden" name="pmn02" id="pmn02" /> <input
							class="easyui-validatebox" type="hidden" name="requirementdd"
							id="requirementdd" /> <input class="easyui-validatebox"
							type="hidden" name="accid" id=accid /></td>
					</tr>
				</table>

			</form>

		</div>

	</div>





	<div class="easyui-dialog" id="dlgimg" closed="true" align="center"
		title="预览" style="width: 50%; height: 50%;">
		<div>
			<img id="simg" width=100% height=100% />
		</div>
	</div>

	<div class="easyui-dialog" id="dialog_newfile" closed="true"
		align="center" title="上传附件"
		style="width: 450px; height: 440px; padding: 10px"
		data-options="
                iconCls: 'icon-new',
                buttons: [{
                    text:'确定',
                    iconCls:'icon-ok',
                    handler:function(){
                          upload();
                    }
                },{
                    text:'取消',
                    handler:function(){
                       $('#dialog_newfile').dialog('close');
                    }
                }]
            ">
		<table>
			<tr>
				<td valign="top">
					<form id="upload_form" enctype="multipart/form-data"
						action="uploadimg" method="post">

						<table>

							<tr>
								<td>选择图片:</td>
								<td><input id="file" name="file" class="easyui-filebox"
									data-options="buttonText:'选择' ,onChange:change_photo">
							</tr>
							<tr>
								<td colspan=2>
									<div id="Imgdiv">
										<img id="Img" width="300px" height="300px" />
									</div>
								</td>
							</tr>
						</table>
					</form>
					</div>
</body>
</html>