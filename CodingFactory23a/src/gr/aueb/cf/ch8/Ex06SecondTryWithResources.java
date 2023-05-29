package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06SecondTryWithResources {
    public static void main(String[] args) {

        int num;

        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
            System.out.println(num);
        }catch (InputMismatchException e) {
            e.printStackTrace();
        }




    }
}
