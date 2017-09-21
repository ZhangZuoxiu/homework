package com.action;

import javax.servlet.http.HttpServletRequest;
import com.bean.DBBean;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateHouse extends ActionSupport {

	HttpServletRequest request;
	private String id;
	private String price;
	private String discount;
	private String deposit;
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getDiscount() {
		return discount;
	}


	public void setDiscount(String discount) {
		this.discount = discount;
	}


	public String getDeposit() {
		return deposit;
	}


	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}


	public String execute() throws Exception
	{
		String sql="update house set price='"+Integer.parseInt(this.getPrice())+"'" +
				",discount='"+Integer.parseInt(this.getDiscount())+"'," +
				"deposit='"+Integer.parseInt(this.getDeposit())+"' where hotel='"+this.getId()+"'";
		try 
		{
			DBBean db=new DBBean();
			db.executeUpdate(sql);
			db.close();
			return "success";
		} catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
	}
}
