package gr.aueb.cf.ch4;

import java.util.Scanner;

public class AddMullApp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n;
        int sum = 0;
        int result = 1;

        System.out.println("Δώσε αριθμό ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            sum = sum + i;
            result = result * i;
        }
        System.out.printf("Sum: %d", sum);
        System.out.println("");
        System.out.printf("Result: %,d", result);
    }
}
