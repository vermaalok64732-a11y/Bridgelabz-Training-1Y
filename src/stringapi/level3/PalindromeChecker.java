package stringApi.Level3;

import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Iterative method using start and end indexes
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using char array and reversal
    public static boolean isPalindromeCharArray(String text) {
        int len = text.length();
        char[] original = text.toCharArray();
        char[] reverse = new char[len];

        // Create reversed array using charAt
        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }

        // Compare original and reverse arrays
        for (int i = 0; i < len; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text to check palindrome: ");
        String input = sc.nextLine();

        // Remove spaces and convert to lowercase for consistent checking
        String text = input.replaceAll("\\s+", "").toLowerCase();

        // Logic 1
        boolean resultIterative = isPalindromeIterative(text);
        System.out.println("Palindrome Check (Iterative): " + resultIterative);

        // Logic 2
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Palindrome Check (Recursive): " + resultRecursive);

        // Logic 3
        boolean resultCharArray = isPalindromeCharArray(text);
        System.out.println("Palindrome Check (Char Array Reversal): " + resultCharArray);

        sc.close();
    }
}
