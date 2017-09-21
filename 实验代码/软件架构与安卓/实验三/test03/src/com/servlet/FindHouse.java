package com.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.UserDao;
import com.entity.House;

public class FindHouse extends HttpServlet {

	protected void processRequest(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException
		{
		    response.setContentType("text/html;charset=utf-8");
		    String type=request.getParameter("type");
		    System.out.println(type);
		    UserDao dao=new UserDao();
		    try 
		    {
		    	List<House> list=dao.findAll();
		    	System.out.println(list);
		    	request.setAttribute("list", list);
		    	request.getRequestDispatcher("house/findHouse.jsp").forward(request, response);
		    	 /*if(type.equals("checkIn"))
				 {
					 request.getRequestDispatcher("operate/checkIn.jsp").forward(request, response);
				 }
				 else if(type.equals("checkOut"))
				 {
					 request.getRequestDispatcher("operate/checkOut.jsp").forward(request, response);
				 }
				 else
				 {
					 request.getRequestDispatcher("house/findHouse.jsp").forward(request, response);
				 }*/
		    	
			} 
		    catch (Exception e) {
				// TODO: handle exception
		    	e.printStackTrace();
		    	response.getWriter().println("<script language='javaScript'> alert('查询失败!');</script>");
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
