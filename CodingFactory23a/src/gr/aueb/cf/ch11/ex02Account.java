package gr.aueb.cf.ch11;

public class ex02Account {

    private int id;
    private String iban;
    private String firstName;
    private String lastName;
    private String ssn;
    private  double balance;

    public ex02Account(){}

    public ex02Account(int id, String iban, String firstName, String lastName, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Public API
    /**
    *
     * Deposits a certain amount of money
     *
     * the amount to deposit
    * @param amount
    *
    * @throws Exception
    * */

    public void deposit(double amount) throws Exception {
        try {
            if (amount >= 0) {
                balance += amount;
            } else {
                throw new Exception("Negative amount exception");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     *
     * Withdraws a certain amount of money
     *
     * @param amount
     *      the amount to withdraw
     * @param ssn
     *      the given ssn
     * @throws Exception
     *      if the ssn is not valid or the balance is not sufficient
     * */
    public void withdraw(double amount, String ssn) throws Exception{

        try{
            if (!isSsnValid(ssn)){
                throw new Exception("Ssn not valid exception");
            }
            if (amount > balance) {
                throw new Exception("Insufficient balance exception");
            }else {
                balance -= amount;
            }

        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }



    /**
     * Returns the balance of the account
     * @return
     *      the account's balance
     */

    public double getAccountBalance(){
        return getBalance();
    }

    /**
     * returns the account's state in  string format
     * @return
     */
    public String accountToString(){
        return "(" + id + ", " + iban + ", " +
                firstName + ", " + lastName + ", " +
                ssn + ", " + balance + ")";
    }



    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }

}
