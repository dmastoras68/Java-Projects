package gr.aueb.cf.ch7;

public class Ex12StringSplitApp {
    public static void main(String[] args) {
        String s = "Athens University    of Economics and Business";
        String[] tokens = s.split(" ");

        String[] tokens1 = s.split(" +");


        //String[] tokens = s.split(" +"); αν έχουμε περισσότερα κενά

        for (String token : tokens) {
            System.out.println(token);
        }


        for (String token : tokens1) {
            System.out.println(token);
        }


    }
}
