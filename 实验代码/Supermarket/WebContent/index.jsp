<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>北国超市导购系统</title>
</head>
<body  bgcolor="#E0FFFF">
 <center>
 	<h1 style="color:#4682B4 ">欢迎来到北国超市</h1>
 </center>
 <center>
 <table border-width:1 width="800" height="450">
	<tr>	<!--第一行 -->
    	<td >仓储</a></td>
        <td >仓储</td>
        <td style="color:red ">紧急出口</td>
        <td >仓储</td>
        <td >仓储</td>
        <td >仓储</td>i
    <tr>
    <tr>	<!--第二行 -->
    	<td>仓储</td>
        <td><a href="http://localhost:8080/Supermarket/shui.jsp">水产区1</td>
        <td><a href="http://localhost:8080/Supermarket/rou.jsp">肉禽区1</td>
        <td><a href="http://localhost:8080/Supermarket/rou.jsp">肉禽区2</td>
        <td><a href="http://localhost:8080/Supermarket/shuguo.jsp">蔬菜区</td>
        <td><a href="http://localhost:8080/Supermarket/shuguo.jsp">水果区</td>
    <tr>
    <tr>	<!--第三行 -->
    	<td>仓储</td>
        <td><a href="http://localhost:8080/Supermarket/shui.jsp">水产区2</td>
        <td><a href="http://localhost:8080/Supermarket/xiuxian.jsp">休闲食品区1</td>
        <td><a href="http://localhost:8080/Supermarket/xiuxian.jsp">休闲食品区2</td>
        <td><a href="http://localhost:8080/Supermarket/yuancai.jsp">原材区</td>
        <td>仓储</td>
    <tr>
    <tr>	<!--第四行 -->
    	<td style="color:red ">紧急出口</td>
        <td><a href="http://localhost:8080/Supermarket/leng.jsp">冷藏区1</td>
        <td><a href="http://localhost:8080/Supermarket/xiuxian.jsp">休闲食品区3</td>
        <td><a href="http://localhost:8080/Supermarket/xiuxian.jsp">休闲食品区4</td>
        <td><a href="http://localhost:8080/Supermarket/wenwan.jsp">文具用品区</td>
        <td>仓储</td>
    <tr>
    <tr>	<!--第五行 -->
    	<td>仓储</td>
        <td><a href="http://localhost:8080/Supermarket/leng.jsp">冷藏区2</td>
        <td><a href="http://localhost:8080/Supermarket/huli.jsp">个人护理区1</td>
        <td><a href="http://localhost:8080/Supermarket/qingjie.jsp">个人清洁区1</td>
        <td><a href="http://localhost:8080/Supermarket/fushi.jsp">服饰区1</td>
        <td style="color:red ">紧急出口</td>
    <tr>
    <tr>	<!--第六行 -->
    	<td>仓储</td>
        <td><a href="http://localhost:8080/Supermarket/yanjiu.jsp">烟酒饮料</td>
        <td><a href="http://localhost:8080/Supermarket/huli.jsp">个人护理区2</td>
        <td><a href="http://localhost:8080/Supermarket/qingjie.jsp">个人清洁区2</td>
        <td><a href="http://localhost:8080/Supermarket/fushi.jsp">服饰区2</td>
        <td>仓储</td>
    <tr>
    <tr>
    	<td style="color:green ">出口</td>
    	<td style="color:grey ">收银</td>
    	<td style="color:grey ">收银</td>
    	<td style="color:grey ">收银</td>
    	<td style="color:grey ">收银</td>
    	<td style="color:green ">入口</td>
    <tr>
</center>	    
<table>
	<input type="button" name="search" value="路径指示" onclick="javascript:window.location='http://localhost:8080/Supermarket/SearchWay.jsp';" />
	<input type="button" name="searchsth" value="搜索" onclick="javascript:window.location='http://localhost:8080/Supermarket/SearchSth.jsp';" />
</body>
</html>