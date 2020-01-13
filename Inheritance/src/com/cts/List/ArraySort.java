package com.cts.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class ArraySort {
public static void main(String args[])
{
	ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(12,4,22,67,15));
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
}
}
