<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加用户</title>
</head>
<body>

	<jsp:useBean id="db1" class="Bean.DBBean" scope="page" />
	<%
		String username=(String)request.getParameter("username");
		String password=(String)request.getParameter("password");
		String password02=(String)request.getParameter("password02");


		String s ="Select * From login1";
		ResultSet rs = db1.executeQuery(s);
		boolean exist = true;
		while(rs.next())
		{
			if(username.equals(rs.getString(1)))
			{
				exist = false;
				out.println("<script language='javaScript'> alert('用户名已存在，点击确定回到注册页面。');</script>");
				response.setHeader("refresh", "1;url=Zhuce.jsp");
			}
		}
		if(exist)
		{
			if(password.equals(""))
			{
				out.println("<script language='javaScript'> alert('密码为空，请重新填写。');</script>");
				response.setHeader("refresh", "1;url=Zhuce.jsp");
			}
			else
			{
				if(password.equals(password02))
				{
					String InsertSQL = "Insert Into login1 Values('" + username + "','" + password + "')";
					int i = db1.executeUpdate(InsertSQL);
					if (i == 1)
					{
						out.println("<script language='javaScript'> alert('注册成功，点击确定回到登陆页面。');</script>");
						response.setHeader("refresh", "1;url=Login.jsp");
					}
				}
				else
				{
					out.println("<script language='javaScript'> alert('密码不一致，请重新填写。');</script>");
					response.setHeader("refresh", "1;url=Zhuce.jsp");
				}
				
				
			}
		}
		db1.close();
		
	%>		
</body>
</html>