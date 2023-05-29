package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex07MultipleExceptionsApp {
    public static void main(String[] args) {
        File file = new File("C:\\tmp\\intfile.txt");
        char ch;


        //Εδώ πάμε από το ειδικό λάθος FileNotFoundException προς
        //το πιο γενικό IOException και το ακόμα πιο γενικό Exception.
        // Αν μπουν ανάποδα, βγάζει λάθος

        try (Scanner sc = new Scanner(file)) {
            ch = (char) System.in.read();
        } catch (FileNotFoundException e1) {
            System.out.println("File not found error");
        } catch (IOException e2) {
            System.out.println("I/O error");
        } catch (Exception e3) {
            System.out.println("General exception");
        }
    }
}
