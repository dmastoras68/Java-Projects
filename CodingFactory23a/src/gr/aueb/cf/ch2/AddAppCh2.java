package gr.aueb.cf.ch2;

public class AddAppCh2 {

    public static void main(String[] args) {

        /*
        Οι χιλιάδες μπορούν να χωριστούν με κάτω παύλα:
         */
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;
        /*
        Αυτό είναι overflow, αλλά προσοχή! Δεν βγάζει λάθος!
         */
        result = num1 + num2;

        System.out.println(result);
    }


}
