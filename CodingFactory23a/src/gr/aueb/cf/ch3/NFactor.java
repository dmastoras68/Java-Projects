package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int num1 = 0;
        int i = 1;
        long result = 1L;

        System.out.println("Αριθμός για υπολογισμό παραγοντικού");
        num1 = sc.nextInt();

        if (num1==0){
            num1 = 1;
        }

        while (i<= num1){
            result = result * i;
            i++;
        }

        System.out.printf("%d! = %d",num1,result);

    }
}
