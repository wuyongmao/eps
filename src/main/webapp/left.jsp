<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<jsp:include page="inc/meta.jsp"></jsp:include>
<jsp:include page="inc/easyui.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>left</title>
<link href="inc/css/main.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="inc/js/eps.js"></script>


<script type="text/javascript">
	$(function() {
		// eps.node();
		
		$('#treenode').tree({
		   url:'users/getnode?ROLE=${sessionScope.username.ROLE}',
			
			onClick : function(node) {
				 
				eps.nodeclick();
			}
		}); 
		  
 	});
 
	</script>
</head>
<body>
	<div id="left"></div>
	<div id="left_menu"></div>
	<div id="left_tree">
		<div id="tree_text">

			<ul id="treenode"></ul>


			<!-- <li class="tree_li" href="rightsmanager.jsp"><span class="list_img"><img src="inc/img/list_img.gif" /></span>权限管理 </li> -->
		</div>
	</div>
	<div id="tree_down"></div>





</body>
</html>
