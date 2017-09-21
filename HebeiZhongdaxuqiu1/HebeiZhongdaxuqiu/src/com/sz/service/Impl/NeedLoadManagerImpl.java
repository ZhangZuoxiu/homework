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
	
	//获取所属地域的下拉框的值
	@Override
	public List<LocalArea> getLocalAreas() {
		return needLoadDao.LocalAreas();
	}
	//获取归口管理部门的下拉框的值
	@Override
	public List<Gkglbm> getGkglbms() {
		// TODO Auto-generated method stub
		return needLoadDao.Gkglbms();
	}
	//获取国民经济行业的第一个下拉框的值
	@Override
	public List<Gmjjhy> getFirstGmjjhys() {
		// TODO Auto-generated method stub
		return needLoadDao.getFirstGmjjhys();
	}
	//获取国民经济行业的第二个下拉框的值
	@Override
	public List<Gmjjhy> getSecondGmjjhys(String secondCode) {
		// TODO Auto-generated method stub
		return needLoadDao.getSecondGmjjhys(secondCode);
	}
	//获取国民经济行业的第三个下拉框的值
	@Override
	public List<Gmjjhy> getThirdGmjjhys(String thirdCode) {
		// TODO Auto-generated method stub
		return needLoadDao.getThirdGmjjhys(thirdCode);
	}
	//获取学科分类的第一个下拉框的值
	@Override
	public List<Xkfl> getFirstXkfls() {
		// TODO Auto-generated method stub
		return needLoadDao.getFirstXkfls();
	}
	//获取学科分类的第二个下拉框的值
	@Override
	public List<Xkfl> getSecondXkfls(String secondXcode) {
		// TODO Auto-generated method stub
		return needLoadDao.getSecondXkfls(secondXcode);
	}
	//获取学科分类的第三个下拉框的值
	@Override
	public List<Xkfl> getThirdXkfls(String thirdXcode) {
		// TODO Auto-generated method stub
		return needLoadDao.getThirdXkfls(thirdXcode);
	}
	//获取管理处室的值
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
