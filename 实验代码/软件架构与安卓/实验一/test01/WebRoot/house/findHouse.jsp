<%@ page language="java" import="java.util.*" import="bean.House" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'findHouse.jsp' starting page</title>
    
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
  <h2 align="center">查看客房信息</h2>
    <%
    	List<House> list=(List<House>)request.getAttribute("list");
    	System.out.println("123:"+list);
     %>
     <table border="1" cellspacing="0" align="center">
     	<tr>
     		<td>房间号</td><td>房间状态</td><td>房价</td><td>折扣</td><td>押金</td><td align="center">操作</td>
		</tr>
		<%
			for(House house : list)
			{
		%>
		<tr>
     		<td><%=house.getHouseId() %></td><td><%=house.getHouseState() %></td>
     		<td><%=house.getHousePrice() %></td><td><%=house.getHouseDiscount() %></td>
     		<td><%=house.getHouseDeposit() %></td><td><a href="house/updateHouse.jsp?houseId=<%=house.getHouseId() %>
     		&housePrice=<%=house.getHousePrice() %>&houseDiscount=<%=house.getHouseDiscount()%>
     		&houseDeposit=<%=house.getHouseDeposit() %>">修改 </a><a href="deleteHouseServlet?houseId=<%=house.getHouseId() %>">删除</a></td>
		</tr>
		<%		
			}
		 %>
     </table>
  </body>
</html>
	