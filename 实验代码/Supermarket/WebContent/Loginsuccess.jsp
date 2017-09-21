<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>超市管理系统</title>
<style type="text/css">
body,td,th {
	font-size: larger;
}
body {
	background-image: url(images/注册背景.jpg);
}
</style>
</head>
<body>
<h2 style="color:lightblue" align=center>欢迎进入超市管理系统</h2>
<h4 style="color:sliver" align=center>功能表</h4>

<center>
	<table border="0" >
	
		<form action="add.jsp">
		
			<input type="submit" value="添加商品" style="color:black">
		
		</form>
		</table>
		
			<br>
			
		<table border="0" >
	
		<form action="delete.jsp">
		
			<input type="submit" value="删除商品" style="color:blackF">
		
		</form>
		</table>
			<br>
			
			
		<table border="0" >
	
		<form action="change.jsp">
		
			<input type="submit" value="修改信息" style="color:blackF">
		
		</form>
		</table>
		<br>
		<table border="0" >
	
		<form action="search.jsp">
		
			<input type="submit" value="查询商品" style="color:black">
		
		</form>
		</table>
		<br>
		<table border="0" >
	
		
		</table>
	
	</table>
	</center>
		
</body>
</html>