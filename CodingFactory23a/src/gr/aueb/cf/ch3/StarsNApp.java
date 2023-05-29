package gr.aueb.cf.ch3;

import java.util.Scanner;

public class StarsNApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;
        int n = 0;

        System.out.println("Αριθμός επαναλήψεων:");
        n= sc.nextInt();

        while ((i<=n)){
            System.out.println("*");
            i=i+1;
        }
    }
}
