package com.cts.main;

public class Demo {
public static void main(String args[])
{
	StringBuffer sb=new StringBuffer();
//final capacity

		System.out.println(sb.capacity());
sb.append("thoripakkam");
sb.insert(3, "chennai");
System.out.println(sb);
sb.delete(2, 6);
System.out.println(sb);
}
}
