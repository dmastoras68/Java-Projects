package gr.aueb.cf.ch7;

import java.util.Scanner;
/**
 * Ciphers and de-ciphers a given word
 * */
public class CaesarCipher {
    public static void main(String[] args) {

        final int CAESAR_CIPHER = 3;

        int transport = 0;
        String phraseToCipher = "";
        String phraseToDecipher = "";
        String cipheredPhrase = "";
        String[] sml = new String[26]; //small letters array
        String[] caps = new String[26];//capital letters array
        String[] csml = new String[26];//ciphered small letters array
        String[] ccaps = new String[26];//ciphered capital letters array
        int menuSelection = 0;

        Scanner sc = new Scanner(System.in);
        fillLetters(sml, false); //filling the casual alphabet's small letters
        fillLetters(caps, true); // the same with caps

        while (menuSelection >=0 && menuSelection <3){

            System.out.println("Enter the transport integer (0 to abort)");

            transport = sc.nextInt();
            if (transport == 0 ) {
                System.out.println("Bye!");
                break;
            }
            //Caius Julius Caesar invented the cipher algorithm with transport = 3
            if (transport == CAESAR_CIPHER) System.out.println("Congrats, you selected Julius Caesar's Cipher!");

            //after the given transport, we create the ciphered alphabets
            createCipheredAlphabets(caps, ccaps, sml, csml, transport);

            printMenu();
            menuSelection = sc.nextInt();
            switch (menuSelection){
                case 1:
                    System.out.println("Now, enter a phrase in Latin alphabet:");

                    phraseToCipher = sc.next();
                    cipher(phraseToCipher,ccaps, csml);
                    break;
                case 2:
                    System.out.println("Now, enter a ciphered phrase in Latin alphabet:");

                    phraseToDecipher = sc.next();
                    decipher(phraseToDecipher,caps, sml, transport);
                    break;
                case 3:
                    System.out.println("Bye");
                    break;
                default:
                    printMenu();
            }

        }

    }

    public static void cipher(String phraseToCipher, String[] ccaps, String[] csml){
        String cipheredPhrase = "";
        String currentLetter = "";
        int asciiNum = 0;

        for (int i = 0; i <= phraseToCipher.length()-1; i++) {
            //currentLetter = phraseToCipher.substring(i,1);
            asciiNum = phraseToCipher.charAt(i);

// * Capital letters start from 65 and small letters from 97
//the new ascii number occurs after transporting the old ascii number
            if (asciiNum >= 65 && asciiNum <= 90) {
                cipheredPhrase = cipheredPhrase + ccaps[asciiNum - 65];
            } else if (asciiNum >= 97 && asciiNum <= 122) {
                cipheredPhrase = cipheredPhrase + csml[asciiNum - 97];
            } else cipheredPhrase = cipheredPhrase + " ";

        }

        System.out.println(cipheredPhrase);
    }

    public static void decipher(String phraseToDeCipher, String[] caps, String[] sml, int transport){
        String decipheredPhrase = "";
        String currentLetter = "";
        int asciiNum = 0;
        int newasciiNum = 0;

        for (int i = 0; i <= phraseToDeCipher.length()-1; i++) {

            asciiNum = phraseToDeCipher.charAt(i);

            if (asciiNum >= 65 && asciiNum <= 90) {

                if (asciiNum - transport >= 65) {
                    newasciiNum = asciiNum - transport;
                } else {
                    newasciiNum = asciiNum + 25 - transport + 1;
                }

            } else if (asciiNum >= 97 && asciiNum <= 122) {
                if (asciiNum - transport >= 97) {
                    newasciiNum = asciiNum - transport;
                } else {
                    newasciiNum = asciiNum + 25 - transport + 1;
                }
            }

// * Capital letters start from 65 and small letters from 97

            if (newasciiNum >= 65 && newasciiNum <= 90) {
                decipheredPhrase = decipheredPhrase + caps[newasciiNum - 65];
            } else if (newasciiNum >= 97 && newasciiNum <= 122) {
                decipheredPhrase = decipheredPhrase + sml[newasciiNum - 97];
            } else decipheredPhrase = decipheredPhrase + " ";

        }

        System.out.println(decipheredPhrase);
    }

    public static void fillLetters(String letters[], boolean isCaps) {
        //caps = new String[26];
        int startFrom;
        if (isCaps) {
            startFrom = 65;
        } else {
            startFrom = 97;
        }

        for (int i = 0; i <= 25; i++) {
            letters[i] = Character.toString(i + startFrom);
        }

    }

    public static void createCipheredAlphabets(String[] caps, String[] ccaps, String[] small, String[] csmall, int transport) {

        for (int i = 0; i <= 25 - transport; i++) {
            csmall[i] = small[i + transport];
        }

        for (int i = 25 - transport + 1; i <= 25; i++) {
            csmall[i] = small[i - 25 + transport - 1];
        }

        for (int i = 0; i <= 25 - transport; i++) {
            ccaps[i] = caps[i + transport];
        }

        for (int i = 25 - transport + 1; i <= 25; i++) {
            ccaps[i] = caps[i - 25 + transport - 1];
        }

    }


    public static void printMenu(){

        System.out.println("Select from 1 to 3 ");
        System.out.println("1. Cipher");
        System.out.println("2. Decipher");
        System.out.println("3. Exit");
    }

}