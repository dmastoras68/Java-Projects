package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Επιλέξτε ένα");
            System.out.println("1 - One");
            System.out.println("2 - Two");
            System.out.println("3 - Team");
            System.out.println("4 - Quit");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Start 1-player game");
                    break;
                case 2:
                    System.out.println("Start 2-player game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                case 4:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }

        }while(choice !=4 );
        System.out.println("Goodbye");

    }
}
