<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="jquery/jquery2.0.0.js">
	
</script>
<script type="text/javascript">
	function loadInfo() {
    $.getJSON("loadInfo", function(data) {
        $.each(data.comments, function(i, item) {
            $("#info").append(
                    "<div>" + item.id + "</div>" + 
                    "<div>" + item.nickname  + "</div>" +
                    "<div>" + item.content + "</div><hr/>");
        });
        });
}

function sendMessage(){
	$.ajax({
    type:"post",
    dataType:"text",
    url:"userMessage",
    data:{
     'username':"sz",
     'password':"123"
    },
    error:function(data){ 
     alert("错误"); 
    }, 
    success:function(data)
    {
     alert("1");
     alert(data);
    }
   });
}
</script>
</head>
    <body>
        <input type="button" value="获取" id="btnGet" onclick="loadInfo()" />
        <input type="button" value="发送" id="btnGet" onclick="sendMessage()" />
        <div id="info"></div>
    </body>
</html>
