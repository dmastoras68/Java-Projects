package gr.aueb.cf.ch7;

import java.util.Scanner;

public class Ex02StringInputApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Please provide a string");
        //s = sc.next(); //ends with white space (space, tab or new line)

        s = sc.nextLine();

        System.out.println(s);
    }
}
