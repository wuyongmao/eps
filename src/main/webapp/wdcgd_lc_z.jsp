<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<script type="text/javascript" src="inc/js/eps.js"></script>
<script type="text/javascript" src="inc/initcolumn/wdcgd_lc_z.js"></script>
<script type="text/javascript" src="inc/js/ext.js"></script>


<link rel="stylesheet" type="text/css" href="inc/css/baseCss.css"></link>



<title>我的采购单(量产)</title>

<script type="text/javascript">
	var wdcgd_lc_z = $.extend({}, wdcgd_lc_z);/* 全局对象 */
	var selectedrow;
	var map;
	eps.ACC = "${sessionScope.username.ACC}";
	eps.ACCID = "${sessionScope.username.ACCID}";
	eps.NAME = "${sessionScope.username.NAME}";
	eps.ROLE='${sessionScope.username.ROLE}'
		wdcgd_lc_z.status="2";
	    
	    if (eps.ROLE !="admin")  {
	    	 eps.PMM03_t='${sessionScope.username.ACC}';
	    		
	    }else{
	    	eps.PMM03_t='';
	    }
	    
	    
	$(function() {
		var  column_wdcgd_lc_z_PMM_PMN =[];   //采购主明细档

		
		
		
		
		$('#status').combobox({
			onChange: function(newValue,oldValue){
				wdcgd_lc_z.status=newValue;
				//console.info(wdcgd_lc_z.status);
			}
		});
		
		
		column_wdcgd_lc_z_PMM_PMN= initcolumn();
 		var datagrid; //定义全局变量  
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
	                    //   queryParams: { deptName:"", deptId: ""},
	                    columns : [ column_wdcgd_lc_z_PMM_PMN ],

	                    toolbar : "#toolstb",
	                    onDblClickCell : function(index, field, value) {
	                        selectedrow = $("#dataGrid").datagrid('getSelected');
	                        eps.gbclickfield = field;
	                        eps.PMMUD02 = selectedrow.PMMUD02; //供应商id
	                        eps.PMM03 = selectedrow.PMM12; // 采购员id
	                        //console.info("=======供应商id=============");

	                        //console.info(eps.PMMUD02);
	                        //console.info(eps.PMM03);

	                        //  alert('{index:' + index + '}{field:' + field + '}{value:'+ value + '}');
	                        //console.info('{index:' + index + '}{field:' + field     + '}{value:' + value + '}');
	                        eps.openwdwdcgd_lc_dialog(index, field, selectedrow);
 	                    },
	                    onDblClickRow : function(index, row) {
	                        //console.info(row);
	                    },

	                    pagination : true,//表示在datagrid设置分页              
	                    rownumbers : true,
	                    singleSelect : true
	                });
	        $('#dataGrid').datagrid('getPager').pagination({
	            pageSize : 10,
	            pageNumber : 1,
	            pageList : [ 10, 50, 100, 200, 500 ],
	            beforePageText : '第', 
	            afterPageText : '页    共 {pages} 页',
	            displayMsg : '当前显示 {from} - {to} 条记录   共 {total} 条记录'
	        });

	    });
	 
 

	wdcgd_lc_z.doSearch = function() {
		var opts = $("#dataGrid").datagrid("options");
		  var ob={PMM01 :   $('#PMM01').val(),       //  采购单号
				  PMM04:     $('#PMM04').val(),    //采购日期
				  PMNUD05:     $('#PMNUD05').val(),     //生产季节
				  PMMUD02:     $('#PMMUD02').val(),    //采购厂商
				  PMN041:     $('#PMN041').val(),     //材料名称
				  PMN04:     $('#PMN04').val(),          //料件编号
				  PMN02:     $('#PMN02').val(),         //项次
				  PMN24:     $('#PMN24').val(),        //请购单号
				  GEN021:     $('#GEN021').val(),      //采购人姓名
				  PMN16:     $('#PMN16').val(),          //状况码  
				  
				  PMM12  :    eps.PMM03_t,
				  TA_PMM06 : 'CY',
				  PMM02  :    '!SUB'

		  
		  };
  
 		  opts.url =  "${pageContext.request.contextPath }/cgmxjson"; //ds
		$("#dataGrid").datagrid("load", ob
				  
		
		);
		  
		  
	//	  var queryParams =$('#dataGrid').datagrid('options').queryParams;  

  	};
    
  	

    function changeStatus() {
        var obj = {};
    

		
		
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
        //console.info("------------------>");

        //console.info(map);
        
        
        
       
        
        
        
        obj = eps.rowDate;
        $("#statuschangeform").form('clear');
        //console.info(obj);
        $('#statuschangeform').form('load', obj);
        $('#statuschange').dialog("open");
    }
  	
  	
	wdcgd_lc_z.remove = function() {
		$("#searchform").form('clear');
	};
	function editadress() {

		//console.info("begin--rowData");

		var rowaa = $('#dataGrid').datagrid('getSelected');
		
		if (rowaa) {

			$("#shdzchangeform").form('clear');
			$('#shdzchangeform').form('load', {
				PMN01 : rowaa.PMN01,
				PMN02 : rowaa.PMN02,
				SHDZ : rowaa.SHDZ

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
						 
               $.ajax({ 
    			   type: "POST",
    			   timeout : 10000,             //超时时间设置，单位毫秒       1000ms=1s
    			  dataType:'json',				//返回的数据格式
               data:  eps.serializeObject($('#shdzchangeform'))  ,
           url:"${pageContext.request.contextPath}/pmn/changeshdz", 
    			   success: function(data){
    				   
    			  $('#dialog_m_dataGrid').datagrid('reload');

    				if (data.code == "100") {

    					$.messager.show({
    						title : '提示',
    						msg : '处理成功',
    						timeout : 2000,
    						showType : 'slide'
    					});
    			
     
     									
    				} else {
    					$.messager.show({
    						title : '提示',
    						msg : '处理失败',
    						timeout : 2000,
    						showType : 'slide'
    					});

    				}


    	      $('#shdzchange').dialog('close');
    				$("#shdzchangeform").form('clear');

    				
    				$('#dataGrid').datagrid('reload');
    				

    			   }
    		   }
      );
    		


						
						
						
						
						
						
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
					<td><span>生产季节</span></td>
					<td><input id="PMNUD05" name="PMNUD05" class="easyui-textbox" /></td>
					<td><span>采购厂商</span></td>
					<td><input id="PMMUD02" name="PMMUD02" class="easyui-textbox" /></td>
					<td><span>材料名称</span></td>
					<td><input id="PMN041" name="PMN041" class="easyui-textbox" /></td>
					<td><span>采购单号</span></td>
					<td><input id="PMM01" name="PMM01" class="easyui-textbox" /></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td><span>请购单号</span></td>
					<td><input id="PMN24" name="PMN24" class="easyui-textbox" /></td>
					<td><span>项次</span></td>
					<td><input id="PMN02" name="PMN02" class="easyui-textbox" /></td>

					<td><span>采购人姓名</span></td>
					<td><input id="GEN021" name="GEN021" class="easyui-textbox"></td>
					<td><span>状况码</span></td>
					<td><select id="PMN16" name="PMN16" class="easyui-combobox"
						editable="false" style="width: 100px" panelHeight="auto">
							<option value=""></option>
							<option value="1">已核准(1)</option>
							<option value="2">发出采购单(2)</option>
							<option value="6">结案-正常(6)</option>
							<option value="7">结案-结长(7)</option>
							<option value="8">结案-结短(8)</option>
					</select></td>
					<td><span>料件编号</span></td>
					<td><input id="PMN04" name="PMN04" class="easyui-textbox" /></td>
					<td></td>
					<td></td>
					<td><div class="easyui-linkbutton" iconCls="icon-search"
							plain="true" onclick="wdcgd_lc_z.doSearch()">查询</div></td>

					<td><div class="easyui-linkbutton" iconCls="icon-clear"
							onclick=" wdcgd_lc_z.remove()">清空</div></td>
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




	<!--  收货明细弹窗-->
	<div id="shmx__dialog" class="easyui-dialog" title="收货明细详情"
		data-options="modal:true,closed:true,iconCls:'icon-edit' ,fitColumns:true , resizable:true,
		buttons: '#shmx__dialogbb'
		"
		style="width: 80%; height: 40%;">

		<div id="shmx__dd" style="height: 100%; width: 100%">
			<table id="shmx__dg" class="easyui-datagrid"
				style="width: 100%; height: 100%" rownumbers="true"
				pagination="true">
			</table>
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
	
	
	
	<div id="shmx__dialogbb">
		<div class="easyui-linkbutton"
			onclick="javascript:$('#shmx__dialog').dialog('close')">关闭</div>
	</div>


	<!--  地址修改弹窗-->
	<div id="shdzchange" class="easyui-dialog" title="状态修改"
		data-options="modal:true , closed:true,iconCls:'icon-edit' "
		style="width: 300px; height: 100px;">

		<div style="width: 100%; height: 100%;">
			<form id="shdzchangeform" method="post">
				<table style="width: 100%; height: 100%;">

					<tr>
						<td><select id="SHDZ" name="SHDZ" class="easyui-combobox"
							editable=false panelHeight="auto" style="width: 250px">
								<option value="A102">总厂(A102)</option>
								<option value="A202">白石(A202)</option>
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



	<!--  交期、批色明细修改弹窗-->
	<div id="wdcgd_lc_m_dialog" class="easyui-dialog" title="记录修改"
		data-options="modal:true,closed:true,iconCls:'icon-edit',footer:'#dlgft', resizable:true,
		buttons: '#wdcgd_lc_m_dialogbb'
		"
		style="width: 80%; height: 70%;">

		<div id="wdcgd_lc_m" style="height: 100%; width: 100%">
			<table id="dialog_m_dataGrid" class="easyui-datagrid"
				style="width: 100%; height: 100%" title="编辑" iconCls="icon-edit"
				pageSize=50 rownumbers="true" pagination="true">
			</table>
		</div>

	</div>

	<div id="dlgft" style="padding: 2px 5px;">
		<div class="easyui-linkbutton" iconCls="icon-add" plain="true"
			id='append'">新增</div>
		<!--   <div id='edit' class="easyui-linkbutton" iconCls="icon-edit"
            plain="true">编辑</div> -->
		<div class="easyui-linkbutton" iconCls="icon-save" plain="true"
			id='accept'>保存</div>
		<div class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			id='removeit'">取消</div>
	</div>


	<div id="wdcgd_lc_m_dialogbb">
		<div class="easyui-linkbutton"
			onclick="javascript:$('#wdcgd_lc_m_dialog').dialog('close')">关闭</div>
	</div>

</body>
</html>