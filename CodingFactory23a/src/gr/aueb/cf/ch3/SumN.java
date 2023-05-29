package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        long sum = 0L;
        long product = 1L;
        int sumTo = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Sum to:");
        sumTo = sc.nextInt();

        while (i<=sumTo){
            sum = sum + i;
            i=i+1;
        }

        i = 1;
        while (i<=sumTo){
            product = product * i;
            i=i+1;
        }
        System.out.println("Result Sum: " + sum);
        System.out.println("Result Product: " + product);
    }
}
