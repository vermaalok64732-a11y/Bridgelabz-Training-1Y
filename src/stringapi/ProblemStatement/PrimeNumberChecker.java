package stringApi.ProblemStatement;

import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input as String
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        int number = Integer.parseInt(input);

        // Call prime checking function
        boolean isPrime = checkPrime(number);

        // Display result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }

        scanner.close();
    }

    // Function to check if number is prime
    public static boolean checkPrime(int num) {

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
