<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<title>EPS系统</title>
<link rel="shortcut icon" href="./inc/img/tlog.png" type="image/x-icon" />

<script type="text/javascript" src="./inc/js/eps.js"></script>

<script type="text/javascript">
	var role = "${sessionScope.username.ROLE}" + "";
	eps.ROLE = role; 

	//alert(eps.ROLE+"===eps.role");
	//alert(aa);
</script>

</head>
<frameset rows="52,*" cols="*" frameborder="no" border="0"
	framespacing="0">
	<frame src="top.jsp" name="topFrame" scrolling="No" noresize="noresize"
		id="topFrame" />

	<frameset rows="*" cols="188,*" framespacing="0" frameborder="no"
		border="0">
		<frame src="left.jsp" name="leftFrame" scrolling="No"
			noresize="noresize" id="leftFrame" />
		<frame src="right_top.html" id="top_right" name="positionFrame" />
	</frameset>
</frameset>
<noframes>
	<body>

	</body>
</noframes>
</html>