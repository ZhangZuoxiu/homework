package com.sz.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.sz.dao.InsDao;
import com.sz.model.Institution;

@Component("insDao")
public class InsDaoImpl implements InsDao{

	private HibernateTemplate hibernateTemplate;
	
	@Override
	public boolean saveIns(Institution institution) {
		try{
			List<Institution> inss=  hibernateTemplate.find("from Institution i where i.JGQC='"+institution.getJGQC()+"'");
			if(inss!=null&&inss.size()>0)
			{
				
				Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();          
				session.clear();          
				session.update(institution);
				System.out.println("111");
				
			}
			else
			{
				getHibernateTemplate().refresh(institution);
				hibernateTemplate.save(institution);
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}


	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


}
