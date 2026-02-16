package com.gla.methods.level1;

import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate number of rounds needed to complete 5 km
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;  // Perimeter of triangle
        double totalDistance = 5000;               // 5 km in meters
        return totalDistance / perimeter;          // Number of rounds
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate rounds
        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds needed to complete 5 km: " + rounds);

        scanner.close();
    }
}
