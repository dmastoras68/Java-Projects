package gr.aueb.cf.ch5;

public class FactorialApp {
    public static void main(String[] args) {
    int n = 5;

        System.out.println(FactorialApp.Factorial(n));

    }

    public static int Factorial(int n){
        int j = 1;
        int i = 1;
        while( j <= n){
            i = i*j;
            j++;
        }
        return i;

    }

}
