package stringApi.Level2;

import java.util.Scanner;
import java.util.Random;

public class StudentVoting {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            ages[i] = 10 + rand.nextInt(90); // random age between 10 and 99
        }

        return ages;
    }

    // Method to determine voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age); // Store age as String

            if (age < 0) {
                result[i][1] = "Cannot Vote (Invalid Age)";
            } else if (age >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResults(String[][] array) {
        System.out.println("\nAge\tVoting Eligibility");
        System.out.println("-------------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + "\t" + array[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of students
        int n = 10;

        System.out.println("Enter ages for " + n + " students or type 0 to generate random ages:");

        int[] ages = new int[n];
        boolean random = false;

        // Take user input or generate random ages
        for (int i = 0; i < n; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            int input = sc.nextInt();
            if (input == 0) {
                random = true;
                break;
            }
            ages[i] = input;
        }

        if (random) {
            ages = generateAges(n);
            System.out.println("\nRandom ages generated for students:");
            for (int i = 0; i < n; i++) {
                System.out.print(ages[i] + " ");
            }
            System.out.println();
        }

        // Check voting eligibility
        String[][] results = checkVotingEligibility(ages);

        // Display results
        displayResults(results);

        sc.close();
    }
}
