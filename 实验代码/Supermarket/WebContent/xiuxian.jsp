<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>休闲食品区指南</title>
</head>
<body>
<h1 style="color:#4682B4 ">欢迎来到休闲食品区</h1>
<jsp:useBean id="db" class="javaBean.DBean" scope="page" />
<h3 style="color:#4682B4 ">休闲食品区1</h3>
	<%
		String sql1="select * from commodity where place= '休闲食品1'";
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
	
<h3 style="color:#4682B4 ">休闲食品区2</h3>
	<%
		String sql2="select * from commodity where place= '休闲食品2'";
		ResultSet rs2=db.executeQuery(sql2);
		while(rs2.next())
		{
			String no2= rs2.getString(1);
			String name2 = rs2.getString(2);
			String detail2 = rs2.getString(3);
			out.println(name2+"<tr><td>"+detail2+"\n");
		} 

		rs2.close();
	%>
	
<h3 style="color:#4682B4 ">休闲食品区3</h3>
	<%
		String sql3="select * from commodity where place= '休闲食品3'";
		ResultSet rs3=db.executeQuery(sql3);
		while(rs3.next())
		{
			String no3= rs3.getString(1);
			String name3 = rs3.getString(2);
			String detail3 = rs3.getString(3);
			out.println(name3+"<tr><td>"+detail3+"\n");
		} 

		rs3.close();
	%>
	
	
<h3 style="color:#4682B4 ">休闲食品区4</h3>
	<%
		String sql4="select * from commodity where place= '休闲食品4'";
		ResultSet rs4=db.executeQuery(sql4);
		while(rs4.next())
		{
			String no4= rs4.getString(1);
			String name4 = rs4.getString(2);
			String detail4 = rs4.getString(3);
			out.println(name4+"<tr><td>"+detail4+"\n");
		} 

		rs4.close();
		db.close();
	%>
</body>
</html>