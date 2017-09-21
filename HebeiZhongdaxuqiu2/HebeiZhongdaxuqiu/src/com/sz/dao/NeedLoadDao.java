package com.sz.dao;

import java.util.List;

import com.sz.model.Gkglbm;
import com.sz.model.Glcs;
import com.sz.model.Gmjjhy;
import com.sz.model.LocalArea;
import com.sz.model.Xkfl;

public interface NeedLoadDao {
	//获取所属地域：
	public List<LocalArea> LocalAreas();
	
	//获取归口管理部门
	public List<Gkglbm> Gkglbms();
	
	//获取国民经济行业的第一个下拉框
	public List<Gmjjhy> getFirstGmjjhys();
	
	//获取国民经济行业的第二个下拉框
	public List<Gmjjhy> getSecondGmjjhys(String secondCode);
	
	//获取国民经济行业的第三个下拉框
	public List<Gmjjhy> getThirdGmjjhys(String thirdCode);
	
	//获取学科分类第一个下拉框
	public List<Xkfl> getFirstXkfls();

	//获取学科分类的第二个下拉框
	public List<Xkfl> getSecondXkfls(String secondXcode);

	//获取学科分类的第三个下拉框的值
	public List<Xkfl> getThirdXkfls(String thirdXcode);

	//获取管理处室的值
	public List<Glcs> getGlcs();
}
