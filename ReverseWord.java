import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        scanner.close();

        String reversed = reverseWord(input);
        System.out.println("Reverse String: " + reversed);
    }

    public static String reverseWord(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap the characters at the left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the indices towards the center
            left++;
            right--;
        }

        return new String(charArray);
    }
}
