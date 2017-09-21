<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品信息</title>
</head>
<body>
<center>
	<form action="SearchCheck.jsp">
		<table>
			<tr align="center">
        		<td colspan="2" class="title_td" align="center">
        			<div class="title_font">查询商品信息</div>
        			<input type="hidden" name="state" value="0" />
         	    </td>
			<tr>
			
			<tr>
				<td>
					<select name="selectcondition" id="selectcondition" >
								<option >-请选择查询方式-</option>
								<option value="0">商品编号</option>
								<option value="1">商品名称</option>
					</select>
				</td>
			</tr>
			
			<tr>	
				<td>
					<input type="text" name="search">
				</td>
			</tr>
		</table>
				<input type="submit" value="查询" style="color:#5F9EA0">		
	</form>
</center>		
</body>
</html>