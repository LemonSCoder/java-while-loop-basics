/*
 * Activity 2.1.1
 */
import java.util.Scanner;

public class FrequencyCount
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // choose something to count in place of ...
    System.out.println("Enter a sentence and I will count the number of vowels."); 
    String str = sc.nextLine();

    /* your code here */
    int vowelCount = 0;
    int i = 0;
    while (i < str.length()) {
        String lowerSubString = str.toLowerCase();
        //char can only be referenced with single parentheses
        if (lowerSubString.charAt(i) == 'a' || lowerSubString.charAt(i) == 'e' || lowerSubString.charAt(i) == 'i' || lowerSubString.charAt(i) == 'o' || lowerSubString.charAt(i) == 'u') {
            vowelCount++;
        }
        i++;
    }
    System.out.println("Your vowel count is: " + vowelCount);
  }
}
