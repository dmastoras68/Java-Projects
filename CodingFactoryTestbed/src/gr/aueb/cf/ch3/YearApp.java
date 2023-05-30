package gr.aueb.cf.ch3;

import java.util.Scanner;

public class YearApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = 0;
        boolean result = false;
        System.out.println("Δώσε έτος:");

        year = sc.nextInt();

        if (year%400==0){
            result=true;
        }
        else {
            if(year%100==0){
                result=false;
            }
            else{
                if(year%4==0){
                    result=true;
                }
            }
        }

        System.out.printf("Είναι το έτος %d δίσεκτο; %b %n",year,result);
    }
}
