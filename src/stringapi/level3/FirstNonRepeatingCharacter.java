package stringApi.Level3;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256]; // ASCII characters frequency

        int length = text.length(); // get string length

        // Count frequency of each character using charAt
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (freq[c] == 1) {
                return c;
            }
        }

        return '\0'; // return null character if no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
