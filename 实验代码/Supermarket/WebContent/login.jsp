<%@ page import="java.sql.*" language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录界面</title>
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
		<h1 style="color:lightblue">欢迎进入超市管理系统</h1>	
			<form id="indexform" name="indexForm" action="Logincheck.jsp" method="post">
				<table border="0">
					<tr>
						<td>用户名：</td>
						<td><input type="text" name="username"></td>
					</tr>
					<tr>
						<td>密码：</td>
						<td><input type="password" name="password">
						</td>
					</tr>
				</table>
			<br>
				<input type="submit" value="登录" style="color:lightblue">
			</form>
			<form action="Zhuce.jsp">
				<input type="submit" value="注册" style="color:lightblue">
			</form>
	</center>
</body>
</html>