package gr.aueb.cf.ch3;
import java.util.Scanner;
public class OrangeRedSignal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean orangeOn = false;
        boolean redOn = false;

        boolean tank1LTQuarter = false;
        boolean tank2LTQuarter = false;

        System.out.println("Is tank1 less than 1/4 ?");
        tank1LTQuarter = sc.nextBoolean();

        System.out.println("Is tank2 less than 1/4 ?");
        tank2LTQuarter = sc.nextBoolean();
        /*
        Άν είναι και οι δύο boolean αληθείς, τότε θα ανάψει και το κόκκινο και το πορτοκαλί
        */
        System.out.println("Περίπτωση που θέλουμε να ανάβουν και τα δύο λαμπάκια");
        orangeOn = tank1LTQuarter || tank2LTQuarter;
        redOn = tank1LTQuarter && tank2LTQuarter;

        System.out.println("Orange on: " + orangeOn );
        System.out.println("Red on: " + redOn );
        /*
        αν θέλουμε να ανάψει ΜΟΝΟ ΕΝΑ λαμπάκι, χρησιμοποιούμε XOR ^
        Προσοχή! το ^ είναι για bitwise καταστάσεις τις οποίες θα δούμε αργότερα! Άρα το παρακάτω είναι λάθος!
        */
        /******************************/
        System.out.println("Περίπτωση που θέλουμε να ανάβει μόνο ένα λαμπάκι");
        orangeOn = tank1LTQuarter ^ tank2LTQuarter;
        redOn = tank1LTQuarter && tank2LTQuarter;
        /******************************/
        /*
        Προσοχή! το ^ είναι για bitwise καταστάσεις τις οποίες θα δούμε αργότερα! Άρα το παραπάνω είναι λάθος!
         */

        System.out.println("Orange on: " + orangeOn );
        System.out.println("Red on: " + redOn );
    }
}
