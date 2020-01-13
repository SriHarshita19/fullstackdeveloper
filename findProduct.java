 You have to write a Program that accepts the product name and quantity as input
   and displays the total price using the unit prices already stored in the system.
import java.io.*;
import java.util.Scanner;
class findProduct
{
 public static void main(String args[])
 {
   int quan,total;
   String n;
   Scanner s=new Scanner(System.in);
   n=s.nextLine();
   quan=s.nextInt();
   if(n.equals("apple"))
   {
      total=quan*10;
      System.out.println(total);
   }
   else if(n.equals("banana"))
   {
      total=quan*20;
      System.out.println(total);
   }
   else
   {
     System.out.println("not mentioned");
   }
}
}
  