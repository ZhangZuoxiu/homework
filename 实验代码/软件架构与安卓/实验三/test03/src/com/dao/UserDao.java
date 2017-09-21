package com.dao;

import com.entity.House;
import com.hibernateFile.HibernateSessionFactory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {

	private Transaction transaction;
	private Session session;
	private Query query;
	public boolean saveInfo(Object obj)
	{
		try
		{
			session=HibernateSessionFactory.getSession();
			transaction=session.beginTransaction();
			session.saveOrUpdate(obj);
			transaction.commit();
			session.close();
			return true;
				
		  }
			
		catch(Exception e)
		{
			 e.printStackTrace();
			 return false;
		}
	}
	
	public boolean deleteInfo(Object obj)
	{
		try
		{
			session=HibernateSessionFactory.getSession();
			transaction=session.beginTransaction();
			session.delete(obj);
			transaction.commit();
			session.close();
			return true;
				
		  }
			
		catch(Exception e)
		{
			 e.printStackTrace();
			 return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<House> findAll()
	{
		 session=HibernateSessionFactory.getSession();
		 try
		 {
			 transaction=session.beginTransaction();
			 //HQL���
			 String queryString="";
			 queryString="from hotel as model";
			 query=session.createQuery(queryString);
			 List<House> list=(List<House>) query.list();
			 transaction.commit();
			 session.close();
			 return list;
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 return null;
		 }
	}
	
	@SuppressWarnings("unchecked")
	public List<House> findById( String value)
	{
		session=HibernateSessionFactory.getSession();
		 try
		 {
			 transaction=session.beginTransaction();
			 //HQL���
			 String queryString="";
			 queryString="from hotel as model where model.id='"+value+"'";
			 query=session.createQuery(queryString);
			 List<House> list=(List<House>) query.list();
			 transaction.commit();
			 session.close();
			 return list;
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 return null;
		 }
	}
}
