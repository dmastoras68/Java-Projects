package gr.aueb.cf.ch5;



/**
ΔΕΝ ΚΑΝΕΙ SWAP!!!!!
* */
public class SwapApp {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        swap(a,b);

        System.out.println("a = " + a  + " b = " + b);

    }


    /**
     * Swaps a,b
    * */
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
}
