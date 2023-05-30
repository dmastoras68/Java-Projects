package gr.aueb.cf.ch5;

import java.util.Scanner;

public class StarsMethod {



    public static void main(String[] args) {
    int intSelection = 0;
    int intNumberOfStars = 0;
    Scanner sc = new Scanner(System.in);

    /*
    * intSelection is set = 0 initially, to pass for the first time. After that, the value 0 is forbidden
    * */

     while (intSelection >= 0 && intSelection <= 6 ){
         showMenu();
         intSelection = sc.nextInt();
        switch (intSelection) {
            case 1:
                System.out.println("How many horizontal stars?");
                intNumberOfStars = sc.nextInt();
                printLinesOfStars(intNumberOfStars, 1);
                break;
            case 2:
                System.out.println("How many lines of a single star?");
                intNumberOfStars = sc.nextInt();
                printLinesOfStars(1, intNumberOfStars);
                break;
            case 3:
                System.out.println("How many lines of the same number of stars?");
                intNumberOfStars = sc.nextInt();
                printLinesOfStars(intNumberOfStars,intNumberOfStars);
                break;
            case 4:
                System.out.println("How many lines of ascending number of stars?");
                intNumberOfStars = sc.nextInt();
                printDiffLinesOfStars(intNumberOfStars, 1);
                break;
            case 5:
                System.out.println("How many lines of descending number of stars?");
                intNumberOfStars = sc.nextInt();
                printDiffLinesOfStars(intNumberOfStars, -1);
                break;
            case 6:
                System.out.println("So long and thanks for all the fish!");
                intSelection = -1;
                break;
            default:
                System.out.println("You must select from 1 to 6!");
                intSelection = 0;
                break;
        }
     }
    }

    public static void showMenu() {

        int selection;

        System.out.println("1. Show n stars horizontally");
        System.out.println("2. Show n stars vertically");
        System.out.println("3. Show n lines of stars with n stars each");
        System.out.println("4. Show n lines of stars each line ascending from 1 to n");
        System.out.println("5. Show n lines of stars each line descending from n to 1");
        System.out.println("6. Exit program");

        }

    /*
    * This routine prints h horizontal stars.
    * */
    public  static void printHorizontalStars(int h) {
        int i=1;

        while (i <= h) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    /*
    * This routine prints v lines of h stars. It utilizes
    * the printHorizontalStars routine
    * */
    public static void printLinesOfStars(int h, int v) {

        int i = 1;
        while ( i <= v ) {
            printHorizontalStars(h);
            i++;
        }
    }

    /*
    * This routine prints n lines of stars with ascending or descending number
    * (it depends on the value of variable diff. 1 is ascending, -1 is descending).
    * It utilizes the printHorizontalStars routine.
    * */

    public static  void printDiffLinesOfStars(int n,  int diff) {

        int i;
        int startingStars;

        if (diff == 1) {
            i = 1;
            while ( i <= n){
                printHorizontalStars(i);
                i++;
            }
        } else if (diff == -1) {
            i = n;
            while ( i >= 1){
                printHorizontalStars(i);
                i--;
            }
        }

    }

}
