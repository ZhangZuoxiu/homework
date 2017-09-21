package com.sz.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.sz.model.Institution;
import com.sz.model.Need;
import com.sz.service.InsManager;
import com.sz.service.NeedManager;
import com.sz.service.UserManager;

@Component("needAction")
@Scope("prototype")
public class NeedAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private Institution institution;
	private Need need;
	private Need needBack;
	private List<Need> needs;
	private int WJID;
	private InsManager insManager;
	private NeedManager needManager;
	
	public String needSubmit()
	{
		String flag ="success";
		System.out.println(need.getXKFL());
		System.out.println(need.getXQJSYYHY());
		
		if(insManager.saveIns(institution)&&needManager.addNeed(need))
		{
			flag="success";
		}
		else{
			flag="fail";
		}
		return flag;
	}

	public String needLoad(){
		
		needs = needManager.getNeeds();
		return "success";
	}
	
	public String needUpdateLoad(){
		//System.out.println(need.getWJID());
		needBack = needManager.getNeedbyWJID(need.getWJID());
		return "success";
	}
	
	public String needDelete(){
		//System.out.println(need.getWJID());
		if(needManager.deleteNeedbyWJID(need.getWJID()))
		{return "success";}
		return "fail";
	}
	
	public String needCheck(){
		needBack = needManager.getNeedbyWJID(need.getWJID());
		return "success";
	}
	
	public String needModeAuditLoad(){
		needs = needManager.getWeishenheNeeds();
		return "success";
	}
	
	
	public String needModeAudit()
	{
		needBack = needManager.getNeedbyWJID(need.getWJID());
		return "success";
	}
	
	public String needXXSHTG()
	{
		return "success";
	}
	
	public String needTJXXSHTG()
	{
		String flag="";
		if(needManager.XXSHglcsIN(need.getWJID(),need.getGLCSBM()))
		{
			flag="success";
		}
		else
		{
			flag="fail";
		}
		
		
		return flag;
	}
	
	public String needXXSHBTG()
	{
		return "success";
	}
	
	public String needTJXXSHBTG()
	{
		/*System.out.println(need.getXSSHYJ());
		System.out.println(need.getWJID());*/
		String flag="";
		if(needManager.XXSHyjIN(need.getWJID(),need.getXSSHYJ()))
		{
			flag="success";
		}
		else
		{
			flag="fail";
		}
		
		
		return flag;
	}
	
	public String needDepartmentAuditLoad()
	{
		needs = needManager.getWeiBMshenheNeeds();
		return "success";
	}
	public String needDepartmentAudit()
	{
		needBack = needManager.getNeedbyWJID(need.getWJID());
		return "success";
	}
	
	public String needBMSHTG()
	{
		String flag="";
		if(needManager.BMSHTG(WJID))
		{
			flag="success";
		}
		else
		{
			flag="fail";
		}
		
		
		return flag;
	}
	
	public String needBMSHBTG()
	{
		return "success";
	}
	
	public String  needTJBMSHBTG()
	{
		
		String flag="";
		if(needManager.BMSHyjIN(need.getWJID(),need.getBMSHYJ()))
		{
			flag="success";
		}
		else
		{
			flag="fail";
		}
		
		
		return flag;
	}
	
	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}


	public InsManager getInsManager() {
		return insManager;
	}

	@Resource
	public void setInsManager(InsManager insManager) {
		this.insManager = insManager;
	}


	public Need getNeed() {
		return need;
	}

	public void setNeed(Need need) {
		this.need = need;
	}

	public NeedManager getNeedManager() {
		return needManager;
	}
	@Resource
	public void setNeedManager(NeedManager needManager) {
		this.needManager = needManager;
	}

	public List<Need> getNeeds() {
		return needs;
	}

	public void setNeeds(List<Need> needs) {
		this.needs = needs;
	}

	public Need getNeedBack() {
		return needBack;
	}

	public void setNeedBack(Need needBack) {
		this.needBack = needBack;
	}

	public int getWJID() {
		return WJID;
	}

	public void setWJID(int wJID) {
		WJID = wJID;
	}


}
