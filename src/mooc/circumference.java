package mooc;

import java.util.Scanner;

public class circumference {
    public static void main(String[] args){
        Scanner calculate = new Scanner(System.in);
        int radius = 0;

        System.out.println("Type the radius: ");
        radius = Integer.parseInt(calculate.nextLine());

        System.out.println("Circumference of the circle: " + 2 * Math.PI * radius);
    }
}
