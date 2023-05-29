package gr.aueb.cf.ch4;

import java.util.Scanner;

public class ProgApp {

    final static int FROGJUMP = 5;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int i=0;
        System.out.println("Αρχική θέση");
        x = sc.nextInt();
        System.out.println("Τελική θέση");
        y = sc.nextInt();

        for (int currentLoc  = x; currentLoc < y; currentLoc= currentLoc + FROGJUMP){
            i++;
        }

        System.out.printf( "Θα χρειαστεί %d σάλτα.", i );
    }
}
