package gr.aueb.cf.ch2;

public class RandomDieApp {
    public static void main(String[] args) {

        int zari = 0;

        /*
        (max - min + 1) + 1
         */
        zari = (int) (Math.random()*(6- 1+ 1)) + 1;


        System.out.println(zari);
    }
}
