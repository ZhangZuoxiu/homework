<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录验证</title>
</head>
<body>
	<%
		String username=(String)request.getParameter("username");
		String password=(String)request.getParameter("password");
//		System.out.println("username:"+username);
//		System.out.println("password:"+password);
		
		%>
		<jsp:useBean id="db1" class="Bean.DBBean" scope="page" />
		
		<%
			String sql="select * from login1 where username="+"'"+username+"'";
			ResultSet rs=db1.executeQuery(sql);
			if(rs.next()){
//				System.out.p rintln(rs.getString("password"));
//				System.out.print(password);
//				System.out.print(password.equals(rs.getObject("password")));
			    if(password.equals(rs.getObject("password"))){
			    	response.sendRedirect("Loginsuccess.jsp");
//			    	response.setHeader("refresh", "1;url=loginsuccss.jsp");
			    }
			    else{
			    	out.print("<script language='javaScript'> alert('密码错误');</script>");
			    	response.setHeader("refresh", "1;url=Login.jsp");
			    }
			}
			else{
				response.sendRedirect("Zhuce.jsp");
			}
			rs.close();
			db1.close();
		%>
</body>

</body>
</html>