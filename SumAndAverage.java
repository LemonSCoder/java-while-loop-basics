/*
 * Activity 2.1.1
 */
import java.util.Scanner;

public class SumAndAverage
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of values to sum and average: ");
    int numValues = sc.nextInt();
    
    /* your code here */
    int currentInt = 0;
    int currentSum = 0;
    while (currentInt <= numValues) {
        currentSum += currentInt;
        currentInt++;
    }
    System.out.println("Sum of values: " + currentSum);
    System.out.println("Average of values: " + ((double) currentSum / numValues));
    
  }
  
}
