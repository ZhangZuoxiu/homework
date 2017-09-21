package com.sz.vo;

import org.springframework.stereotype.Component;

import com.sz.model.Institution;
import com.sz.model.Need;

@Component("needVoIns")
public class NeedVoIns {
	private int WJID;
	private int XSSFSH;
	private String XSSHYJ;
	private int BMSFSH;
	private String BMSHYJ;
	private String  GLCSBM;
	private String JGQC;
	private String JSXQMC;
	private int XQQSNF;
	private int XQJZNF;
	private String XQGS;
	private String GJZ;
	private int JHZTZ;
	private String JSXQJJFS;
	private String HZYXDW;
	private String KJHDLX;
	private String XKFL;
	private String XQJSSSLY;
	private String QTJSMS;
	private String XQJSYYHY;
	
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
	
	public NeedVoIns()
	{}
	public NeedVoIns(Need n,Institution I)
	{
	    WJID =  n.getWJID();
	    XSSFSH = n.getXSSFSH();
		XSSHYJ = n.getXSSHYJ();
		BMSFSH = n.getBMSFSH();
		BMSHYJ = n.getBMSHYJ();
		GLCSBM = n.getGLCSBM();
		JGQC = n.getJGQC();
		JSXQMC = n.getJSXQMC();
		XQQSNF = n.getXQQSNF();
		XQJZNF = n.getXQJZNF();
		XQGS = n.getXQGS();
		GJZ = n.getGJZ();
		JHZTZ = n.getJHZTZ();
		JSXQJJFS = n.getJSXQJJFS();
		HZYXDW = n.getHZYXDW();
		KJHDLX = n.getKJHDLX();
		XKFL = n.getXKFL();
		XQJSSSLY = n.getXQJSSSLY();
		QTJSMS = n.getQTJSMS();
	    XQJSYYHY = n.getXQJSYYHY();
	    
	    GKGLBM = I.getGKGLBM();
		TXDZ = I.getTXDZ();	
		SZDY = I.getSZDY();
		WZ = I.getWZ();
		DZYX = I.getDZYX();
		FRDB = I.getFRDB();		
		YZBM = I.getYZBM();
		LXR = I.getLXR(); 
		GDDH = I.getGDDH();
		SJ = I.getSJ();
		CZ = I.getCZ(); 
		JGSX = I.getJGSX();
		JGJJ = I.getJGJJ();
	}
	
	public int getWJID() {
		return WJID;
	}
	public void setWJID(int wJID) {
		WJID = wJID;
	}
	public int getXSSFSH() {
		return XSSFSH;
	}
	public void setXSSFSH(int xSSFSH) {
		XSSFSH = xSSFSH;
	}
	public String getXSSHYJ() {
		return XSSHYJ;
	}
	public void setXSSHYJ(String xSSHYJ) {
		XSSHYJ = xSSHYJ;
	}
	public int getBMSFSH() {
		return BMSFSH;
	}
	public void setBMSFSH(int bMSFSH) {
		BMSFSH = bMSFSH;
	}
	public String getBMSHYJ() {
		return BMSHYJ;
	}
	public void setBMSHYJ(String bMSHYJ) {
		BMSHYJ = bMSHYJ;
	}
	public String getGLCSBM() {
		return GLCSBM;
	}
	public void setGLCSBM(String gLCSBM) {
		GLCSBM = gLCSBM;
	}
	public String getJGQC() {
		return JGQC;
	}
	public void setJGQC(String jGQC) {
		JGQC = jGQC;
	}
	public String getJSXQMC() {
		return JSXQMC;
	}
	public void setJSXQMC(String jSXQMC) {
		JSXQMC = jSXQMC;
	}
	public int getXQQSNF() {
		return XQQSNF;
	}
	public void setXQQSNF(int xQQSNF) {
		XQQSNF = xQQSNF;
	}
	public int getXQJZNF() {
		return XQJZNF;
	}
	public void setXQJZNF(int xQJZNF) {
		XQJZNF = xQJZNF;
	}
	public String getXQGS() {
		return XQGS;
	}
	public void setXQGS(String xQGS) {
		XQGS = xQGS;
	}
	public String getGJZ() {
		return GJZ;
	}
	public void setGJZ(String gJZ) {
		GJZ = gJZ;
	}
	public int getJHZTZ() {
		return JHZTZ;
	}
	public void setJHZTZ(int jHZTZ) {
		JHZTZ = jHZTZ;
	}
	public String getJSXQJJFS() {
		return JSXQJJFS;
	}
	public void setJSXQJJFS(String jSXQJJFS) {
		JSXQJJFS = jSXQJJFS;
	}
	public String getHZYXDW() {
		return HZYXDW;
	}
	public void setHZYXDW(String hZYXDW) {
		HZYXDW = hZYXDW;
	}
	public String getKJHDLX() {
		return KJHDLX;
	}
	public void setKJHDLX(String kJHDLX) {
		KJHDLX = kJHDLX;
	}
	public String getXKFL() {
		return XKFL;
	}
	public void setXKFL(String xKFL) {
		XKFL = xKFL;
	}
	public String getXQJSSSLY() {
		return XQJSSSLY;
	}
	public void setXQJSSSLY(String xQJSSSLY) {
		XQJSSSLY = xQJSSSLY;
	}
	public String getQTJSMS() {
		return QTJSMS;
	}
	public void setQTJSMS(String qTJSMS) {
		QTJSMS = qTJSMS;
	}
	public String getXQJSYYHY() {
		return XQJSYYHY;
	}
	public void setXQJSYYHY(String xQJSYYHY) {
		XQJSYYHY = xQJSYYHY;
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
