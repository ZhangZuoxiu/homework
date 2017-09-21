package com.sz.service;

import com.sz.model.User;

public interface UserManager {
	public void addUser(User user);
	public boolean exits(User user);
	public boolean loginCheck(User user);
	public String getJGQC(String YHM);
}
