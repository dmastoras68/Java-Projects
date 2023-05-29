package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TheDoorsOfDurin {
final static String SPEAK_FRIEND = "Mellon";

    public static void main(String[] args) {
        String msg = "The doors of Durin, Lord of Moria. Speak, Friend, and enter.";
        String pw="";
        Scanner sc = new Scanner(System.in);
        while (!pw.equals(SPEAK_FRIEND)){
            System.out.println(msg);
            pw = sc.next();
            if  (!pw.equals(SPEAK_FRIEND)){
                System.out.println("Thou shall not pass!");
            }
        }
        System.out.println("Thou may pass!");
    }
}
