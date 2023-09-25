import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: ");
        String input = scanner.nextLine();
        scanner.close();

        int vowelCount = countVowels(input);

        System.out.println("Number of vowels = " + vowelCount);
    }

    public static int countVowels(String input) {
        // Convert the input to lowercase to make the counting case-insensitive
        input = input.toLowerCase();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
