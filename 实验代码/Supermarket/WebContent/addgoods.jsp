<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加审核</title>
</head>
<body>
<jsp:useBean id="db" class="Bean.DBBean" scope="page" />
	<%
		String gno =(String)request.getParameter("gno");
		String gname =(String)request.getParameter("gname");
		String gprise1 =(String)request.getParameter("gprise1");
		String gprise2 =(String)request.getParameter("gprise2");
		String gnum =(String)request.getParameter("gnum");
		
		
		
		
		
		String s ="Select * From shangpin";
		ResultSet rs = db.executeQuery(s);
		boolean exist = true;
		while(rs.next())
		{
			if(gno.equals(rs.getString(1)))
			{
				exist = false;
				out.println("<script language='javaScript'> alert('商品代码已存在，点击确定回到新增商品页面。');</script>");
				response.setHeader("refresh", "1;url=add.jsp");
			}
		}
		if(exist)
		{
			
			String InsertSQL = "Insert Into shangpin Values('" + gno + "','" + gname + "','" + gprise1 + "','" + gprise2+ "','" + gnum + "')";
			int i = db.executeUpdate(InsertSQL);
			if (i == 1)
			{
				out.println("<script language='javaScript'> alert('新增商品成功，点击确定返回商品管理系统。');</script>");
				response.setHeader("refresh", "1;url=Loginsuccess.jsp");
			}		
		}
		db.close();
		
	%>	
</body>
</html>