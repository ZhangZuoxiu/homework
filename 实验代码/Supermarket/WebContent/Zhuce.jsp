<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册页面</title>
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
	<center>
		<h1 style="color:lightblue">注册新用户</h1>
		<form action="Adduser.jsp"  method=post>
		<table border="0">
			<tr>
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="username" ></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="password" >
					</td>
				</tr>
				<tr>
					<td>确认密码：</td>
					<td><input type="password" name="password02" >
					</td>
				</tr>
			</table>
	
			<br>
				<td>
				<input type="submit" value="注册" style="color:#BC8F8F">
				</td>
		</form>
	</center>
</body>
</html>