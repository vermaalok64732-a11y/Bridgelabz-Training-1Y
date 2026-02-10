package stringApi.Level3;

import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length of the string without using length()
    public static int stringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception at the end
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // reached end of string
        }
        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int len = stringLength(text);
        char[] temp = new char[len]; // temporary array to store unique characters
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

        // Create an array of exact size to store unique characters
        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(input);

        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        sc.close();
    }
}
