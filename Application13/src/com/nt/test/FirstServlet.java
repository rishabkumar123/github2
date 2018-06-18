package com.nt.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	
	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException
	{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	int no=Integer.parseInt(req.getParameter("number"));
	RequestDispatcher rd=req.getRequestDispatcher("xyz");
	rd.include(req,res);
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		PreparedStatement ps=con.prepareStatement("select * from student1 where sid=?");
		ps.setInt(1,no);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			pw.println("<b>Student id</b>"+rs.getInt(1));
			pw.println("<br><b>student name</b>"+rs.getString(2));
			pw.println("<br><b>place</b>"+rs.getString(3));
			
		}
		else
		{
			pw.println("no record found");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
			
		
	}
//	pw.close();
	RequestDispatcher rd1=req.getRequestDispatcher("Footer.html");
	rd1.include(req,res);
		
		
	}
	
	

}
