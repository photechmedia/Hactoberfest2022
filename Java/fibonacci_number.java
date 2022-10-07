import java.util.*;
public class Fibonnaci {

   public static void main(String[] args) {
        int FibLength;
        Scanner sc = new Scanner(System.in); // create object
        System.out.print("Please enter length upto which you have to find the series :");  //enter the length 
        FibLength = sc.nextInt();

        int num1,num2,num3;
        // initialized first element to 0
        num1 = 0;
        // initialized second element to 1
        num2 = 1;
        System.out.println("Fibonacci Series: ");
        System.out.print( "  " + num1);
        System.out.print( "  "+ num2);

        for (int i = 2; i < FibLength; i++) {
            num3=num1+num2;
            System.out.print(" " + num3);
            num1=num2;
            num2=num3;
            
        }
        for (int i = 0; i < FibLength; i++) {
            System.out.print(" ");
        }
    }

}
