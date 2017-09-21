<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>原材区指南</title>
</head>
<body>
<h1 style="color:#4682B4 ">欢迎来到原材区</h1>
<jsp:useBean id="db" class="javaBean.DBean" scope="page" />
<h3 style="color:#4682B4 ">原材区</h3>
	<%
		String sql1="select * from commodity where place= '原材区'";
		ResultSet rs1=db.executeQuery(sql1);
		while(rs1.next())
		{
			String no= rs1.getString(1);
			String name = rs1.getString(2);
			String detail = rs1.getString(3);
			out.println(name+"<tr><td>"+detail+"\n");
		} 

		rs1.close();
		db.close();
	%>
	
</body>
</html>