// sum and product of digit is same


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
