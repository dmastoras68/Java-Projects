package gr.aueb.cf.ch5;

public class PowerRecursiveApp {
    public static void main(String[] args) {
        System.out.println(power(3,3));
    }

    public static float power(float a, float n) {

        if (n==0) {
            return 1;
        }

        return a * power( a, n-1);

    }
}
