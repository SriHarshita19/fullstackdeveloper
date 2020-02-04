package com.cts.training.controller;
import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*; 
@WebServlet("/register")
public class Register extends HttpServlet{
 public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
	 res.setContentType("text/html");  
	 PrintWriter out = res.getWriter();  
	           
	 String name=req.getParameter("UserName");  
	 String password=req.getParameter("Password");  
	 String repassword=req.getParameter("Re-enter Password");  
	 String email=req.getParameter("Email");
	 String phone=req.getParameter("Phone");
	           
	 try{  
	 Class.forName("com.mysql.jdbc.Driver");
	 Connection con=DriverManager.getConnection(  
			 "jdbc:mysql://localhost:3306/cts");
	 PreparedStatement ps=con.prepareStatement(  
			 "insert into register values(?,?,?,?,?)");  
			   
			 ps.setString(1,name);  
			 ps.setString(2,password);  
			 ps.setString(3,repassword);  
			 ps.setString(4,email);
			 ps.setString(5,phone);
			           
			 int i=ps.executeUpdate();  
			 if(i>0) { 
			 out.print("You are successfully registered...");  
			       
			           
			 }
	 }
	    catch (Exception e1)
	         {
	    	System.out.println(e1);
	    	 }  
		 out.close();  
			 
 

 }
}

