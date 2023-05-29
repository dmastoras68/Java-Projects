package gr.aueb.cf.ch5;

import java.util.Scanner;

public class AddApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int res;

        System.out.println("Enter i:");
        i = sc.nextInt();
        System.out.println("Enter j:");
        j = sc.nextInt();

        res = add(i,j);
        System.out.println("Result: " + res);

    }

    public static int add (int a, int b){
//        int c;
//        c = a + b;
//        return c;
        return a + b;
    }




}
