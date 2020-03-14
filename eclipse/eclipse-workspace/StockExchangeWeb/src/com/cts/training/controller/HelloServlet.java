package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/helloServlet")

public class HelloServlet extends HttpServlet{
  protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
  {
	  PrintWriter out=response.getWriter();
	  String username=request.getParameter("user");
	  String password=request.getParameter("pass");
	  String reenterpass=request.getParameter("password");
	  String email=request.getParameter("email");
	  String phone=request.getParameter("phone");
	  out.println("Username:"+username);
	  out.println("<br>Password:"+password);
	  out.println("<br>Re-enter Password:"+reenterpass);
	  out.println("<br>Email:"+email);
	  out.println("<br>Phone:"+phone);
	 
	  
  }
}
