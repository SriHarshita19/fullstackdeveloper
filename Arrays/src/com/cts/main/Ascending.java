package com.cts.main;
import java.util.Scanner;
public class Ascending {
	public static void main(String args[])
	{
		int arr[],size,i,temp,j;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		arr=new int[size];
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
