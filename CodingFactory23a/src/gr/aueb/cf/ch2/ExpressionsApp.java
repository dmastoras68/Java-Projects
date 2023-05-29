package gr.aueb.cf.ch2;

public class ExpressionsApp {

    public static void main(String[] args) {

        int sua = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int num1 = 12;
        int num2 = 5;

        sua = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;




        System.out.printf("sum: %d, sub: %d, mul: %d, div: %d, mod: %d \n",
                                 sua, sub, mul, div, mod );

        result1 =  num1 + num2 * num2 - 5/num1 % 4;
        System.out.printf("result1 = %d \n", result1);

        result1 =  (num1 + num2) * num2 - (5/num1) % 4;
        System.out.printf("result1 = %d \n", result1);


    }

}
