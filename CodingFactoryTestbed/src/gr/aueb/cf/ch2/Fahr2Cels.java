package gr.aueb.cf.ch2;

import java.util.Scanner;

public class Fahr2Cels {

    public static void main(String[] args) {


        int fahr = 0;
        int cels = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Δώσε θερμοκρασία σε βαθμούς Φαρενάιτ:");
        fahr = sc.nextInt();

        cels = ((fahr-32) * 5)/9;

        System.out.printf("Η θερμοκρασία %d βαθμών Φαρενάιτ είναι %d βαθμοί Κελσίου.%n", fahr, cels);
        System.out.printf("Η θερμοκρασία %d\u00B0 Φαρενάιτ είναι %d\u00B0 Κελσίου.%n", fahr, cels);
    }
}
