package com.sz.dao;

import org.springframework.stereotype.Component;

import com.sz.model.User;

public interface UserDao {
	public void addUser(User user);
	public boolean checkUserByJGBM(String JGBM);
	public boolean checkUserByYHMandMM(User user);
	public String getJGQC(String YHM);
	
}
