// sum and product of digit is same

//Armstrong  153=1^3+5^3+3^3=153

class SpyNumber {
  public static void main(String args[]) {
    int n = 1234, digit = 0, sum = 0, product = 1;
    while (n > 0) {

      digit = n % 10;
      sum += digit;
      product *= digit;
      n = n / 10;
    }
    if (sum == product)
      System.out.println("Spy Number");
    else
      System.out.println("Not a Spy Number");
  }
}