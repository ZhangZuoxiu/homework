<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品信息</title>
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
<h2 style="color:lightblue" align=center>查询商品功能页</h2>
<center>
	<form action="searchgoods.jsp">
		<table>
			<tr align="center">
        		<td colspan="2" class="title_td" align="center">
 
        			<input type="hidden" name="state" value="0" />
         	    </td>
			<tr>
			
			<tr>
			<td>
					<input type="text" name="search">
				</td>
				<td>
				请输入商品编号
				</td>
			
				
			</tr>
		</table>
				<input type="submit" value="查询" style="color:#5F9EA0">		
	</form>
</center>		
</body>
</html>