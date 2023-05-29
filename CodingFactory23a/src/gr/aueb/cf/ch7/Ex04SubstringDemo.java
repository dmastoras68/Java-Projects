package gr.aueb.cf.ch7;

public class Ex04SubstringDemo {
    public static void main(String[] args) {
        String a = "Athens University of Economic and Business";

        for(int i = 0; i <= a.length()-1; i++){
            System.out.print(a.substring(i,i+1));
        }

    }
}
