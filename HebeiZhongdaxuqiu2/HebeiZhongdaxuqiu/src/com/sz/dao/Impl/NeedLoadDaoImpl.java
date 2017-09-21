package com.sz.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.sz.dao.NeedLoadDao;
import com.sz.model.Gkglbm;
import com.sz.model.Glcs;
import com.sz.model.Gmjjhy;
import com.sz.model.LocalArea;
import com.sz.model.Xkfl;

@Component("needLoadDao")
public class NeedLoadDaoImpl implements NeedLoadDao{

	private HibernateTemplate hibernateTemplate;
	
	//�����ݿ��ȡ����������������ֵ
	@Override
	public List<LocalArea> LocalAreas() {
		List<LocalArea> localAreas=  hibernateTemplate.find("from LocalArea");
		return localAreas;
	}
	
	//�����ݿ��ȡ��ڹ����ŵ��������ֵ
	@Override
	public List<Gkglbm> Gkglbms() {
		List<Gkglbm> gkglbms = hibernateTemplate.find("from Gkglbm");
		return gkglbms;
	}
	//�����ݿ��ȡ���񾭼���ҵ�ĵ�һ���������ֵ
	@Override
	public List<Gmjjhy> getFirstGmjjhys() {
		List<Gmjjhy>  gmjjhys= hibernateTemplate.find("from Gmjjhy g where g.code like '%0000'");
		return gmjjhys;
	}
	//�����ݿ��ȡ�����񾭼���ҵ�ĵڶ����������ֵ
	@Override
	public List<Gmjjhy> getSecondGmjjhys(String secondCode) {
		List<Gmjjhy>  gmjjhys= hibernateTemplate.find("from Gmjjhy g where g.code like '"+secondCode.substring(0, 1)+"%00'");
		return gmjjhys;
	}
	//�����ݿ��ȡ���񾭼���ҵ�ĵ������������ֵ
	@Override
	public List<Gmjjhy> getThirdGmjjhys(String thirdCode) {
		List<Gmjjhy>  gmjjhys= hibernateTemplate.find("from Gmjjhy g where g.code like '"+thirdCode.substring(0, 3)+"%'");
		return gmjjhys;
	}
	
	//�����ݿ��ȡѧ�Ʒ���ĵ�һ���������ֵ
	@Override
	public List<Xkfl> getFirstXkfls() {
		List<Xkfl>  xkfls= hibernateTemplate.find("from Xkfl x where x.code like '%00000'");
		return xkfls;
	}
	//�����ݿ��ȡѧ�Ʒ���ĵڶ����������ֵ
	@Override
	public List<Xkfl> getSecondXkfls(String secondXcode) {
		List<Xkfl>  xkfls= hibernateTemplate.find("from Xkfl x where x.code like '"+secondXcode.substring(0, 2)+"%00'");
		return xkfls;
	}
	//�����ݿ���ѧ�Ʒ���ĵ������������ֵ
	@Override
	public List<Xkfl> getThirdXkfls(String thirdXcode) {
		List<Xkfl>  xkfls= hibernateTemplate.find("from Xkfl x where x.code like '"+thirdXcode.substring(0, 5)+"%'");
		return xkfls;
	}
	//��ȡ�����ҵ�ֵ
	@Override
	public List<Glcs> getGlcs() {
		List<Glcs> glcss = hibernateTemplate.find("from Glcs");
		return glcss;
	}

	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
