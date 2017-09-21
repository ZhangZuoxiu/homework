package com.sz.dao;

import java.util.List;

import com.sz.model.Gkglbm;
import com.sz.model.Glcs;
import com.sz.model.Gmjjhy;
import com.sz.model.LocalArea;
import com.sz.model.Xkfl;

public interface NeedLoadDao {
	//��ȡ��������
	public List<LocalArea> LocalAreas();
	
	//��ȡ��ڹ�����
	public List<Gkglbm> Gkglbms();
	
	//��ȡ���񾭼���ҵ�ĵ�һ��������
	public List<Gmjjhy> getFirstGmjjhys();
	
	//��ȡ���񾭼���ҵ�ĵڶ���������
	public List<Gmjjhy> getSecondGmjjhys(String secondCode);
	
	//��ȡ���񾭼���ҵ�ĵ�����������
	public List<Gmjjhy> getThirdGmjjhys(String thirdCode);
	
	//��ȡѧ�Ʒ����һ��������
	public List<Xkfl> getFirstXkfls();

	//��ȡѧ�Ʒ���ĵڶ���������
	public List<Xkfl> getSecondXkfls(String secondXcode);

	//��ȡѧ�Ʒ���ĵ������������ֵ
	public List<Xkfl> getThirdXkfls(String thirdXcode);

	//��ȡ�����ҵ�ֵ
	public List<Glcs> getGlcs();
}
