package com.nt.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeaderServlet extends HttpServlet 
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
	pw.println("<marquee><h1 style='color:red'>Student Details</h1></marquee>");
	}
	

}
