package stringApi.ProblemStatement;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        String input = getInput();

        boolean result = checkPalindrome(input);

        displayResult(input, result);
    }

    // Function to take input
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String text = scanner.nextLine();
        return text;
    }

    // Function to check palindrome
    public static boolean checkPalindrome(String text) {

        // Remove spaces and convert to lowercase
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Function to display result
    public static void displayResult(String text, boolean isPalindrome) {

        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }
}
