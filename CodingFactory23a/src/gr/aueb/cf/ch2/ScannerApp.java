package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει από το standard input (λέγε με πληκτρολόγιο)
 * δύο ακεραίους και τους προσθέτει.
 */
public class ScannerApp
{
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int res = 0;



        Scanner sc = new Scanner(System.in);

        System.out.println("Insert two integers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        res = num1 + num2;

        System.out.println("Result = " + res);

    }
}
