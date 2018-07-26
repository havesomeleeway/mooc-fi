package mooc_week2;

import java.util.Scanner;

public class loopsEndingRemembering {
  public static void main (String[] args) {
    int i = 0;
    while(i > -1) {
      Scanner input = new Scanner(System.in);
      System.out.println("Type numbers: ");
      i = Integer.parseInt(input.nextLine());
      int sum = i;  //takes the output of i and passes it into sum
      if (i == -1){
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is: " + sum);
      }
    }
  }
}
