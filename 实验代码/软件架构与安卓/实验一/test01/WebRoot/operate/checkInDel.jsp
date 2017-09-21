<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'checkInDel.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <%	String houseId=(String)request.getParameter("houseId");
  	    int housePrice=Integer.parseInt((String)request.getParameter("housePrice").trim());
    	int houseDiscount=Integer.parseInt((String)request.getParameter("houseDiscount").trim());
    	int houseDeposit=Integer.parseInt((String)request.getParameter("houseDeposit").trim());
    	int pay=housePrice*houseDiscount/10+houseDeposit;
    	session.setAttribute("houseId", houseId);
    	System.out.println(houseId);
   %>
    <h2 align="center">入住登记</h2>
    <form action="checkInDelServlet" method="post">
    <table align="center" border="1" cellspacing="0">
    	<tr>
    		<td>入住人姓名</td>
    		<td><input type="text" size="20" name="name"></td>
    	</tr>
    	<tr>
    		<td>身份证号</td>
    		<td><input type="text" size="20" name="idnumber"></td>
    	</tr>
    	<tr>
    		<td>房费（元）</td><td><%=housePrice*houseDiscount/10 %></td>
    	</tr>
    	<tr>
    		<td>押金(元)</td><td><%=houseDeposit %></td>
    	</tr>
    	<tr>
    		<td>付款总额(元)</td><td><input type="text" size="20" name="pay" value="<%=pay %>" readonly="readonly"></td>
    	</tr>
    </table>
    <div align="center"><input type="submit" value="确定"></div>
    </form>
  </body>
</html>
