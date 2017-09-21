<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品信息</title>
</head>
<body>
<center>
	<form action="UpdateCheck.jsp">
		<table>
			<tr align="center">
        		<td colspan="2" class="title_td" align="center">
        			<div class="title_font">修改商品信息</div>
        			<input type="hidden" name="state" value="0" />
         	    </td>
			<tr>
			
			<tr>
				<td>输入想要修改的商品编号</td>
			</tr>
			
			<tr>
			<td>
				<input type="text" name="updateNO">
			</td>
			</tr>
				
		</table>
				
		<table>
			<td>
				<input type="submit" value="确定" style="color:#5F9EA0">
			</td>	
		</form>
		
		<form action="shangping.jsp">
		
			<td>
				<input type="submit" value="返回" style="color:#5F9EA0">
			</td>
		</form>
	</table>
	</center>
</body>
</html>