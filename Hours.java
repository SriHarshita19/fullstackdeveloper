 Write a Program to accept hours and number of resources and display the total
   number of productive hours. (Total number of productive hours = hours * number of
   resources).
import java.util.Scanner;
class Hours
{
 public static void main(String args[])
 {
  int hours,resources,prodhours;
  Scanner s=new Scanner(System.in);
  hours=s.nextInt();
  resources=s.nextInt();
  prodhours=hours*resources;
  System.out.println("prodhours"+ prodhours);
}
}
