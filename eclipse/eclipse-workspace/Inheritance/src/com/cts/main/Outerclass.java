package com.cts.main;

class Outerclass {
	public static void main(String args[])
	{
		Outer outer=new Outer();
		Outer.Inner inner=outer.new Inner();
		inner.display();
	}
}
class Outer
{
	int x=10;
	static int y=20;
	 class Inner
	{
	public void display()
	{
		System.out.println(y);
	}
	}
}

