package mooc_week2;

import java.util.Scanner;

public class sumOfThePowers {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Type a number: ");
    double power = input.nextDouble();
    int result = (int)Math.pow(2, power);

    System.out.println("The result is: " + result);
  }
}
