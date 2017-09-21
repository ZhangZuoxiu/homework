<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%

%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品</title>
<script language="javascript">
		<!--
		 function onSubmit(){
       	    var form = document.ProductForm;
       	    var msg = "";
       	    if (form.productNo.value == "") {
       	    	msg = msg + "商品代码不能为空\n";
       	    }
       	    
       	    if (form.productName.value == "") {
       	    	msg = msg + "商品名称不能为空\n";
       	    }
       	    
       	 	if (form.description.value == "") {
    	    	msg = msg + "描述不能为空\n";
    	    }
       	 	
       		if (form.place.value == "") {
   	    	msg = msg + "放置区不能为空\n";
   	    	}
       		
       		if (form.costprice.value == "") {
   	    	msg = msg + "商品进价不能为空\n";
   	    	}
       		
       		if (form.unitprice.value == "") {
   	    	msg = msg + "商品售价不能为空\n";
   	    	}
       		
       		if (form.num.value == "") {
       	    	msg = msg + "商品数量不能为空\n";
       	    	}
       		
       	    if (msg == "") {
       	    	return true;
       	    } else {
       	    	alert(msg);
       	    	return false;
       	    }
   	    }
		//-->
		</script>
</head>
<body>
<form name="ProductForm" action="AddCheck.jsp"  method=post>
	    <table class="list" align="center" width="90%" cellpadding="4" cellspacing="1">
        	<tr align="center">
        		<td colspan="2" class="title_td" align="center">
        			<div class="title_font">新增商品</div>
        			<input type="hidden" name="state" value="0" />
         	    </td>
        	</tr>
        	
            <tr>
            	<td class="td_left" width="25%">商品代码：</td>
	       		<td class="td_right">
	       			<input type="text" name="productNo" maxlength="10" onkeyup="this.value=this.value.replace(/\D/g,'')" />
	       		</td>
            </tr>
            
            <tr>
            	<td class="td_left" width="25%">商品名称：</td>
	       		<td class="td_right">
	       			<input type="text" name="productName" maxlength="10" />
	       		</td>
            </tr>
            
            <tr>
          		<td class="td_left">描述：</td>
          		<td class="td_right">
          			<textarea name="description" cols="50" rows="4"></textarea>
          		</td>
        	</tr>
        	
            <tr>
	       		<td class="td_left">商品放置区：</td>
	       		<td class="td_right">
	       			<select name="place" [multiple] [size=10]> 
    					<option value="水产区1" [selected]>水产区1</option> 
    					<option value="水产区2" [selected]>水产区2</option> 
    					<option value="冷藏区1" [selected]>冷藏区1</option> 
    					<option value="冷藏区2" [selected]>冷藏区2</option> 
    					<option value="烟酒饮料" [selected]>烟酒饮料</option>
    					<option value="肉禽区1" [selected]>肉禽区1</option> 
    					<option value="肉禽区2" [selected]>肉禽区2</option> 
    					<option value="休闲食品区1" [selected]>休闲食品区1</option> 
    					<option value="休闲食品区2" [selected]>休闲食品区2</option> 
    					<option value="休闲食品区3" [selected]>休闲食品区3</option> 
    					<option value="休闲食品区4" [selected]>休闲食品区4</option> 
    					<option value="个人护理区1" [selected]>个人护理区1</option> 
    					<option value="个人护理区2" [selected]>个人护理区2</option> 
    					<option value="个人清洁区1" [selected]>个人清洁区1</option> 
    					<option value="个人清洁区2" [selected]>个人清洁区2</option> 
    					<option value="蔬果区1" [selected]>蔬果区1</option> 
    					<option value="fruit" [selected]>蔬果区2</option>
    					<option value="原材区" [selected]>原材区</option> 
    					<option value="文具用品区" [selected]>文具用品区</option> 
    					<option value="服饰区1" [selected]>服饰区1</option> 
    					<option value="服饰区2" [selected]>服饰区2</option>			
					</select>
              	</td>
            </tr>
            
            <tr>
            	<td class="td_left" width="25%">商品进价：</td>
	       		<td class="td_right">
	       			<input type="text" name="costprice" maxlength="10" onkeyup="this.value=this.value.replace(/\D/g,'')"/>
	       		</td>
            </tr>
            
            <tr>
          		<td class="td_left">商品售价：</td>
          		<td class="td_right">
          			<input type="text" name="unitprice" maxlength="10" onkeyup="this.value=this.value.replace(/\D/g,'')"/>
          		</td>
        	</tr>
        	
        	<tr>
            	<td class="td_left" width="25%">商品数量：</td>
	       		<td class="td_right">
	       			<input type="text" name="num" maxlength="10" onkeyup="this.value=this.value.replace(/\D/g,'')"/>
	       		</td>
            </tr>
            
            <tr>
            	<td align="center" colspan="2">
	            	<input type="submit" value="确定" class="btn_style"/>&nbsp;&nbsp;
            	</td>
            </tr>
            
         </table>
       </form>


</body>
</html>



