package com.sz.vo;

import org.springframework.stereotype.Component;

@Component("userRegisterInfo")
public class UserRegisterInfo {
	private String JGBM;	//��������
	private String JGQC;	//����ȫ��
	private String YHM;  	//�û���
	private String YHMM;	//�û�����
	private String QRMM;	//ȷ������
	private String ZSXM;	//��ʵ����
	private String SFZH;	//���֤��
	
	
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
