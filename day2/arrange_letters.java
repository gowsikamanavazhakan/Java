import java.util.Arrays;
import java.util.Scanner;

public class arrange_letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String inputWord = scanner.nextLine();
        
        char[] charArray = inputWord.toCharArray();

        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }

        String reversedAlphabeticalOrder = new String(charArray);

        System.out.println("Alphabetical Order: " + reversedAlphabeticalOrder);
    }
}
