package gr.aueb.cf.ch6;

public class ArraySearchApp {

    public static void main(String[] args) {
        final int SECRET = 12;
        int[] arr = {1,5,9,3,12};
        boolean secretIsFound = false;

        for (int item: arr) {
            if(item == SECRET){
                System.out.println(item);
                secretIsFound = true;
                break;
            }
        }

        if(secretIsFound) {
            System.out.println("Secret found");
        } else {
            System.out.println("Secret NOT found");
        }

    }
}
