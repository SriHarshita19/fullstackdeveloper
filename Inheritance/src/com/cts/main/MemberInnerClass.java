package com.cts.main;

public class MemberInnerClass {
public static void main(String args[])
{
	Outer outer=new Outer();
	outer.display();
}
}
class Outer
{
	int x=10;
	static int y=20;
	public void display()
	{
		class Member
		{
			public void show()
			{
				System.out.println(x);
				System.out.println(y);
			}
		}
		Member m=new Member();
		m.show();
	}
	}