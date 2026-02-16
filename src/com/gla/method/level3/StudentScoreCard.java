package com.gla.methods.level3;

import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {

    // b. Generate random 2-digit scores (10-99) for PCM subjects
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(100); // 0-99
            }
        }
        return scores;
    }

    // c. Calculate total, average, and percentage for each student
    public static double[][] calculateTotalAvgPercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] result = new double[numStudents][3]; // total, average, percentage
        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = total / 3.0; // since max marks per subject = 100, total/300*100 = total/3
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to determine grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Method to determine remarks based on grade
    public static String getRemarks(String grade) {
        switch (grade) {
            case "A": return "Level 4, above agency-normalized standards";
            case "B": return "Level 3, at agency-normalized standards";
            case "C": return "Level 2, below, but approaching agency-normalized standards";
            case "D": return "Level 1, well below agency-normalized standards";
            case "E": return "Level 1-, too below agency-normalized standards";
            case "R": return "Remedial standards";
            default: return "";
        }
    }

    // d. Display scorecard in tabular format
    public static void displayScoreCard(int[][] scores, double[][] totals, int numStudents) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        for (int i = 0; i < numStudents; i++) {
            String grade = getGrade(totals[i][2]);
            String remarks = getRemarks(grade);
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f\t\t%s\t%s\n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    totals[i][0],
                    totals[i][1],
                    totals[i][2],
                    grade,
                    remarks);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        // Generate scores
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, percentage
        double[][] totals = calculateTotalAvgPercentage(scores);

        // Display scorecard
        displayScoreCard(scores, totals, numStudents);

        scanner.close();
    }
}
