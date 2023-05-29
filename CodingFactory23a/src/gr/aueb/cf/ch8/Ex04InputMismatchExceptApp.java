package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04InputMismatchExceptApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true) {

            try{
                System.out.println("Please insert num");
                inputNum = sc.nextInt();
                if (inputNum == MAGIC_NUM) {
                    System.out.println("Great!");
                    break;
                }

            }catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Wrong number!");

            }
        }

        System.out.println("Bye!");

    }
}
