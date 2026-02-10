package stringApi.Level3;

import java.util.Scanner;

public class CharacterFrequency {

    // Method to find frequency of characters and return as 2D array
    public static String[][] findCharFrequency(String text) {
        int[] freq = new int[256]; // ASCII characters frequency
        int length = text.length();

        // Count frequency using charAt()
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Count how many unique characters are present
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (freq[text.charAt(i)] != 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark as counted
            }
        }

        // Restore frequencies and prepare 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        freq = new int[256]; // reset frequency array

        // Count frequency again for storing correct values
        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }

        boolean[] counted = new boolean[256]; // to track stored characters

        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (!counted[c]) {
                result[index][0] = String.valueOf(c);       // character
                result[index][1] = String.valueOf(freq[c]); // frequency
                counted[c] = true;
                index++;
            }
        }

        return result;
    }

    // Method to display 2D array
    public static void displayFrequency(String[][] freqData) {
        System.out.println("Character\tFrequency");
        System.out.println("-----------------------");
        for (int i = 0; i < freqData.length; i++) {
            System.out.println(freqData[i][0] + "\t\t" + freqData[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freqData = findCharFrequency(input);

        displayFrequency(freqData);

        sc.close();
    }
}
