 Consider an example, where the discount percentage on a TV needs to be decided
   on the basis of the type of TV. If the TV is CRT (C), the discount will be 5% of the
   selling price (SP). If the TV is LCD (L), then the discount will depend on the size of
   the TV screen. For 14 inches screen, the discount is 8% of the SP. For 21 inches
   screen, the discount is 10% of the SP.
import java.util.Scanner;
class Tv
{
 public static void main(String args[])
 {
  int inches;
  String tv;
  Scanner s=new Scanner(System.in);
  inches=s.nextInt();
  tv=s.nextLine();
  if(tv.equals("CRT"))
  {
    System.out.println("discount will be 5%");
  }
  else if(tv.equals("LED"))
  {
    if(inches==14)
    {
     System.out.println("discount will be 8%");
    }
   if(inches==21)
    {
     System.out.println("discount will be 10%");
    }
  else
    {
    System.out.println("not found");
    }
  }
}
}
 