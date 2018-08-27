<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<script type="text/javascript" src="inc/js/ext.js"></script>


<link rel="stylesheet" href="./inc/dist/bootstrap.min.css">

<script src="./inc/dist/bootstrap.min.js"></script>
<script src="./inc/dist/js/bootstrap.min.js"></script>

<!-- <script src="./inc/dist/js/bootstrapValidator.min.js"></script>
<link href="./inc/dist/css/bootstrapValidator.min.css" rel="stylesheet" />
 -->


<script type="text/javascript">
	var user = $.extend({}, user);/* 全局对象 */
	user.flag = 0;

	$(function() {

		$('#formaa').form('load', {
			NAME : '${sessionScope.username.NAME}',
			ACC : '${sessionScope.username.ACC}',
			QQ : '${sessionScope.username.QQ}',
			PWD : '${sessionScope.username.PWD}',
			WECHAT : '${sessionScope.username.WECHAT}',
			ACCID : '${sessionScope.username.ACCID}',
			HP : '${sessionScope.username.HP}',
			TEL : '${sessionScope.username.TEL}',
			EMAIL : '${sessionScope.username.EMAIL}'

		});
		
		
		$('#formab').form('load', {
			PMC01 : '${sessionScope.company.PMC01}', 
			PMC03 : '${sessionScope.company.PMC03}', 
			PMC081 : '${sessionScope.company.PMC081}', 
			PMC091 : '${sessionScope.company.PMC091}', 
			PMC10 : '${sessionScope.company.PMC10}' 
 
		});
		
		
		  

		$('#e1').unbind('click').click(function() {
			edit();

		});

		$('#s1').unbind('click').click(function() {
			save();
			$("form input").attr("readonly", "readonly");

 	});

	});

	function edit() {
		//console.info($("form input"));
		$("form input").not("#NAME").not("#ACC").not("#PWD")
		.not("#PMC01")
		.not("#PMC03")
		.not("#PMC081")
		.not("#PMC091")
		.not("#PMC10")
		.removeAttr( "readonly");
		 
		
		$('#PWD').unbind('dblclick').dblclick(function() {

			$("#PWD").removeAttr("readonly");
			user.flag = 1;
		});

		user.flag = 1;

	}

	function save() {

		 

		if (user.flag == 0) {
			return;
		}

		$.ajax({
			   type: "POST",
			   timeout : 10000,             //超时时间设置，单位毫秒       1000ms=1s
			  dataType:'json',				//返回的数据格式
              data:  serializeObject($('#formaa'))  ,
			    url : "${pageContext.request.contextPath}/users/saveuser2",
			    complete: function(XMLHttpRequest,status){
			    	 if(status=='timeout')                //超时,status还有success,error等值的情况
			    	 {
			          	$.messager.progress('close');
			          	$.messager.alert('警告','请求超时','error'); 
			          
			    	 } },
			   success: function(data){
						  
				if (data.code == 100) {

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
			   }
		   }
     );
		
		 
		user.flag = 0;

	}
	
	
	
	serializeObject=  function (form){
		var o ={};
		$.each(form.serializeArray(),function(index){
		if(o[this['name']]){
		o[this['name']] = o[this['name']] +","+this['value'];
		}else{
		o[this['name']] = this['value'];
		}
		});
		return o;
		} ;
</script>


<title>用户信息维护</title>

</head>
<body>


	<ul id="myTab" class="nav nav-tabs">
		<li class="active"><a href="#userdetail" data-toggle="tab">
				用户明细 </a></li>
		<li><a href="#moredetail" data-toggle="tab">更多资料</a></li>
	</ul>









	<div id="myTabContent" class="tab-content">
		<div class="tab-pane fade in active" id="userdetail"
			style="padding: 50px">


			<form id="formaa" class="form-horizontal" role="form" method="POST">
				<div class="form-group">
					<label for="NAME" class="col-lg-3 control-label">姓名</label>
					<div class="col-lg-5">
						<input type="text" class="form-control" id="NAME" name="NAME"
							readonly="readonly">
					</div>
				</div>
				<div class="form-group">
					<label for="ACC" class="col-lg-3 control-label">帐户</label>
					<div class="col-lg-5">
						<input type="text" class="form-control" id="ACC" name="ACC"
							readonly="readonly" autocomplete="off">
					</div>
				</div>


				<div class="form-group">
					<label class="col-lg-3 control-label">密码</label>
					<div class="col-lg-5">
						<input type="password" readonly="readonly" class="form-control"
							id="PWD" name="PWD">

					</div>
				</div>


				<div class="form-group">
					<label class="col-lg-3 control-label">Email</label>
					<div class="col-lg-5">
						<input type="email" readonly="readonly" class="form-control"
							id="EMAIL" name="EMAIL">
					</div>
				</div>
				<div class="form-group">
					<label for="TEL" class="col-lg-3 control-label">座机</label>
					<div class="col-lg-5">
						<input type="text" readonly="readonly" class="form-control"
							id="TEL" name="TEL">
					</div>
				</div>
				<div class="form-group">
					<label for="HP" class="col-lg-3 control-label">手机号码</label>
					<div class="col-lg-5">
						<input type="text" readonly="readonly" class="form-control"
							id="HP" name="HP">
					</div>
				</div>
				<div class="form-group">
					<label for="WECHAT" class="col-lg-3 control-label">微信号</label>
					<div class="col-lg-5">
						<input type="text" readonly="readonly" class="form-control"
							id="WECHAT" name="WECHAT">
					</div>
				</div>

				<div class="form-group">
					<label for="QQ" class="col-lg-3 control-label">QQ</label>
					<div class="col-lg-5">
						<input type="text" readonly="readonly" class="form-control"
							id="QQ" name="QQ">
					</div>
				</div>
				<div class="form-group">
					<div class="col-lg-9 col-lg-offset-3">
						<div id="e1" class="btn btn-default">修改</div>
						<div id="s1" class="btn btn-default">保存</div>
					</div>
				</div>
				<input type="hidden" id="ACCID" name="ACCID" />

			</form>









		</div>
		<div class="tab-pane fade" id="moredetail" style="padding: 50px">

			<form id="formab" class="form-horizontal" role="form" method="POST">
				<div class="form-group">
					<label for="PMC081" class="col-lg-3 control-label">公司名称</label>
					<div class="col-lg-5">
						<input type="text" class="form-control" id="PMC081" name="PMC081"
							readonly="readonly">
					</div>
				</div>
				<div class="form-group">
					<label for="PMC03" class="col-lg-3 control-label">公司简称</label>
					<div class="col-lg-5">
						<input type="text" class="form-control" id="PMC03" name="PMC03"
							readonly="readonly">
					</div>
				</div>
				<div class="form-group">
					<label for="PMC01" class="col-lg-3 control-label">公司代码</label>
					<div class="col-lg-5">
						<input type="text" class="form-control" id="PMC01" name="PMC01"
							readonly="readonly">
					</div>
				</div>
				<div class="form-group">
					<label for="PMC091" class="col-lg-3 control-label">地址</label>
					<div class="col-lg-5">
						<input type="text" class="form-control" id="PMC091" name="PMC091"
							readonly="readonly">
					</div>
				</div>
				<div class="form-group">
					<label for="NAME" class="col-lg-3 control-label">联系电话</label>
					<div class="col-lg-5">
						<input type="text" class="form-control" id=PMC10 name="PMC10"
							readonly="readonly">
					</div>
				</div>


			</form>
		</div>

	</div>




</body>
</html>