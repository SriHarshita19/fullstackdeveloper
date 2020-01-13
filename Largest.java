Write a Program to accept three numbers and to display the largest of the three numbers.
import java.util.Scanner;
class Largest
{
 public static void main(String[] args) {

      int num1 = 10, num2 = 20, num3 = 7;

      if( num1 >= num2 && num1 >= num3)
          System.out.println(num1+" is the largest Number");

      else if (num2 >= num1 && num2 >= num3)
          System.out.println(num2+" is the largest Number");

      else
          System.out.println(num3+" is the largest Number");
  }
}