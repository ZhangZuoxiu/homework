<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="java.util.Date"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'NeedCollect.jsp' starting page</title>
    
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


}
.danyuange
{
	height:100%;
	}

</style>
 <script src="jquery/jquery2.0.0.min.js"></script> 
 <script type="text/javascript" src="JS1/NeedCollect.js" charset="gbk">
  </script>

</head>


<body>

<h2 align="center">河北重大科技需求征集系统</h2>
 <div>
  <form id="form1" name="form1" method="post" action="needSubmit" target="_parent">
    <table width="1008" height="1162" frame="border" rules="all" align="center" cellspacing="0">
      <tr>
        <td width="169" height="43">*机构全称</td>
        <td width="299"><label for="JGQC"></label>
        <input type="text"  name="institution.JGQC" id="JGQC" value="<s:property value="#session.JGQC"/>"readonly="true"/>
        </td>
        <td width="169">归口管理部门</td>
        <td width="308" >
        <select style="width:160px;" select name="institution.GKGLBM" size="1"id="GKGLBM">
        	 <option value="">归口管理部门</option>
 		</select>
 		(默认为空白项)			
        </td>
      </tr>
      <tr>
        <td height="35">*通讯地址</td>
        <td><label for="TXDZ"></label>
        <input type="text" name="institution.TXDZ" id="TXDZ" value=""/>
        <label><div id="mesTXDZ" nowrap></div></label>
        </td>
        <td>*所在地域</td>
         <td width="308">
         <select style="width:160px;"select name="institution.SZDY" size="1"id="SZDY">
 		</select>
 		<label><div id="mesSZDY" nowrap></div></label>
        </td>
      </tr>
      <tr>
        <td height="32">网址</td>
        <td><label for="WZ"></label>
        <input type="text" name="institution.WZ" id="WZ" value=""/></td>
        <td>*电子邮箱</td>
        <td><label for="DZYX"></label>
        <input type="text" name="institution.DZYX" id="DZYX" onblur="DZYXYanzheng()" value=""/>
         <label><div id="mesDZYX" nowrap></div></label>
        </td>
      </tr>
      <tr>
        <td height="31">*法人代表</td>
        <td><label for="FRDB"></label>
        <input type="text" name="institution.FRDB" id="FRDB" value=""/></td>
        <td>邮政编码</td>
        <td><label for="YZBM"></label>
        <input type="text" name="institution.YZBM" id="YZBM" value=""/>
        <label><div id="mesYZBM" nowrap></div></label>
        </td>
      </tr>
      <tr>
        <td height="37">*联系人</td>
        <td><label for="LXR"></label>
        <input type="text" name="institution.LXR" id="LXR" value=""/></td>
        <td>固定电话</td>
        <td><label for="Phone"></label>
        <input type="text" name="institution.GDDH" id="GDDH" value=""/></td>
      </tr>
      <tr>
        <td height="37">*手机</td>
        <td><label for="SJ"></label>
        <input type="text" name="institution.SJ" id="SJ" value=""/></td>
        <td>传真</td>
        <td><label for="CZ"></label>
        <input type="text" name="institution.CZ" id="CZ" value=""/></td>
      </tr>
      <tr>
        <td height="37">*机构属性</td>
        <td colspan="3">
        <label>
            <input type="radio" name="institution.JGSX" value="企业 " id="InsProp_0" /> 企业 </label>
          <label>
            <input type="radio" name="institution.JGSX" value="高等院校" id="InsProp_1" />高等院校</label>
          <label>
            <input type="radio" name="institution.JGSX" value="研究机构 " id="InsProp_2" />研究机构 </label>
          <label>
            <input type="radio" name="institution.JGSX" value="其他" id="InsProp_3" />其他</label>
        </p>
        </td>
      </tr>
      <tr>
        <td colspan="4"><p>机构简介：（主要包括基本情况、现有研究基础等，限500字以内）</p>
        <p>
          <label for="JGJJ"></label>
          <textarea name="institution.JGJJ" id="JGJJ" cols="100" rows="5" placeholder="机构简介" class="comments" width="100%"onKeyDown="textCounter(this.form.JGJJ,this.form.Shengyu,500);"   onKeyUp="textCounter(this.form.JGJJ,this.form.Shengyu,500);"></textarea>
        </p>
<!--         <p>剩余字数 -->
<!--           <label for="Shengyu"></label> -->
<!--           <input name="Shengyu" type="text" id="Shengyu" size="5" readonly="true"/> -->
<!--           字 -->
<!--         </p></td> -->
      </tr>
      <tr>
        <td height="46">*技术需求名称</td>
        <td><label for="JSXQMC"></label>
        <input type="text" name="need.JSXQMC" id="JSXQMC" /></td>
       	<input type="hidden" name="need.JGQC" id="JGQC" value="<s:property value="#session.JGQC"/>"/>
        <td>*需求时限</td>
        <td>
         <select name="need.XQQSNF" style="width: 90px;" id="XQQSNF"> 
     <option value="">--- 请选择 ---</option> 
              <%  
                     StringBuffer bufYear = new StringBuffer();  
                     //下拉列表的年数  
                     for(int i=0;i<100;i++){  
                     //最小年  
                     int iYear = 2016+i;  
                     bufYear.append("<option value = '"+iYear+"'");  
                     Date date = new Date();  
                     int sYear = date.getYear();  
                     //系统时间从1900年开始  
                     int sYearc = sYear+1900;  
                     if(iYear == sYearc){  
                          bufYear.append(" selected");  
                      }  
                     bufYear.append(" >"+iYear+"</option>\n");  
                     }  
                     out.println(bufYear.toString());  
               %>  
      </select>-  
     <select name='need.XQJZNF' style="width: 90px;" id="XQJZNF"onblur="YearYanzheng()">  
       <option value="">--- 请选择 ---</option>
              <%  
                     StringBuffer bufYear2 = new StringBuffer();  
                     //下拉列表的年数  
                     for(int i=0;i<100;i++){  
                     //最小年  
                    
                     int iYear2 = 2016+i;  
                     bufYear2.append("<option value = '"+iYear2+"'");  
                     Date date = new Date();  
                     int sYear2 = date.getYear();  
                     //系统时间从1900年开始  
                     int sYearc2 = sYear2+1900;  
                      if(iYear2 == sYearc2){  
                          bufYear2.append(" selected");  
                      }  
                     bufYear2.append(" >"+iYear2+"</option>\n");  
                     }  
                     out.println(bufYear2.toString());  
               %>  
      </select>  
        <label><div id="mesyear" nowrap></div></label>
        
        </td>
      </tr>
      <tr>
        <td colspan="4"><p>*技术需求概述</p>
          <p>1.主要问题（需要解决的重大技术问题。）</p>
          <p>2.技术关键（所需要的关键技术、主要指标）</p>
          <p>3.预期目标（技术创新性、经济社会效益，限500字内）</p>
          <textarea name="need.XQGS" id="XQGS" cols="100" rows="5"placeholder="重大需求概述" value="" class="comments"width="100%"onKeyDown="textCounter(this.form.Question,this.form.Shengyu1,500);"   onKeyUp="textCounter(this.form.Question,this.form.Shengyu1,500);"></textarea>
<!--         <p>剩余字数 -->
<!--           <label for="Shengyu1"></label> -->
<!--           <input name="Shengyu1" type="text" id="Shengyu1" size="5" readonly="readonly"/>字 </p> -->
      </tr>
      <tr>
        <td>*关键字（1-5个，逐个录入）</td>
        <td colspan="3">
        <input name="GJZ1" type="text" id="GJZ1" placeholder="关键字" value="" size="10" onkeyup="Guannjianzi()"/>
            ----
            <label for="GJZ2"></label>
            <input name="GJZ2" type="text" id="GJZ2" size="10"readonly="true"onkeyup="Guannjianzi()" value=""/>
            ----
            <label for="GJZ3"></label>
            <input name="GJZ3" type="text" id="GJZ3" size="10" readonly="true"onkeyup="Guannjianzi()"value=""/>
            ----
            <label for="GJZ4"></label>
            <input name="GJZ4" type="text" id="GJZ4" size="10"readonly="true" onkeyup="Guannjianzi()"value=""/>
            ----
            <label for="GJZ5"></label>
            <input name="GJZ5" type="text" id="GJZ5" size="10" readonly="true"value=""/>
            <input name="need.GJZ" type="hidden" id="GJZ"value=""/>
        </td>
      </tr>
      <tr>
        <td height="33">拟投入资金总额</td>
        <td colspan="3"> <input type="text" name="need.JHZTZ" id="JHZTZ"placeholder="拟投入总金额" value=""/> 
        万元</td>
      </tr>
      <tr>
        <td>*技术需求解决方式</td>
        <td colspan="3"> <label>
            <input type="radio" name="need.JSXQJJFS" value="独立研发" id="JSXQJJFS_0" />独立研发</label >
           <label>
            <input type="radio" name="need.JSXQJJFS" value="委托研发" id="JSXQJJFS_1" />委托研发 </label>
          <label>
            <input type="radio" name="need.JSXQJJFS" value="合作研发" id="JSXQJJFS_2" />合作研发</label>
          <label>
            <input type="radio" name="need.JSXQJJFS" value="其他" id="JSXQJJFS_3" />其他</label>
        <p>合作意向单位:
         <input type="text" name="need.HZYXDW" id="HZYXDW"placeholder="合作意向单位" value=""/>
         </p>
        </td>
      </tr>
      <tr>
        <td height="40">*科技活动类型</td>
        <td colspan="3">
         <label>
            <input type="radio" name="need.KJHDLX" value="基础研究" id="KJHDLX_0" />基础研究</label>
          <label>
            <input type="radio" name="need.KJHDLX" value="应用研究" id="KJHDLX_1" />应用研究</label>
          <label>
            <input type="radio" name="need.KJHDLX" value="试验发展" id="KJHDLX_2" />试验发展</label>
             <br />
          <label>
            <input type="radio" name="need.KJHDLX" value="研究发展与成果应用" id="KJHDLX_3" />研究发展与成果应用</label>
          <label>
            <input type="radio" name="need.KJHDLX" value="技术推广与科技服务 " id="KJHDLX_4" />技术推广与科技服务 </label>
         <label>
            <input type="radio" name="need.KJHDLX" value="生产性活动 " id="KJHDLX_5" />生产性活动 </label>
        </p>
        </td>
      </tr>
     
     <tr id="studyrow">
        <td>*学科分类</td>
        <td colspan="3">
        <label for="XKFL"></label>
          <select name="XKFL1" size="1" id="XKFL1" style="width:250px;" onchange="getSecondXkfls();">
        </select>     
        <select name="XKFL2" id="XKFL2" style="width:250px;"onchange="getThirdXkfls();">
        </select>
        <select name="XKFL3" id="XKFL3"style="width:250px;"onchange="inputXkfl();">
        </select>
        <input type="hidden" name="need.XKFL" id="XKFL"/>
        </td>
      </tr>
      <tr id="belongrow">
        <td height="37">*需求技术所属领域</td>
        <td colspan="3">
          <label>
            <input type="checkbox" name="need.XQJSSSLY" value="电子信息" id="XQJSSSLY_0" />
            电子信息</label>
          <label>
            <input type="checkbox" name="need.XQJSSSLY" value="光机电一体化" id="XQJSSSLY_1" />
            光机电一体化</label>
          <label>
            <input type="checkbox" name="need.XQJSSSLY" value="生物技术与制药 " id="XQJSSSLY_2" />
            生物技术与制药 </label>
          <label>
            <input type="checkbox" name="need.XQJSSSLY" value="新材料及应用" id="XQJSSSLY_3" />
            新材料及应用</label>
            <br/>
          <label>
            <input type="checkbox" name="need.XQJSSSLY" value="现代农业" id="XQJSSSLY_4" />
            现代农业</label>
            <label>
            <input type="checkbox" name="need.XQJSSSLY" value="新能源与高效节能" id="XQJSSSLY_5" />
            新能源与高效节能</label>
          <label>
            <input type="checkbox" name="need.XQJSSSLY" value="资源与环境 " id="XQJSSSLY_6" />
            资源与环境</label>
          <label>
            <input type="checkbox" name="need.XQJSSSLY" value="高技术服务业" id="XQJSSSLY_7" />
            高技术服务业</label>
           <br/>
          <label>
            <input type="checkbox" name="XQJSSSLY" value="海洋" id="XQJSSSLY_8" />
            海洋</label>
          <label>
            <input type="checkbox" name="XQJSSSLY" value="社会公共事业" id="BelongField_9" />
            社会公共事业</label>
           <label>
            <input type="checkbox" name="XQJSSSLY" value="医疗卫生" id="XQJSSSLY_10" />
            医疗卫生</label>
          <label>
            <input type="checkbox" name="XQJSSSLY" value="其他" id="XQJSSSLY_11" /> 其他(在下面注明)</label>
          <br/>
          其他技术：
          <label for="QTJSMS"></label>
          <input type="text" name="need.QTJSMS" id="QTJSMS"placeholder="其它技术" value=""/>
          <br />
        </p>
        </td>
      </tr>
      <tr id="applyrow">
        <td height="31">*需求技术应用行业</td>
        <td colspan="3"><label for="XQJSYYHY"></label>
          <label for="XQJSYYHY1"></label>
          <select name="XQJSYYHY1" size="1" id="XQJSYYHY1" style="width:250px;"onchange="getSecondGmjjhys()" ><!--  -->
        </select>      <label for="XQJSYYHY2"></label>
        <select name="XQJSYYHY2" id="XQJSYYHY2" style="width:250px;" onchange="getThirdGmjjhys()">
        </select>
        <label for="XQJSYYHY3"></label>
        <select name="XQJSYYHY3" id="XQJSYYHY3"style="width:250px;" onchange="inputXqjsyyhy();">
        </select>
         <input type="hidden" name="need.XQJSYYHY" id="XQJSYYHY"/>
        </td>
      </tr>
      <tr align="center">
        <td height="31" colspan="4"> 
         <input type="hidden" name="InsKey" value="">
<!--         <input type="submit" name="tijiao" id="tijiao" value="保存不提交" /> -->
      	<input type="submit" name="tijiao" id="tijiao"   value="提交并保存" onclick="return check1();"/>
      	 <input type="reset" name="reset" id="reset" value="重置" >
        </td>
      </tr>
    </table>
  </form>
  
</div>



  
     <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
