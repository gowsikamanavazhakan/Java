import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        scanner.close();

        if (isValidUsername(username)) {
            System.out.println("Valid username.");
        } else {
            System.out.println("Invalid username. Usernames must contain only letters, numbers, underscores, and be between 3 and 20 characters long.");
        }
    }

    public static boolean isValidUsername(String username) {
        // Define a regular expression pattern for a valid username
        String regex = "^[a-zA-Z0-9_]{3,20}$";

        // Use Pattern and Matcher to check if the username matches the pattern
        return Pattern.matches(regex, username);
    }
}
