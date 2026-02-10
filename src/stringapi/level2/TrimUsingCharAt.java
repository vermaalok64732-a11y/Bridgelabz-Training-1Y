package stringApi.Level2;

import java.util.Scanner;

public class TrimUsingCharAt {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 != len2) return false;

        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        // Use user-defined method to find start and end indices
        int[] indices = findTrimIndices(input);

        // Get trimmed string using charAt() method
        String trimmedCustom = substringUsingCharAt(input, indices[0], indices[1]);

        // Get trimmed string using built-in trim()
        String trimmedBuiltIn = input.trim();

        // Compare the two results
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("\nTrimmed string (user-defined): \"" + trimmedCustom + "\"");
        System.out.println("Trimmed string (built-in)  : \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both trimmed strings equal? " + areEqual);

        sc.close();
    }
}
