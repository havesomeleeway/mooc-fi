package mooc;

import java.util.Scanner;

public class calculator {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);

        int sum;
        int read;

        System.out.println("Type the first number: ");
        sum = Integer.parseInt(reader.nextLine());
        read = sum;

        System.out.println(read);


    }
}
