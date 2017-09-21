package com.sz.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.sz.dao.NeedDao;
import com.sz.model.Need;
import com.sz.vo.NeedVoIns;

@Component("needDao")
public class NeedDaoImpl implements NeedDao{

	private HibernateTemplate hibernateTemplate;
	
	@Override
	public boolean addNeed(Need need) {
		try{
			hibernateTemplate.save(need);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@Override
	public List<Need> getNeeds() {
		List<Need> needs =  hibernateTemplate.find("from Need");
		return needs;
	}
	
	@Override
	public Need getNeedbyWJID(int WJID) {
		Need need = (Need) hibernateTemplate.get(Need.class, WJID);
		return need;
	}
	
	@Override
	public boolean deleteNeedbyWJID(int WJID) {
		boolean b= true;
		try{
			hibernateTemplate.delete(hibernateTemplate.get(Need.class, WJID));
		}catch(Exception e){
			e.printStackTrace();
			b=false;
		}
		return b;
	}
	
	@Override
	public List<Need> getWeishenheNeeds() {
		List<Need> needs =  hibernateTemplate.find("from Need n where n.XSSFSH="+0);
		return needs;
	}
	
	@Override
	public boolean XXSHglcsIN(int wjid, String glcsbm) {
		boolean b =true;
		try {
			Need need = (Need) hibernateTemplate.load(Need.class, wjid);
			need.setGLCSBM(glcsbm);
			need.setXSSFSH(1);
			hibernateTemplate.update(need);
		} catch (Exception e) {
			b= false;
		}
		return b;
	}
	@Override
	public boolean XXSHyjIN(int wjid, String xsshyj) {
		boolean b =true;
		try {
			Need need = (Need) hibernateTemplate.load(Need.class, wjid);
			need.setXSSHYJ(xsshyj);
			need.setXSSFSH(2);
			hibernateTemplate.update(need);
		} catch (Exception e) {
			b= false;
		}
		return b;
	}
	@Override
	public List<Need> getWeiBMshenheNeeds() {
		List<Need> needs =  hibernateTemplate.find("from Need n where n.XSSFSH ="+1+" and n.BMSFSH="+0);
		return needs;
	}
	
	@Override
	public boolean BMSHTG(int wJID) {
		boolean b =true;
		try {
			Need need = (Need) hibernateTemplate.load(Need.class, wJID);
			
			need.setBMSFSH(1);
			hibernateTemplate.update(need);
		} catch (Exception e) {
			b= false;
		}
		return b;
	}
	@Override
	public boolean BMSHyjIN(int wjid, String bmshyj) {
		boolean b =true;
		try {
			Need need = (Need) hibernateTemplate.load(Need.class, wjid);
			need.setBMSHYJ(bmshyj);
			need.setBMSFSH(2);
			hibernateTemplate.update(need);
		} catch (Exception e) {
			b= false;
		}
		return b;
	}
	
	@Override
	public List<NeedVoIns> getNeedsbyTiaojians(String zhuangtaiTiaojian,
			int zhuangtaiVal, String biaoyin1, String tiaojian1,
			String biaoyin2, String tiaojian2) {
		String sql = "";
		String first = "";
		String firstContent = "";
		String second = "";
		String secondContent ="";
		String third = "";
		String thirdContent = "";
		
		if("".equals(zhuangtaiTiaojian))
		{
			first = "1";
			firstContent = "1";
		}else
		{
			first = "n."+zhuangtaiTiaojian;
			firstContent = zhuangtaiVal+"";
		}
		
		if("".equals(biaoyin1))
		{
			second = "1";
			secondContent = "1";
		}
		else{
			second = biaoyin1;
			secondContent = tiaojian1;
		}
		
		if("".equals(biaoyin2))
		{
			third = "1";
			thirdContent = "1";
		}else
		{
			third = biaoyin2;
			thirdContent = tiaojian2;
		}
		
		
		Session session = getHibernateTemplate().getSessionFactory().getCurrentSession();
		
		sql = "select * from Need n join institution I where "+first+" = '"+firstContent+"' and "+second+" = '"+secondContent+"' and "+third+" = '"+thirdContent+"' and I.JGQC = n.JGQC";
		System.out.println(sql);
		
		List list = session.createSQLQuery(sql).list();

		//List<NeedVoIns> needVoIns = ListToNeedVoIns(list);
		return list;
	}
	
	public List<NeedVoIns> ListToNeedVoIns(List list)
	{
		List<NeedVoIns> needVoInss = new ArrayList<NeedVoIns>();
		for(int i = 0; i < list.size();i++){
			NeedVoIns  needVoIns= new NeedVoIns();
		     Object[] object = (Object[])list.get(i);
		     //Double.parseDouble(String.valueOf(object[6]))
		     needVoIns.setWJID((Integer) object[0]);
		     needVoIns.setXSSFSH((Integer)object[1]);
		     needVoIns.setXSSHYJ((String)object[2]);
		     needVoIns.setBMSFSH((Integer)object[3]);
		     needVoIns.setBMSHYJ((String)object[4]);
		     needVoIns.setGLCSBM((String)object[5]);
		     needVoIns.setJSXQMC((String)object[6]);
		     needVoIns.setJGQC((String)object[7]);
		     needVoIns.setXQQSNF((Integer)object[8]);
		     needVoIns.setXQJZNF((Integer)object[9]);
		     needVoIns.setXQGS((String)object[10]);
		     needVoIns.setGJZ((String)object[11]);
		     needVoIns.setJHZTZ((Integer)object[12]);
		     needVoIns.setJSXQJJFS((String)object[13]);
		     needVoIns.setHZYXDW((String)object[14]);
		     needVoIns.setKJHDLX((String)object[15]);
		     needVoIns.setXKFL((String)object[16]);
		     needVoIns.setXQJSSSLY((String)object[17]);
		     needVoIns.setQTJSMS((String)object[18]);
		     needVoIns.setXQJSYYHY((String)object[19]);
		     
		     needVoIns.setGKGLBM((String)object[21]);
		     needVoIns.setTXDZ((String)object[22]);
		     needVoIns.setSZDY((String)object[23]);
		     needVoIns.setWZ((String)object[24]);
		     needVoIns.setDZYX((String)object[25]);
		     needVoIns.setFRDB((String)object[26]);
		     needVoIns.setYZBM((String)object[27]);
		     needVoIns.setLXR((String)object[28]);
		     needVoIns.setGDDH((String)object[29]);
		     needVoIns.setSJ((String)object[30]);
		     needVoIns.setCZ((String)object[31]);
		     needVoIns.setJGSX((String)object[32]);
		     needVoIns.setJGJJ((String)object[33]);
		     
		     
		     needVoInss.add(needVoIns);
		}
		
		
		return needVoInss;
		
	}
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
