package com.action;

import com.bean.DBBean;
import com.opensymphony.xwork2.ActionSupport;

public class AddHouse extends ActionSupport {
	
	private String id;
	private String discount;
	private String price;
	private String deposit;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String execute() throws Exception
	{
		try 
		{
			String sql="insert into hotel values('"+this.getId()+"','未 入住','"+Integer.parseInt(this.getPrice())+"'" +
					",'"+Integer.parseInt(this.getDiscount())+"','"+Integer.parseInt(this.getDeposit())+"')";
			/*System.out.println(sql);*/
			DBBean db=new DBBean();
			db.executeUpdate(sql);
			db.close();
			return "success";
		} 
		catch (Exception e) {
			// TODO: handle exception
			return "error";
		}
		
	}
}
