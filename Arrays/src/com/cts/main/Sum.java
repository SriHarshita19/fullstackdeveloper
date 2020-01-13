package com.cts.main;

import java.util.Scanner;

public class Sum {
	public static void main(String args[]){
	      int arr[],size,i;
	      int sum=0;
	      Scanner s=new Scanner(System.in);
	      System.out.print("enter size of array");
	      size=s.nextInt();
	      arr=new int[size];
	      for (i=0;i<size;i++) 
	      {
	    	  arr[i]=s.nextInt();
	      }
	       for(i=0;i<size;i++)
	       {
	    	   sum=sum+arr[i];
	    	  
	       }
	       System.out.print(sum);
	     } 
}

