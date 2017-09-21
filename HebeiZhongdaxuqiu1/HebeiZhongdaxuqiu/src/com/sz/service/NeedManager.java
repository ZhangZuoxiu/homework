package com.sz.service;

import java.util.List;

import com.sz.model.Need;
import com.sz.vo.NeedVoIns;

public interface NeedManager {
	//添加需求
	public Boolean addNeed(Need need);
	//获取所有的需求
	public List<Need> getNeeds();
	//获取特定id的需求
	public Need getNeedbyWJID(int WJID);
	//删除特定id的需求
	public boolean deleteNeedbyWJID(int WJID);
	//获取未审核的需求
	public List<Need> getWeishenheNeeds();
	//保存形式审核后所选的管理处室
	public boolean XXSHglcsIN(int wjid, String glcsbm);
	//保存形式审核不通过的意见
	public boolean XXSHyjIN(int wjid, String xsshyj);
	//获取未进行部门审核的需求
	public List<Need> getWeiBMshenheNeeds();
	//部门审核通过
	public boolean BMSHTG(int wJID);
	//填写部门审核不通过的意见
	public boolean BMSHyjIN(int wjid, String bmshyj);
	
	//多条件查询出需求
	public List<NeedVoIns> getNeedsbyTiaojians(String zhuangtaiTiaojian,
			int zhuangtaiVal, String biaoyin1, String tiaojian1,
			String biaoyin2, String tiaojian2);

	
}
