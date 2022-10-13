//no need to import scanner because you are not taking input from user 
//import java.util.Scanner;

class HighestDigit
{
  public static void main(String args[]) {
   int n=984254; //any random number is taken 
    int largestDigit, digit = 0; 
    while (num > 0)
      {
	largestDigit = num % 10;
	if (digit < largestDigit)
	  {
	    digit = largestDigit;
	  }
	num = num / 10;
      }
    System.out.println ("The Largest Digit is from the entred number is  " + digit);
}
