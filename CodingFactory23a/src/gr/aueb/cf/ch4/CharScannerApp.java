package gr.aueb.cf.ch4;

import java.util.Scanner;

public class CharScannerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputChar;
        System.out.println("Enter a series of characters:");
        inputChar = sc.next().charAt(0); /*Διαβάζει μόνο τον πρώτο χαρακτήρα*/
        System.out.println("Char: " + inputChar);

    }
}
