import java.util.*;
import java.util.Scanner;
import java.lang.Math;

class Smith{
    int num;
    int a=0;
    int [] li;
    public Smith(int n){
        num=n;
        li=new int[num];
    }
    public int[] factors(){
        int n=num;
        for(int i = 2; i <= Math.sqrt(n); i ++){
            while (n % i == 0) {
                li[a]=i;
                a++;
                n /= i;
            }
        }
        if(n>2){
            li[a]=n;
        }
        return li;
    }
    public int sumDigits(){
        int n=num, sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public int sumFactors(int[] li){
        int sum=0;
        for(int i=0; i<li.length; i++){
            if(li[i]!=0) {
                if(li[i]>9){
                    while(li[i]!=0){
                        int rem=li[i]%10;
                        sum+=rem;
                        li[i]/=10;
                    }
                }
                else {
                    sum += li[i];
                }
            }
        }
        return sum;
    }

}

public class Smith_No {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        Smith s=new Smith(a);
        int sf=s.sumFactors(s.factors());
//        System.out.println(sf);
        int sd=s.sumDigits();
        if(sf==sd){
            System.out.println(a+" is a Smith number.");
        }
        else{
            System.out.println(a+" is not a Smith number.");
        }
//        System.out.println(sd);
//        System.out.println(ans);
//        for(int i=0; i<li.length; i++){
//            if(li[i]!=0) {
//                System.out.println(li[i]);
//            }
//        }
    }
}
