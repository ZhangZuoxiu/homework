package com.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.bean.DBBean;
import com.bean.House;
import com.opensymphony.xwork2.ActionSupport;

public class FindHouse extends ActionSupport {
	
	HttpServletRequest request;
	public String execute() throws Exception
	{
		ResultSet rs=null;
		List<House> list=new ArrayList<House>() ;
		try 
		{
			
			String sql="select * from hotel";
			DBBean db=new DBBean();
			rs=db.executeQuery(sql);
			while(rs.next())
			{
				 House house=new House();
				 house.setHouseId(rs.getString(1));
				 house.setHouseState(rs.getString(2));
				 house.setHousePrice(rs.getInt(3));
				 house.setHouseDiscount(rs.getInt(4));
				 house.setHouseDeposit(rs.getInt(5));
				 list.add(house);
				 System.out.println(house);
			}
			rs.close();
			db.close();
			request=ServletActionContext.getRequest();
			request.getSession().setAttribute("list", list);
			return "success";
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			return "error";
		}
		
	}
}
