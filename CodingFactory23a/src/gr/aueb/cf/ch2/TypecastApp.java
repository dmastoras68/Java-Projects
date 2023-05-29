package gr.aueb.cf.ch2;

public class TypecastApp {

    public static void main(String[] args) {
        int num1  = 10;

        /*
        παρακάτω, το 20 που by default είναι int, θα μετατραπεί σε long
         */
        long num2 = 20L;

        long result = 0L;

        /*
        Αυτό σκάει:
        num1 = num2;
         */

        /*
        Παρακάτω, το ανάποδο:
         */

        /*
        Αυτό είναι το Typecast: Θα μετατρέψει το
        long σε int
         */
        num1 = (int) num2;

        /*
        Γενικά τα Typecast πρέπει να αποφεύγονται γιατί
        μπορεί να υπάρξει απώλεια δεδομένων
         */





    }

}
