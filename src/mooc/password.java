package mooc;

import java.io.Reader;
import java.util.Scanner;

public class password {
    public static void main (String [] args){
        String password = "carrot";

        Scanner passwordRequest = new Scanner(System.in);
while (true) {
    System.out.println("Type the password:");
    String userPassword = passwordRequest.nextLine();

    if (userPassword.equals("carrot")) {
        System.out.println("Right!");
        break;
    } else {
        System.out.println("Wrong!");
    }
}

    }
}
