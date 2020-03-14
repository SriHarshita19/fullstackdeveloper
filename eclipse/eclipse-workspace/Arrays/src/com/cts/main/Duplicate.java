package com.cts.main;
import java.util.Scanner;
public class Duplicate {
	public static void main(String args[])
	{
		int arr[],size,i,j;
		int count=0;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		arr=new int[size];
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			for(j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			
		}
		System.out.println(count);
	}

}
