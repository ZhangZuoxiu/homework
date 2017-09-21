package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.UserDao;
import com.entity.House;

public class AddHouse extends HttpServlet {

	protected void processRequest(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException
	{
		response.setContentType("text/html;charset=utf-8");
		String id=request.getParameter("id");
		int price=Integer.parseInt(request.getParameter("price"));
		int discount=Integer.parseInt(request.getParameter("discount"));
		int deposit=Integer.parseInt(request.getParameter("deposit"));
		House house=new House();
		house.setHouseId(id);
		house.setHousePrice(price);
		house.setHouseDiscount(discount);
		house.setHouseState("未入住");
		house.setHouseDeposit(deposit);
		PrintWriter out=response.getWriter();
		UserDao dao=new UserDao();
		try 
		{
			dao.saveInfo(house);
			out.println("<script language='javaScript'> alert('添加成功!');</script>");
			response.setHeader("refresh", "1;url=findHouseServlet?type=find");
			out.close();
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			out.println("<script language='javaScript'> alert('添加失败!');</script>");
			response.setHeader("refresh", "1;url=house/addHouse.jsp");
		}	
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException
	{
		processRequest(request, response);
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException
	{
		processRequest(request, response);
	}
}
