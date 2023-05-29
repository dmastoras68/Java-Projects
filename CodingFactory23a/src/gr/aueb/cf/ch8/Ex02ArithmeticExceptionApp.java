package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Ex02ArithmeticExceptionApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numerator;
        int denominator;
        int result = 0;

        try {
            System.out.println("Please insert two integers for division");
            numerator = sc.nextInt();
            denominator = sc.nextInt();
            result = numerator / denominator;
            System.out.printf("%d / %d = %d", numerator, denominator, result);

        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("Λάθος παρονομαστής");
        } /*catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Λάθος παρονομαστής");*/  //NOT RECOMMENDED!!


    }
}
