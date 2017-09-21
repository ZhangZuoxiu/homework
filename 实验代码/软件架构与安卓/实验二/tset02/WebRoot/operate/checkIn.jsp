<%@ page language="java" import="java.util.*" import="com.bean.House" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'readyCheckIn.jsp' starting page</title>
    
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
     <h2 align="center">可用客房信息</h2>
    <%
    	List<House> list=(List<House>)request.getAttribute("list");
     %>
     <table border="1" cellspacing="0" align="center">
     	<tr>
     		<td>房间号</td><td>房间状态</td><td>房价</td><td>折扣</td><td>押金</td><td align="center">操作</td>
		</tr>
		<%
			for(House house : list)
			{
			System.out.println(house.getHouseState().replaceAll(" ", ""));
				if(house.getHouseState().replaceAll(" ", "").equals("未入住"))
				{
		%>
		<tr>
     		<td><%=house.getHouseId() %></td><td><%=house.getHouseState() %></td>
     		<td><%=house.getHousePrice() %></td><td><%=house.getHouseDiscount() %></td>
     		<td><%=house.getHouseDeposit() %></td><td><a href="operate/checkInDel.jsp?houseId=<%=house.getHouseId() %>
     		&housePrice=<%=house.getHousePrice() %>&houseDiscount=<%=house.getHouseDiscount()%>
     		&houseDeposit=<%=house.getHouseDeposit() %>">入住 </a></td>
		</tr>
		<%		}
			}
		 %>
     </table>
  </body>
</html>
