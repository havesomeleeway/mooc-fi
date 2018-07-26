package mooc_week2;

import java.util.Scanner;

public class sumOfSet {
  public static void main (String [] args) {
    Scanner numberSum = new Scanner(System.in);
    System.out.println("Until what? ");
    int userInput = Integer.parseInt(numberSum.nextLine());
    int first = 1;
    int sum = 0;

    while (first <= userInput){ //while 1 is less than user input
      sum = sum + first; // Sum is 0, which will add 1 at the start of the loop. In the second loop, it adds whatever that is first + 1
      first++; // After the first loop, first adds 1 to itself
    }
    System.out.println("Sum is: " + sum);
  }
}
