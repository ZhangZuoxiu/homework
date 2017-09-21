<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询结果</title>
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
<h2 style="color:lightblue" align=center>查询结果页面</h2>
<jsp:useBean id="db" class="Bean.DBBean" scope="page" />

<table border="0" align=center>
	<tr>
			<td style="color:red">商品编号  </td>
			<td style="color:red">商品名称  </td>
			<td style="color:red">商品进价 </td>
			<td style="color:red">商品售价  </td>
			<td style="color:red">商品数量  </td></tr>
		
			
	

<%
String selectcondition = request.getParameter("selectcondition");
String search=(String)request.getParameter("search");

	String s0="select * from shangpin where gno='"+search+"'";
	ResultSet rs0 = db.executeQuery(s0);
	while(rs0.next())
	{
		out.println("<td>" + rs0.getString(1) +
				"</td><td>  " + rs0.getString(2) + 
				"</td><td>  " + rs0.getString(3) + 
				"</td>><td>  " + rs0.getString(4) + 
				"</td><td>  " + rs0.getString(5) +
				"</td>" );
	}
%>
	</table>
<form action="Loginsuccess.jsp" align=center>
	<input type="submit" value="返回主页" style="color:#BC8F8F">
	</form>
	</center>
</body>
</html>