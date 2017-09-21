package com.sz.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.sz.model.Need;
import com.sz.service.NeedManager;
import com.sz.vo.NeedVoIns;
@Component("needSearchAction")
@Scope("prototype")
public class NeedSearchAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ZhuangtaiTiaojian;
	private int ZhuangtaiVal;
	private String Biaoyin1;
	private String Biaoyin2;
	private String Tiaojian1;
	private String Tiaojian2;
	private List<NeedVoIns> needVoIns;
	private NeedManager needManager;
	
	public String getNeedsbyTiaojian()
	{
		/*System.out.println(ZhuangtaiTiaojian+":"+ZhuangtaiVal+"/"+Biaoyin1+":"+Tiaojian1+"/"+Biaoyin2+":"+Tiaojian2);*/
		needVoIns = needManager.getNeedsbyTiaojians(ZhuangtaiTiaojian,ZhuangtaiVal,Biaoyin1,Tiaojian1,Biaoyin2,Tiaojian2);
		
		return "success";
	}
	
	
	@JSON(serialize=false) 
	public String getZhuangtaiTiaojian() {
		return ZhuangtaiTiaojian;
	}
	public void setZhuangtaiTiaojian(String zhuangtaiTiaojian) {
		ZhuangtaiTiaojian = zhuangtaiTiaojian;
	}
	@JSON(serialize=false) 
	public int getZhuangtaiVal() {
		return ZhuangtaiVal;
	}
	public void setZhuangtaiVal(int zhuangtaiVal) {
		ZhuangtaiVal = zhuangtaiVal;
	}
	@JSON(serialize=false) 
	public String getBiaoyin1() {
		return Biaoyin1;
	}
	public void setBiaoyin1(String biaoyin1) {
		Biaoyin1 = biaoyin1;
	}
	@JSON(serialize=false) 
	public String getBiaoyin2() {
		return Biaoyin2;
	}
	public void setBiaoyin2(String biaoyin2) {
		Biaoyin2 = biaoyin2;
	}
	@JSON(serialize=false) 
	public String getTiaojian1() {
		return Tiaojian1;
	}
	public void setTiaojian1(String tiaojian1) {
		Tiaojian1 = tiaojian1;
	}
	@JSON(serialize=false) 
	public String getTiaojian2() {
		return Tiaojian2;
	}
	public void setTiaojian2(String tiaojian2) {
		Tiaojian2 = tiaojian2;
	}


	@JSON(serialize=false) 
	public NeedManager getNeedManager() {
		return needManager;
	}
	@Resource
	public void setNeedManager(NeedManager needManager) {
		this.needManager = needManager;
	}


	public List<NeedVoIns> getNeedVoIns() {
		return needVoIns;
	}


	public void setNeedVoIns(List<NeedVoIns> needVoIns) {
		this.needVoIns = needVoIns;
	}

}
