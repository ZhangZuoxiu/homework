<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>SearchCheck</title>
</head>
<body>
<jsp:useBean id="db" class="javaBean.DBean" scope="page" />

<table border="0">
	<tr>
			<th>商品编号</th>
			<th>商品名称</th>
			<th>描述</th>
			<th>放置地点</th>
			<th>成本价</th>
			<th>售价</th>
			<th>数量</th>
		</tr>

<%
	String selectcondition = request.getParameter("selectcondition");
	String search=(String)request.getParameter("search");
	if(selectcondition.equals("0"))
	{
		String s0="select * from commodity where no='"+search+"'";
		ResultSet rs0 = db.executeQuery(s0);
		while(rs0.next())
		{
			out.println("<tr><td>" + rs0.getString(1) +
					"</td><td>" + rs0.getString(2) + 
					"</td><td>" + rs0.getString(3) + 
					"</td><td>" + rs0.getString(4) + 
					"</td><td>" + rs0.getString(5) +
					"</td><td>" + rs0.getString(6) +
					"</td><td>" + rs0.getString(7) +
					"</td></tr>");
		}
	}
	if(selectcondition.equals("1"))
	{
		String s1="select * from commodity where name='"+search+"'";
		ResultSet rs1 = db.executeQuery(s1);
		while(rs1.next())
		{
			out.println("<tr><td>" + rs1.getString(1) +
					"</td><td>" + rs1.getString(2) + 
					"</td><td>" + rs1.getString(3) + 
					"</td><td>" + rs1.getString(4) + 
					"</td><td>" + rs1.getString(5) +
					"</td><td>" + rs1.getString(6) +
					"</td><td>" + rs1.getString(7) +
					"</td></tr>");
		}
	}
	db.close();
%>
	<input type="button" name="return" value="返回" onclick="javascript:window.location='http://localhost:8080/Supermarket/shangping.jsp';" />
</body>
</html>