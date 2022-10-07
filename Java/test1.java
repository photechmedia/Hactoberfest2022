package org.demo.A;



import java.math.BigInteger;



public class test1 {



   public static void main(String[] args) {



       // Creating 2 BigInteger objects
        BigInteger b1, b2;



       b1 = new BigInteger("1");
        b2 = new BigInteger("1");



       // apply equals() method
        boolean response = b1.equals(b2);



       // print result
        if (response) {



           System.out.println("BigInteger1 " + b1 + " and BigInteger2 " + b2 + " are equal");
        } else {



           System.out.println("BigInteger1 " + b1 + " and BigInteger2 " + b2 + " are not equal");
        }
    }
}
