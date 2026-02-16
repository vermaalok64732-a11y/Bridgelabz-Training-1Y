package com.gla.methods.level2;

import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI for each person and store in array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // in kg
            double heightCm = data[i][1]; // in cm
            double heightM = heightCm / 100; // convert to meters
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi; // store BMI in third column
        }
    }

    // Method to get BMI status
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int members = 10;
        double[][] teamData = new double[members][3]; // weight, height, BMI

        // Input weight and height for 10 members
        for (int i = 0; i < members; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            System.out.print("Weight (kg): ");
            teamData[i][0] = scanner.nextDouble();

            System.out.print("Height (cm): ");
            teamData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI
        calculateBMI(teamData);

        // Get BMI status
        String[] status = getBMIStatus(teamData);

        // Display results
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < members; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    teamData[i][0], teamData[i][1], teamData[i][2], status[i]);
        }

        scanner.close();
    }
}
