package gr.aueb.cf.ch5;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sel = 0;
        double x = 0.0;
        double y = 0.0;
        do{
            menu();
            sel = sc.nextInt();
            if(sel == 6) {
                break;
            } else if (sel <1 || sel > 6) {
                System.out.println("Wrong Selection");
                continue;
            }
            System.out.println("Enter x ");
            x = sc.nextDouble();
            System.out.println("Enter y ");
            y = sc.nextDouble();
            selection(sel, x, y);
            System.out.println("");
        } while (sel != 6);

    }

    public static void selection(int sel, double x, double y){
        switch (sel){
            case 1:
                System.out.printf("Result: %f" , add(x,y)) ; break;
            case 2:
                System.out.printf("Result: %f" , sub(x,y)) ;break;
            case 3:
                System.out.printf("Result: %f" , mul(x,y)) ;break;
            case 4:
                System.out.printf("Result: %f" , div(x,y)) ;break;
            case 5:
                System.out.printf("Result: %f" , mod(x,y)) ;break;
            case 6: break;
            default:
                System.out.println("Wrong Selection");break;
        }
    }


    public static void menu(){
        System.out.println("Please, select");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");

    }


    public static double add(double x, double y){
        return x + y;
    }

    public static double sub(double x, double y){
        return x - y;
    }

    public static double mul(double x, double y){
        return x * y;
    }

    public static double div(double x, double y){
        if (y==0) {
            return Integer.MAX_VALUE;
        } else {
            return x / y;
        }
    }

    public static double mod (double x, double y){
        if (y==0) {
            return Integer.MAX_VALUE;
        } else {
            return x % y;
        }

    }

}
