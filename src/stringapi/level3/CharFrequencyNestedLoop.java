package stringApi.Level3;

import java.util.Scanner;

public class CharFrequencyNestedLoop {

    // Method to find frequency of characters using nested loops
    public static String[] findCharFrequency(String text) {
        char[] chars = text.toCharArray();  // Convert string to char array
        int len = chars.length;
        int[] freq = new int[len];          // Frequency array

        // Nested loop to calculate frequency
        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') continue; // Skip already counted characters
            freq[i] = 1;                   // Initialize frequency

            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate as counted
                }
            }
        }

        // Count how many characters are not '0' for result array size
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') count++;
        }

        // Create result array
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " -> " + freq[i];
                index++;
            }
        }

        return result;
    }

    // Method to display results
    public static void displayFrequency(String[] freqData) {
        System.out.println("Character\tFrequency");
        System.out.println("-----------------------");
        for (String s : freqData) {
            String[] parts = s.split(" -> ");
            System.out.println(parts[0] + "\t\t" + parts[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] freqData = findCharFrequency(input);

        displayFrequency(freqData);

        sc.close();
    }
}
