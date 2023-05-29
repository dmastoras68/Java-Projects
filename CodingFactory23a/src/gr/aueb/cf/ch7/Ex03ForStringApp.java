package gr.aueb.cf.ch7;

import javax.sound.midi.Soundbank;

public class Ex03ForStringApp {
    public static void main(String[] args) {
        String s = "Coding Factory";
        for(int i = 0; i<s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println("\u2764");

        for (char ch: s.toCharArray()){
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");

        int index = s.indexOf("o",7);
        int index2 = s.lastIndexOf("o");
        System.out.println(index);
        System.out.println(index2);

        if (s.startsWith("Coding")){
            System.out.println("OK");
        }

        System.out.println(s.substring(3,8));
        System.out.println(s.substring(3));


    }
}
