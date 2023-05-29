package gr.aueb.cf.ch7;

public class Ex07EqualsApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("athens");

        //Άλλο η σύγκριση μεταβλητών και άλλο των περιεχομένων τους.

        if (s1 == s2) {
            System.out.println("Strings are equal");
        }

        if (s1.equals(s3)) {
            System.out.println("EQUAL");
        }
        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("EQUAL");
        }

    }


}
