package com.cts.main;

public class Constructor {
   int x;
   Constructor()
   {
	   x=8;
   }
   public static void main(String args[])
   {
	   Constructor c=new Constructor();
	   System.out.println("x:"+c.x);
   }
}

