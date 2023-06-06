package gr.aueb.cf.ch11;

public class ex01Student {
    private static int studentsCount = 0;

    static {
        studentsCount = 0;
    }

    private int id;
    private String firstName;
    private String lastName;


    public ex01Student() {
        studentsCount++;
    }

    public ex01Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        studentsCount++;
    }


    public static int intGetStudentsCount(){
        return studentsCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
