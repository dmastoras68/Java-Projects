package gr.aueb.cf.ch8;

public class Ex02SecondArithExeptApp {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 0;
        int result;

        //Case testing
        if (num2 == 0) {
            System.out.println("Correct denominator");
        }

    }

}

/*
*
* Έστω ότι φτιάχνω ένα void που διαβάζει ένα αρχείο με αριθμητικά δεδομένα.
* Αυτό το void, μπορεί να χτυπήσει είτε IOException, είτε ArithmeticException,
* αν από λάθος στο αρχείο έχει πέσει κάποιο γράμμα ανάμεσα στους αριθμούς.
* Πως μπορώ να χειριστώ μια τέτοια περίπτωση που περιμένω δύο exception;
* */