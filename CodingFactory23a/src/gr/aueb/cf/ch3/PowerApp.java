package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        long result = 1L;
        int i = 1;


        System.out.println("Insert a:");
        a = sc.nextInt();
        System.out.println("Insert b:");
        b = sc.nextInt();

        while (i<=b){
            result = result * a;
            i=i+1;
        }

        System.out.println("Result: " + result);
    }

}
