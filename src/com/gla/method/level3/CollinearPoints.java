package com.gla.methods.level3;

import java.util.Scanner;

public class CollinearPoints {

    // ---------- Method 1 : Using Slopes ----------
    static boolean areCollinearBySlope(double x1, double y1,
                                       double x2, double y2,
                                       double x3, double y3) {

        // Handle vertical line cases (avoid divide by zero)
        if ((x2 - x1) == 0 && (x3 - x2) == 0)
            return true;

        if ((x2 - x1) == 0 || (x3 - x2) == 0)
            return false;

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // ---------- Method 2 : Using Area of Triangle ----------
    static boolean areCollinearByArea(double x1, double y1,
                                      double x2, double y2,
                                      double x3, double y3) {

        double area = 0.5 * (x1 * (y2 - y3) +
                x2 * (y3 - y1) +
                x3 * (y1 - y2));

        return area == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of three points:");

        System.out.print("x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Using slope
        if (areCollinearBySlope(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear (Slope Method)");
        else
            System.out.println("Not Collinear (Slope Method)");

        // Using area
        if (areCollinearByArea(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear (Area Method)");
        else
            System.out.println("Not Collinear (Area Method)");

        sc.close();
    }
}
