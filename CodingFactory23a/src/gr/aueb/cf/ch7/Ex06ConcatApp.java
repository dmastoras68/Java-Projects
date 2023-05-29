package gr.aueb.cf.ch7;

public class Ex06ConcatApp {
    public static void main(String[] args) {
        String title = "dr";
        String firstName = "John";
        String lastName = "Wayne";

        String fullName;
        String titledName;

        fullName = firstName + " " + lastName;

        System.out.println(fullName);
        titledName = title.concat(" ").concat(firstName).concat(" ").concat(lastName);
        System.out.println(titledName);


    }
}
