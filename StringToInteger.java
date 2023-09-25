import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string representing an integer: ");
        String input = scanner.nextLine();
        scanner.close();

        try {
            int intValue = Integer.parseInt(input);
            System.out.println("Integer value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. The provided string is not a valid integer.");
        }
    }
}
