package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PossitivesApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int possitivesCount = 0;

        System.out.println("Print a positive number on a nagative to exit:");
        num = sc.nextInt();

        while (num>=0){
            System.out.println("Positive number entered");
            possitivesCount = possitivesCount + 1;
            System.out.println("Print a positive number on a nagative to exit:");
            num = sc.nextInt();
        }

        System.out.println("You entered a negative number: " + num);
        System.out.println("Positive numbers: " + possitivesCount);

    }
}
