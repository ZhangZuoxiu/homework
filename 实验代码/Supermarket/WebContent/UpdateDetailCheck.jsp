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
<jsp:useBean id="db" class="javaBean.DBean" scope="page" />
<%

	String updateNo=(String)request.getParameter("updateNO");
	String productName =(String)request.getParameter("productName");
	String description=(String)request.getParameter("description");
	String place =(String)request.getParameter("place");
	String costprice =(String)request.getParameter("costprice");
	String unitprice =(String)request.getParameter("unitprice");
	String num =(String)request.getParameter("num");
	
	
	String s1="update commodity set name ='"+productName+"' where no='"+updateNo+"'";
	String s2="update commodity set detail ='"+description+"' where no='"+updateNo+"'";
	String s3="update commodity set place ='"+place+"' where no='"+updateNo+"'";
	String s4="update commodity set costprice ='"+costprice+"' where no='"+updateNo+"'";
	String s5="update commodity set unitprice ='"+unitprice+"' where no='"+updateNo+"'";
	String s6="update commodity set num ='"+num+"' where no='"+updateNo+"'";
	
	//System.out.println(s1);
	int i1 = db.executeUpdate(s1);
	int i2 = db.executeUpdate(s2);
	int i3 = db.executeUpdate(s3);
	int i4 = db.executeUpdate(s4);
	int i5 = db.executeUpdate(s5);
	int i6 = db.executeUpdate(s6);
	
	if((i1==1)&&(i2==1)&&(i3==1)&&(i4==1)&&(i5==1)&&(i6==1))
	{
		out.println("<script language='javaScript'> alert('修改成功');</script>");
		response.setHeader("refresh", "0;url=shangping.jsp");
	}
	else
	{
		out.println("<script language='javaScript'> alert('修改失败');</script>");
		response.setHeader("refresh", "0;url=Updatec.jsp");
	}
	db.close();
%>

</body>
</html>