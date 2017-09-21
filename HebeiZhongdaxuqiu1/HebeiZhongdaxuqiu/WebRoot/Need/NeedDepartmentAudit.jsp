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
    
    <title>部门审核的页面</title>
    
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
  
  <body>

  <body>
  <h2 align="center">部门审核</h2>
  	<table border="1" align="center" cellspacing="0">
		<tr>
		<td width="150" align="center">序号</td>
		<td width="150" align="center">技术需求名称</td>
		<td width="150" align="center">关键字</td>
		<td width="150" align="center">科技活动类型</td>
		<td width="150" align="center">计划总投资</td>
		<td width="150" align="center">编辑</td>
	</tr>
	<s:iterator value="needs">
	<tr>
	<td><s:property value="WJID"/></td>
		<td><s:property value="JSXQMC"/></td>
		<td><s:property value="GJZ"/></td>
		<td><s:property value="KJHDLX"/></td>
		<td><s:property value="JHZTZ"/></td>
		<td><a href="needDepartmentAudit?need.WJID=<s:property value="WJID"/>">审核</a></td>
		
	</tr>
	</s:iterator>
	</table>

  </body>
</html>
