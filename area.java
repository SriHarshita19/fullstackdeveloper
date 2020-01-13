 Write a Program that accepts the length and breadth of a
   rectangle and displays its area and perimeter.
import java.io.*;
import java.util.Scanner;
class Area
{
public static void main(String args[]){
 int l,b;
 Scanner s=new Scanner(System.in);
 
 int area,perimeter;
 l=s.nextInt();
 b=s.nextInt();
 area=l*b;
 System.out.println("Area is:" +area);
 perimeter=2*(l+b);
 System.out.println("perimeter is:" +perimeter);
}
}
