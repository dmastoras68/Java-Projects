package gr.aueb.cf.ch7;

public class Ex08CompareApp {

    public static void main(String[] args) {

        String s1 = "Athens";
        String s2 = "athens";

        //s1.compareTo(s2) if s1 > s2 -
        //s1.compareTo(s2) if s1 = s2 0
        //s1.compareTo(s2) if s1 < s2 +
        //Brings the ascii-based difference

        System.out.println(s1.compareTo(s2));

        if (s1.compareTo(s2) < 0){
            System.out.println("s1 lt s2");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("s1 gt s2");
        } else {
            System.out.println("s1 eq es");
        }


    }
}
