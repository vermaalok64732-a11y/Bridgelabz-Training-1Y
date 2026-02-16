package com.gla.methods.level3;

import java.util.Scanner;

public class LineAndDistance {

    // b. Calculate Euclidean distance
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // c. Calculate line equation y = m*x + b
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double m, b;
        if (x2 - x1 == 0) { // vertical line
            m = Double.POSITIVE_INFINITY;
            b = Double.NaN; // undefined intercept
        } else {
            m = (y2 - y1) / (x2 - x1);
            b = y1 - m * x1;
        }
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        double distance = euclideanDistance(x1, y1, x2, y2);
        double[] line = lineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean Distance: %.2f\n", distance);
        if (Double.isInfinite(line[0])) {
            System.out.println("Line is vertical: x = " + x1);
        } else {
            System.out.printf("Line equation: y = %.2fx + %.2f\n", line[0], line[1]);
        }

        scanner.close();
    }
}
