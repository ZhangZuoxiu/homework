<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>肉禽区指南</title>
</head>
<body>
<h1 style="color:#4682B4 ">欢迎来到肉禽区</h1>
<jsp:useBean id="db" class="javaBean.DBean" scope="page" />
<h3 style="color:#4682B4 ">肉禽区1</h3>
	<%
		String sql1="select * from commodity where place= '肉禽区1'";
		ResultSet rs1=db.executeQuery(sql1);
		while(rs1.next())
		{
			String no= rs1.getString(1);
			String name = rs1.getString(2);
			String detail = rs1.getString(3);
			out.println(name+"<tr><td>"+detail+"\n");
		} 

		rs1.close();
	%>
	
<h3 style="color:#4682B4 ">肉禽区2</h3>
	<%
		String sql2="select * from commodity where place= '肉禽区2'";
		ResultSet rs2=db.executeQuery(sql2);
		while(rs2.next())
		{
			String no2= rs2.getString(1);
			String name2 = rs2.getString(2);
			String detail2 = rs2.getString(3);
			out.println(name2+"<tr><td>"+detail2+"\n");
		} 

		rs2.close();
		db.close();
	%>
</body>
</html>