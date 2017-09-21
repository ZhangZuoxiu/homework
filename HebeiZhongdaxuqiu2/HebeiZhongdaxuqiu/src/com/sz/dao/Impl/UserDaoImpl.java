package com.sz.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.sz.dao.UserDao;
import com.sz.model.User;
import com.sz.util.Md5_Code;
@Component("userDao")
public class UserDaoImpl implements UserDao {

	private HibernateTemplate hibernateTemplate;
	@Override
	public void addUser(User user) {
		//String Md5_YHM =Md5_Code.Md5(user.getYHM());
		String Md5_YHMM =Md5_Code.Md5(user.getYHMM());
		
		//user.setYHM(Md5_YHM);
		user.setYHMM(Md5_YHMM);
		
		hibernateTemplate.save(user);
	}
	
	@Override
	public boolean checkUserByJGBM(String JGBM) {
		List<User> users=  hibernateTemplate.find("from User u where u.JGBM='"+JGBM+"'");
		if(users!=null&&users.size()>0)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public boolean checkUserByYHMandMM(User user) {
		//String Md5_YHM =Md5_Code.Md5(user.getYHM());
		String Md5_YHMM =Md5_Code.Md5(user.getYHMM());
		
		
		List<User> users=  hibernateTemplate.find("from User u where u.YHM='"+user.getYHM()+"' and u.YHMM ='"+Md5_YHMM+"'");
		if(users!=null&&users.size()>0)
		{
			return true;
		}
		return false;
	}
	

	@Override
	public String getJGQC(String YHM) {
		
		List<User> users=  hibernateTemplate.find("from User u where u.YHM='"+YHM+"'");
		String JGQC="";
		for(User user:users)
		{
			JGQC= user.getJGQC();
		}
		
		return JGQC;	
	}


	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


}
