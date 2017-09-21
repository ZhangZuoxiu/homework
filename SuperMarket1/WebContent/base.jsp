<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
function check()
{
	 var form=document.form2;
	 if(form.Iname.value=="")
	 {
	 alert('修改信息成功')
	 form.Iname.focus();
	 return true;
	 }
	}
</script>
</head>
<body bgcolor="lightblue" >
<center>
<font size="7" >资料中心</font></center>
<form id="form2" name="form2" method="post" action="main2.jsp">

<table align="center" frame="border" rules="all" bgcolor="lightblue" >

  <tr>
    <td width="155" height="52" align="center">姓名</td>
    <td width="442" align="left"><input type="text" name="Iname" id="Iname" /></td>
  </tr>
  <tr>
    <td height="52" align="center">性别</td>
    <td align="left"><input type="radio" name="radio" id="radio" value="radio" />
      男  <input type="radio" name="radio2" id="radio2" value="radio2" />
      女</td>
  </tr>
  <tr>
    <td height="49" align="center">手机号</td>
    <td align="left"><input type="text" name="textfield3" id="textfield3" /></td>
  </tr>
  <tr>
    <td height="46" align="center">邮箱</td>
    <td align="left"><input type="text" name="textfield4" id="textfield4" /></td>
  </tr>
  <tr>
    <td height="46" align="center">身份证号</td>
    <td align="left"><input type="text" name="textfield5" id="textfield5" /></td>
  </tr>
  <tr>
    <td height="42" align="center">银行卡号</td>
    <td align="left"><input type="text" name="textfield6" id="textfield6" /></td>
  </tr>
  <tr>
    <td height="42" align="center">开户银行</td>
    <td align="left"><input type="text" name="textfield7" id="textfield7" /></td>
  </tr>
  <tr>
    <td height="50" align="center">开户支行</td>
    <td align="left"><input type="text" name="textfield8" id="textfield8" /></td>
  </tr>
  <tr>
    <td height="43" align="center">开户城市</td>
    <td align="left"><input type="text" name="textfield9" id="textfield9" /></td>
  </tr>
  <tr>
    <td height="48" align="center">开户姓名</td>
    <td align="left"><input type="text" name="textfield10" id="textfield10" /></td>
  </tr>
</table>
<h1 align="right">
<input type="submit" name="submit" id="submit" value="保存修改" onclick="return check()"> 
				<input type="button" name="submit" id="submit" value="返回" onclick="window.location.href='main2.jsp'">
			</h1>
</form>

</body>
</html>