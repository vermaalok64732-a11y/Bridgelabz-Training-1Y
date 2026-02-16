package com.gla.methods.level2;

import java.util.Scanner;

public class NumberCheck {

    // Method to check positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Check each number
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (!isPositive(num)) {
                System.out.println(num + " is Negative.");
            } else {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            }
        }

        // Compare first and last element
        int result = compare(numbers[0], numbers[4]);
        System.out.print("\nFirst element (" + numbers[0] + ") is ");
        if (result == 1) {
            System.out.println("greater than last element (" + numbers[4] + ").");
        } else if (result == 0) {
            System.out.println("equal to last element (" + numbers[4] + ").");
        } else {
            System.out.println("less than last element (" + numbers[4] + ").");
        }

        scanner.close();
    }
}
