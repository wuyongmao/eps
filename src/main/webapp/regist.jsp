<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Cache-Control" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<title>注册页面</title>
<link rel="stylesheet" type="text/css"
	href="./inc/dist/css/bootstrap.min.css"></link>
<link href="./inc/dist/css/bootstrapValidator.min.css" rel="stylesheet" />
<script type="text/javascript" src="./inc/easyui1.5/jquery.min.js"></script>
<script type="text/javascript" src="./inc/jquery-placeholder.js"></script>
<script type="text/javascript" src="./inc/dist/bootstrap.min.js "></script>
<script src="./inc/dist/js/bootstrapValidator.min.js"></script>

<script type="text/javascript">
	$(function() {

		$('#form').bootstrapValidator({
			message : '这个值没有被验证',
			feedbackIcons : {
				valid : 'glyphicon glyphicon-ok',
				invalid : 'glyphicon glyphicon-remove',
				validating : 'glyphicon glyphicon-refresh'
			},
			fields : {
				ACC : {
					ssage : '用户名验证失败',
					validators : {
						notEmpty : {
							message : '账户不能为空'
						},
						remote : {//ajax验证。server result:{"valid",true or false} 向服务发送当前input name值，获得一个json数据。例表示正确：{"valid",true}  
							url : '/eps/users/checkACC',
							message : '用户已存在',//提示消息
							delay : 2000,//每输入一个字符，就发ajax请求，服务器压力还是太大，设置2秒发送一次ajax（默认输入一个字符，提交一次，服务器压力太大）
							type : 'POST',//请求方式
							data : function(validator) {
								return {
									ACC : $('#ACC').val(),
								};
							}

						}

					}
				},

				confirmPWD : {
					validators : {
						notEmpty : {
							message : '确认密码不能为空'
						},
						identical : {
							field : 'PWD',
							message : '两次密码输入不一致！'
						},
						different : {
							field : 'ACC',
							message : '密码不能与账户相同!'
						}
					}
				},
				PWD : {
					message : '用户名验证失败',
					validators : {
						notEmpty : {
							message : '密码不能为空'
						}
					}
				},
				NAME : {
					message : '用户名验证失败',
					validators : {
						notEmpty : {
							message : '姓名不能为空'
						}
					}
				},

				PMMUD02 : {
					message : '用户名验证失败',
					validators : {
						notEmpty : {
							message : '供应商代码不能为空'
						}
					}
				},

				EMAIL : {
					validators : {
						notEmpty : {
							message : '邮箱地址不能为空'
						}
					}
				}
			}
		}).on('success.form.bv', function(e) {
			// Prevent form submission
			e.preventDefault();
			// Get the form instance
			var $form = $(e.target);
			// Get the BootstrapValidator instance
			//var bv = $form.data('bootstrapValidator');
			// Use Ajax to submit form data
			$.post("users/adduser", $form.serialize(), function(data) {
				//   console.log(data)
				if (data.code == "100") {
					alert("注册成功，返回登录界面");
					window.location.href = "/eps/login.html";
				} else if (data.code == "200") {
					alert("注册失败");
					//  console.info(data);
					//  window.location.href = "/eps/regist.jsp";

				} else {
					alert("未知错误");
					window.location.href = "/eps/regist.jsp";

				}
			});
		});

	});
</script>


</head>
<body>
	<div class="page-header">
		<h2>用户注册</h2>
	</div>

	<form id="form" class="form-horizontal" action="" role="form"
		method="POST" autocomplete="off">
		<div class="form-group">
			<label for="NAME" class="col-lg-3 control-label">姓名</label>
			<div class="col-lg-5">
				<input type="text" class="form-control" id="NAME" name="NAME"
					placeholder="请输入姓名">
			</div>
		</div>
		<div class="form-group">
			<label for="ACC" class="col-lg-3 control-label">账户</label>
			<div class="col-lg-5">
				<input type="text" class="form-control" id="ACC" name="ACC"
					autocomplete="off" placeholder="请输入账户">
			</div>
		</div>


		<div class="form-group">
			<label class="col-lg-3 control-label">密码</label>
			<div class="col-lg-5">
				<input type="password" class="form-control" id="PWD" name="PWD"
					placeholder="请输入密码">
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-3 control-label">确认密码</label>
			<div class="col-lg-5">
				<input placeholder="确认密码" type="password" class="form-control"
					name="confirmPWD" />
			</div>
		</div>
		<div class="form-group">
			<label for="PMMUD02" class="col-lg-3 control-label">供应商代码</label>
			<div class="col-lg-5">
				<input type="text" class="form-control" id="PMMUD02" name="PMMUD02"
					placeholder="请输入供应商代号">
			</div>
		</div>
		<div class="form-group">
			<label class="col-lg-3 control-label">Email</label>
			<div class="col-lg-5">
				<input type="email" class="form-control" id="EMAIL" name="EMAIL"
					placeholder="请输入邮件地址">
			</div>
		</div>
		</div>
		<div class="form-group">
			<label for="TEL" class="col-lg-3 control-label">座机</label>
			<div class="col-lg-5">
				<input type="text" class="form-control" id="TEL" name="TEL"
					placeholder="请输入座机号码">
			</div>
		</div>
		</div>
		<div class="form-group">
			<label for="HP" class="col-lg-3 control-label">手机号码</label>
			<div class="col-lg-5">
				<input type="text" class="form-control" id="HP" name="HP"
					placeholder="请输入手机号码">
			</div>
		</div>
		</div>
		<div class="form-group">
			<label for="WECHAT" class="col-lg-3 control-label">微信号</label>
			<div class="col-lg-5">
				<input type="text" class="form-control" id="WECHAT" name="WECHAT"
					placeholder="请输入微信号">
			</div>
		</div>
		</div>
		</div>
		<div class="form-group">
			<label for="QQ" class="col-lg-3 control-label">QQ</label>
			<div class="col-lg-5">
				<input type="text" class="form-control" id="QQ" name="QQ"
					placeholder="请输入QQ">
			</div>
		</div>
		<div class="form-group">
			<div class="col-lg-9 col-lg-offset-3">
				<button type="submit" id="submit" class="btn btn-default">注册</button>
				<button type="reset" class="btn btn-default">重置</button>
				<a class="btn btn-default" href="login.html" role="button">返回登录</a>
			</div>
		</div>
	</form>

</body>
</html>