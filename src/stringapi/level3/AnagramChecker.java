package stringApi.Level3;

import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert to lowercase for uniform comparison
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        // Step 1: Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Initialize frequency arrays for all ASCII characters
        int[] freq1 = new int[256]; // Frequency for text1
        int[] freq2 = new int[256]; // Frequency for text2

        // Step 3: Count frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // Step 4: Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true; // All frequencies match
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // Check if the two texts are anagrams
        boolean result = areAnagrams(text1, text2);

        if (result) {
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are Anagrams.");
        } else {
            System.out.println("\"" + text1 + "\" and \"" + text2 + "\" are NOT Anagrams.");
        }

        sc.close();
    }
}
