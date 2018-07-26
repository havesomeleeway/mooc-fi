package mooc;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Your name: ");
        String name = reader.nextLine(); // Reads a line of input from user and assigns it to variable called name


        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.nextLine()); // Reads a integer and passes it to the variable age

        System.out.println("Your name is: " + name + ", and you are " + age + " years old, nice to meet you!");
    }

}



