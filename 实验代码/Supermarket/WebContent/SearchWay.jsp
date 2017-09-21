<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>路径选择</title>
</head>
<body>
 	<input type="button" name="returnindex" value="返回主页" onclick="javascript:window.location='http://localhost:8080/Supermarket/index.jsp';" />
	<h1 style="color:#4682B4 ">选路径</h1>
	<h3 style="color:#4682B4 ">选择您所在的地点</h3>
	
	<form action = "http://localhost:8080/Supermarket/way.jsp">
	<select name="出发地" [multiple] [size=25]> 
    	<option value="1" [selected]>水产区1</option> 
    	<option value="2" [selected]>水产区2</option> 
    	<option value="3" [selected]>冷藏区1</option> 
    	<option value="4" [selected]>冷藏区2</option> 
    	<option value="5" [selected]>烟酒饮料</option>
    	<option value="6" [selected]>肉禽区1</option> 
    	<option value="7" [selected]>肉禽区2</option> 
    	<option value="8" [selected]>休闲食品区1</option> 
    	<option value="9" [selected]>休闲食品区2</option> 
    	<option value="10" [selected]>休闲食品区3</option> 
    	<option value="11" [selected]>休闲食品区4</option> 
    	<option value="12" [selected]>个人护理区1</option> 
    	<option value="13" [selected]>个人护理区2</option> 
    	<option value="14" [selected]>个人清洁区1</option> 
    	<option value="15" [selected]>个人清洁区2</option> 
    	<option value="16" [selected]>蔬果区1</option> 
    	<option value="17" [selected]>蔬果区2</option>
    	<option value="18" [selected]>原材区</option> 
    	<option value="19" [selected]>文具用品区</option> 
    	<option value="20" [selected]>服饰区1</option> 
    	<option value="21" [selected]>服饰区2</option>
    	<option value="22" [selected]>紧急出口</option>
    	<option value="23" [selected]>出口</option>
    	<option value="24" [selected]>收银</option>
    	<option value="25" [selected]>入口</option>    
	</select> 
	
	
	<h3 style="color:#4682B4 ">选择您的目的地</h3>
		<select name="目的地" [multiple] [size=25]> 
    	<option value="1" [selected]>水产区1</option> 
    	<option value="2" [selected]>水产区2</option> 
    	<option value="3" [selected]>冷藏区1</option> 
    	<option value="4" [selected]>冷藏区2</option> 
    	<option value="5" [selected]>烟酒饮料</option>
    	<option value="6" [selected]>肉禽区1</option> 
    	<option value="7" [selected]>肉禽区2</option> 
    	<option value="8" [selected]>休闲食品区1</option> 
    	<option value="9" [selected]>休闲食品区2</option> 
    	<option value="10" [selected]>休闲食品区3</option> 
    	<option value="11" [selected]>休闲食品区4</option> 
    	<option value="12" [selected]>个人护理区1</option> 
    	<option value="13" [selected]>个人护理区2</option> 
    	<option value="14" [selected]>个人清洁区1</option> 
    	<option value="15" [selected]>个人清洁区2</option> 
    	<option value="16" [selected]>蔬果区1</option> 
    	<option value="17" [selected]>蔬果区2</option>
    	<option value="18" [selected]>原材区</option> 
    	<option value="19" [selected]>文具用品区</option> 
    	<option value="20" [selected]>服饰区1</option> 
    	<option value="21" [selected]>服饰区2</option>
    	<option value="22" [selected]>紧急出口</option>
    	<option value="23" [selected]>出口</option>
    	<option value="24" [selected]>收银</option> 
    	<option value="25" [selected]>入口</option> 
	</select> 
	<p>
	
	</p>
		<input type="button" value="确认" onclick="this.form.submit()">
	</form>
</body>

</html>