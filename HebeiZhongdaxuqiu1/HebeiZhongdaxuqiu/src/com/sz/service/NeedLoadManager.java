package com.sz.service;

import java.util.List;

import com.sz.model.Gkglbm;
import com.sz.model.Glcs;
import com.sz.model.Gmjjhy;
import com.sz.model.LocalArea;
import com.sz.model.Xkfl;

public interface NeedLoadManager {
	//�����������
	public List<LocalArea> getLocalAreas();
	
	//��ù�ڹ�����
	public List<Gkglbm> getGkglbms();
	
	//��ù��񾭼���ҵ�ĵ�һ��������
	public List<Gmjjhy> getFirstGmjjhys();
	
	//��ù��񾭼���ҵ�ĵڶ���������
	public List<Gmjjhy> getSecondGmjjhys(String secondCode);
	
	//��ù��񾭼���ҵ�ĵ�����������
	public List<Gmjjhy> getThirdGmjjhys(String thirdCode);
	
	//��ȡѧ�Ʒ���ĵ�һ��������
	public List<Xkfl> getFirstXkfls();

	//��ȡѧ�Ʒ���ĵڶ����������ֵ
	public List<Xkfl> getSecondXkfls(String secondXcode);
	
	//��ȡѧ�Ʒ���ĵ������������ֵ
	public List<Xkfl> getThirdXkfls(String thirdXcode);

	//��ȡ�����ҵ�ֵ
	public List<Glcs> getGlcs();
}
