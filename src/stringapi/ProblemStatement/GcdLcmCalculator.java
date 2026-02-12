package stringApi.ProblemStatement;

import java.util.Scanner;

public class GcdLcmCalculator {

    public static void main(String[] args) {

        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        displayResult(num1, num2, gcd, lcm);
    }

    // Function to take input as String and convert to int
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using GCD
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Function to display results
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("For numbers " + a + " and " + b + ":");
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
