package com.cts.main;
import java.util.Scanner;
public class Total {
public static void main(String args[])
{
	System.out.println("1.java         5000");
	System.out.println("2.c         1000");
	System.out.println("3.cpp         3000");
	System.out.println("4.python         4000");
	System.out.println("5.angular         2000");
	Scanner s=new Scanner(System.in);
	StringBuffer sb=new StringBuffer();
	String choice=s.nextLine();
	int prize=0;
	String course=choice;
    if(course.contains("java"))
    {
    	sb.append("java    5000");
    	prize=prize+5000;
	}
    if(course.contains("c"))
    {
    	sb.append("c    1000");
    	prize=prize+1000;
	}
    if(course.contains("cpp"))
    {
    	sb.append("cpp    3000");
    	prize=prize+3000;
	}
    if(course.contains("python"))
    {
    	sb.append("python    4000");
    	prize=prize+4000;
	}
    if(course.contains("angular"))
    {
    	sb.append("angular    2000");
    	prize=prize+2000;
	}
    System.out.println(prize);
}
}
