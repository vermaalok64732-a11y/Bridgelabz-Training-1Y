package stringApi.Level3;

import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status for one person
    public static String[] calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meters
        double bmi = weightKg / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimal places

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.valueOf(weightKg), String.valueOf(heightCm), String.valueOf(bmi), status};
    }

    // Method to calculate BMI for all persons
    public static String[][] calculateAllBMI(double[][] heightWeight) {
        int n = heightWeight.length;
        String[][] result = new String[n][4]; // weight, height, BMI, status

        for (int i = 0; i < n; i++) {
            result[i] = calculateBMI(heightWeight[i][0], heightWeight[i][1]);
        }

        return result;
    }

    // Method to display the BMI table
    public static void displayBMI(String[][] bmiData) {
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(bmiData[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        double[][] heightWeight = new double[n][2]; // weight, height

        // Input weight and height for 10 persons
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            heightWeight[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            heightWeight[i][1] = sc.nextDouble();
        }

        // Calculate BMI and Status
        String[][] bmiData = calculateAllBMI(heightWeight);

        // Display BMI table
        displayBMI(bmiData);

        sc.close();
    }
}
