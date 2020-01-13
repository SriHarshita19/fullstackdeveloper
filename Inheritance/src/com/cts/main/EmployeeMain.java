package com.cts.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class EmployeeMain {
public static void main(String args[])throws ClassNotFoundException,SQLException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	int id=Integer.parseInt(sc.nextLine());
	System.out.println("enter name");
	String name=sc.nextLine();
	System.out.println("enter address");
	String address=sc.nextLine();
	System.out.println("enter age");
	int age=Integer.parseInt(sc.nextLine());
	System.out.println("enter phonenum");
	int phonenum=Integer.parseInt(sc.nextLine());
	System.out.println("enter dept");
	String dept=sc.nextLine();
	System.out.println("enter location");
	String location=sc.nextLine();
	System.out.println("enter salary");
	String salary=sc.nextLine();
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/cts";
	String username="root";
	String password="admin";
	Connection conn=DriverManager.getConnection(url,username,password);
	String query="insert into employeetable values(?,?,?,?,?,?,?,?)";
	PreparedStatement ps=conn.prepareStatement(query);
	ps.setInt(1,id);
	ps.setString(2,name);
	ps.setString(3, address);
	ps.setInt(4,age);
	ps.setInt(5,phonenum);
	ps.setString(6, dept);
	ps.setString(7,location);
	ps.setString(8,salary);
		
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

