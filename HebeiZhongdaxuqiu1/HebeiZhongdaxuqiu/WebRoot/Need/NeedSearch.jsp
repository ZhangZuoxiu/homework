<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>需求检索页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div>
<fieldset>
<center>
  <p>	审核状态：
    <label for="ExmainState"></label>
    <select name="Zhuangtai" id="Zhuangtai" style="width:150px">
      <option value="">请选择</option>
      <option value="未审核">未审核</option>
      <option value="形式审核通过">形式审核通过</option>
      <option value="形式审核未通过">形式审核未通过</option>
      <option value="部门审核通过">部门审核通过</option>
      <option value="部门审核未通过">部门审核未通过</option>
    </select>
    </p>
  <p>标引条件1：
  <label for="Biaoyin1"></label>
    <select name="Biaoyin1" id="Biaoyin1" style="width:150px" onchange="change()">
      <option value="">请选择</option>
      <option value="I.GKGLBM">归口管理部门</option>
      <option value="I.SZDY">所在地域</option>
      <option value="I.JGSX">机构属性</option>
      <option value="n.JSXQJJFS">技术需求解决方式</option>
      <option value="n.KJHDLX">科技活动类型</option>
      <option value="n.GLCSBM">管理处室</option>
    </select>
    <select name="Tiaojian1" id="Tiaojian1" style="width:150px">
    <option value="">请选择<option>
  	</select>
  </p>
  <p>
  	<div id="t2">
  	标引条件2：
    <label for="Biaoyin2"></label>
    <select name="Biaoyin2" id="Biaoyin2" style="width:150px">
      <option value="">请选择</option>
      <option value="I.JGQC">机构全称</option>
      <option value="I.FRDB">法人代表</option>
      <option value="I.LXR">联系人</option>
      <option value="n.JSXQMC">技术需求名称</option>
      <option value="n.GJZ">关键字</option>
      <option value="n.JHZTZ">计划总投资</option>
      <option value="n.XKFL">学科分类</option>
      <option value="n.XQJSSSLY">需求技术所属领域</option>
      <option value="n.XQJSYYHY">需求技术应用行业</option>
    </select>
    <input type="text" name="Tiaojian2" id="Tiaojian2" style="width:150px"/>
    <input type="button" value="+" onclick="tiaojianAdd()">
    <input type="button" value="-" onclick="tiaojiandelete()"></br>
    </div>
    <div id="t3"></div>
    <br>
    <center><input type="button" name="Chaxun" id="Chaxun" value="查询" onclick ="getNeedsbyTiaojian()" style="outline:none" /></center>
  </p>
  </center>
  </fieldset>
	
<br>
</div>
<div>
	<table border="1" align="center" cellspacing="0" id="needTable">
	<thead>
	<tr>
		<td width="150" align="center">序号</td>
		<td width="150" align="center">技术需求名称</td>
		<td width="150" align="center">关键字</td>
		<td width="150" align="center">总投资金额</td>
		<td width="150" align="center">科技活动类型</td>
		<td width="150" align="center">编辑</td>
	</tr>
	</thead>
	<tbody></tbody>
	</table>
</div>

<script src="jquery/jquery2.0.0.min.js"></script> 
<script type="text/javascript" charset="gbk" src="JS1/NeedSearch.js">
</script>

  </body>
</html>
