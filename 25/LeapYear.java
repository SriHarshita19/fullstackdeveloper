package com.cts.main;

public class LeapYear {
public static void main(String args[])
{
	int year=2008;
	if(year%4==0 || year%100==0 && year%400==0)
	{
		System.out.println(year+"year is leapyear");
	}
	else
	{
		System.out.println(year+"year is not leapyear");
	}
}
}
