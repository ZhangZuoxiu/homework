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

public class DeleteHouse extends HttpServlet {

	protected void processRequest(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException
		{
			response.setContentType("text/html;charset=utf-8");
			String id=request.getParameter("houseId");
			PrintWriter out=response.getWriter();
			UserDao dao=new UserDao();
			try 
			{
				List<House> list=dao.findById(id);
				dao.deleteInfo(list.get(0));
				out.println("<script language='javaScript'> alert('删除成功!');</script>");
				response.setHeader("refresh", "1;url=findHouseServlet?type=find");
				out.close();
			} 
			catch (Exception e) 
			{
				// TODO: handle exception
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
