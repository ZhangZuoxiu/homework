package com.sz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
//������Ϣ��
public class Institution {
	private String JGQC;		//����ȫ��
	private String GKGLBM;		//��ڹ�����
	private String TXDZ;		//ͨѶ��ַ
	private String SZDY;		//���ڵ���
	private String WZ;			//��ַ
	private String DZYX;		//��������
	private String FRDB;		//���˴���
	private String YZBM;		//��������
	private String LXR;			//��ϵ��
	private String GDDH;		//�̶��绰
	private String SJ;			//�ֻ�
	private String CZ;			//����
	private String JGSX;		//��������
	private String JGJJ;		//�������
	
	
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
