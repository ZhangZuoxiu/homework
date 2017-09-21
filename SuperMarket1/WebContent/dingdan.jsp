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
	 alert('成功')
	 form.Iname.focus();
	 return true;
	 }
	}
</script>
</head>
<body bgcolor="lightblue" >
<form id="form2" name="form2" method="post" action="caiwu.jsp">
<center><font size="7" >订单中心</font></center>
<table align="center" frame="border" rules="all" bgcolor="lightblue" >
<tr ><td align="center" width=150 height=20>订单号</td>
<td align="center" width=150 height=20>日期</td>
<td align="center" width=150 height=20><p>订单详情</p>
<td align="center" width=150 height=20>金额</td></tr>

<tr><td align='center'><input type="text" name="Iname"id="Iname" ></td>
<td align='center'><input type="text" id="2" ></td>
<td align='center'><input type="text" id="3" ></td>
<td align='center'><input type="text" id="4" ></td>

</tr>
<tr><td align='center'><input type="text" name="Iname1"id="Iname1" ></td>
<td align='center'><input type="text" id="2" ></td>
<td align='center'><input type="text" id="3" ></td>
<td align='center'><input type="text" id="4" ></td>

</tr>
<tr><td align='center'><input type="text" name="Iname1"id="Iname1" ></td>
<td align='center'><input type="text" id="2" ></td>
<td align='center'><input type="text" id="3" ></td>
<td align='center'><input type="text" id="4" ></td>

</tr>
<tr><td align='center'><input type="text" name="Iname1"id="Iname1" ></td>
<td align='center'><input type="text" id="2" ></td>
<td align='center'><input type="text" id="3" ></td>
<td align='center'><input type="text" id="4" ></td>

</tr>
<tr><td align='center'><input type="text" name="Iname1"id="Iname1" ></td>
<td align='center'><input type="text" id="2" ></td>
<td align='center'><input type="text" id="3" ></td>
<td align='center'><input type="text" id="4" ></td>

</tr>
<tr><td align='center'><input type="text" name="Iname1"id="Iname1" ></td>
<td align='center'><input type="text" id="2" ></td>
<td align='center'><input type="text" id="3" ></td>
<td align='center'><input type="text" id="4" ></td>

</tr>
</table>
<h1 align="right">
<input type="submit" name="submit" id="submit" value="确定" onclick="return check()"> 
				<input type="button" name="submit" id="submit" value="返回" onclick="window.location.href='main2.jsp'">
			</h1>

</form>
</body>
</html>