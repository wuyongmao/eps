<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<script type="text/javascript" src="inc/js/eps.js"></script>
<script type="text/javascript" src="inc/initcolumn/wdcgd_yf_z_ww.js"></script>
<script type="text/javascript" src="inc/js/ext.js"></script>
<script type="text/javascript" src="inc/js/jquery-form.js"></script>




<link rel="stylesheet" type="text/css" href="inc/css/baseCss.css"></link>


<title>我的采购单(研发)</title>

<script type="text/javascript">
	var wdcgd_yf_z = $.extend({}, wdcgd_yf_z);/* 全局对象 */
	var selectedrow;
	var selectedindex ; 
	eps.ACC = "${sessionScope.username.ACC}";
	eps.ACCID = "${sessionScope.username.ACCID}";
	eps.NAME = "${sessionScope.username.NAME}";
	eps.ROLE='${sessionScope.username.ROLE}';
	
    if (eps.ROLE =="admin"  || eps.ROLE =="PG"  )  {
    	eps.PMM03_t='';

    	
    }  else{
   	 eps.PMM03_t='${sessionScope.username.ACC}';

    }
	
	$(function() {
		var column_wdcgd_yf_z_PMM_PMN = []; //采购主明细档
		//console.info(eps.ACC);
		//console.info("=============>>>>.");
		column_wdcgd_yf_z_PMM_PMN = initcolumn();
	//	var parentrow;
		var datagrid; //定义全局变量  
	//	var editRow = "";//定义当前编辑的行  
		datagrid = $("#dataGrid").datagrid(
				{
					//title : "量产(我的采购单)",
					border : false,
					fit : true,
					rownumbers : true,
					locale : "zh_CN",
					multiSort :true,
					//iconCls : 'icon-sum',
					striped : true,
					sortOrder : "desc",
					collapsible : false,
					// url: "${pageContext.request.contextPath }/cgmxjson",  
 					columns : [ column_wdcgd_yf_z_PMM_PMN ],

					toolbar : "#toolstb",
					onDblClickCell : function(index, field, value) {
						selectedrow = $("#dataGrid").datagrid('getSelected');
						
						if(field=='SHDZ'){
							$("#SHDZT").css("display","block");
							$("#PSFLAGT").css("display","none");
							 
						}else if(field == 'PSFLAG'){
							$("#SHDZT").css("display","none");
							$("#PSFLAGT").css("display","block");
							
							
						} 
						
						
						
						
						eps.gbclickfield = field;
						eps.PMMUD02 = selectedrow.PMMUD02; //供应商id
						eps.PMM03 = selectedrow.PMM12; // 采购员id
						//console.info("=======供应商id=============");
                        //console.log("field--->"+field);
						//console.info(eps.PMMUD02);
						//console.info(eps.PMM03);

						//	alert('{index:' + index + '}{field:' + field + '}{value:'+ value + '}');
						//console.info('{index:' + index + '}{field:' + field + '}{value:' + value + '}');
						eps.openwdwdcgd_yf_dialog(index, field, selectedrow);
						////console.info(parentrow);
					},
					onSelect:  function(index, row) {
						 selectedindex=index;
						 selectedrow=row;

						 //console.info(selectedrow);
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

			/* buttons : [ {
				iconCls : 'icon-save',
				handler : function() {
					eps.download();
				}
			} ],
			 */
			beforePageText : '第',//页数文本框前显示的汉字   
			afterPageText : '页    共 {pages} 页',
			displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录',
		});
		
		 
		
		
		

	});

	wdcgd_yf_z.doSearch = function() {
		var opts = $("#dataGrid").datagrid("options");
		var ob = {
			PMM01 : $('#PMM01').val(), //  采购单号
			PMM04 : $('#PMM04').val(), //采购日期
			PMNUD05 : $('#PMNUD05').val(), //生产季节
			PMMUD02 : $('#PMMUD02').val(), //采购厂商
			PMN041 : $('#PMN041').val(), //材料名称
			PMN04 : $('#PMN04').val(), //料件编号
			PMN02 : $('#PMN02').val(), //项次
			PMN24 : $('#PMN24').val(), //请购单号
			GEN021 : $('#GEN021').val(), //采购人姓名
			PMM18 : $('#PMM18').val(), //确认码
			PSFLAG : $('#PSFLAG').val(), //是否批色
			PMN41 : $('#PMN41').val(), //工单号码
			SFB02 : $('#SFB02').val(), //工单类型

			CJL : $('#CJL').val(),
			PMM12:eps.PMM03_t,
			TA_PMM06 : 'RD' ,
			PMM02  :    'SUB'
             
		//未交数量

		};

 		opts.url = "${pageContext.request.contextPath }/cgmxjson"; //ds
		$("#dataGrid").datagrid("load", ob

		);

	//	var queryParams = $('#dataGrid').datagrid('options').queryParams;

	};

	wdcgd_yf_z.remove = function() {
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

		var index = $('#dialog_m_dataGrid').datagrid('getRowIndex',
				$('#dialog_m_dataGrid').datagrid('getSelected'));

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

		//console.info("发起人：" + eps.rowDate.accid);
		//console.info("登录用户：" + eps.ACCID);

	 
		
		
		$('#statuschange').dialog({
			buttons : [ {
				text : '保存',
				handler : function() {
					
					$('#statuschangeform').form({    
					    url:"${pageContext.request.contextPath}/ddlog/changestatus",    
					    onSubmit : function(param) {
						       
					        param.PMMUD02 =eps.PMMUD02   ;    // 供应商id
					        param.PMM03 =eps.PMM03        ; // 采购员id
					        param.currentdate=eps.getDate();
							

					},    
					    success:function(data){ 
					       var map=	$.parseJSON(data);
					    	if (map.status == "success") {
								$.messager.show({
									title : '提示',
									msg : '操作成功!' 
								});
								
								
								$('#statuschange').dialog('close');
								$('#dialog_m_dataGrid').datagrid('reload');
							
							
							

					    }    else {
					    	
					    	$.messager.show({
								title : '提示',
								msg : '操作失败!' 
							});
							$('#statuschange').dialog('close');

					    }
					    	
					    }} 
 
							
					 );    
					// submit the form    

					$.get("users/checkrole1", { accid1: eps.ACCID, accid2: eps.rowDate.accid },
							  function(data){
							    //console.info("=====>get.data");
							    //console.info(data);
							    if(data.code==200){
							    	
							    	$.messager.show({
								    		title:'提示',
								    		msg:data.msg,
								    		timeout:5000,
								    		showType:'slide'
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
 
		//var form = new FormData(document.getElementById("upload_form"));  
		$("#upload_form").ajaxSubmit({
			type: "POST",
            url : 'uploadimg', 
            dataType : eps.JudgeBroswer=="IE" ? "text" : "json",
		     success : function(data) {
		    	 if (typeof (data) == "string") {  
		             //ie会进入这里  
		             data = JSON.parse(data);//或者data = eval("(" + data + ")");  
		         } 
		    	 
                    if (data.code == 100) {

                        $.messager.show({
                            title : '提示',
                            msg : data.msg
                        });
                        setValue(data.extend.url);
                        $('#dialog_newfile').dialog('close');

                    } else if (data.code == 200) {
                        $.messager.show({
                            title : '提示',
                            msg : data.msg
                        });

                        $('#dialog_newfile').dialog('close');

                    }

                 
                 
             }   
		});

	}

	function editadress() {

		//console.info("begin--rowData");

		var rowaa = $('#dataGrid').datagrid('getSelected');
		
		if (rowaa) {

			$("#shdzchangeform").form('clear');
			$('#shdzchangeform').form('load', {
				PMN01 : rowaa.PMN01,
				PMN02 : rowaa.PMN02,
				SHDZ : rowaa.SHDZ,
				PSFLAG :rowaa.PSFLAG

			});

			$('#shdzchange').dialog({
				title : '地址修改',
				modal : true,

				buttons : [ {
					text : '保存',
					handler : function() {
               if(	$("#shdzchangeform").form('validate') ==false )
					  {
            	   
            	   
            	   
						  $.messager.show({
								title : '提示',
								msg : '保存失败'
							});
						  
						  return;
					  }
						 
						$('#shdzchangeform').form('submit', {    
						    url:"${pageContext.request.contextPath}/pmn/changeshdz",    
						    onSubmit: function(){    
						        // do some check    
						        // return false to prevent submit;    
						    },    
						    success:function(data){    
						    	//console.info("=====shdzchangeform-->submit");
						        //console.info(data)    ;
						        
						     var   map1 = $.parseJSON(data);
								//console.info(data);
								if (map1.code == 100) {

									$.messager.show({
										title : '提示',
										msg : map1.msg
									});
									//console.info(map1);
 									$('#shdzchange').dialog('close');
 									$("#shdzchangeform").form('clear');

 									
 									$('#dataGrid').datagrid('reload');
  									
 									$('#dataGrid').datagrid('selectRow',selectedindex);

 									
 									
 									
 									
 									
								} else if (map1.code == 200) {
									$.messager.show({
										title : '提示',
										msg : map1.msg
									});
									$("#shdzchangeform").form('clear');

									$('#shdzchange').dialog('close');

								}
						        
						        
						        
						        
						        
						    }    
						});  


						
						
						
						
						
						
					}
				}, {
					text : '关闭',
					handler : function() {
						$("#shdzchangeform").form('clear');

						$('#shdzchange').dialog("close");

					}
				} ]

			});

			$('#shdzchange').dialog("open");

		}

		//console.info("end ----rowData");
			$('#dataGrid').datagrid('selectRow',selectedindex);

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

	<div id="toolstb" style="padding: 10px">

		<form id="searchform"
			action="${pageContext.request.contextPath }/cgmxjson">
			<table class="tableForm">
				<tr>

					<td><span>采购日期</span></td>
					<td><input id="PMM04" name="PMM04" class="easyui-datebox"
						editable="false" /></td>
					<td><span>采购厂商</span></td>
					<td><input id="PMMUD02" name="PMMUD02" class="easyui-textbox" /></td>
					<td><span>采购人姓名</span></td>
					<td><input id="GEN021" name="GEN021" class="easyui-textbox"></td>

					<td><span>料件编号</span></td>
					<td><input id="PMN04" name="PMN04" class="easyui-textbox" /></td>
					<td><span>是否批色</span></td>

					<td><select id="PSFLAG" name="PSFLAG" class="easyui-combobox"
						editable="false" style="width: 100px" panelHeight="auto">
							<option value="N">否(N)</option>
							<option value="Y">是(Y)</option>
					</select></td>

				</tr>
				<tr>
					<td><span>采购单号</span></td>
					<td><input id="PMM01" name="PMM01" class="easyui-textbox" /></td>
					<td><span>项次</span></td>
					<td><input id="PMN02" name="PMN02" class="easyui-textbox" /></td>
					<td><span>确认码</span></td>
					<td><select id="PMM18" name="PMM18" class="easyui-combobox"
						editable="false" style="width: 100px" panelHeight="auto">
							<option value=""></option>

							<option value="N">未审核(N)</option>
							<option value="Y">已审核(Y)</option>
							<option value="X">作废(X)</option>
					</select></td>
					<td><span>工单号</span></td>
					<td><input id="PMN41" name="PMN41" class="easyui-textbox" /></td>
					<td><span>工单类型</span></td>
					<td><select id="SFB02" name="SFB02" class="easyui-combobox"
						editable="false" style="width: 100px" panelHeight="auto">
							<option value=""></option>
							<option value="7">委外工单(7)</option>
							<option value="8">返工委外工单(8)</option>
					</select></td>

					<td></td>
					<td><div class="easyui-linkbutton" iconCls="icon-search"
							plain="true" onclick="wdcgd_yf_z.doSearch()">查询</div></td>

					<td><div class="easyui-linkbutton" iconCls="icon-clear"
							onclick=" wdcgd_yf_z.remove()">清空</div></td>
				</tr>
			</table>


		</form>
	</div>



	<div id="dept_data" style="height: 100%; width: 100%">
		<table id="dataGrid" class="easyui-datagrid"
			style="width: 100%; height: 570px" rownumbers="true"
			pagination="true">
		</table>
	</div>





	<!-- ,footer:'#dlgft', -->


	<!--  收货 明细弹窗-->
	<div id="shmx__dialog" class="easyui-dialog" title="收货明细详情"
		data-options="modal:true,closed:true,iconCls:'icon-edit' ,fitColumns:true ,  
		buttons: '#shmx__dialogbb', resizable : true
		"
		style="width: 80%; height: 40%;">

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
	<div id="wdcgd_yf_m_dialog" class="easyui-dialog" title="记录修改"
		data-options="modal:true,closed:true,iconCls:'icon-edit' ,fitColumns:true, 
		buttons: '#wdcgd_yf_m_dialogbb',	 resizable : true 
		
		"
		style="width: 80%; height: 30%;">

		<div id="wdcgd_yf_m" style="height: 100%; width: 100%">
			<table id="dialog_m_dataGrid" class="easyui-datagrid"
				style="width: 100%; height: 100%" title="编辑" iconCls="icon-edit"
				pageSize=50 rownumbers="true" pagination="true">
			</table>
		</div>

	</div>

	<div id="wdcgd_yf_m_dialogbb">
		<div class="easyui-linkbutton"
			onclick="javascript:$('#wdcgd_yf_m_dialog').dialog('close')">关闭</div>
	</div>

	<div style="display: none;">
		<div id="dlgft">
			<div class="easyui-linkbutton" iconCls="icon-add" plain="true"
				id='append'">新增</div>
			<div class="easyui-linkbutton" iconCls="icon-save" plain="true"
				id='accept'>保存</div>
			<!-- 	 <div id='edit' class="easyui-linkbutton"  iconCls="icon-edit"
			plain="true">编辑</div> -->
			<div class="easyui-linkbutton" iconCls="icon-remove" plain="true"
				id='removeit'">取消</div>
		</div>
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




	<!--  地址修改弹窗-->
	<div id="shdzchange" class="easyui-dialog" title="状态修改"
		data-options="modal:true , closed:true,iconCls:'icon-edit' "
		style="width: 300px; height: 100px;">

		<div style="width: 100%; height: 100%;">
			<form id="shdzchangeform" method="post">
				<table style="width: 100%; height: 100%;">

					<tr id="SHDZT" style="display: none">
						<td><select id="SHDZ" name="SHDZ" class="easyui-combobox"
							editable=false panelHeight="auto" style="width: 250px">
								<option value="A102">总厂(A102)</option>
								<option value="A202">白石(A202)</option>
						</select></td>

					</tr>
					<tr id="PSFLAGT" style="display: none">
						<td><select id="PSFLAG" name="PSFLAG" class="easyui-combobox"
							editable=false panelHeight="auto" style="width: 250px">
								<option value="N">否(N)</option>
								<option value="Y">是(Y)</option>
						</select></td>

					</tr>
					<tr>
						<td><input class="easyui-validatebox" type="hidden"
							name="PMN01" id="PMN01" data-options="required:true" /></td>


					</tr>
					<tr>
						<td><input class="easyui-validatebox" type="hidden"
							name="PMN02" id="PMN02" data-options="required:true" /></td>
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