package mooc_week2;

import java.util.Scanner;

public class factorial {
  public static void main (String [] args){

    Scanner input = new Scanner(System.in);{
      System.out.println("Type a number: ");
      int userInput = Integer.parseInt(input.nextLine());

      int factorial = 1;

      // factorial
      // n! = 1*4  = 4
      // 4  = 4*3  = 12
      // 12 = 12*2 = 24
      // 24 = 24*1 = 24

      while (userInput >= 1 ){
        factorial *= userInput;
        userInput--;
      }

      System.out.println("Factorial is: " + factorial);
    }
  }
}
