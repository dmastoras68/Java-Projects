package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04SecondInputMismatchExceptApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true) {

            System.out.println("Please insert num");

            if(sc.hasNextInt()) {
                inputNum = sc.nextInt();
            } else {
                sc.nextLine();
                System.out.println("Wrong number!");
                continue;
            }


            if (inputNum == MAGIC_NUM) {
                System.out.println("Great!");
                break;

            }
        }

        System.out.println("Bye!");

    }
}
