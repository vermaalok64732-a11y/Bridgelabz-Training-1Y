package stringApi.Day8ProblemStatement;

import java.util.Scanner;

public class PalindromeStringCheck {

    public static void main(String[] args) {

        String input = getInput();

        boolean isPalindrome = checkPalindrome(input);

        displayResult(input, isPalindrome);
    }

    // Function to get input from user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        return text;
    }

    // Function to check if a string is a palindrome
    public static boolean checkPalindrome(String text) {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase(); // remove spaces & lowercase

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

    // Function to display the result
    public static void displayResult(String text, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }
}
