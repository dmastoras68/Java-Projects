package gr.aueb.cf.ch2;

import java.util.Arrays;

public class IntPrintApp {

    public static void main(String[] args) {
        int i = 12;
        System.out.print(i);
        System.out.println(i);

        /*
        Αντί για \n καλύτερο είναι %n
         */

        System.out.printf("%d%n", i);

        System.out.println("Result = " + ++i);

        System.out.println("-----------");

        System.out.printf("%, 07d",i);



    }

}
