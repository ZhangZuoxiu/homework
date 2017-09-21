package com.sz.vo;

import org.springframework.stereotype.Component;

@Component("userRegisterInfo")
public class UserRegisterInfo {
	private String JGBM;	//机构编码
	private String JGQC;	//机构全称
	private String YHM;  	//用户名
	private String YHMM;	//用户密码
	private String QRMM;	//确认密码
	private String ZSXM;	//真实姓名
	private String SFZH;	//身份证号
	
	
	public String getJGBM() {
		return JGBM;
	}
	public void setJGBM(String jGBM) {
		JGBM = jGBM;
	}
	public String getJGQC() {
		return JGQC;
	}
	public void setJGQC(String jGQC) {
		JGQC = jGQC;
	}
	public String getYHM() {
		return YHM;
	}
	public void setYHM(String yHM) {
		YHM = yHM;
	}
	public String getYHMM() {
		return YHMM;
	}
	public void setYHMM(String yHMM) {
		YHMM = yHMM;
	}
	public String getQRMM() {
		return QRMM;
	}
	public void setQRMM(String qRMM) {
		QRMM = qRMM;
	}
	public String getZSXM() {
		return ZSXM;
	}
	public void setZSXM(String zSXM) {
		ZSXM = zSXM;
	}
	public String getSFZH() {
		return SFZH;
	}
	public void setSFZH(String sFZH) {
		SFZH = sFZH;
	}
	
}
