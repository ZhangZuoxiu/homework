/**
 * Firstҳ���javascript
 */



  //������֤***********************************************************************
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
  document.getElementById("mesDZYX").innerHTML="<font color='red'>�����ʽ����!</font>";
  //document.getElementById("email").focus();
  return false;    
 }    
} 





//����ʱ����֤***********************************************************************
function YearYanzheng()
{
	var a = document.getElementById('XQQSNF').value; 
	var b = document.getElementById('XQJZNF').value;
	if(a>b)
	{
	    document.getElementById("mesyear").innerHTML="<font color='red'>��ȷ����һ�����С�ڵڶ���!</font>";
         document.getElementById("year1").focus();
         return false;
	}
	else
	{
		
		   document.getElementById("mesyear").innerHTML="<font color='red'></font>";
   	     return true;
	}
}


//ͨѶ��ַ��֤***********************************************************************

function TXDZYanzheng()
{
	var a = document.getElementById('TXDZ').value; 
	if(a=="")
	{
	    document.getElementById("mesTXDZ").innerHTML="<font color='red'>ͨѶ��ַ����Ϊ��!</font>";
         return false;
	}
	else
	{
		
		   document.getElementById("mesTXDZ").innerHTML="<font color='red'></font>";
   	     return true;
	}
}
//���˴�����֤***********************************************************************

function RepresentativeYanzheng()
{
	var a = document.getElementById('Representative').value; 
	if(a=="")
	{
	    document.getElementById("mesRepresentative").innerHTML="<font color='red'>���˴�����Ϊ��!</font>";
         return false;
	}
	else
	{
		
		   document.getElementById("mesRepresentative").innerHTML="<font color='red'></font>";
   	     return true;
	}
}

//��ϵ����֤***********************************************************************

function PeopleYanzheng()
{
	var a = document.getElementById('People').value; 
	if(a=="")
	{
	    document.getElementById("mesPeople").innerHTML="<font color='red'>��ϵ�˲���Ϊ��!</font>";
         return false;
	}
	else
	{
		
		   document.getElementById("mesPeople").innerHTML="<font color='red'></font>";
   	     return true;
	}
}

//�绰��֤***********************************************************************

function PhoneYanzheng()
{
	var a = document.getElementById('Phone').value; 
	if(a=="")
	{
	    document.getElementById("mesPhone").innerHTML="<font color='red'>�绰����Ϊ��!</font>";
         return false;
	}
	else
	{
		
		   document.getElementById("mesPhone").innerHTML="<font color='red'></font>";
   	     return true;
	}
}
//�ֻ���֤***********************************************************************

function CellphoneYanzheng()
{
	var a = document.getElementById('Cellphone').value; 
	if(a=="")
	{
	    document.getElementById("mesCellphone").innerHTML="<font color='red'>�ֻ�����Ϊ��!</font>";
         return false;
	}
	else
	{
		
		   document.getElementById("mesCellphone").innerHTML="<font color='red'></font>";
   	     return true;
	}
}

//�ؼ��ֱ���һ��һ������*********************************************************
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
//��֤ʣ���ַ���********************************************
function textCounter(field, countfield, maxlimit) {    
// ������3�������������֣�����Ԫ�����������ַ���    
       if (field.value.length > maxlimit)
	   {    
       //���Ԫ�����ַ�����������ַ�������������ַ����ضϣ�    
      field.value = field.value.substring(0, maxlimit);
	 
	   }
       else    
		//�ڼ������ı�������ʾʣ����ַ�����    
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
		alert("ͨѶ��ַ����Ϊ��!");
	    form1.Address.focus();
	   return false;
	}
	
	if(form1.DZYX.value=="")
	{
		alert("�������䲻��Ϊ��!");
	    form1.DZYX.focus();
	   return false;
	}
	if(form1.LegRep.value=="")
	{
		alert("���˴�����Ϊ��!");
	    form1.LegRep.focus();
	   return false;
	}
	if(form1.Linkman.value=="")
	{
		alert("��ϵ�˲���Ϊ��!");
	    form1.Linkman.focus();
	   return false;
	}
	if(form1.Cellphone.value=="")
	{
		alert("�ֻ�����Ϊ��!");
	    form1.Cellphone.focus();
	   return false;
	}
	
	if(form1.InsProp.value==""&&form1.InsProp.value==null)
	{
		alert("�������Բ���Ϊ��!");
	   return false;
	}
	if(form1.InsIntro.value=="")
	{
		alert("������鲻��Ϊ��!");
	    form1.InsIntro.focus();
	   return false;
	}
	if(form1.InsProp.value=="")
	{
		alert("�������Բ���Ϊ��!");
	   
	   return false;
	}
	if(form1.NeedName.value=="")
	{
		alert("�����������Ʋ���Ϊ��!");
	    form1.NeedName.focus();
	   return false;
	}
	if(form1.Question.value=="" &&form1.TechKey.value=="" &&form1.Exceptgoal.value=="")
	{
		alert("�����������Ϊ��!");
		form1.Question.focus();
	   return false;
	}
	if(form1.GJZ1.value=="")
	{
		alert("�ؼ��ֲ���Ϊ��!");
	    form1.GJZ1.focus();
	   return false;
	}
	if(form1.CooperateMode.value=="")
	{
		alert("������������ʽ����Ϊ��!");
	    
	   return false;
	}
	if(form1.SearchKind.value=="")
	{
		alert("�Ƽ�����Ͳ���Ϊ��!");
	    
	   return false;
	}

	
	
	return true;
}

//��ȡ���񾭼õĵڶ����������ֵ

function getSecondGmjjhys(){
	if($("#XQJSYYHY1").val()==null||$("#XQJSYYHY1").val()=="")
	{
		//alert("��");
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
		    	$("#XQJSYYHY2").html("");//���XQJSYYHY2����
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


//��ȡ���񾭼���ҵ�ĵ������������ֵ
function getThirdGmjjhys(){
	if($("#XQJSYYHY2").val()==null||$("#XQJSYYHY2").val()=="")
	{
		//alert("��");
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
		    	$("#XQJSYYHY3").html("");//���XQJSYYHY3����
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

//��ȡѧ�Ʒ���ڶ����������ֵ
function getSecondXkfls(){
	if($("#XKFL1").val()==null||$("#XKFL1").val()=="")
	{
		//alert("��");
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
		    	$("#XKFL2").html("");//���XKFL2����
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

//��ȡѧ�Ʒ���ĵ������������ֵ
function getThirdXkfls(){
	if($("#XKFL2").val()==null||$("#XKFL2").val()=="")
	{
		//alert("��");
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
		    	$("#XKFL3").html("");//���XKFL3����
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
	var inpt= document.getElementById('form1').getElementsByTagName('input');  //��ȡ�������е�inputԪ��
	for(var i=0;i<inpt.length;i++){   //������õ�inputԪ��
		if(inpt[i].type=='radio'){   //����ǵ�ѡ��ť
			inpt[i].onclick=function(){ // input�ĵ����¼�
				//if(this.checked)

				if(this.nextSibling.nodeValue=="�����з�")
				{
					document.getElementById('HZYXDW').readOnly=false;
					Form1.HZYXDW.readonly=false;
				}
				else if(this.nextSibling.nodeValue=="�����з�"||this.nextSibling.nodeValue=="ί���з� "||this.nextSibling.nodeValue=="����")
				{
					document.getElementById('HZYXDW').value="";
					//document.getElementById('CooperateOrganization').readonly=true;
					document.getElementById('HZYXDW').readOnly=true;
				}

				if(this.nextSibling.nodeValue=="�����о�")
				{
					studyrow.style.display="";
					belongrow.style.display="none";
					applyrow.style.display="none";

					/*  document.getElementById('otherField').value="";
		   document.getElementById('otherField').disabled=true;

					 */
				}
				else if(this.nextSibling.nodeValue=="Ӧ���о�"||this.nextSibling.nodeValue=="���鷢չ"||this.nextSibling.nodeValue=="�о���չ��ɹ�Ӧ��"||this.nextSibling.nodeValue=="�����ƹ���Ƽ����� "||this.nextSibling.nodeValue=="�����Ի ")
				{
					studyrow.style.display="none";
					belongrow.style.display="";
					applyrow.style.display="";

					/*  document.getElementById('otherField').disabled=false;*/
				}


			}
		}
	}
	
	
	
	
	
	
	
	//ʹ��ajax ���� ��������
	$.getJSON("loadLocalAreInfo", function(data) {
		$("#SZDY").html("");//���SZDY����
		$("#SZDY").append("<option value=''></option>");
		$.each(data.localAreas, function(i, item) {
			$("#SZDY").append(
					"<option value='"+ item.title +"'>"+ item.title +"</option>");
		});
	});
	//��ȡ��ڹ�����
	$.getJSON("loadGkglbms", function(data) {
		$("#GKGLBM").html("");//���SZDY����
		$("#GKGLBM").append("<option value=''></option>");
		$.each(data.gkglbms, function(i, item) {
			$("#GKGLBM").append(
					"<option value='"+ item.department+"'>"+item.department+"</option>");
		});
	});
	//��ȡ���񾭼õĵ�һ��������ֵ
	$.getJSON("loadFirstGmjjhys", function(data) {
		$("#XQJSYYHY1").html("");//���SZDY����
		$("#XQJSYYHY1").append("<option value=''></option>");
		$.each(data.firstgmjjhys, function(i, item) {
			$("#XQJSYYHY1").append(
					"<option value='"+ item.code+"'>"+item.title+"</option>");
		});
	});
	
	//��ȡѧ�Ʒ���ĵ�һ���������ֵ
	$.getJSON("loadFirstXkfls", function(data) {
		$("#XKFL1").html("");//���XKFL1����
		$("#XKFL1").append("<option value=''></option>");
		$.each(data.firstxkfls, function(i, item) {
			$("#XKFL1").append(
					"<option value='"+ item.code+"'>"+item.title+"</option>");
		});
	});
	
}



