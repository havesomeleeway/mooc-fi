package mooc;

import java.io.Reader;
import java.util.Scanner;

public class divider {
    public static void main(String[] args){
        Scanner divide = new Scanner(System.in);
        double numberOne;
        double numberTwo;

        System.out.println("Type a number: ");
        numberOne = Integer.parseInt(divide.nextLine());

        System.out.println("Type another number: ");
        numberTwo = Integer.parseInt(divide.nextLine());

        System.out.println("Division: " + numberOne / numberTwo );


    }
}
