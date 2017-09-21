package com.sz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User {
	
	private String JGBM;	//��������
	private String JGQC;	//����ȫ��
	private String YHM;  	//�û���
	private String YHMM;	//�û�����
	private String ZSXM;	//��ʵ����
	private String SFZH;	//���֤��
	
	@Id
	@GeneratedValue(generator = "usergenerator")    
	@GenericGenerator(name = "usergenerator", strategy = "assigned")
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
