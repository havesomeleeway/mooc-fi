package mooc;

import java.util.Scanner;

public class greaterNumber {
    public static void main (String [] args){
        Scanner checker = new Scanner(System.in);
        int numOne;
        int numTwo;

        System.out.println("Type the first number: ");
        numOne = Integer.parseInt(checker.nextLine());

        System.out.println("Type the second number: ");
        numTwo = Integer.parseInt((checker.nextLine()));

        if (numOne == numTwo){
            System.out.println("The numbers are equal!");
        } else if (numOne > numTwo){
            System.out.println("Greater number: " + numOne);
        } else {
            System.out.println("Greater number " + numTwo);
        }

    }


}
