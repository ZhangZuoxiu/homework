<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品信息</title>
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
<h2 style="color:lightblue" align=center>修改商品功能页</h2>
<center>
	<form action="changecheck.jsp">
		<table>
			<tr align="center">
        		<td colspan="2" class="title_td" align="center">
        		
        			<input type="hidden" name="state" value="0" />
         	    </td>
			<tr>
			
			<tr>
				<td>输入编号</td>
			<td>
				<input type="text" name="changeno">
			</td>
			</tr>
				
		</table>
				
		<table>
			<td>
				<input type="submit" value="确定" style="color:#5F9EA0">
			</td>	
		</form>
		
		<form action="Loginsuccess.jsp">
		
			<td>
				<input type="submit" value="返回" style="color:#5F9EA0">
			</td>
		</form>
	</table>
	</center>
</body>
</html>