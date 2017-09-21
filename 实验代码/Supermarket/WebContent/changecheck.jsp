<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>修改商品</title>
<style type="text/css">
body,td,th {
	font-size: larger;
}
body {
	background-image: url(images/注册背景.jpg);
}
</style>
	</head>
	<body>
	<h2 style="color:lightblue" align=center>输入修改后的信息</h2>
	<jsp:useBean id="db" class="Bean.DBBean" scope="page" />
    	<form  id="indexform" name="indexForm" action="changegoods.jsp" method="post">
	    <table  align=center>
        
            <tr>
            	<td class="td_left" width="25%">商品名称：</td>
	       		<td class="td_right">
	       			<input type="text" name="gname" maxlength="10" />
	       		</td>
            </tr>
            
            <tr>
            	<td class="td_left" width="25%">商品进价：</td>
	       		<td class="td_right">
	       			<input type="text" name="gprise1" maxlength="10" onkeyup="this.value=this.value.replace(/\D/g,'')"/>
	       		</td>
            </tr>
            
            <tr>
          		<td class="td_left">商品售价：</td>
          		<td class="td_right">
          			<input type="text" name="gprise2" maxlength="10" onkeyup="this.value=this.value.replace(/\D/g,'')"/>
          		</td>
        	</tr>
        	
        	<tr>
            	<td class="td_left" width="25%">商品数量：</td>
	       		<td class="td_right">
	       			<input type="text" name="gnum" maxlength="10" onkeyup="this.value=this.value.replace(/\D/g,'')"/>
	       		</td>
            </tr>
            
            <tr>
            	<td align="center" colspan="2">
	            	<input type="submit" value="确定" class="btn_style"/>
            	</td>
            </tr>
            
         </table>
       </form>
	</body>
</html>

