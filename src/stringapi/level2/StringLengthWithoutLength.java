package stringApi.Level2;

import java.util.Scanner;

public class StringLengthWithoutLength {

    // Method to find length without using length()
    public static int getLength(String str) {
        int count = 0;

        // Loop until charAt() throws an exception
        try {
            while (true) {
                str.charAt(count); // Access character at current index
                count++;           // Increment count
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when index is out of bounds
            // Return the count
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Using user-defined method
        int customLength = getLength(input);

        // Using built-in length() method
        int builtInLength = input.length();

        // Displaying results
        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);

        sc.close();
    }
}
