package com.sz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
//机构信息类
public class Institution {
	private String JGQC;		//机构全称
	private String GKGLBM;		//归口管理部门
	private String TXDZ;		//通讯地址
	private String SZDY;		//所在地域
	private String WZ;			//网址
	private String DZYX;		//电子邮箱
	private String FRDB;		//法人代表
	private String YZBM;		//邮政编码
	private String LXR;			//联系人
	private String GDDH;		//固定电话
	private String SJ;			//手机
	private String CZ;			//传真
	private String JGSX;		//机构属性
	private String JGJJ;		//机构简介
	
	
	@Id
	@GeneratedValue(generator = "usergenerator")    
	@GenericGenerator(name = "usergenerator", strategy = "assigned")
	public String getJGQC() {
		return JGQC;
	}
	public void setJGQC(String jGQC) {
		JGQC = jGQC;
	}
	public String getGKGLBM() {
		return GKGLBM;
	}
	public void setGKGLBM(String gKGLBM) {
		GKGLBM = gKGLBM;
	}
	public String getTXDZ() {
		return TXDZ;
	}
	public void setTXDZ(String tXDZ) {
		TXDZ = tXDZ;
	}
	public String getSZDY() {
		return SZDY;
	}
	public void setSZDY(String sZDY) {
		SZDY = sZDY;
	}
	public String getWZ() {
		return WZ;
	}
	public void setWZ(String wZ) {
		WZ = wZ;
	}
	public String getDZYX() {
		return DZYX;
	}
	public void setDZYX(String dZYX) {
		DZYX = dZYX;
	}
	public String getFRDB() {
		return FRDB;
	}
	public void setFRDB(String fRDB) {
		FRDB = fRDB;
	}
	public String getYZBM() {
		return YZBM;
	}
	public void setYZBM(String yZBM) {
		YZBM = yZBM;
	}
	public String getLXR() {
		return LXR;
	}
	public void setLXR(String lXR) {
		LXR = lXR;
	}
	public String getGDDH() {
		return GDDH;
	}
	public void setGDDH(String gDDH) {
		GDDH = gDDH;
	}
	public String getSJ() {
		return SJ;
	}
	public void setSJ(String sJ) {
		SJ = sJ;
	}
	public String getCZ() {
		return CZ;
	}
	public void setCZ(String cZ) {
		CZ = cZ;
	}
	public String getJGSX() {
		return JGSX;
	}
	public void setJGSX(String jGSX) {
		JGSX = jGSX;
	}
	public String getJGJJ() {
		return JGJJ;
	}
	public void setJGJJ(String jGJJ) {
		JGJJ = jGJJ;
	}
}
