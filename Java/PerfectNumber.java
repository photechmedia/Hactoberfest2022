import java.util.Scanner;

class PerfectNumber
{
  public static void main(String args[])  
  {
    Scanner sc=new Scanner(System.in);
    int s=0;
    System.out.println("Enter a number");
    int n=sc.nextInt();
    for(int i=1;i<n;i++)
    {
      if(n%i==0)
      s+=i;
    }
    if(s==n)
      System.out.println("Perfect number");
    else
      System.out.println("Not a perfect number");
     
   
  }
}
