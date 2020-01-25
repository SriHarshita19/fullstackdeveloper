package com.cts.main;

import java.util.ArrayList;

public class Lambda {
public static void main(String args[])
{
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.forEach(n->System.out.println(n));
}
}
