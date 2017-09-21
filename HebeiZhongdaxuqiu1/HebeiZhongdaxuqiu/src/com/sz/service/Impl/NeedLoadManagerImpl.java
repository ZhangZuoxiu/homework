package com.sz.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sz.dao.NeedLoadDao;
import com.sz.model.Gkglbm;
import com.sz.model.Glcs;
import com.sz.model.Gmjjhy;
import com.sz.model.LocalArea;
import com.sz.model.Xkfl;
import com.sz.service.NeedLoadManager;

@Component("needLoadManager")
public class NeedLoadManagerImpl implements NeedLoadManager {

	private NeedLoadDao needLoadDao;
	
	//��ȡ����������������ֵ
	@Override
	public List<LocalArea> getLocalAreas() {
		return needLoadDao.LocalAreas();
	}
	//��ȡ��ڹ����ŵ��������ֵ
	@Override
	public List<Gkglbm> getGkglbms() {
		// TODO Auto-generated method stub
		return needLoadDao.Gkglbms();
	}
	//��ȡ���񾭼���ҵ�ĵ�һ���������ֵ
	@Override
	public List<Gmjjhy> getFirstGmjjhys() {
		// TODO Auto-generated method stub
		return needLoadDao.getFirstGmjjhys();
	}
	//��ȡ���񾭼���ҵ�ĵڶ����������ֵ
	@Override
	public List<Gmjjhy> getSecondGmjjhys(String secondCode) {
		// TODO Auto-generated method stub
		return needLoadDao.getSecondGmjjhys(secondCode);
	}
	//��ȡ���񾭼���ҵ�ĵ������������ֵ
	@Override
	public List<Gmjjhy> getThirdGmjjhys(String thirdCode) {
		// TODO Auto-generated method stub
		return needLoadDao.getThirdGmjjhys(thirdCode);
	}
	//��ȡѧ�Ʒ���ĵ�һ���������ֵ
	@Override
	public List<Xkfl> getFirstXkfls() {
		// TODO Auto-generated method stub
		return needLoadDao.getFirstXkfls();
	}
	//��ȡѧ�Ʒ���ĵڶ����������ֵ
	@Override
	public List<Xkfl> getSecondXkfls(String secondXcode) {
		// TODO Auto-generated method stub
		return needLoadDao.getSecondXkfls(secondXcode);
	}
	//��ȡѧ�Ʒ���ĵ������������ֵ
	@Override
	public List<Xkfl> getThirdXkfls(String thirdXcode) {
		// TODO Auto-generated method stub
		return needLoadDao.getThirdXkfls(thirdXcode);
	}
	//��ȡ�����ҵ�ֵ
	@Override
	public List<Glcs> getGlcs() {
		// TODO Auto-generated method stub
		return needLoadDao.getGlcs();
	}
	
	public NeedLoadDao getNeedLoadDao() {
		return needLoadDao;
	}
	@Resource
	public void setNeedLoadDao(NeedLoadDao needLoadDao) {
		this.needLoadDao = needLoadDao;
	}
	


}
