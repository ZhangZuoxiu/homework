package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import bean.DBBean;
import bean.House;

public class FindHouse extends HttpServlet {

	protected void processRequest(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException
		{
		    response.setContentType("text/html;charset=utf-8");
		    String type=request.getParameter("type");
			String sql="select * from hotel";
			DBBean db=new DBBean();
			PrintWriter out=response.getWriter();
			try 
			{
			   List<House> list=new ArrayList<House>();
			   ResultSet rs=db.executeQuery(sql);
			   while(rs.next())
			   {
				   House house=new House();
				   house.setHouseId(rs.getString(1));
				   house.setHouseState(rs.getString(2));
				   house.setHousePrice(rs.getInt(3));
				   house.setHouseDiscount(rs.getInt(4));
				   house.setHouseDeposit(rs.getInt(5));
				   list.add(house);
			   }
			   db.close();
			   System.out.println(list);
			   request.setAttribute("list", list);
			   if(type.equals("Student"))
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
			   }
			} catch (Exception e) {
				// TODO: handle exception
				out.println("<script language='javaScript'> alert('查询失败!');</script>");
				out.close();
				System.out.println("1+"+e);
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
