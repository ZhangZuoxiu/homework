package com.action;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.bean.DBBean;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteHouse extends ActionSupport {

	HttpServletRequest request;
	public String execute() throws Exception
	{
		request=ServletActionContext.getRequest();
		String id=request.getParameter("houseId").trim();
		System.out.println(id);
		String sql="delete from house where houseId='"+id+"'";
		System.out.println(sql);
		try 
		{
			DBBean db=new DBBean();
			db.executeUpdate(sql);
			db.close();
			return "success";
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			return "error";
		}
	}
}
