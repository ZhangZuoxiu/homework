<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>部门审核界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
#form1 table tr td strong {
	font-weight: bold;
}
.comments {

width:100%;/*自动适应父布局宽度*/
overflow:auto;
word-break:break-all;
font-size:16px;
 background-color:##66ccff;

/*在ie中解决断行问题(防止自动变为在一行显示，主要解决ie兼容问题，ie8中当设宽度为100%时，文本域类容超过一行时，
当我们双击文本内容就会自动变为一行显示，所以只能用ie的专有断行属性“word-break或word-wrap”控制其断行)*/
}
.danyuange
{
	height:100%;
	}

</style>
  </head>
  
  <body>
      <s:debug></s:debug>
    
    <div>
    <form action="">
     <table width="1008"  border="1" align="center">
     <tr>
        <td height="46" width="169">*技术需求名称</td>
        <td width="299"><label for="JSXQMC"></label>
       	 <s:property value="needBack.JSXQMC"/>
       	 </td>
        <td width="169">*需求时限</td>
        <td width="308" >
        <s:property value="needBack.XQQSNF"/>-<s:property value="needBack.XQJZNF"/>
        </td>
      </tr>
     <tr>
        <td colspan="4" ><p>*技术需求概述</p>
          <textarea  name="need.XQGS" id="XQGS" cols="100" rows="5"placeholder="重大需求概述" value="" class="comments"width="100%"onKeyDown="textCounter(this.form.Question,this.form.Shengyu1,500);"   onKeyUp="textCounter(this.form.Question,this.form.Shengyu1,500);"><s:property value="needBack.XQGS"/></textarea>
      </tr>
      <tr>
        <td>*关键字</td>
        <td colspan="3">
        <s:property value="needBack.GJZ"/>
        </td>
      </tr>
      <tr>
        <td height="33">拟投入资金总额</td>
        <td colspan="3"><s:property value="needBack.JHZTZ"/>  万元</td>
      </tr>
      <tr>
        <td>*技术需求解决方式</td>
        <td colspan="3"> 
        	<s:property value="needBack.JSXQJJFS"/>  
        </td>
      </tr>
      <tr>
        <td height="40">*科技活动类型</td>
        <td colspan="3">
        	<s:property value="needBack.KJHDLX"/>  
        </td>
      </tr>
     
     <s:if test="needBack.KJHDLX=='基础研究'.toString()">
     	<tr id="studyrow">
        <td>*学科分类</td>
        <td colspan="3">
        	<s:property value="needBack.XKFL"/>
        </td>
      </tr>
     </s:if>
     <s:else>
      <tr id="belongrow">
        <td height="37">*需求技术所属领域</td>
        <td colspan="3">
        	<s:property value="needBack.XQJSSSLY"/> 
        </td>
      </tr>
      <tr id="applyrow">
        <td height="31">*需求技术应用行业</td>
        <td colspan="3"><label for="XQJSYYHY"></label>
        	<s:property value="needBack.XQJSYYHY"/>
        </td>	
      </tr>
      </s:else>
      <tr align="center">
        <td height="31" colspan="4"> 
        	<input type="button" onclick="window.location='needBMSHTG?WJID=<s:property value="needBack.WJID"/>'" value="通过"/>
        	<input type="button" onclick="window.location='needBMSHBTG?WJID=<s:property value="needBack.WJID"/>'" value="不通过"/>
        </td>
      </tr>
    </table>
  </form>
</div>
  </body>
</html>
