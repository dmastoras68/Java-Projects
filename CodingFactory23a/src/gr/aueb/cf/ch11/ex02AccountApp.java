package gr.aueb.cf.ch11;

public class ex02AccountApp {
    public static void main(String[] args) {
        ex02Account alice = new ex02Account(1,"GR12345",
                            "Alice", "W",
                                "F12345",350.0);

        try{
            alice.deposit(100);
            System.out.println("Successful deposit");
            System.out.println("The new balance is:" + alice.getAccountBalance());

            alice.withdraw(50, "F12345");
            System.out.println("Successful withdraw");
            System.out.println(alice.accountToString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
