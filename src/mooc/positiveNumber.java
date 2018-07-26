package mooc;

import java.util.Scanner;

public class positiveNumber {
    public static void main (String[] args){
        Scanner checkNum = new Scanner(System.in);
        int firstNum;
        int secondNum;

        System.out.println("Type a number: ");
        firstNum = Integer.parseInt(checkNum.nextLine());

        if (firstNum > 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }

}
