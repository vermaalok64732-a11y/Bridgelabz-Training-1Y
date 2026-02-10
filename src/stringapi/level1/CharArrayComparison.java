package stringApi.Level1;

import java.util.Scanner;

public class CharArrayComparison {

    // Method to return characters of a string without using toCharArray()
    public static char[] getCharsUsingCharAt(String str) {
        char[] chars = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }

        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the string: ");
        String text = sc.next();

        // Getting characters using user-defined method
        char[] userDefinedArray = getCharsUsingCharAt(text);

        // Getting characters using built-in toCharArray()
        char[] builtInArray = text.toCharArray();

        // Comparing both character arrays
        boolean result = compareCharArrays(userDefinedArray, builtInArray);

        // Displaying results
        System.out.print("Characters using user-defined method: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.println("Are both character arrays equal? " + result);

        sc.close();
    }
}
