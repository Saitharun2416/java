import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter username: ");
        String u = s.nextLine();

        boolean isValid = true;

        if (u.length() < 5) {
            isValid = false;
            System.out.println("Username must be at least 5 characters long.");
        }

  
        for (char c : u.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                isValid = false;
                System.out.println("Username must contain only letters and digits.");
                break;
            }
        }

        if (!Character.isLetter(u.charAt(0))) {
            isValid = false;
            System.out.println("Username must start with a letter.");
        }

        if (isValid) {
            System.out.println("Username is valid.");
        } else {
            System.out.println("Username is not valid.");
        }

        s.close();
    }
}
