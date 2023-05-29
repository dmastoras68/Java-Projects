package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BoolApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int intTemp = 0;


        System.out.println("Is it raining (true/false)?");
        isRaining = sc.nextBoolean();

        System.out.println(intTemp<0);

        System.out.println("Please insert temperature:");
        intTemp = sc.nextInt();

        isSnowing = isRaining && (intTemp < 0);

        System.out.println("Is snowing: " + isSnowing);






    }

}
