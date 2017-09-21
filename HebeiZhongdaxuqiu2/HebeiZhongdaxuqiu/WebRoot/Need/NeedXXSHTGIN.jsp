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
    
    <title>形式审核选择部门</title>
    
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
  <s:debug></s:debug>
  	<form action="needTJXXSHTG" method="post">
  	<table align="center">
   <tr><td>请选择管理处室：<select id="GLCS" name="need.GLCSBM"></select>
   <input type="hidden" name="need.WJID" value =<s:property value="WJID"/>></td>
   </tr>
   <tr></tr>
   <tr>
   <td align="center">
       <input type="submit" value="确认提交">
   </td>
   </tr>
   </table>
   </form>
   
  <script src="jquery/jquery2.0.0.min.js"></script> 
   <script type="text/javascript">
   window.onload = function(){
   		//使用ajax 加载 管理处室
	$.getJSON("loadglcs", function(data) {
		$("#GLCS").html("");
		$.each(data.glcss, function(i, item) {
			$("#GLCS").append(
					"<option value='"+ item.title +"'>"+ item.title +"</option>");
		});
	});
   }
   
   </script> 
  </body>
</html>
