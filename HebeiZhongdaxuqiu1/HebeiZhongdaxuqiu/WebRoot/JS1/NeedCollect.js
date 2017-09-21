/**
 * First页面的javascript
 */



  //邮箱验证***********************************************************************
function DZYXYanzheng()    
{    
var DZYX = document.getElementById('DZYX').value;    
 var pattern = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;    
 flag = pattern.test(DZYX);    
 if(flag)    
 {    
	 document.getElementById("mesDZYX").innerHTML="<font color='red'></font>";
   	 return true;    
 }    
 else    
 {    
  document.getElementById("mesDZYX").innerHTML="<font color='red'>邮箱格式有误!</font>";
  //document.getElementById("email").focus();
  return false;    
 }    
} 





//需求时限验证***********************************************************************
function YearYanzheng()
{
	var a = document.getElementById('XQQSNF').value; 
	var b = document.getElementById('XQJZNF').value;
	if(a>b)
	{
	    document.getElementById("mesyear").innerHTML="<font color='red'>请确保第一个年份小于第二个!</font>";
         document.getElementById("year1").focus();
         return false;
	}
	else
	{
		
		   document.getElementById("mesyear").innerHTML="<font color='red'></font>";
   	     return true;
	}
}


//通讯地址验证***********************************************************************

function TXDZYanzheng()
{
	var a = document.getElementById('TXDZ').value; 
	if(a=="")
	{
	    document.getElementById("mesTXDZ").innerHTML="<font color='red'>通讯地址不能为空!</font>";
         return false;
	}
	else
	{
		
		   document.getElementById("mesTXDZ").innerHTML="<font color='red'></font>";
   	     return true;
	}
}
//法人代表验证***********************************************************************

function RepresentativeYanzheng()
{
	var a = document.getElementById('Representative').value; 
	if(a=="")
	{
	    document.getElementById("mesRepresentative").innerHTML="<font color='red'>法人代表不能为空!</font>";
         return false;
	}
	else
	{
		
		   document.getElementById("mesRepresentative").innerHTML="<font color='red'></font>";
   	     return true;
	}
}

//联系人验证***********************************************************************

function PeopleYanzheng()
{
	var a = document.getElementById('People').value; 
	if(a=="")
	{
	    document.getElementById("mesPeople").innerHTML="<font color='red'>联系人不能为空!</font>";
         return false;
	}
	else
	{
		
		   document.getElementById("mesPeople").innerHTML="<font color='red'></font>";
   	     return true;
	}
}

//电话验证***********************************************************************

function PhoneYanzheng()
{
	var a = document.getElementById('Phone').value; 
	if(a=="")
	{
	    document.getElementById("mesPhone").innerHTML="<font color='red'>电话不能为空!</font>";
         return false;
	}
	else
	{
		
		   document.getElementById("mesPhone").innerHTML="<font color='red'></font>";
   	     return true;
	}
}
//手机验证***********************************************************************

function CellphoneYanzheng()
{
	var a = document.getElementById('Cellphone').value; 
	if(a=="")
	{
	    document.getElementById("mesCellphone").innerHTML="<font color='red'>手机不能为空!</font>";
         return false;
	}
	else
	{
		
		   document.getElementById("mesCellphone").innerHTML="<font color='red'></font>";
   	     return true;
	}
}

//关键字必须一个一个输入*********************************************************
function Guannjianzi()
{
	var gjz1 = document.getElementById('GJZ1').value; 
	var gjz2 = document.getElementById('GJZ2').value;
	var gjz3 = document.getElementById('GJZ3').value;
	var gjz4 = document.getElementById('GJZ4').value;
	var gjz5 = document.getElementById('GJZ5').value;
	var gjz  = document.getElementById('GJZ').value;
	if(gjz1!="")
	{
		document.getElementById('GJZ2').readOnly=false;
		form1.GJZ.value = gjz1;
	}
	else
	{
		document.getElementById('GJZ2').readOnly=true;
	}
	if(gjz1!=""&&gjz2!="")
	{
		document.getElementById('GJZ3').readOnly=false;
		form1.GJZ.value = gjz1+","+gjz2;
	}
	else
	{
		document.getElementById('GJZ3').readOnly=true;
	}
	if(gjz1!=""&&gjz2!=""&&gjz3!="")
	{
		document.getElementById('GJZ4').readOnly=false;
		form1.GJZ.value = gjz1+","+gjz2+","+gjz3;
	}
	else
	{
		document.getElementById('GJZ4').readOnly=true;
	}
	if(gjz1!=""&&gjz2!=""&&gjz3!=""&&gjz4!="")
	{
		document.getElementById('GJZ5').readOnly=false;
		form1.GJZ.value = gjz1+","+gjz2+","+gjz3+","+gjz4;
	}
	else
	{
		document.getElementById('GJZ5').readOnly=true;
	}
	if(gjz1!=""&&gjz2!=""&&gjz3!=""&&gjz4!=""&&gjz5!="")
	{
		form1.GJZ.value = gjz1+","+gjz2+","+gjz3+","+gjz4+","+gjz5;
	}
	
}
//验证剩余字符数********************************************
function textCounter(field, countfield, maxlimit) {    
// 函数，3个参数，表单名字，表单域元素名，限制字符；    
       if (field.value.length > maxlimit)
	   {    
       //如果元素区字符数大于最大字符数，按照最大字符数截断；    
      field.value = field.value.substring(0, maxlimit);
	 
	   }
       else    
		//在记数区文本框内显示剩余的字符数；    
       countfield.value = maxlimit - field.value.length;    
      }    


function inputXqjsyyhy(){
	alert("1");
	var xqjsyyhy2 = document.getElementById('XQJSYYHY2');
	var xqjsyyhy3 = document.getElementById('XQJSYYHY3');
	
	if(xqjsyyhy3=="")
	{
		form1.XQJSYYHY.value = xqjsyyhy2.options[xqjsyyhy2.selectedIndex].text;
	}else if(xqjsyyhy3 != "")
	{
		form1.XQJSYYHY.value = xqjsyyhy3.options[xqjsyyhy3.selectedIndex].text;
	}
}
function inputXkfl(){
	var xkfl2 = document.getElementById('XKFL2');
	var xkfl3 = document.getElementById('XKFL3');
	if(xkfl3=="")
	{
		form1.XKFL.value = xkfl2.options[xkfl2.selectedIndex].text;
	}else if(xkfl3 != "")
	{
		form1.XKFL.value = xkfl3.options[xkfl3.selectedIndex].text;
	}else{
		form1.XKFL.value ="";
	}
	
}
function check1() {
	
	
	
	
	if(form1.Address.value=="")
	{
		alert("通讯地址不能为空!");
	    form1.Address.focus();
	   return false;
	}
	
	if(form1.DZYX.value=="")
	{
		alert("电子邮箱不能为空!");
	    form1.DZYX.focus();
	   return false;
	}
	if(form1.LegRep.value=="")
	{
		alert("法人代表不能为空!");
	    form1.LegRep.focus();
	   return false;
	}
	if(form1.Linkman.value=="")
	{
		alert("联系人不能为空!");
	    form1.Linkman.focus();
	   return false;
	}
	if(form1.Cellphone.value=="")
	{
		alert("手机不能为空!");
	    form1.Cellphone.focus();
	   return false;
	}
	
	if(form1.InsProp.value==""&&form1.InsProp.value==null)
	{
		alert("机构属性不能为空!");
	   return false;
	}
	if(form1.InsIntro.value=="")
	{
		alert("机构简介不能为空!");
	    form1.InsIntro.focus();
	   return false;
	}
	if(form1.InsProp.value=="")
	{
		alert("机构属性不能为空!");
	   
	   return false;
	}
	if(form1.NeedName.value=="")
	{
		alert("技术需求名称不能为空!");
	    form1.NeedName.focus();
	   return false;
	}
	if(form1.Question.value=="" &&form1.TechKey.value=="" &&form1.Exceptgoal.value=="")
	{
		alert("需求概述不能为空!");
		form1.Question.focus();
	   return false;
	}
	if(form1.GJZ1.value=="")
	{
		alert("关键字不能为空!");
	    form1.GJZ1.focus();
	   return false;
	}
	if(form1.CooperateMode.value=="")
	{
		alert("技术需求解决方式不能为空!");
	    
	   return false;
	}
	if(form1.SearchKind.value=="")
	{
		alert("科技活动类型不能为空!");
	    
	   return false;
	}

	
	
	return true;
}

//获取国民经济的第二个下拉框的值

function getSecondGmjjhys(){
	if($("#XQJSYYHY1").val()==null||$("#XQJSYYHY1").val()=="")
	{
		//alert("空");
	}else{
		//alert($("#XQJSYYHY1").val());
		$.ajax({
		    type:"post",
		    dataType:"text",
		    url:"loadScondGmjjhys",
		    data:{
		     'secondCode':$("#XQJSYYHY1").val(),
		    },
		    success:function(data)
		    {
		    	//alert(data);
		    	 var data1 = eval("("+data+")"); 
		    	$("#XQJSYYHY2").html("");//清空XQJSYYHY2内容
				$("#XQJSYYHY2").append("<option value=''></option>");
				$.each(data1.secondgmjjhys, function(i, item) {
					if((item.code).substr(1, 4)!="0000")
					{
					$("#XQJSYYHY2").append(
							"<option value='"+ item.code+"'>"+item.title+"</option>");
					}
				});
		    }
		  });
	}
}


//获取国民经济行业的第三个下拉框的值
function getThirdGmjjhys(){
	if($("#XQJSYYHY2").val()==null||$("#XQJSYYHY2").val()=="")
	{
		//alert("空");
	}else{
		//alert($("#XQJSYYHY2").val());
		$.ajax({
		    type:"post",
		    dataType:"text",
		    url:"loadThirdGmjjhys",
		    data:{
		     'thirdCode':$("#XQJSYYHY2").val(),
		    },
		    success:function(data)
		    {
		    	//alert(data);
		    	 var data1 = eval("("+data+")"); 
		    	$("#XQJSYYHY3").html("");//清空XQJSYYHY3内容
				$("#XQJSYYHY3").append("<option value=''></option>");
				$.each(data1.thirdgmjjhys, function(i, item) {
					if((item.code).substr(3, 2)!="00")
					{
					$("#XQJSYYHY3").append(
							"<option value='"+ item.code+"'>"+item.title+"</option>");
					}
				});
		    }
		  });
	}
}

//获取学科分类第二个下拉框的值
function getSecondXkfls(){
	if($("#XKFL1").val()==null||$("#XKFL1").val()=="")
	{
		//alert("空");
	}else{
		//alert($("#XKFL1").val());
		$.ajax({
		    type:"post",
		    dataType:"text",
		    url:"loadScondXkfls",
		    data:{
		     'secondXcode':$("#XKFL1").val(),
		    },
		    success:function(data)
		    {
		    	//alert(data);
		    	 var data1 = eval("("+data+")"); 
		    	$("#XKFL2").html("");//清空XKFL2内容
				$("#XKFL2").append("<option value=''></option>");
				$.each(data1.secondxkfls, function(i, item) {
					if((item.code).substr(2, 5)!="00000")
					{
					$("#XKFL2").append(
							"<option value='"+ item.code+"'>"+item.title+"</option>");
					}
				});
		    }
		  });
	}
}

//获取学科分类的第三个下拉框的值
function getThirdXkfls(){
	if($("#XKFL2").val()==null||$("#XKFL2").val()=="")
	{
		//alert("空");
	}else{
		//alert($("#XKFL2").val());
		$.ajax({
		    type:"post",
		    dataType:"text",
		    url:"loadThirdXkfls",
		    data:{
		     'thirdXcode':$("#XKFL2").val(),
		    },
		    success:function(data)
		    {
		    	//alert(data);
		    	 var data1 = eval("("+data+")"); 
		    	$("#XKFL3").html("");//清空XKFL3内容
				$("#XKFL3").append("<option value=''></option>");
				$.each(data1.thirdxkfls, function(i, item) {
					if((item.code).substr(5, 2)!="00")
					{
					$("#XKFL3").append(
							"<option value='"+ item.code+"'>"+item.title+"</option>");
					}
				});
		    }
		  });
	}
}



window.onload = function(){
	var inpt= document.getElementById('form1').getElementsByTagName('input');  //获取表单下所有的input元素
	for(var i=0;i<inpt.length;i++){   //遍历获得的input元素
		if(inpt[i].type=='radio'){   //如果是单选按钮
			inpt[i].onclick=function(){ // input的单击事件
				//if(this.checked)

				if(this.nextSibling.nodeValue=="合作研发")
				{
					document.getElementById('HZYXDW').readOnly=false;
					Form1.HZYXDW.readonly=false;
				}
				else if(this.nextSibling.nodeValue=="独立研发"||this.nextSibling.nodeValue=="委托研发 "||this.nextSibling.nodeValue=="其他")
				{
					document.getElementById('HZYXDW').value="";
					//document.getElementById('CooperateOrganization').readonly=true;
					document.getElementById('HZYXDW').readOnly=true;
				}

				if(this.nextSibling.nodeValue=="基础研究")
				{
					studyrow.style.display="";
					belongrow.style.display="none";
					applyrow.style.display="none";

					/*  document.getElementById('otherField').value="";
		   document.getElementById('otherField').disabled=true;

					 */
				}
				else if(this.nextSibling.nodeValue=="应用研究"||this.nextSibling.nodeValue=="试验发展"||this.nextSibling.nodeValue=="研究发展与成果应用"||this.nextSibling.nodeValue=="技术推广与科技服务 "||this.nextSibling.nodeValue=="生产性活动 ")
				{
					studyrow.style.display="none";
					belongrow.style.display="";
					applyrow.style.display="";

					/*  document.getElementById('otherField').disabled=false;*/
				}


			}
		}
	}
	
	
	
	
	
	
	
	//使用ajax 加载 所属地域
	$.getJSON("loadLocalAreInfo", function(data) {
		$("#SZDY").html("");//清空SZDY内容
		$("#SZDY").append("<option value=''></option>");
		$.each(data.localAreas, function(i, item) {
			$("#SZDY").append(
					"<option value='"+ item.title +"'>"+ item.title +"</option>");
		});
	});
	//获取归口管理部门
	$.getJSON("loadGkglbms", function(data) {
		$("#GKGLBM").html("");//清空SZDY内容
		$("#GKGLBM").append("<option value=''></option>");
		$.each(data.gkglbms, function(i, item) {
			$("#GKGLBM").append(
					"<option value='"+ item.department+"'>"+item.department+"</option>");
		});
	});
	//获取国民经济的第一个下拉框值
	$.getJSON("loadFirstGmjjhys", function(data) {
		$("#XQJSYYHY1").html("");//清空SZDY内容
		$("#XQJSYYHY1").append("<option value=''></option>");
		$.each(data.firstgmjjhys, function(i, item) {
			$("#XQJSYYHY1").append(
					"<option value='"+ item.code+"'>"+item.title+"</option>");
		});
	});
	
	//获取学科分类的第一个下拉框的值
	$.getJSON("loadFirstXkfls", function(data) {
		$("#XKFL1").html("");//清空XKFL1内容
		$("#XKFL1").append("<option value=''></option>");
		$.each(data.firstxkfls, function(i, item) {
			$("#XKFL1").append(
					"<option value='"+ item.code+"'>"+item.title+"</option>");
		});
	});
	
}



