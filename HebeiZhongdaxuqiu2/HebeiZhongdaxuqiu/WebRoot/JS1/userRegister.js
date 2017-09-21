
function JGBM_yanzheng(){
	var JGBM = document.userRegisterForm.JGBM.value;
	var JGBM_Msg=document.getElementById("JGBM_Msg");
	if (JGBM ==""){
		JGBM_Msg.innerHTML = "<font color='red'>机构编码不能为空!</font>";
	}
	else
	{
		if(isNaN(JGBM))
		{
			JGBM_Msg.innerHTML = "<font color='red'>请输入数字！</font>";
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
		JGQC_Msg.innerHTML = "<font color='red'>机构全称不能为空!</font>";
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
		YHM_Msg.innerHTML = "<font color='red'>用户名不能为空!</font>";
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
		YHMM_Msg.innerHTML = "<font color='red'>用户密码不能为空!</font>";
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
		QRMM_Msg.innerHTML = "<font color='red'>确认密码不能为空!</font>";
	}
	else
	{
		if(QRMM!=YHMM)
		{
			//alert(QRMM+":"+YHMM);
			QRMM_Msg.innerHTML = "<font color='red'>两次密码不一致!</font>";
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
		ZSXM_Msg.innerHTML = "<font color='red'>真实姓名不能为空!</font>";
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
		SFZH_Msg.innerHTML = "<font color='red'>身份证号不能为空!</font>";
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
		alert("机构编码不能为空！");
		return false;
	}
	
	if(JGQC=="")
	{
		alert("机构全称不能为空！");
		return false;
	}
	if(YHM=="")
	{
		alert("用户名不能为空！");
		return false;
	}
	if(YHMM=="")
	{
		alert("用户密码不能为空！");
		return false;
	}
	if(QRMM=="")
	{
		alert("确认密码不能为空！");
		return false;
	}
	if(QRMM!=YHMM)
	{
		alert("两次输入密码不相同！");
		return false;
	}
	if(ZSXM=="")
	{
		alert("真实姓名不能为空！");
		return false;
	}
	if(SFZH=="")
	{
		alert("身份证号不能为空！");
		return false;
	}
	return true;
}