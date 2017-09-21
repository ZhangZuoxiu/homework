package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.DBBean;

public class CheckIn extends HttpServlet {

	protected void processRequest(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException
		{
			response.setContentType("text/html;charset=utf-8");
			String id=(String)request.getSession().getAttribute("houseId");
			String name=request.getParameter("name");
			name=new String(name.getBytes("ISO-8859-1"),"utf-8");
			String idnumber=request.getParameter("idnumber");
			int pay=Integer.parseInt(request.getParameter("pay"));
			String sql1="insert into Student values('"+name+"','"+idnumber+"','"+id+"','"+pay+"')";
			String sql2="update hotel set state='已入ס' where hotel='"+id+"'";
			System.out.println(sql2);
			DBBean db=new DBBean();
			int i=db.executeUpdate(sql1);	
			db.close();
			DBBean dbBean=new DBBean();
			int j=dbBean.executeUpdate(sql2);
			dbBean.close();
			PrintWriter out=response.getWriter();
			if(i>0&&j>0)
			{
				out.println("<script language='javaScript'> alert('登记成功!');</script>");
				response.setHeader("refresh", "1;url=checkInServlet?type=checkIn");
				out.close();
			}
			else 
			{
				out.println("<script language='javaScript'> alert('登记失败!');</script>");
				response.setHeader("refresh", "1;url=checkInServlet?type=checkIn");
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
