package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise = 0;





        while (choise!=5){
            System.out.println("Επιλέξτε από 1 - 5:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choise=sc.nextInt();

            if (choise==1){
                System.out.println("Επιλέξατε Εισαγωγή");
            }
            else if (choise==2){
                System.out.println("Επιλέξατε Διαγραφή");
            }
            else if (choise==3){
                System.out.println("Επιλέξατε Ενημέρωση");
            }
            else if (choise==4){
                System.out.println("Επιλέξατε Αναζήτηση");
            }
            else if (choise==5){
                System.out.println("Επιλέξατε Έξοδοο");
            }
            else {
                System.out.println(); System.out.println("Πρέπει να επιλέξετε από 1 - 5:");
            }
        }


    }
}
