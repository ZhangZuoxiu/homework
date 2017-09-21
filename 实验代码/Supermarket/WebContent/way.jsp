<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>显示路径</title>
</head>
<body>
<input type="button" name="returnindex" value="返回主页" onclick="javascript:window.location='http://localhost:8080/Supermarket/index.jsp';" />
<input type="button" name="returnsearch" value="返回上层" onclick="javascript:window.location='http://localhost:8080/Supermarket/SearchWay.jsp';" />
<%
		String a=(String)request.getParameter("出发地");
		String b=(String)request.getParameter("目的地");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
%>
	
</body>
</html>