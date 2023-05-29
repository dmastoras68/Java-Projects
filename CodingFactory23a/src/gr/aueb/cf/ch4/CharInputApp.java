package gr.aueb.cf.ch4;

import java.io.IOException;

public class CharInputApp {
    public static void main(String[] args) throws IOException {
        char inputChar;



        System.out.println("Insert an ASCII char:") ;
        /*
        Η  System.in.read() διαβάζει ένα char
        * */
        inputChar =(char) System.in.read();

        System.out.println("char: " + inputChar);
    }
}
