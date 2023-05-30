package gr.aueb.cf.ch4;


import java.util.Scanner;

public class Stars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int i = 0;
        int j = 0;

        System.out.println("Δώσε αριθμό για να τυπώσω αστεράκια:");
        n = sc.nextInt();

        /*
        Οριζόντια με σκέτο print και ένα println στο τέλος.
         */


        System.out.printf("%d Οριζόντια: ", n);
        System.out.println();
        while ( i< n){
            System.out.print("*");
            i++;
        }

        /*
        Κάθετα, με println μόνο.
        */

        System.out.println("");
        System.out.printf("%d Κάθετα: ", n);
        System.out.println("");

        i=0;
        while ( i< n){
            System.out.println("*");
            i++;
        }


        /*
        nxn αυξάνουμε τα i, j μέχρι να φτάσουν το n
        * */

        System.out.printf("%d x %d: ", n,n);
        System.out.println();


        while (j < n) {
            i=0;
            while (i < n) {
                System.out.print("*");
                i++;
            }
            System.out.println();
            j++;
        }


        /*
        * Διπλή αύξηση: Αυξάνω το j (κάθετα) μέχρι να φτάσει το n
        * και σε εσωτερική λούπα αυξάνω το i μέχρι να φτάσει το j
        * */

        System.out.printf("Από 1 έως %d: ", n);
        System.out.println("");

        i = 0;
        j = 0;

        while (n > j){
            for (i = 0; i <= j; i = i + 1){
                System.out.print("*");
            }
            System.out.println("");
            j++;
        }

        /*
        * Διπλή μείωση: Ξεκινάω με j = n και το μειώνω κατά 1
        * ενώ στη μέσα λούπα εξισώνω το i με το (μειωμένο) j.
        * */

        System.out.printf("Από %d έως 1: ", n);
        System.out.println("");

        i=0;
        j = n;

        while (j > 0){
            for (i = j; i > 0; i = i - 1){
                System.out.print("*");
            }
            System.out.println("");
            j--;
        }

        System.out.println("Bye!");
    }
}
