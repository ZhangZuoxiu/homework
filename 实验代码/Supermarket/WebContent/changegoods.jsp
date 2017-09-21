<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>UpdateDetailCheck</title>
</head>
<body>
<jsp:useBean id="db" class="Bean.DBBean" scope="page" />
<%

String gno =(String)request.getParameter("gno");
String gname=(String)request.getParameter("gname1");
String gprise1 =(String)request.getParameter("gprise1");
String gprise2 =(String)request.getParameter("gprise2");
String gnum =(String)request.getParameter("gnum");
String changeno =(String)request.getParameter("changeno");
	
	
	String s1="update shangpin set gname ='"+gname+"' where gno='"+changeno+"'";
	String s2="update shangpin set gprise1 ='"+gprise1+"' where gno='"+changeno+"'";
	String s3="update shangpin set gprise2 ='"+gprise2+"' where gno='"+changeno+"'";
	String s4="update shangpin set gnum ='"+gnum+"' where gno='"+changeno+"'";
	
	//System.out.println(s1);
	int i1 = db.executeUpdate(s1);
	int i2 = db.executeUpdate(s2);
	int i3 = db.executeUpdate(s3);
	int i4 = db.executeUpdate(s4);
	
	
	if((i1==1)&&(i2==1)&&(i3==1)&&(i4==1))
	{
		out.println("<script language='javaScript'> alert('修改成功');</script>");
		response.setHeader("refresh", "0;url=Loginsuccess.jsp");
	}
	else
	{
		out.println("<script language='javaScript'> alert('修改失败');</script>");
		response.setHeader("refresh", "0;url=change.jsp");
	}
	db.close();
%>

</body>
</html>