import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();
        scanner.close();

        int specialCharCount = 0;

        System.out.println("Special characters in the line:");

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (isSpecialCharacter(ch)) {
                System.out.println(ch);
                specialCharCount++;
            }
        }

        System.out.println("Number of special characters: " + specialCharCount);
    }

    public static boolean isSpecialCharacter(char ch) {
        // Define a set of special characters you want to check for
        String specialCharacters = "!@#$%^&*()_-+=<>?/[]{}|;:',.";

        // Check if the character is in the set of special characters
        return specialCharacters.indexOf(ch) != -1;
    }
}
