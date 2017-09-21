<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="JS1/userRegister.js" charset="gbk"></script>
  </head>
  
  <body>
    <h2 align="center">注册页面</h2>
    <form name="userRegisterForm"action="userRegister" method="post" onsubmit="return CheckUser();" target="_parent">
    	<table align="center">
    		<tr>
    			<td>机构编码：</td>
    			<td><input type="text" name="user.JGBM" id="JGBM" onblur="JGBM_yanzheng();"/></td>
    			<td><em id="JGBM_Msg"></em></td>
    		</tr>
    		<tr>
    			<td>机构全称：</td>
    			<td><input type="text" name="user.JGQC" id="JGQC" onblur="JGQC_yanzheng();"/></td>
    			<td><em id="JGQC_Msg"></em></td>
    		</tr>
    		<tr>
    			<td>用户名：</td>
    			<td><input type="text" name="user.YHM" id="YHM" onblur="YHM_yanzheng();"></td>
    			<td><em id="YHM_Msg"></em></td>
    		</tr>
    		<tr>
    			<td>用户密码：</td>
    			<td><input type="password" name="user.YHMM" id="YHMM" onblur="YHMM_yanzheng();"></td>
    			<td><em id="YHMM_Msg"></em></td>
    		</tr>
    		<tr>
    			<td>确认密码：</td>
    			<td><input type="password" name="QRMM" id="QRMM" onblur="QRMM_yanzheng();"></td>
    			<td><em id="QRMM_Msg"></em></td>
    		</tr>
    		<tr>
    			<td>真实姓名：</td>
    			<td><input type="text" name="user.ZSXM" id="ZSXM" onblur="ZSXM_yanzheng();"></td>
    			<td><em id="ZSXM_Msg"></em></td>
    		</tr>
    		<tr>
    			<td>身份证号：</td>
    			<td><input type="text" name="user.SFZH" id="SFZH" onblur="SFZH_yanzheng();"></td>
    			<td><em id="SFZH_Msg"></em></td>
    		</tr>
    		<tr>
    			<td><input type="submit"  value="注册"></td>
    			<td><input type="reset" value="重置"></td>
    			<td></td>
    		</tr>
    	</table>
    </form>
    
    
    
  </body>
</html>
