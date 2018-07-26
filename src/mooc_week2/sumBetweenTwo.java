package mooc_week2;

import java.util.Scanner;

public class sumBetweenTwo {
  public static void main (String [] args){

    Scanner input = new Scanner(System.in);
    System.out.println("First: ");
    int firstNum = Integer.parseInt(input.nextLine()); //passes user input into firstNum

    System.out.println("Last: ");
    int lastNum = Integer.parseInt(input.nextLine()); //passes user input into lastNum

    int sum = 0;

    while (firstNum <= lastNum){
    sum = sum + firstNum; // sum = 0 + firstNum
    firstNum++; // firstNum then adds + 1
    }

    System.out.println("The sum is: " + sum);
  }
}
