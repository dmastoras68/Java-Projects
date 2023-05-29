package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = 0;
        double b = 0;
        double c = 0;
        double res = 0;
        final double EPSILON = 0.01;

        System.out.println("Πλευρά α τριγώνου:");
        a = sc.nextDouble();
        System.out.println("Πλευρά β τριγώνου:");
        b = sc.nextDouble();
        System.out.println("Υποτείνουσα:");
        c = sc.nextDouble();

        res =  (c -  Math.sqrt(a*a + b*b));

        if (Math.abs(res) > EPSILON){
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
