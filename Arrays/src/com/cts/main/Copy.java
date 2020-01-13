package com.cts.main;
import java.util.Scanner;
public class Copy {
public static void main(String args[])
{
	int arr1[];
	int size,i;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of elements to be stored in the array");
	size=s.nextInt();
	arr1=new int[size];
	int [] arr2=new int[size];
	arr2=arr1;
	arr2[0]++;
	System.out.println("elements stored in first array are");
	for(i=0;i<size;i++) {
		System.out.print(arr1[i]);
	}
	System.out.println();
	System.out.print("elements stored in second array are");
	for(i=0;i<size;i++)
	{
		System.out.print(arr2[i]);
	}
	System.out.println();
}
}
