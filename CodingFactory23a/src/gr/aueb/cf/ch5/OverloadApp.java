package gr.aueb.cf.ch5;

public class OverloadApp {
    public static void main(String[] args) {

    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int add( int a, int b, int c){
        return a + b + c;
    }

}
