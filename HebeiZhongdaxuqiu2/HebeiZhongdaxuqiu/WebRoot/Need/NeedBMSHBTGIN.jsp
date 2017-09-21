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
    
    <title>部门审核不通过的意见</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
#form1 table tr td strong {
	font-weight: bold;
}
.comments {

width:100%;/*自动适应父布局宽度*/
overflow:auto;
word-break:break-all;
font-size:16px;
 background-color:##66ccff;

/*在ie中解决断行问题(防止自动变为在一行显示，主要解决ie兼容问题，ie8中当设宽度为100%时，文本域类容超过一行时，
当我们双击文本内容就会自动变为一行显示，所以只能用ie的专有断行属性“word-break或word-wrap”控制其断行)*/
}
.danyuange
{
	height:100%;
	}

</style>
  </head>
  
  <body>
    <s:debug></s:debug>
  	<form action="needTJBMSHBTG" method="post">
  	<table align="center" width="500px">
   <tr><td>请输入部门审核不通过意见:</td></tr>
   <tr><td>
   <textarea rows="4" class="comments" name="need.BMSHYJ" width="100%"></textarea>
   </td>
   </tr>
   <tr><td><input type="hidden" name="need.WJID" value ='<s:property value="WJID"/>'></td> </tr>
   <tr>
   <td align="center">
       <input type="submit" value="确认提交">
   </td>
   </tr>
   </table>
   </form>
  </body>
</html>
