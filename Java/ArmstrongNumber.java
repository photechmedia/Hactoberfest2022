public class ArmstrongNumber {
  public static void main(String[] args) {
    int n = 153, count = 0, rem = 0, sum = 0;
    int number = n;
    while (number > 0) {
      count++;
      number = number / 10;
    }
    number = n;

    while (number > 0) {
      rem = number % 10;
      for (int i = 0; i < count; i++) {
        rem = rem * 1;
      }
      sum = sum + rem;
    }
    if (sum == n)
      System.out.println("\nArmstong Number");
    else
      System.out.println("not");

  }
}
