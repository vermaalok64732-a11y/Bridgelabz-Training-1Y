package stringApi.Day8ProblemStatement;

import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {

        String text = getInput();

        int vowels = countVowels(text);
        int consonants = countConsonants(text);

        displayResult(vowels, consonants);
    }

    // Function to get input from user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        return input;
    }

    // Function to count vowels
    public static int countVowels(String text) {
        int count = 0;
        String lower = text.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    // Function to count consonants
    public static int countConsonants(String text) {
        int count = 0;
        String lower = text.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch >= 'a' && ch <= 'z' && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                count++;
            }
        }
        return count;
    }

    // Function to display results
    public static void displayResult(int vowels, int consonants) {
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
