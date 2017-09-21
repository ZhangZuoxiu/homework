package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.DBBean;

public class DeleteHouse extends HttpServlet {

	protected void processRequest(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException
		{
			response.setContentType("text/html;charset=utf-8");
			String id=request.getParameter("houseId");
			String sql="delete from hotel where hotel='"+id+"'";
			System.out.println(sql);
			DBBean db=new DBBean();
			int i=db.executeUpdate(sql);
			db.close();
			PrintWriter out=response.getWriter();
			if(i>0)
			{
				out.println("<script language='javaScript'> alert('删除成功!');</script>");
				response.setHeader("refresh", "1;url=findHouseServlet?type=find");
				out.close();
			}
			else 
			{
				out.println("<script language='javaScript'> alert('删除失败!');</script>");
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
