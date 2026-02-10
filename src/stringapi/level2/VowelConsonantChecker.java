package stringApi.Level2;

import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check character type: Vowel, Consonant, or Not a Letter
    public static String checkChar(char ch) {
        // Convert uppercase letters to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if it's a lowercase letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to create 2D array of characters and their type
    public static String[][] getCharTypes(String text) {
        int length = text.length();
        String[][] charTypes = new String[length][2];

        for (int i = 0; i < length; i++) {
            charTypes[i][0] = String.valueOf(text.charAt(i)); // Character
            charTypes[i][1] = checkChar(text.charAt(i));     // Type
        }

        return charTypes;
    }

    // Method to display 2D array in tabular format
    public static void displayCharTypes(String[][] array) {
        System.out.println("\nCharacter\tType");
        System.out.println("-------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + "\t\t" + array[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Get character types in 2D array
        String[][] result = getCharTypes(input);

        // Display result in tabular format
        displayCharTypes(result);

        sc.close();
    }
}
