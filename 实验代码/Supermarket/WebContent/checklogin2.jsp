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
		<jsp:useBean id="db" class="javaBean.DBean" scope="page" />
		
		<%
			String sql="select * from manager where mname="+"'"+username+"'";
			ResultSet rs=db.executeQuery(sql);
			if(rs.next()){
//				System.out.p rintln(rs.getString("password"));
//				System.out.print(password);
//				System.out.print(password.equals(rs.getObject("password")));
			    if(password.equals(rs.getObject("mpassword"))){
			    	response.sendRedirect("shangping.jsp");
//			    	response.setHeader("refresh", "1;url=loginsuccss.jsp");
			    }
			    else{
			    	out.print("<script language='javaScript'> alert('密码错误');</script>");
			    	response.setHeader("refresh", "1;url=login2.jsp");
			    }
			}
			else{
				response.sendRedirect("Lead.jsp");
			}
			rs.close();
			db.close();
		%>
</body>

</body>
</html>