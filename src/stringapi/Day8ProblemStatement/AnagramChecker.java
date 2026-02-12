package stringApi.Day8ProblemStatement;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {

        String str1 = getInput("Enter the first string: ");
        String str2 = getInput("Enter the second string: ");

        boolean isAnagram = checkAnagram(str1, str2);

        displayResult(str1, str2, isAnagram);
    }

    // Function to get input from user
    public static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    // Function to check if two strings are anagrams
    public static boolean checkAnagram(String s1, String s2) {
        // Remove spaces and convert to lowercase
        String str1 = s1.replaceAll("\\s+", "").toLowerCase();
        String str2 = s2.replaceAll("\\s+", "").toLowerCase();

        // If lengths differ, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    // Function to display result
    public static void displayResult(String s1, String s2, boolean isAnagram) {
        if (isAnagram) {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are NOT anagrams.");
        }
    }
}
