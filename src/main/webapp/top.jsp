<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>top</title>
<link href="inc/css/main.css" rel="stylesheet" type="text/css" />
<script src="./inc/easyui1.5/jquery.min.js" charset="UTF-8"
	type="text/javascript"></script>
<!--gray  --> 
<script type="text/javascript" src="inc/js/eps.js"></script>

</head>

<body>
	<div id="top">
		<div id="logo">
			<span style="position: absolute; top: 10px; right: 10px;">登录用户:<span>${sessionScope.username.NAME}

			</span> <a href="logout" target="_top">退出</a></span>
		</div>
	</div>
</body>
</html>
