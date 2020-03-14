package com.cts.main;

public class SwapNumbers {
public static void main(String args[])
{
	int a=3,b=4;
	System.out.println("before swap");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	a=a-b;
	b=a+b;
	a=b-a;
	System.out.println("after swap");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
}
}
