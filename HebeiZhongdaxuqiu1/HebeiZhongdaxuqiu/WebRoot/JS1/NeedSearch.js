 function change(){   
	  var pro = $("#Biaoyin1");    
	  var provalue = pro.find("option:selected").text();  
	  var tiaojian = $("#Tiaojian1");    
	  tiaojian.empty();//��ճ���������    
	  tiaojian.append($("<option>��ѡ��</option>"));
	  switch(provalue){     
	  case "��������":
		 
		  tiaojian.append($("<option>��ҵ</option>")); 
		  tiaojian.append($("<option>�ߵ�ԺУ</option>"));      
		  tiaojian.append($("<option>�о�����</option>")); 
		  tiaojian.append($("<option>����</option>"));         
		  break;      
     	  case "���ڵ���":
     		 // tiaojian.append($("<option>��ѡ��</option>"));
			  tiaojian.append($("<option>ʯ��ׯ��</option>"));   
			  tiaojian.append($("<option>��ɽ��</option>"));
			  tiaojian.append($("<option>�ػʵ���</option>"));    
			  tiaojian.append($("<option>������</option>")); 
			  tiaojian.append($("<option>��̨��</option>"));    
			  tiaojian.append($("<option>������</option>"));    
			  tiaojian.append($("<option>�żҿ���</option>"));   
			  tiaojian.append($("<option>�е���</option>"));
			  tiaojian.append($("<option>������</option>"));    
			  tiaojian.append($("<option>�ȷ���</option>")); 
			  tiaojian.append($("<option>��ˮ��</option>"));    
			  tiaojian.append($("<option>������</option>"));
			  tiaojian.append($("<option>������</option>"));    
			  tiaojian.append($("<option>����</option>"));
			  break;      
     case "��ڹ�����":  
    	 tiaojian.append($("<option>��ѡ��</option>"));
    	 var dep;
    	 
    	 $.getJSON("loadGkglbms", function(data) {
    			$("#Tiaojian1").html("");//Tiaojian1
    			$("#Tiaojian1").append("<option value=''>��ѡ��</option>");
    			$.each(data.gkglbms, function(i, item) {
    				$("#Tiaojian1").append(
    						"<option value='"+ item.department+"'>"+item.department+"</option>");
    			});
    		});
    	       
		  break;      	  
     case "������������ʽ": 
    	//  tiaojian.append($("<option>��ѡ��</option>"));
		  tiaojian.append($("<option>�����з�</option>")); 
		  tiaojian.append($("<option>ί���з�</option>"));      
		  tiaojian.append($("<option>�����з�</option>")); 
		  tiaojian.append($("<option>����</option>"));         
		  break;    
     case "�Ƽ������":
    //	  tiaojian.append($("<option>��ѡ��</option>"));
		  tiaojian.append($("<option>�����о�</option>")); 
		  tiaojian.append($("<option>Ӧ���о�</option>"));      
		  tiaojian.append($("<option>���鷢չ</option>")); 
		  tiaojian.append($("<option>�о������鷢չ�ɹ�Ӧ</option>"));  
		  tiaojian.append($("<option>�����ƹ���Ƽ�����</option>"));
		  tiaojian.append($("<option>�����Ի</option>"));
		  break;  
     case "������":
    	//  tiaojian.append($("<option>��ѡ��</option>"));
		  tiaojian.append($("<option>�칫��</option>"));   
		  tiaojian.append($("<option>���´�</option>"));
		  tiaojian.append($("<option>���ص�ί</option>"));    
		  tiaojian.append($("<option>���߷��洦</option>"));
		  tiaojian.append($("<option>�ƻ�����</option>"));    
		  tiaojian.append($("<option>ƽ̨�������</option>")); 
		  tiaojian.append($("<option>���ʺ�����</option>"));    
		  tiaojian.append($("<option>���¼�����</option>")); 
		  tiaojian.append($("<option>ũ��Ƽ���</option>"));    
		  tiaojian.append($("<option>��ᷢչ��</option>")); 
		  tiaojian.append($("<option>�ɹ����г���</option>"));    
		  tiaojian.append($("<option>�����</option>")); 
		  tiaojian.append($("<option>�����ݸɲ���</option>"));    
		  tiaojian.append($("<option>֪ʶ��Ȩ��</option>")); 
		  tiaojian.append($("<option>��ɺ�����</option>"));    
		  tiaojian.append($("<option>ɽ��</option>")); 
		  tiaojian.append($("<option>���ط�������</option>"));    
		  tiaojian.append($("<option>�Ƽ��з�����</option>")); 
		  tiaojian.append($("<option>�Ƽ��鱨�о�Ժ</option>"));    
		  tiaojian.append($("<option>���Ĺ�˾</option>")); 
		  tiaojian.append($("<option>�����</option>"));    
		  tiaojian.append($("<option>������</option>")); 
		  tiaojian.append($("<option>�Ƽ�������Ϣ����</option>"));    
		  tiaojian.append($("<option>�Ƽ�Ͷ������</option>")); 
		  tiaojian.append($("<option>�ɹ�ת������</option>"));    
		  tiaojian.append($("<option>��С��ҵ�����ʽ��������</option>")); 
		  tiaojian.append($("<option>���⽻������</option>"));    
		  
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
	 if(Zhuangtai=='δ���')
	 {
		 ZhuangtaiTiaojian = "XSSFSH";
		 ZhuangtaiVal = "0";
	 }
	 else if(Zhuangtai=='��ʽ���ͨ��')
	 {
		 ZhuangtaiTiaojian = "XSSFSH";
		 ZhuangtaiVal = "1";
	 }
	 else if(Zhuangtai=='��ʽ���δͨ��')
	 {
		 ZhuangtaiTiaojian = "XSSFSH";
		 ZhuangtaiVal = "2";
	 }
	 else if(Zhuangtai=='�������ͨ��')
	 {
		 ZhuangtaiTiaojian = "BMSFSH";
		 ZhuangtaiVal = "1";
	 }
	 else if(Zhuangtai=='�������δͨ��')
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
	    				 +'<td><a href="#">�鿴</a></td></tr>'
	    		 );
			 });
		 }
	 });
 }
 
 
 