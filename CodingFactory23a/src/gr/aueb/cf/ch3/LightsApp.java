package gr.aueb.cf.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LightsApp {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int intVelocity = 0;
        boolean lightsOn = false;

        System.out.println("Is it raining?");
        isRaining = sc.nextBoolean();

        System.out.println("Is it dark?");
        isDark = sc.nextBoolean();

        System.out.println("Enter velocity:");
        intVelocity = sc.nextInt();

        isRunning = (intVelocity>100);
        lightsOn = isRaining && (isRunning || isRunning);

        System.out.println("Lights on: " + lightsOn);


    }

}
