

    function check(){
    	if (form2.Iname.value == "") {
            form2.Iname.focus();
            alert("机构名称不能为空");
            return false;
        }
    	//归口管理部门
    	if (form2.Ibelong.value == "请选择") {
            form2.Ibelong.focus();
            alert("请选择归口管理部门");
            return false;
        }
        if (form2.Iadd.value == "") {
            form2.Iadd.focus();
            alert("通讯地址不能为空");
            return false;
        }
        if (form2.Iadd1.value == "") {
            form2.Iadd1.focus();
            alert("所在地域不能为空");
            return false;
        }
      /*  if (form2.dwwz.value == "") {
            form2.dwwz.focus();
            alert("单位网址不能为空");
            return false;
        }*/
        if (form2.Iemail.value == "") {
            form2.Iemailfocus();
            alert("电子信箱不能为空");
            return false;
        }
        if (form2.Ifrdb.value == "") {
            form2.Ifrdb.focus();
            alert("法人代表不能为空");
            return false;
        }
     /*   if (form2.yzbm.value == "") {
            form2.yzbm.focus();
            alert("邮政编码不能为空");
            return false;
        }*/
        if (form2.Iclient.value == "") {
            form2.Iclient.focus();
            alert("联系人不能为空");
            return false;
        }
//        if (form2.gd.value == "") {
//            form2.gd.focus();
//            alert("固话不能为空");
//            return false;
//        }
        if (form2.Iphone.value == "") {
            form2.Iphone.focus();
            alert("手机不能为空");
            return false;
        }
      /*if (form2.cz.value == "") {
            form2.cz.focus();
            alert("传真不能为空");
            return false;
        }*/
        
        //机构属性
	    var first=document.getElementsByName("Ipeoprety");
    	var jgsx=""; 
    	for (var i = 0; i < first.length; i++) { 
            if(first[i].checked == true){
                jgsx=first[i].value;
            }
        }
    	if(jgsx==""){
    		alert("请选择机构属性");
    		return false;
    	}
        
        if (form2.Iintro.value == "") {
            form2.Iintro.focus();
            alert("机构简介不能为空");
            return false;
        }
        if (form2.Ixqname.value == "") {
            form2.Ixqname.focus();
            alert("技术需求名称不能为空");
            return false;
        }
        //需求时限
        if(form2.year1.value == "")
        {
        	form2.Iyear1.focus();
            alert("请输入需求开始年份");
            return false;
        }
        if(form2.Iyear2.value == "")
        {
        	form2.Iyear2.focus();
            alert("请输入需求结束年份");
            return false;
        }
        if (form2.Ixqintro1.value == "") {
            form2.Ixqintro1.focus();
            alert("主要问题不能为空");
            return false;
        }
        if (form2.Ixqintro2.value == "") {
            form2.Ixqintro2.focus();
            alert("技术关键不能为空");
            return false;
        }
        if (form2.Ixqintro3.value == "") {
            form2.Ixqintro3.focus();
            alert("预期目标不能为空");
            return false;
        }
        //关键字
        if (form2.Igjz1.value == "") {
            form2.Igjz1.focus();
            alert("关键字不能为空");
            return false;
        }
        //研究类型
        var fourth=document.getElementsByName("Itype");
    	var yjlx=""; 
    	for (var i = 0; i < fourth.length; i++) { 
            if(fourth[i].checked == true){
                yjlx=fourth[i].value;
            }
        }
    	if(yjlx==""){
    		alert("请选择研究类型");
    		return false;
    	} 	
        if(fourth[0].checked == false)
        {
        	var second=document.getElementsByName("Ilingyu");
        	var xqly=""; 
        	for (var i = 0; i < second.length; i++) { 
                if(second[i].checked == true){
                    xqly=xqly+second[i].value+"、";
                }
            }
        	if(second[12].checked==true)
        	{
        		if(form2.Ielse.value=="")
        		{
        			alert("请填写其他技术内容");
        			return false;
        		}
        		xqly=xqly+"、"+form2.Ielse.value;
        	}
        	if(xqly==""){
        		alert("请选择需求技术所属领域");
        		return false;
        	}
        	document.getElementById("xqly").value=xqly;
        	
        	if (form2.Ixqyyhy.value == "") {
                form2.Ixqyyhy.focus();
                alert("技术应用行业不能为空");
                return false;
            }
        }
	    //合作模式
	    var third=document.getElementsByName("Ihzms");
    	var hzms=""; 
    	for (var i = 0; i < third.length; i++) { 
            if(third[i].checked == true){
                hzms=hzms+third[i].value+"、";
            }
        }
    	if(hzms==""){
    		alert("请选择技术需求解决方式");
    		return false;
    	}
    	document.getElementById("hzms").value=hzms;
/*
        if (form2.ztz.value == "") {
            form2.ztz.focus();
            alert("计划总投资不能为空");
            return false;
        }*/
       
        return true;
    }
    function readWrite()
    {
    	//document.getElementById("gjz2").setAttribute("readOnly", false);
    	for(var i=2;i<6;i++)
    	{
    		if(document.getElementById("Igjz"+(i-1)).value!="")
    		{
    			document.getElementById("Igjz"+i).readOnly=false;
    		}
    	}
    }
    
   
  

 