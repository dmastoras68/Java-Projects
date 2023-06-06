package gr.aueb.cf.ch11;

public class ex01StudentApp {
    public static void main(String[] args) {
        ex01Student alice = new ex01Student();
        ex01Student bob = new ex01Student(2,"Bob", "D.");

        System.out.println(ex01Student.intGetStudentsCount());

        //set
        alice.setId(1);
        alice.setFirstName("Alice");
        alice.setLastName("Wonderland");

        //get
        System.out.println("Id: " + alice.getId());
        System.out.println("First name: " + alice.getFirstName());
        System.out.println("Last name: " + alice.getLastName());


        System.out.println("Id: " + bob.getId());
        System.out.println("First name: " + bob.getFirstName());
        System.out.println("Last name: " + bob.getLastName());

    }

}
