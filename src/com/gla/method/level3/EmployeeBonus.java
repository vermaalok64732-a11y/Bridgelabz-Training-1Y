package com.gla.methods.level3;

import java.util.Random;

public class EmployeeBonus {

    // b. Generate salaries (5-digit) and years of service for 10 employees
    public static double[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        double[][] data = new double[numEmployees][2]; // [salary, yearsOfService]
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            data[i][1] = rand.nextInt(11); // years of service 0-10
        }
        return data;
    }

    // c. Calculate new salary and bonus
    public static double[][] calculateBonusAndNewSalary(double[][] employees) {
        int n = employees.length;
        double[][] result = new double[n][2]; // [bonus, newSalary]
        for (int i = 0; i < n; i++) {
            double salary = employees[i][0];
            double years = employees[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = Math.round(bonus * 100.0) / 100.0;
            result[i][1] = Math.round(newSalary * 100.0) / 100.0;
        }
        return result;
    }

    // d. Calculate totals and display
    public static void displayEmployeeBonus(double[][] employees, double[][] bonuses) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < employees.length; i++) {
            double oldSalary = employees[i][0];
            double years = employees[i][1];
            double bonus = bonuses[i][0];
            double newSalary = bonuses[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t%.2f\t\t%.0f\t%.2f\t%.2f\n",
                    i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("\nTotal\t" + String.format("%.2f", totalOldSalary) +
                "\t\t-\t" + String.format("%.2f", totalBonus) +
                "\t" + String.format("%.2f", totalNewSalary));
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employees = generateEmployeeData(numEmployees);
        double[][] bonuses = calculateBonusAndNewSalary(employees);
        displayEmployeeBonus(employees, bonuses);
    }
}
