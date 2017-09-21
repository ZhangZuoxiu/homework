<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="db" class="javaBean.DBean" scope="page" />
<%
	String productNo=(String)request.getParameter("productNo");
	String sql="delete from commodity where no="+productNo;
	out.println(sql);
	int i = db.executeUpdate(sql);
	if(i == 1)
	{
		out.println("<script language='javaScript'> alert('删除成功,跳转至商品管理系统');</script>");
		response.setHeader("refresh", "0;url=shangping.jsp");
	}
	else
	{
		out.println("<script language='javaScript'> alert('删除失败');</script>");
		response.setHeader("refresh", "0;url=shanchu.jsp");
	}
%>
</body>
</html>