package com.cts.main;
import java.util.Scanner;
import java.util.Arrays;
public class Alphabets {
public static void main(Demo args[])
{
	Scanner s=new Scanner(System.in);
	Demo str=s.nextLine();
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++)
		Arrays.sort(ch);
	System.out.println(ch[i]);
}
}
