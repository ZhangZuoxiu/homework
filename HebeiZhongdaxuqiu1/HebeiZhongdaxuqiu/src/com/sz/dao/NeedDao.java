package com.sz.dao;

import java.util.List;

import com.sz.model.Need;
import com.sz.vo.NeedVoIns;

public interface NeedDao {
	//增加需求
	public boolean addNeed(Need need);
	//获取所有的需求
	public List<Need> getNeeds();
	//获取特定id的需求
	public Need getNeedbyWJID(int WJID);
	//删除特定id的需求
	public boolean deleteNeedbyWJID(int WJID);
	//获取未审核的需求
	public List<Need> getWeishenheNeeds();
	//将形式审核通过后的管理处室填入数据库
	public boolean XXSHglcsIN(int wjid, String glcsbm);
	//将形式审核的意见填入数据库
	public boolean XXSHyjIN(int wjid, String xsshyj);
	//获取未进行部门审核的需求
	public List<Need> getWeiBMshenheNeeds();
	//部门审核通过
	public boolean BMSHTG(int wJID);
	//将部门审核意见存入数据库
	public boolean BMSHyjIN(int wjid, String bmshyj);
	//多条件查询出想要的需求
	public List<NeedVoIns> getNeedsbyTiaojians(String zhuangtaiTiaojian,
			int zhuangtaiVal, String biaoyin1, String tiaojian1,
			String biaoyin2, String tiaojian2);
	
}
