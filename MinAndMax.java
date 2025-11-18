/*
 * Activity 2.1.1
 */
import java.util.Scanner;

public class MinAndMax
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of values in your sequence (cannot be zero): ");
    int numValues = sc.nextInt();
    
    /* Your code here */
    int minVal = 1;
    int maxVal = 0;
    int i = 1;
    while (i <= numValues) {
        if (i <= minVal) {
            minVal = i;
        }
        if (i >= numValues) {
            maxVal = i;
        }
        i++;
    }
    System.out.println("Minimum Value: " + minVal);
    System.out.println("Maximum Value: " + maxVal);
    
  }
  
}