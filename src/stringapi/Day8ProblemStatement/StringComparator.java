package stringApi.Day8ProblemStatement;

import java.util.Scanner;

public class StringComparator {

    public static void main(String[] args) {

        String str1 = getInput("Enter String 1: ");
        String str2 = getInput("Enter String 2: ");

        int result = compareStrings(str1, str2);

        displayResult(str1, str2, result);
    }

    // Function to get input from user
    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    // Function to compare strings lexicographically
    public static int compareStrings(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2; // positive if s1 > s2, negative if s1 < s2
            }
        }

        // If all characters are same up to min length, compare lengths
        return len1 - len2;
    }

    // Function to display result
    public static void displayResult(String s1, String s2, int comparison) {
        if (comparison < 0) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order.");
        } else if (comparison > 0) {
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + s1 + "\" is equal to \"" + s2 + "\".");
        }
    }
}
