<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>形式审核界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
table {
	width: 80%;
	border-color: #e9e6e7;
}

table tr:nth-child(odd) {
	background: #e9e6e7;
}

table tr:nth-child(even) {
	background: white;
}
</style>
  </head>
  <s:debug></s:debug>
  <body>
  <center><caption>形式审核</caption></center>
  	<table border="1" align="center" cellspacing="0">
	<tr>
		<th>序号</th>
		<th>技术需求名称</th>
		<th>关键字</th>
		<th>科技活动类型</th>
		<th>计划总投资</th>
		<th>编辑</th>
	</tr>
	<s:iterator value="needs">
	<tr>
	<td><s:property value="WJID"/></td>
		<td><s:property value="JSXQMC"/></td>
		<td><s:property value="GJZ"/></td>
		<td><s:property value="KJHDLX"/></td>
		<td><s:property value="JHZTZ"/></td>
		<td><a href="needModeAudit?need.WJID=<s:property value="WJID"/>">审核</a></td>
		
	</tr>
	</s:iterator>
	</table>

  </body>
</html>
