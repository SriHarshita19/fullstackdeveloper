package com.cts.activity.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class EmployeeMain {
public static void main(String args[])throws ClassNotFoundException, SQLException
{
	Scanner sc=new Scanner(System.in);
	int id=Integer.parseInt(sc.nextLine());
	System.out.println("enter name:");
	String name=sc.nextLine();
	System.out.println("enter address:");
	String address=sc.nextLine();
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/cts";
	String username="root";
	String password="admin";
	Connection conn=DriverManager.getConnection(url,username,password);
	String query="insert into employeetable values(?,?,?)";
	PreparedStatement ps=(PreparedStatement) conn.prepareStatement(query);
	ps.setInt(1, id);
	ps.setString(2,name);
	ps.setString(3, address);
		int result=ps.executeUpdate();
	if(result>0)
	{
	System.out.println("data executed successfully");
	}
	else
	{
		System.out.println("try again");
	}
	
}
}
