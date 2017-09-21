package com.sz.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sz.dao.NeedDao;
import com.sz.model.Need;
import com.sz.service.NeedManager;
import com.sz.vo.NeedVoIns;
@Component("needManager")
public class NeedManagerImpl implements NeedManager {

	private NeedDao needDao;
	
	@Override
	public Boolean addNeed(Need need) {
		return needDao.addNeed(need);
	}
	
	@Override
	public List<Need> getNeeds() {
		return needDao.getNeeds();
	}

	@Override
	public Need getNeedbyWJID(int WJID) {
		return needDao.getNeedbyWJID(WJID);
	}

	@Override
	public boolean deleteNeedbyWJID(int WJID) {
		return needDao.deleteNeedbyWJID(WJID);
	}

	@Override
	public List<Need> getWeishenheNeeds() {
		
		return needDao.getWeishenheNeeds();
	}
	@Override
	public boolean XXSHglcsIN(int wjid, String glcsbm) {
		
		return needDao.XXSHglcsIN(wjid,glcsbm);
	}
	@Override
	public boolean XXSHyjIN(int wjid, String xsshyj) {
		
		return needDao.XXSHyjIN(wjid,xsshyj);
	}

	@Override
	public List<Need> getWeiBMshenheNeeds() {
		
		return needDao.getWeiBMshenheNeeds();
	}

	@Override
	public boolean BMSHTG(int wJID) {
		
		return needDao.BMSHTG(wJID);
	}

	@Override
	public boolean BMSHyjIN(int wjid, String bmshyj) {
		
		return needDao.BMSHyjIN(wjid,bmshyj);
	}
	
	@Override
	public List<NeedVoIns> getNeedsbyTiaojians(String zhuangtaiTiaojian,
			int zhuangtaiVal, String biaoyin1, String tiaojian1,
			String biaoyin2, String tiaojian2) {
		
		return needDao.getNeedsbyTiaojians(zhuangtaiTiaojian,zhuangtaiVal,biaoyin1,tiaojian1,biaoyin2,tiaojian2);
	}
	
	public NeedDao getNeedDao() {
		return needDao;
	}
	@Resource
	public void setNeedDao(NeedDao needDao) {
		this.needDao = needDao;
	}

	
}
