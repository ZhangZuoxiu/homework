<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>UpdateCheck</title>
</head>
<body>
<jsp:useBean id="db" class="javaBean.DBean" scope="page" />
<table>
	<tr>
			<td>
				请确认信息：
			</td>
		</tr>
</table>
<table border="0.1">
		
		
		<tr>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>描述</td>
			<td>放置地点</td>
			<td>成本价</td>
			<td>售价</td>
			<td>数量</td>
		</tr>
</table>	


<%
	String updateNO=(String)request.getParameter("updateNO");
	String sql="select * from commodity where no='"+updateNO+"'";
	ResultSet rs = db.executeQuery(sql);
	if(rs.next())
	{
		out.println("<tr><td>" + rs.getString(1) +
				"</td><td>" + rs.getString(2) + 
				"</td><td>" + rs.getString(3) + 
				"</td><td>" + rs.getString(4) + 
				"</td><td>" + rs.getString(5) +
				"</td><td>" + rs.getString(6) +
				"</td><td>" + rs.getString(7) +
				"</td></tr>");
	}
	else
	{
		out.println("<script language='javaScript'> alert('商品编号错误');</script>");
		response.setHeader("refresh", "0;url=xiugai.jsp");
	}
	%>
	<p>
	
	
	</p>
	<form action="UpdatecDetail.jsp" >
	<input type="hidden" name = "updateNO" value =<%= updateNO%>>
		<input type="submit" name="sure" value="确定" >
	</form>
</body>
</html>