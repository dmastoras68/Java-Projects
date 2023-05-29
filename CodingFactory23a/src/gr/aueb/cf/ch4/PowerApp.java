package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger x;
        BigInteger y;
        BigInteger result =  new BigInteger("1");

        /*
        Ή αλλιώς: BigInteger result =  BigInteger.ONE;
         */


        System.out.println( "Δώσε βάση");
        x= BigInteger.valueOf(sc.nextInt());
        System.out.println( "Δώσε εκθέτη");
        y= BigInteger.valueOf(sc.nextInt());

        for (int i=1;  i <= y.intValue() ; i=i+1){
            result = result.multiply(x) ;
        }
        System.out.printf("Αποτέλεσμα: %,d", result);

    }

}
