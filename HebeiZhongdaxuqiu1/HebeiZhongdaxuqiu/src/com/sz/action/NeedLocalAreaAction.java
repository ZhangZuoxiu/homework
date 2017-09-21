package com.sz.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.sz.model.Gkglbm;
import com.sz.model.Gmjjhy;
import com.sz.model.LocalArea;
import com.sz.model.Xkfl;
import com.sz.service.NeedLoadManager;

@Component("NeedLocalAreaAction")
@Scope("prototype")
public class NeedLocalAreaAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NeedLoadManager needLoadManager;
	private List<LocalArea> localAreas;
	private List<Gkglbm> gkglbms;
	private List<Gmjjhy> firstgmjjhys;
	private List<Gmjjhy> secondgmjjhys;
	private List<Gmjjhy> thirdgmjjhys;
	//获取第二个国民经济行业的code
	private String secondCode;
	//获取第二个国民经济行业的code
	private String thirdCode;
	
	private List<Xkfl> firstxkfls;
	private List<Xkfl> secondxkfls;
	private List<Xkfl> thirdxkfls;
	//获取第二个学科分类的code
	private String secondXcode;
	//获取第三个学科分类的code
	private String thirdXcode;
	
	//方法
	//获取所属领地的下拉框的值
	public String loadLocalAreInfo(){
		
		localAreas=needLoadManager.getLocalAreas();
		System.out.println(localAreas.size());
		return "success";
	}
	//获取归口管理部门的下拉框的值
	public String loadGkglbms(){
		
		gkglbms =needLoadManager.getGkglbms();
		System.out.println(gkglbms.size());
		return "success";
	}
	//获取国民经济行业的第一个下拉框的值
	public String loadFirstGmjjhys(){
		
		firstgmjjhys =needLoadManager.getFirstGmjjhys();
		System.out.println(firstgmjjhys.size());
		return "success";
	}
	//获取国民经济行业第二个下拉框的值
	public String loadScondGmjjhys(){
		secondgmjjhys =needLoadManager.getSecondGmjjhys(secondCode);
		System.out.println(secondgmjjhys.size());
		return "success";
	}
	//获取国民经济行业第三个下拉框的值
	public String loadThirdGmjjhys(){
		thirdgmjjhys =needLoadManager.getThirdGmjjhys(thirdCode);
		System.out.println(thirdgmjjhys.size());
		return "success";
	}
	//获取学科分类第一个下拉框的值
	public String loadFirstXkfls(){
		
		firstxkfls =needLoadManager.getFirstXkfls();
		System.out.println(firstxkfls.size());
		return "success";
	}
	//获取学科分类第二个下拉框的值
	public String loadScondXkfls(){
		secondxkfls =needLoadManager.getSecondXkfls(secondXcode);
		System.out.println(secondxkfls.size());
		return "success";
	}
	//获取学科分类第三个下拉框的值
	public String loadThirdXkfls(){
		thirdxkfls =needLoadManager.getThirdXkfls(thirdXcode);
		System.out.println(thirdxkfls.size());
		return "success";
	}
	
	public List<LocalArea> getLocalAreas() {
		return localAreas;
	}

	public void setLocalAreas(List<LocalArea> localAreas) {
		this.localAreas = localAreas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@JSON(serialize=false) 
	public NeedLoadManager getNeedLoadManager() {
		return needLoadManager;
	}
	@Resource
	public void setNeedLoadManager(NeedLoadManager needLoadManager) {
		this.needLoadManager = needLoadManager;
	}

	public List<Gkglbm> getGkglbms() {
		return gkglbms;
	}

	public void setGkglbms(List<Gkglbm> gkglbms) {
		this.gkglbms = gkglbms;
	}

	public List<Gmjjhy> getFirstgmjjhys() {
		return firstgmjjhys;
	}

	public void setFirstgmjjhys(List<Gmjjhy> firstgmjjhys) {
		this.firstgmjjhys = firstgmjjhys;
	}

	public String getSecondCode() {
		return secondCode;
	}

	public void setSecondCode(String secondCode) {
		this.secondCode = secondCode;
	}

	public List<Gmjjhy> getSecondgmjjhys() {
		return secondgmjjhys;
	}

	public void setSecondgmjjhys(List<Gmjjhy> secondgmjjhys) {
		this.secondgmjjhys = secondgmjjhys;
	}

	public String getThirdCode() {
		return thirdCode;
	}

	public void setThirdCode(String thirdCode) {
		this.thirdCode = thirdCode;
	}

	public List<Gmjjhy> getThirdgmjjhys() {
		return thirdgmjjhys;
	}

	public void setThirdgmjjhys(List<Gmjjhy> thirdgmjjhys) {
		this.thirdgmjjhys = thirdgmjjhys;
	}

	public List<Xkfl> getFirstxkfls() {
		return firstxkfls;
	}

	public void setFirstxkfls(List<Xkfl> firstxkfls) {
		this.firstxkfls = firstxkfls;
	}

	public List<Xkfl> getSecondxkfls() {
		return secondxkfls;
	}

	public void setSecondxkfls(List<Xkfl> secondxkfls) {
		this.secondxkfls = secondxkfls;
	}

	public String getSecondXcode() {
		return secondXcode;
	}

	public void setSecondXcode(String secondXcode) {
		this.secondXcode = secondXcode;
	}


	public String getThirdXcode() {
		return thirdXcode;
	}

	public void setThirdXcode(String thirdXcode) {
		this.thirdXcode = thirdXcode;
	}
	public List<Xkfl> getThirdxkfls() {
		return thirdxkfls;
	}
	public void setThirdxkfls(List<Xkfl> thirdxkfls) {
		this.thirdxkfls = thirdxkfls;
	}

	
	

}
