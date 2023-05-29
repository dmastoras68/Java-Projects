package gr.aueb.cf.ch5;

public class EveoOrOddApp {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(EveoOrOddApp.isEven(n));

    }

    public static boolean isEven(int n){

//        if (n % 2 != 0){
//            return false;
//        } else{
//            return true;
//        }
        return n % 2 == 0;
    }


}
