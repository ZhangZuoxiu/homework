package com.sz.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sz.dao.UserDao;
import com.sz.model.User;
import com.sz.service.UserManager;

@Component("userManager")
public class UserManagerImpl implements UserManager
{

	
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}
	
	@Override
	public boolean exits(User user) {
		
		return userDao.checkUserByJGBM(user.getJGBM());
	}
	
	@Override
	public boolean loginCheck(User user) {
		// TODO Auto-generated method stub
		return userDao.checkUserByYHMandMM(user);
	}
	
	@Override
	public String getJGQC(String YHM) {
		// TODO Auto-generated method stub
		return userDao.getJGQC(YHM);
	}
	
	public UserDao getUserDao() {
		return userDao;
	}
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	


}
