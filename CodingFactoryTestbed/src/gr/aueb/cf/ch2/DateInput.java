package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        int month;
        int year;
        int yearmod;

        System.out.println("Δώστε ημέρα μήνα:");
        day = sc.nextInt();
        System.out.println("Δώστε μήνα:");
        month = sc.nextInt();
        System.out.println("Δώστε έτος:");
        year = sc.nextInt();
        yearmod = year % 100;
        System.out.printf("%02d" + "/" + "%02d" + "/" + "%02d" + "%n", day,month,yearmod );

    }
}
