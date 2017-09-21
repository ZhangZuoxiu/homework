package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.DBBean;

public class AddHouse extends HttpServlet {

	protected void processRequest(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException
	{
		response.setContentType("text/html;charset=utf-8");
		String hotel=request.getParameter("id");
		int price=Integer.parseInt(request.getParameter("price"));
		int discount=Integer.parseInt(request.getParameter("discount"));
		int deposit=Integer.parseInt(request.getParameter("deposit"));
		String sql="insert into hotel values('"+hotel+"','未入住','"+price+"','"+discount+"','"+deposit+"')";
		System.out.println(sql);
		DBBean db=new DBBean();
		int i=db.executeUpdate(sql);
		db.close();
		PrintWriter out=response.getWriter();
		if(i>0)
		{
			out.println("<script language='javaScript'> alert('添加成功!');</script>");
			response.setHeader("refresh", "1;url=success.html");
			out.close();
		}
		else 
		{
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
	public String getServletInfo()
	{
		return "Short description";
	}
}
