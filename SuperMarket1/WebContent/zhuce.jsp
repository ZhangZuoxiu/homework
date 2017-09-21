<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录</title>
  
</head>

<body bgcolor="f3f3f3">
<div align='center'><img src="picture//2.jpg" /></div>


<center>
<table  width="340"  bgcolor="lightblue" border="0">
  <tr>
    <td width="277" height="34" align="center"><font size="3">登录</font></td>
  </tr>
  <tr>
    <td height="20" align="center"><input type="text" size="30"name="name" id="name" placeholder="用户名/手机/邮箱"/></td>
  </tr>
  <tr>
    <td height="20" align="center"><input type="text"size="30" name="pwd" id="pwd" placeholder="密码（至少6位任意字符组合）"/></td>
  </tr>
   <tr>
    <td height="20" align="center"><input type="text" size="30"name="pwd" id="pwd" placeholder="确认密码（至少6位任意字符组合）"/></td>
  </tr>
  <tr>
   <td align='center'> <input type="button" name="submit" id="submit" value="登录" onclick="window.location.href='login.jsp'"> 
				<input type="button" name="submit" id="submit" value="注册" onclick="window.location.href='zhuce.jsp'">
			</td>	
  </tr>
</table>
</center>

</body>
</html>