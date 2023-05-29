package gr.aueb.cf.ch1;

/**
 * Προσθέτει δύο ακεραίους
 * και εμφανίζει το αποτέλεσμα στο stdout
 */


public class AddApp
{

    public static void main(String[] args)
    {
        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 10;
        int num2 = 7;
        int result = 0;

        /*
            Αλλιώς: (ΔΕΝ ΠΡΟΤΕΙΝΕΤΑΙ)
            int num1 = 10, num2 = 7 num3 = 0;
         */

        //Εντολές

        result = num1 + num2;


        //Εμφάνιση αποτελεσμάτων

        System.out.println("Το αποτέλεσμα είναι: " + result);

        //Τα δύο παρακάτω είναι ίδια:
        System.out.println("Το αποτέλεσμα της άθροισης των " + num1 + " και " + num2 + " είναι "  + result);
        System.out.printf("Το αποτέλεσμα της άθροισης των %d και %d είναι %d ", num1, num2, result);


    }


}
