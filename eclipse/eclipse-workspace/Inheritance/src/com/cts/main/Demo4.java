package com.cts.main;
import java.util.Scanner;
public class Demo4 {
public static void main(String args[])
{
	String str="Global Warming";
	System.out.println(str.substring(10));
	System.out.println(str.substring(4,8));
    System.out.println(str.matches("[a-zA-Z0-9]+"));
    System.out.println(str.substring(0,str.length()-4));
	System.out.println(str.substring(5));
	System.out.println(str.indexOf("Wa"));
	System.out.println(str);
	System.out.println(str.replace("a","*"));
}
}
