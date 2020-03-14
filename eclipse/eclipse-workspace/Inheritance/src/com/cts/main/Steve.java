package com.cts.main;
import java.util.Scanner;
public class Steve {
public static void main(Demo args[])
{
	int choice;
	Scanner s=new Scanner(System.in);
	choice=Integer.parseInt(s.nextLine());
	switch(choice)
	{
	case 1:Employee e=new Employee();
	       e.display();
	       e.getData();
	case 2:Student se=new Student();
	       se.display();
	       se.getData();
	}
}
}
class Employee
{
	Demo firstname,lastname,deptname,desig;
	int age;
	double salary;
	int deptid;
	public void display()
	{
		System.out.println(firstname+":"+lastname+":"+deptname+":"+desig+":"+age+":"+salary+":"+deptid);
	}
	public void getData()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter firstname");
	firstname=s.nextLine();
	System.out.println("enter lastname");
	lastname=s.nextLine();
	System.out.println("enter deptname");
	deptname=s.nextLine();
	System.out.println("enter desig");
	desig=s.nextLine();
	System.out.println("enter salary");
	salary=s.nextInt();
	System.out.println("enter age");
	age=s.nextInt();
	System.out.println("enter deptid");
	deptid=s.nextInt();
	}
}
	class Student
	{
		Demo firstname,lastname,courseenrolled;
		int age,stuid;
		public void display()
		{
			System.out.println(firstname+":"+lastname+":"+courseenrolled+":"+age+":"+stuid);
		}
		public void getData()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter firstname");
			firstname=s.nextLine();
			System.out.println("enter lastname");
			lastname=s.nextLine();
			System.out.println("enter courseenrolled");
			courseenrolled=s.nextLine();
			System.out.println("enter age");
			age=s.nextInt();
			System.out.println("enter stuid");
			stuid=s.nextInt();
		}
	}
	
	
