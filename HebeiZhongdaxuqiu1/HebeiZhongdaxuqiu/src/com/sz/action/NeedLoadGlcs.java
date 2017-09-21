package com.sz.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.sz.model.Glcs;
import com.sz.service.NeedLoadManager;

@Component("NeedLoadGlcs")
@Scope("prototype")
public class NeedLoadGlcs extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Glcs> glcss;
	private NeedLoadManager needLoadManager;
	public String loadglcs()
	{
		glcss = needLoadManager.getGlcs();
		return "success";
	}
	
	public List<Glcs> getGlcss() {
		return glcss;
	}
	public void setGlcss(List<Glcs> glcss) {
		this.glcss = glcss;
	}
	@JSON(serialize=false) 
	public NeedLoadManager getNeedLoadManager() {
		return needLoadManager;
	}
	@Resource
	public void setNeedLoadManager(NeedLoadManager needLoadManager) {
		this.needLoadManager = needLoadManager;
	}
	

}
