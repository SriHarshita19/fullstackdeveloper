package com.cts.main;

public class Constructor {
public static void main(Demo args[])
{
	Human human=new Human();
	Human h=new Human(2,3);
}
}
class Human
{
	public Human()
	{
		System.out.println("I am called automatically");
	}
	Human(int a,int b)
	{
		System.out.println("Parameterized construtor");
	}
	public void display()
	{
		System.out.println("a=" + a + "b=" + b );
	}
}