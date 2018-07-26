package mooc;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner adder = new Scanner(System.in);
        int sum = 0;
        int temp;

        System.out.println("Type a number: ");
        temp = Integer.parseInt(adder.nextLine());  // passes user input into temp
        sum = temp;                                 // passes temp into sum. sum is now 6 instead of 0

        System.out.println("Type another number: ");
        temp = Integer.parseInt(adder.nextLine());  // passes second input into temp, temp is now 2
        sum += temp;                                // += is taking the existing sum of 6, adding 2 and then passing it into the new sum

        System.out.println("Sum of the numbers: " + sum);
    }
}
