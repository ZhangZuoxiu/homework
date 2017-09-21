package com.hibernateFile;

import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateSessionFactory {

	private static SessionFactory sessionFactory;
	private static Configuration configuration = new Configuration();
	
    private HibernateSessionFactory() {
    }
    static {
    	try
    	{
    		Configuration configure=configuration.configure("hibernate.cfg.xml");
    		sessionFactory=configure.buildSessionFactory();
    	}
    	catch(Exception e)
    	{
    		message("生成SessionFactory失败:"+e);
    	}
    }
	
	
    public static Session getSession() throws HibernateException {
    	return sessionFactory.openSession();
    }

	private static void message(String mess) {
		// TODO Auto-generated method stub
		int type=JOptionPane.YES_NO_OPTION;
		String title="提示信息";
		JOptionPane.showMessageDialog(null, mess, title, type);
	}



}