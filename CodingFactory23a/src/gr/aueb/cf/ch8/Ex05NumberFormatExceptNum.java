package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Ex05NumberFormatExceptNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = "";
        int inputNum = 0;

        try{
            System.out.println("Insert integer:");

            inputStr = sc.nextLine();

            inputNum = Integer.parseInt(inputStr);
            System.out.println(inputNum);
        } catch (NumberFormatException e) {
            System.out.println("Error in input");
        }

    }
}
