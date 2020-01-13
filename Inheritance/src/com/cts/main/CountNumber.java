package com.cts.main;
import java.util.Scanner;
public class CountNumber {
	public static void main(Demo[] args){
		Scanner s=new Scanner(System.in);
		      int c=0,i;
		      System.out.println("enter the range");
		      int n1=s.nextInt();
		      int n2=s.nextInt();
		      for(i=n1;i<=n2;i++)
		      {
		    	  int n3=i;
		    	  while(n3>0)
		    	  {
		    		  int a=n3%10;
		    		  n3=n3/10;
		    		  if(a==1)
		    		  {
		    			  c=c+1;
		    		  }
		    	  }
		      }
		      System.out.println("the no of 1's are"+c);
        }
}
