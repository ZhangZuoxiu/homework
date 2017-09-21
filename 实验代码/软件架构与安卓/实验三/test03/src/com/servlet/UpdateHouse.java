package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.UserDao;
import com.entity.House;


public class UpdateHouse extends HttpServlet {

	protected void processRequest(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException
		{
			response.setContentType("text/html;charset=utf-8");
			String id=request.getParameter("id");
			int price=Integer.parseInt(request.getParameter("price"));
			int discount=Integer.parseInt((String)request.getParameter("discount").trim());
			int deposit=Integer.parseInt(request.getParameter("deposit"));
			PrintWriter out=response.getWriter();
			UserDao dao=new UserDao();
			try 
			{
				List<House> list=dao.findById(id);
				list.get(0).setHousePrice(price);
				list.get(0).setHouseDiscount(discount);
				list.get(0).setHouseDeposit(deposit);
				dao.saveInfo(list.get(0));
				out.println("<script language='javaScript'> alert('修改成功!');</script>");
				response.setHeader("refresh", "1;url=findHouseServlet?type=find");
				out.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				out.println("<script language='javaScript'> alert('修改失败!');</script>");
				response.setHeader("refresh", "1;url=findHouseServlet?type=find");
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
