package com.cts.main;

public class Area {
public static final double PI=3.14;
public void area(double a)
{
	System.out.println("area of square:" +(a*a));
}
public void area(double a,double b)
{
	System.out.println("area of rect:" +(a*b));
}
public void area(int a,float b)
{
	System.out.println("area of tri:" +(a*b/2));
}
public void area(int a)
{
	System.out.println("area of circle:" + (a*a*PI));
}
public static void main(Demo args[])
{
	Area a=new Area();
	a.area(2,2);
}
}
