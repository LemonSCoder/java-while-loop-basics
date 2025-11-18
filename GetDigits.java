 /* Activity 2.1.1
 */
import java.util.Scanner;

public class GetDigits
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a positive integer to see its digits: ");
    int number = sc.nextInt();

    /* your code here */
    int i = 10;
    int j = 1;
    while (i != 10000) {
        double printNum = ((number % i));
        int newNum = (int) printNum / (1 * j);
        System.out.println(newNum);
        i *= 10;
        j *= 10;
    }
  }
}