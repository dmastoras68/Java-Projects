package gr.aueb.cf.ch10;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumbers {

    final static Scanner in = new Scanner(System.in);
    final static Path path = Paths.get("C:/tmp/logMobile.txt");
    final static String[][] contacts = new String[500][3];
    static int pivot = -1;


    public static void main(String[] args) {
        boolean quit = false;
        String s;
        int choice;
        String phoneNumber;

        do{
            printMenu();
            s=getChoice();
            if(s.matches("[Qq]]")) quit = true;
            else {
                try {
                    choice = Integer.parseInt(s);
                    if (!isValid(choice)) {
                        throw new IllegalArgumentException("Error - Choose between 1 and 5");
                    }
                        switch (choice){
                            case 1:
                                printContactMenu();
                                insertController(getFirstName(), getLastName(), getPhoneNumber());
                                break;
                            case 2:
                                phoneNumber = getPhoneNumber();
                                deleteController(phoneNumber);
                                break;
                            case 3:
                                phoneNumber = getPhoneNumber();
                                printContactMenu();
                                updateController(phoneNumber, getFirstName(), getLastName(), getPhoneNumber());
                                break;
                            case 4:
                                phoneNumber = getPhoneNumber();
                                String[] contact = getOneController(phoneNumber);
                                //print contact
                                break;
                            case 5:
                                String[][] allContacts = getAllContactsController();
                                printAllContacts(allContacts);
                                break;
                            default:
                                throw new IllegalArgumentException("Bad choice");
                        }



                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

            }


        }while (! quit);

    }

    public static void printContact(String[] contact){
        for(String s : contact) {
            System.out.print(s + " ");
        }
    }

    public static void printAllContacts(String[][] contacts){
        for(String[] contact : contacts){
            printContact(contact);
        }
    }


    public static boolean isValid(int choice) {
        return (choice>=1 && choice <=5);
    }

    public static void printMenu(){
        System.out.println("Select one of the following:");
        System.out.println("1. Insert contact");
        System.out.println("2. Delete contact");
        System.out.println("3. Update contact");
        System.out.println("4. Search contact");
        System.out.println("5. Print all contacts");
        System.out.println("Q. Exit");
    }

    public static String getChoice(){
        System.out.println("Insert selection");
        return in.nextLine();
    }

    public static void printContactMenu() {
        System.out.println("Insert first name, last name, phone");
    }

    public static String getFirstName(){
        System.out.println("Insert first name");
        return in.nextLine().trim();
    }

    public static String getLastName(){
        System.out.println("Insert last name");
        return in.nextLine().trim();
    }

    public static String getPhoneNumber(){
        System.out.println("Insert phone number");
        return in.nextLine().trim();
    }




    /*
    *
    * Controllers
    * */

    public static void insertController(String firstName, String lastName, String phoneNumber){

        try{
            //Validations
            if(firstName == null || lastName == null || phoneNumber == null ) {
                throw new IllegalArgumentException("Nulls are not allowed");
            }

            if(firstName.length() < 2 || firstName.length() > 50) {
                throw new IllegalArgumentException("First name is not valid");
            }

            if(lastName.length() < 2 || lastName.length() > 50) {
                throw new IllegalArgumentException("Last name is not valid");
            }

            if(phoneNumber.length() < 2 || phoneNumber.length() > 50) {
                throw new IllegalArgumentException("Phone number is not valid");
            }

            //Call service layer
            insertContactService(firstName.trim(), lastName.trim(), phoneNumber.trim());

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }

    }


    public static void updateController(String oldPhoneNumber, String firstName, String lastName, String newPhoneNumber){

        try{
            //Validations
            if( oldPhoneNumber == null || firstName == null || lastName == null || newPhoneNumber == null ) {
                throw new IllegalArgumentException("Nulls are not allowed");
            }

            if(oldPhoneNumber.length() < 2 || oldPhoneNumber.length() > 50) {
                throw new IllegalArgumentException("Old phone number is not valid");
            }


            if(firstName.length() < 2 || firstName.length() > 50) {
                throw new IllegalArgumentException("First name is not valid");
            }

            if(lastName.length() < 2 || lastName.length() > 50) {
                throw new IllegalArgumentException("Last name is not valid");
            }

            if(newPhoneNumber.length() < 2 || newPhoneNumber.length() > 50) {
                throw new IllegalArgumentException("New phone number is not valid");
            }

            //Call service layer
            updateContactService(oldPhoneNumber.trim(), firstName.trim(),
                                 lastName.trim(), newPhoneNumber.trim());

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }

    }

    public static void deleteController(String phoneNumber){

        try{
            //Validations

            if(phoneNumber.length() < 2 || phoneNumber.length() > 50) {
                throw new IllegalArgumentException("Phone number is not valid");
            }

            //Call service layer
            deleteContactService(phoneNumber.trim());

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }

    }

    public static String[] getOneController(String phoneNumber){
        try{
            //Validations

            if(phoneNumber.length() < 2 || phoneNumber.length() > 50) {
                throw new IllegalArgumentException("Phone number is not valid");
            }

            //Call service layer
            return getOneContactService(phoneNumber.trim());

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String[][] getAllContactsController(){
        try{
            return getAllContactsService();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
    }


    /*
    * Service layer
    * */

    public static String[] getOneContactService(String phoneNumber){
        try {
            String[] contact = getContactByPhoneNumber(phoneNumber);
            if (contact.length ==0) {
                throw new IllegalArgumentException("Contact not found");
            }
            return  contact;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }

    }

    public static String[][] getAllContactsService(){
        try {
            String[][] contactsList = getAllContacts();
            if (contacts.length == 0) {
                throw new IllegalArgumentException("List is empty");
            }
            return contactsList;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static void insertContactService(String firstName, String lastName, String phoneNumber) {
        try{
            if (!( insert(firstName, lastName, phoneNumber))) {
                throw new IllegalArgumentException("Error in insert");
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }


    public static void updateContactService(String oldPhoneNumber, String firstName,
                                            String lastName, String newPhoneNumber) {
        try{
            if (!(update(oldPhoneNumber, firstName, lastName, newPhoneNumber))) {
                throw new IllegalArgumentException("Error in update");
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static String[] deleteContactService(String phoneNumber) {
        String[] contact;
        try{
            contact = delete(phoneNumber);
            if (contact.length == 0) {
                throw  new IllegalArgumentException("Error in delete");
            }
            return contact;
        }catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

/*
*
* Crud layer
* */
    public static int getIndexByPhoneNumber(String phoneNumber) {

        for (int i = 0; i<= pivot; i++) {
            if (contacts[i][2].equals(phoneNumber)){
                return i;
            }
        }

        return -1;
    }

    public static boolean insert(String firstName, String  lastName, String phoneNumber) {
        boolean inserted = false;
        if(isFull(contacts)){
            return false;
        }

        if(getIndexByPhoneNumber(phoneNumber) != -1) {
            return false;
        }

        pivot ++;
        contacts[pivot][0] = firstName;
        contacts[pivot][2] = lastName;
        contacts[pivot][3] = phoneNumber;

        return true;
    }


    public static  boolean update (String oldPhoneNumber, String firstName, String lastName, String newPhoneNumber){
        int positionToUpdate = getIndexByPhoneNumber(oldPhoneNumber);
        String[] contact = new String[3];
        if (positionToUpdate == -1) {
            return false;
           // return new String[] {};
        }

//        contact[0] = contacts[positionToUpdate][0];
//        contact[1] = contacts[positionToUpdate][1];
//        contact[2] = contacts[positionToUpdate][2];

        contacts[positionToUpdate][0] = firstName;
        contacts[positionToUpdate][1] = lastName;
        contacts[positionToUpdate][2] = newPhoneNumber;
        //return contact;
        return true;

    }

    public static String[] delete(String phoneNumber){
        int positionToDelete = getIndexByPhoneNumber(phoneNumber);
        String[] contact = new String[3];

        if(positionToDelete == -1) {
            return new String[]{};
        }

//        for (int i= 0 ; i< contact.length; i++) {
//            contact[i] = contacts[positionToDelete][i];
//        }

        System.arraycopy(contacts[positionToDelete] , 0, contact, 0, contact.length);

        if(!(positionToDelete == contacts.length - 1)){
            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete,pivot- positionToDelete);
        }
        pivot --;
        return contact;
    }


    public static String[] getContactByPhoneNumber(String phoneNumber) {
        int positionToReturn = getIndexByPhoneNumber(phoneNumber);
        if(positionToReturn == -1) {
            return new String[]{};
        }
        return contacts[positionToReturn];
    }


    public static String[][] getAllContacts(){
        return Arrays.copyOf(contacts, pivot+1);
    }


    public static boolean isFull(String[][] arr) {
        return pivot == arr.length - 1;

    }


    public static void log(Exception e, String... message ){
        try(PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))){
            ps.println(LocalDateTime.now() + "\n" + e );
            ps.printf("%s", (message.length == 1) ? message[0] : "");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }


}
