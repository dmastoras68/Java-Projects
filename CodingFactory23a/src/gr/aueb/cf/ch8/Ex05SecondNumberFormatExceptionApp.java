package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Ex05SecondNumberFormatExceptionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = "";
        int inputNum = 0;

        System.out.println("Insert integer:");

        inputStr = sc.nextLine();
        if (isInt(inputStr)) {
            inputNum = Integer.parseInt(inputStr);
            System.out.println(inputNum);
        } else {
            System.out.println("Wrong number");
        }

    }


    public static boolean isInt(String s) {
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
