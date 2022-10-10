// 1!+4!+5!=145

import java.util.Scanner;

class StrongNumber
{
  public static void main(String args[])  
  {
    Scanner sc=new Scanner(System.in);
    int fact=1,i,temp,digit=0,sum=0;
    System.out.println("Enter a number");
    int n=sc.nextInt();
    temp=n;
    while(n>0)
    {
      fact=1;
      digit=n%10;
      for(i=digit;i>0;i--)
      {
        fact*=i;
      }
      sum+=fact;
      n=n/10; 
    }
    if(sum==temp)
      System.out.println("strong number");
    else
      System.out.println("not a strong number");

  }
}