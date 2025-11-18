/*
 * Activity 2.1.1
 */
import java.util.Scanner;

public class Divisibility
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the dividend: ");
    int dividend = sc.nextInt();
    System.out.println("Enter the divisor: ");
    int divisor = sc.nextInt();

    /* your code here */
    while (dividend > 0) {
        dividend -= divisor;
    }
    if (dividend == 0) {
        System.out.println("The dividend is evenly divisible by the divisor!");
    } else {
        System.out.println("The dividend is NOT evenly divisible by the divisor.");
    }
      
  }
}