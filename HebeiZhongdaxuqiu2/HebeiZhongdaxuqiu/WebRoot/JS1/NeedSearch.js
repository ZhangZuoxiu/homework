 function change(){   
	  var pro = $("#Biaoyin1");    
	  var provalue = pro.find("option:selected").text();  
	  var tiaojian = $("#Tiaojian1");    
	  tiaojian.empty();//清空城市下拉框    
	  tiaojian.append($("<option>请选择</option>"));
	  switch(provalue){     
	  case "机构属性":
		 
		  tiaojian.append($("<option>企业</option>")); 
		  tiaojian.append($("<option>高等院校</option>"));      
		  tiaojian.append($("<option>研究机构</option>")); 
		  tiaojian.append($("<option>其他</option>"));         
		  break;      
     	  case "所在地域":
     		 // tiaojian.append($("<option>请选择</option>"));
			  tiaojian.append($("<option>石家庄市</option>"));   
			  tiaojian.append($("<option>唐山市</option>"));
			  tiaojian.append($("<option>秦皇岛市</option>"));    
			  tiaojian.append($("<option>邯郸市</option>")); 
			  tiaojian.append($("<option>邢台市</option>"));    
			  tiaojian.append($("<option>保定市</option>"));    
			  tiaojian.append($("<option>张家口市</option>"));   
			  tiaojian.append($("<option>承德市</option>"));
			  tiaojian.append($("<option>沧州市</option>"));    
			  tiaojian.append($("<option>廊坊市</option>")); 
			  tiaojian.append($("<option>衡水市</option>"));    
			  tiaojian.append($("<option>定州市</option>"));
			  tiaojian.append($("<option>辛集市</option>"));    
			  tiaojian.append($("<option>其他</option>"));
			  break;      
     case "归口管理部门":  
    	 tiaojian.append($("<option>请选择</option>"));
    	 var dep;
    	 
    	 $.getJSON("loadGkglbms", function(data) {
    			$("#Tiaojian1").html("");//Tiaojian1
    			$("#Tiaojian1").append("<option value=''>请选择</option>");
    			$.each(data.gkglbms, function(i, item) {
    				$("#Tiaojian1").append(
    						"<option value='"+ item.department+"'>"+item.department+"</option>");
    			});
    		});
    	       
		  break;      	  
     case "技术需求解决方式": 
    	//  tiaojian.append($("<option>请选择</option>"));
		  tiaojian.append($("<option>独立研发</option>")); 
		  tiaojian.append($("<option>委托研发</option>"));      
		  tiaojian.append($("<option>合作研发</option>")); 
		  tiaojian.append($("<option>其他</option>"));         
		  break;    
     case "科技活动类型":
    //	  tiaojian.append($("<option>请选择</option>"));
		  tiaojian.append($("<option>基础研究</option>")); 
		  tiaojian.append($("<option>应用研究</option>"));      
		  tiaojian.append($("<option>试验发展</option>")); 
		  tiaojian.append($("<option>研究与试验发展成果应</option>"));  
		  tiaojian.append($("<option>技术推广与科技服务</option>"));
		  tiaojian.append($("<option>生产性活动</option>"));
		  break;  
     case "管理处室":
    	//  tiaojian.append($("<option>请选择</option>"));
		  tiaojian.append($("<option>办公室</option>"));   
		  tiaojian.append($("<option>人事处</option>"));
		  tiaojian.append($("<option>机关党委</option>"));    
		  tiaojian.append($("<option>政策法规处</option>"));
		  tiaojian.append($("<option>计划财务处</option>"));    
		  tiaojian.append($("<option>平台与基础处</option>")); 
		  tiaojian.append($("<option>国际合作处</option>"));    
		  tiaojian.append($("<option>高新技术处</option>")); 
		  tiaojian.append($("<option>农村科技处</option>"));    
		  tiaojian.append($("<option>社会发展处</option>")); 
		  tiaojian.append($("<option>成果与市场处</option>"));    
		  tiaojian.append($("<option>监察室</option>")); 
		  tiaojian.append($("<option>离退休干部处</option>"));    
		  tiaojian.append($("<option>知识产权局</option>")); 
		  tiaojian.append($("<option>半干旱中心</option>"));    
		  tiaojian.append($("<option>山办</option>")); 
		  tiaojian.append($("<option>机关服务中心</option>"));    
		  tiaojian.append($("<option>科技研发中心</option>")); 
		  tiaojian.append($("<option>科技情报研究院</option>"));    
		  tiaojian.append($("<option>器材公司</option>")); 
		  tiaojian.append($("<option>基金办</option>"));    
		  tiaojian.append($("<option>档案馆</option>")); 
		  tiaojian.append($("<option>科技管理信息中心</option>"));    
		  tiaojian.append($("<option>科技投资中心</option>")); 
		  tiaojian.append($("<option>成果转换中心</option>"));    
		  tiaojian.append($("<option>中小企业创新资金管理中心</option>")); 
		  tiaojian.append($("<option>对外交流中心</option>"));    
		  
		  break;      
	  }
  }
 
 var i =4;
 function tiaojianAdd(){
	 i=i+1;
	 var html=$("#t2").html();
	 $("#t3").append("<div id=t"+i+">"+html+"</div>");
 }
 
 function tiaojiandelete(){
	 $("#t"+i).remove();
	 i=i-1;
	 if(i<4)
	 {
		 i=4;
	 }
 }
 
 function getNeedsbyTiaojian(){
	 var Zhuangtai = $("#Zhuangtai").val();
	 var ZhuangtaiTiaojian="";
	 var ZhuangtaiVal ="";
	 if(Zhuangtai=='未审核')
	 {
		 ZhuangtaiTiaojian = "XSSFSH";
		 ZhuangtaiVal = "0";
	 }
	 else if(Zhuangtai=='形式审核通过')
	 {
		 ZhuangtaiTiaojian = "XSSFSH";
		 ZhuangtaiVal = "1";
	 }
	 else if(Zhuangtai=='形式审核未通过')
	 {
		 ZhuangtaiTiaojian = "XSSFSH";
		 ZhuangtaiVal = "2";
	 }
	 else if(Zhuangtai=='部门审核通过')
	 {
		 ZhuangtaiTiaojian = "BMSFSH";
		 ZhuangtaiVal = "1";
	 }
	 else if(Zhuangtai=='部门审核未通过')
	 {
		 ZhuangtaiTiaojian = "BMSFSH";
		 ZhuangtaiVal = "2";
	 }else
	 {
		 ZhuangtaiTiaojian = "";
		 ZhuangtaiVal = "";
	 }
	 
	 alert(ZhuangtaiTiaojian+":"+ZhuangtaiVal);
	 var Biaoyin1 = $("#Biaoyin1").val();
	 var Tiaojian1 = $("#Tiaojian1").val();
	 var Biaoyin2 = $("#Biaoyin2").val();
	 var Tiaojian2 = $("#Tiaojian2").val();
	 $.ajax({
		 type:"post",
		 dataType:"text",
		 url:"getNeedsbyTiaojian",
		 data:{
			 'ZhuangtaiTiaojian': ZhuangtaiTiaojian,
			 'ZhuangtaiVal' :ZhuangtaiVal,
			 'Biaoyin1' : Biaoyin1,
			 'Tiaojian1' : Tiaojian1,
			 'Biaoyin2' : Biaoyin2,
			 'Tiaojian2' : Tiaojian2
		 },
		 success:function(data)
		 {
			 var data1 = eval("("+data+")"); 
			 $("#needTable tbody").html("");
			 /*alert(data1.needs.);*/
			 $.each(data1.needVoIns, function(i, item) {
			 $("#needTable tbody").append('<tr><td>'+item.WJID+'</td>'
	    				 +'<td>'+item.JSXQMC+'</td>'
	    				 +'<td>'+item.GJZ+'</td>'
	    				 +'<td>'+item.JHZTZ+'</td>'
	    				 +'<td>'+item.KJHDLX+'</td>'
	    				 +'<td><a href="#">查看</a></td></tr>'
	    		 );
			 });
		 }
	 });
 }
 
 
 