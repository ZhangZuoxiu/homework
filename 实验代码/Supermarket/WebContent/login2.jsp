<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登陆</title>
</head>
<body>
<center>
		<h1 style="color:#2F4F4F">管理员登录</h1>	
			<span style="display:inline-block;">
				<form id="indexform" name="indexForm" action="checklogin2.jsp" method="post">
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
					<input type="submit" value="登录" style="color:#5F9EA0">
				</form>
			</span>
			<span style="display:inline-block;">
			</span>
	</center>
</body>
</html>