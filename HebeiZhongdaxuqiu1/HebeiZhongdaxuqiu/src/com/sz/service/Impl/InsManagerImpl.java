package com.sz.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sz.dao.InsDao;
import com.sz.model.Institution;
import com.sz.service.InsManager;

@Component("insManager")
public class InsManagerImpl implements InsManager {

	private InsDao insDao;
	
	@Override
	public boolean saveIns(Institution institution) {
		return insDao.saveIns(institution);
	}
	public InsDao getInsdao() {
		return insDao;
	}
	@Resource
	public void setInsdao(InsDao insDao) {
		this.insDao = insDao;
	}


}
