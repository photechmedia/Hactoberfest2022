import java.util.*;
public class recursion  {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        System.out.println(fact_tail(n,1));
        System.out.println(fact(n));
    }
    static int fact(int n)
    {
        if(n==0 || n==1)
        return 1;

        return (n*fact(n-1));
    }
    static int fact_tail(int n,int f)
    {
        if(n==0 || n==1)
        return f;

        return fact_tail(n-1,n*f);
    }
}
