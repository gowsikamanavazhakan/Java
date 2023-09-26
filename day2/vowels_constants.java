import java.util.Scanner;
public class vowels_constants {
    public static void main(String[] args) {
        String vowels = " ", constants = " ";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String getword = scanner.nextLine().toLowerCase();
        for (int i = 0; i < getword.length(); i++) {
            char ch = getword.charAt(i);
            if (Character.isLetter(ch)) {
                if (isvowels(ch)) {
                    vowels += ch + " ";
                } else {
                    constants += ch + " ";
                }
            }
        }
        System.out.println("Constants" + constants.trim());
        System.out.println("Vowels" + vowels.trim());

    }

    public static boolean isvowels(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
