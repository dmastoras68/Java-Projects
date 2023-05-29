package gr.aueb.cf.ch7;

import java.util.Scanner;

public class Ex10TypecastApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String lexeme;
        int num;

        System.out.println("Please insert a number");
        lexeme = sc.next();
        num = Integer.parseInt(lexeme);

        System.out.println("Num is " + num);

    }
}
