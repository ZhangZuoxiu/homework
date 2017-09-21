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
	
	public boolean isInsExits(String jgqc)
	{
		boolean b = false;
		List<Institution> inss=  hibernateTemplate.find("from Institution i where i.JGQC='"+jgqc+"'");
		if(inss!=null&&inss.size()>0)
		{
			b=true;
		}
		return b;
	}
	@Override
	public boolean saveIns(Institution institution) {
		try{
			
			if(isInsExits(institution.getJGQC()))
			{
				
				Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();          
				session.clear();
				//getHibernateTemplate().refresh(institution);
				System.out.println("11"+institution.getJGQC());
				session.update(institution);
				/*hibernateTemplate.update(institution);*/
				 
				
			}
			else
			{
				if(institution==null)
				{
					getHibernateTemplate().refresh(institution);
				}
				//getHibernateTemplate().refresh(institution);
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
