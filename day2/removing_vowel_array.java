// TODO: 26-09-2023  import scanner package (java.utis.Scanner)
// TODO: 26-09-2023 get input from user
// TODO: 26-09-2023 convert the input string into lowercase
// TODO: 26-09-2023 initialize empty strings to store vowels and constants
// TODO: 26-09-2023 use for loop to iterate through the string
// TODO: 26-09-2023  use charAt() to get the character from the string
// TODO: 26-09-2023 check for character is letter
// TODO: 26-09-2023  create a function to check whether the character is vowel
// TODO: 26-09-2023 store the values in the empty string

import java.util.Scanner;
public class removing_vowel_array {
    public static void main(String[] args) {
        String vowels = " ", constants = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String getword = scanner.nextLine().toLowerCase();
        for (int i = 0; i < getword.length(); i++) {
            char ch = getword.charAt(i);
            if (Character.isLetter(ch)) {
                if (isvowels(ch)) {
                    vowels += ch + " ";
                } else {
                    constants += ch + "";
                }
            }
        }
        System.out.print(constants);

    }

    public static boolean isvowels(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}

