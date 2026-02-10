package stringApi.Level3;

import java.util.Scanner;

public class UniqueCharFrequency {

    // Method to find unique characters using charAt()
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            // Check if c is already in temp array
            for (int j = 0; j < index; j++) {
                if (temp[j] == c) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index] = c;
                index++;
            }
        }

        // Create array of exact size
        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method to find frequency of characters using unique characters
    public static String[][] charFrequency(String text) {
        int[] freq = new int[256];
        int len = text.length();

        // Count frequency of all characters
        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create 2D array for result
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            result[i][0] = String.valueOf(c);   // character
            result[i][1] = String.valueOf(freq[c]); // frequency
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

        String[][] freqData = charFrequency(input);

        displayFrequency(freqData);

        sc.close();
    }
}
