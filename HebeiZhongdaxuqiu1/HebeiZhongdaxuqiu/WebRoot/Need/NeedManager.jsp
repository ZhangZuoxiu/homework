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
    
    <title>需求管理界面</title>
    
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
  	<h2 align="center">需求管理</h2>
  	<table border="1" align="center" cellspacing="0">
	<tr>
		<td width="150" align="center">序号</td>
		<td width="150" align="center">技术需求名称</td>
		<td width="150" align="center">关键字</td>
		<td width="150" align="center">科技活动类型</td>
		<td width="150" align="center">审核状态</td>
		<td width="150" align="center">编辑</td>
	</tr>
	<s:iterator value="needs">
	<tr>
		<td><s:property value="WJID"/></td>
		<td><s:property value="JSXQMC"/></td>
		<td><s:property value="GJZ"/></td>
		<td><s:property value="KJHDLX"/></td>

		<s:if test="XSSFSH=='0'.toString()">
		<td>未审核</td>
		<td><a href="needUpdateLoad?need.WJID=<s:property value="WJID"/>">编辑</a> <a href="needDelete?need.WJID=<s:property value="WJID"/>"">删除</a></td>
		</s:if>
		<s:if test="XSSFSH=='1'.toString()">
			<s:if test="BMSFSH=='0'.toString()">
				<td>未进行部门审核</td>
			</s:if>
			<s:if test="BMSFSH=='1'.toString()">
				<td>部门审核通过</td>
			</s:if>
			<s:if test="BMSFSH=='2'.toString()">
				<td>部门审核未通过</td>
			</s:if>
			<td><a href="needCheck?need.WJID=<s:property value="WJID"/>">查看</a></td>
		</s:if>
		<s:if test="XSSFSH=='2'.toString()">
		<td>形式审核未通过</td>
		<td><a href="needCheck?need.WJID=<s:property value="WJID"/>">查看</a></td>
		</s:if>
	</tr>
	</s:iterator>
	</table>
  </body>
</html>
