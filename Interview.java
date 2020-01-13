 Consider a scenario where all candidates have to take two tests before appearing for an
   interview. A candidate is selected for the interview round, based on the scores of the two
   tests. The individual score in each test should be greater than 75, and the average
   score for the two tests should be a minimum of 80. A call letter for the interview is to
   be sent to candidates who have been selected, and a rejection letter is to be sent to
   the rest.
import java.util.Scanner;
class Interview
{
 public static void main(String args[])
 {
  int r1,r2,average;
  Scanner s=new Scanner(System.in);
  r1=s.nextInt();
  r2=s.nextInt();
  average=(r1+r2)/2;
  if(r1>=75 && r2>=75)
  {
   if(average>=80)
   {
    System.out.println("candidates are selected");
   }
   else
   {
    System.out.println("candidates are not selected");
   }
  }
else
{
   System.out.println("candidates are not qualified");
}
}
}

  