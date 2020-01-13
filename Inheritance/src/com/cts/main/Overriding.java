package com.cts.main;

public class Overriding {
	public static void main(Demo args[])
	{
		//Employee employee=new Employee();
		//employee.display();
		//Manager m=new Manager();
		//m.display();
		Employee1 employee=new Manager();
		employee.display();
	}

}
class Employee1
{
	public void display()
	{
		System.out.println("employee class");
	}
}
class Manager extends Employee1
{
	public void display()
	{
		System.out.println("manager class");
	}
}
