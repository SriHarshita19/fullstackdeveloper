package com.cts.main;
import java.util.Scanner;
public class inheritanceDemo {
	public static void main(String args[])

{
	
	Employee e=new Employee();
	e.getData();
	e.display();
}

class Employee{
   int id;
   String name;
   String company;
   public void display()
   {
	   System.out.println(id+ ":" +name +":" +company +":");
   }
   public void getData()
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter id");
	   id=Integer.parseInt(s.nextLine());
	   System.out.println("enter name");
	   name=s.nextLine();
	   System.out.println("enter company");
	   company=s.nextLine();
	   s.close();
   }
   class Manager extends Employee{
	   String[] team;
	   String dept;
	   public void display()
	   {
		   Scanner s=new Scanner(System.in);
		   System.out.println(team+ ":" +dept +":");
	   }
	   public void getData()
	   {
		   Scanner s=new Scanner(System.in);
		   System.out.println("enter team");
		   int n=s.nextInt();
		   team=new String[n];
		   for(int i=0;i<n;i++)
		   {
			   team[n]=s.nextLine();
		   }
	   }
	   class Developer extends Employee{
		   String projName;
		   String duration;
		   String domain;
		   public void display()
		   {
			   System.out.println(projName+ ":" +duration +":" +domain +":");
		   }
		   public void getData()
		   {
			   Scanner s=new Scanner(System.in);
			   System.out.println("enter projName");
			   projName=s.nextLine();
			   System.out.println("enter duration");
			   duration=s.nextLine();
			   System.out.println("enter domain");
			   domain=s.nextLine();
			  
	   }
   }

	
	
	