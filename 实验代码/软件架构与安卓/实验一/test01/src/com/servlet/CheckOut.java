package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DBBean;

public class CheckOut extends HttpServlet {

	protected void processRequest(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException
		{
			response.setContentType("text/html;charset=utf-8");
			String id=(String)request.getParameter("houseId");
			String sql="update hotel set state='未入住' where hotel='"+id+"'";
			System.out.println(sql);
			DBBean dbBean=new DBBean();
			int i=dbBean.executeUpdate(sql);
			dbBean.close();
			PrintWriter out=response.getWriter();
			if(i>0)
			{
				out.println("<script language='javaScript'> alert('退房成功!');</script>");
				response.setHeader("refresh", "1;url=checkOutServlet?type=checkOut");
				out.close();
			}
			else 
			{
				out.println("<script language='javaScript'> alert('退房失败!');</script>");
				response.setHeader("refresh", "1;url=checkInServlet?type=checkOut");
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

