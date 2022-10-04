import java.util.Scanner;

class HighestDigit
{
  public static void main(String args[])  
  {
   int n=984254;
   int highest=0,digit;
   while(n>0)
   {
    digit=n%10;
    if(digit>highest)
    highest=digit;
    n=n/10;
   }
    System.out.println("Highest digit is= "+highest);
  }
}