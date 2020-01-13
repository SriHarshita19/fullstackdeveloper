 Write a Program that accepts a number and checks whether it's positive, negative, or
   zero.
import java.io.*;
import java.util.Scanner;
public class checkNumber
{
 public static void main(String args[])
{
  int n;
  Scanner s=new Scanner(System.in);
  System.out.println("enter a number to check whether positive ,negative or zero");
  n=s.nextInt();
  if(n>0)
  {
    System.out.println("the number is positive");
  }
  else if(n==0)
  {
    System.out.println("the number is zero");
  }
  else
  {
  System.out.println("the number is negative");
  }
}
}


