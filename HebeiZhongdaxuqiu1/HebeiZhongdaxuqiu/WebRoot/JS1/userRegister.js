
function JGBM_yanzheng(){
	var JGBM = document.userRegisterForm.JGBM.value;
	var JGBM_Msg=document.getElementById("JGBM_Msg");
	if (JGBM ==""){
		JGBM_Msg.innerHTML = "<font color='red'>�������벻��Ϊ��!</font>";
	}
	else
	{
		if(isNaN(JGBM))
		{
			JGBM_Msg.innerHTML = "<font color='red'>���������֣�</font>";
		}else
		{
			JGBM_Msg.innerHTML = "";
		}
	}
	
}

function JGQC_yanzheng(){
	var JGQC = document.userRegisterForm.JGQC.value;
	var JGQC_Msg=document.getElementById("JGQC_Msg");
	if (JGQC ==""){
		JGQC_Msg.innerHTML = "<font color='red'>����ȫ�Ʋ���Ϊ��!</font>";
	}
	else
	{
		JGQC_Msg.innerHTML = "";
	}
	
}

function YHM_yanzheng(){
	var YHM = document.userRegisterForm.YHM.value;
	var YHM_Msg=document.getElementById("YHM_Msg");
	if (YHM ==""){
		YHM_Msg.innerHTML = "<font color='red'>�û�������Ϊ��!</font>";
	}
	else
	{
		YHM_Msg.innerHTML = "";
	}
	
}

function YHMM_yanzheng(){
	var YHMM = document.userRegisterForm.YHMM.value;
	var YHMM_Msg=document.getElementById("YHMM_Msg");
	if (YHMM ==""){
		YHMM_Msg.innerHTML = "<font color='red'>�û����벻��Ϊ��!</font>";
	}
	else
	{
		YHMM_Msg.innerHTML = "";
	}
	
}

function QRMM_yanzheng(){
	var QRMM = document.userRegisterForm.QRMM.value;
	var YHMM = document.userRegisterForm.YHMM.value;
	var QRMM_Msg=document.getElementById("QRMM_Msg");
	if (QRMM ==""){
		QRMM_Msg.innerHTML = "<font color='red'>ȷ�����벻��Ϊ��!</font>";
	}
	else
	{
		if(QRMM!=YHMM)
		{
			//alert(QRMM+":"+YHMM);
			QRMM_Msg.innerHTML = "<font color='red'>�������벻һ��!</font>";
		}else
		{
			QRMM_Msg.innerHTML = "";
		}
	}
	
}

function ZSXM_yanzheng(){
	var ZSXM = document.userRegisterForm.ZSXM.value;
	var ZSXM_Msg=document.getElementById("ZSXM_Msg");
	if (ZSXM ==""){
		ZSXM_Msg.innerHTML = "<font color='red'>��ʵ��������Ϊ��!</font>";
	}
	else
	{
		ZSXM_Msg.innerHTML = "";
	}
	
}

function SFZH_yanzheng(){
	var SFZH = document.userRegisterForm.SFZH.value;
	var SFZH_Msg=document.getElementById("SFZH_Msg");
	if (SFZH ==""){
		SFZH_Msg.innerHTML = "<font color='red'>���֤�Ų���Ϊ��!</font>";
	}
	else
	{
		SFZH_Msg.innerHTML = "";
	}
	
}

function CheckUser(){
	var JGBM = userRegisterForm.JGBM.value;
	var JGQC = userRegisterForm.JGQC.value;
	var YHM = userRegisterForm.YHM.value;
	var YHMM = userRegisterForm.YHMM.value;
	var QRMM = userRegisterForm.QRMM.value;
	var ZSXM = userRegisterForm.ZSXM.value;
	var SFZH = userRegisterForm.SFZH.value;
	if(JGBM=="")
	{
		alert("�������벻��Ϊ�գ�");
		return false;
	}
	
	if(JGQC=="")
	{
		alert("����ȫ�Ʋ���Ϊ�գ�");
		return false;
	}
	if(YHM=="")
	{
		alert("�û�������Ϊ�գ�");
		return false;
	}
	if(YHMM=="")
	{
		alert("�û����벻��Ϊ�գ�");
		return false;
	}
	if(QRMM=="")
	{
		alert("ȷ�����벻��Ϊ�գ�");
		return false;
	}
	if(QRMM!=YHMM)
	{
		alert("�����������벻��ͬ��");
		return false;
	}
	if(ZSXM=="")
	{
		alert("��ʵ��������Ϊ�գ�");
		return false;
	}
	if(SFZH=="")
	{
		alert("���֤�Ų���Ϊ�գ�");
		return false;
	}
	return true;
}