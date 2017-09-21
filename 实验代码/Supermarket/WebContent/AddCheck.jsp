<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>addcheck</title>
</head>
<body>
<jsp:useBean id="db" class="javaBean.DBean" scope="page" />
	<%
		String productNo =(String)request.getParameter("productNo");
		String productName =(String)request.getParameter("productName");
		String description =(String)request.getParameter("description");
		String place =(String)request.getParameter("place");
		String costprice =(String)request.getParameter("costprice");
		String unitprice =(String)request.getParameter("unitprice");
		String num =(String)request.getParameter("num");
		
		
		String s ="Select * From commodity";
		ResultSet rs = db.executeQuery(s);
		boolean exist = true;
		while(rs.next())
		{
			if(productNo.equals(rs.getString(1)))
			{
				exist = false;
				out.println("<script language='javaScript'> alert('商品代码已存在，点击确定回到新增商品页面。');</script>");
				response.setHeader("refresh", "1;url=Addc.jsp");
			}
		}
		if(exist)
		{
			
			String InsertSQL = "Insert Into commodity Values('" + productNo + "','" + productName + "','" + description + "','" + place + "','" + costprice + "','" + unitprice + "','" + num + "')";
			int i = db.executeUpdate(InsertSQL);
			if (i == 1)
			{
				out.println("<script language='javaScript'> alert('新增商品成功，点击确定返回商品管理系统。');</script>");
				response.setHeader("refresh", "1;url=shangping.jsp");
			}		
		}
		db.close();
		
	%>	
</body>
</html>