package com.cts.main;

import java.util.Scanner;

public class Max{
	public static void main(String args[])
	{
		int arr[],size,i;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		arr=new int[size];
		int max=arr[0];
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>max)
			    max=arr[i];
		}
		System.out.println(max);
		int min=arr[0];
		for(i=0;i<size;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min);
	}
	
}
			

