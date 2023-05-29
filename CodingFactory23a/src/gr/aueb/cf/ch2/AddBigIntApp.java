package gr.aueb.cf.ch2;

import java.math.BigInteger;

public class AddBigIntApp {

    public static void main(String[] args) {


        BigInteger bigNum1 = new BigInteger("21474353534535483647");
        BigInteger bigNum2 = new BigInteger("21474835464563543647");
        BigInteger result = new BigInteger("0");

        result = bigNum1.add(bigNum2);

        System.out.printf("%d \n", result);

    }

}
