package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/reg")
public class Registeruser extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter(); 
		int id = Integer.parseInt(request.getParameter("id"));
		String Email = request.getParameter("email");
		String Password = request.getParameter("pass");
		long Phone =Long.parseLong(request.getParameter("phone"));
		String Username = request.getParameter("user");
		//String Courses[] = request.getParameterValues("courses");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/cts";
			String username="root";
			String password="admin";
			
			Connection conn = DriverManager.getConnection(url, username, password);
		
            PreparedStatement st = conn 
                   .prepareStatement("insert into Register values(?,?,?,?,?)"); 
          
            st.setInt(1, id);
            st.setString(2, Email); 
            st.setString(3, Password);
            st.setLong(4, Phone);
            st.setString(5, Username);
            int res =st.executeUpdate(); 
            System.out.println(res);
            st.close(); 
            conn.close(); 
	        RequestDispatcher rd=request.getRequestDispatcher("login.html");
	        rd.forward(request,response);
            
            out.println("<html><body><b>Successfully Inserted"
                    + "</b></body></html>"); 
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		
		
		
	}
}
