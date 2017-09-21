package com.sz.dao;

import java.util.List;

import com.sz.model.Need;
import com.sz.vo.NeedVoIns;

public interface NeedDao {
	//��������
	public boolean addNeed(Need need);
	//��ȡ���е�����
	public List<Need> getNeeds();
	//��ȡ�ض�id������
	public Need getNeedbyWJID(int WJID);
	//ɾ���ض�id������
	public boolean deleteNeedbyWJID(int WJID);
	//��ȡδ��˵�����
	public List<Need> getWeishenheNeeds();
	//����ʽ���ͨ����Ĺ������������ݿ�
	public boolean XXSHglcsIN(int wjid, String glcsbm);
	//����ʽ��˵�����������ݿ�
	public boolean XXSHyjIN(int wjid, String xsshyj);
	//��ȡδ���в�����˵�����
	public List<Need> getWeiBMshenheNeeds();
	//�������ͨ��
	public boolean BMSHTG(int wJID);
	//�������������������ݿ�
	public boolean BMSHyjIN(int wjid, String bmshyj);
	//��������ѯ����Ҫ������
	public List<NeedVoIns> getNeedsbyTiaojians(String zhuangtaiTiaojian,
			int zhuangtaiVal, String biaoyin1, String tiaojian1,
			String biaoyin2, String tiaojian2);
	
}
