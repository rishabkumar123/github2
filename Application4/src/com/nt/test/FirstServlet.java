package com.nt.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	static
	{
		System.out.println("static block executed");
	}

 public void display(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
{
	
	Date ob=new Date();
	//general setting
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	pw.println("<h1 style='color:red'>Date"+ob+"</h1>");
	pw.println("rishab");
	
} 
public void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
{
	display(req,res);
	//PrintWriter pw=res.getWriter();
//	res.setContentType("text/html");
	//pw.println("rishab");
}
	

}
