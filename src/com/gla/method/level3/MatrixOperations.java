package com.gla.methods.level3;

import java.util.Random;

public class MatrixOperations {

    // a. Generate a random matrix with rows and columns
    public static double[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random integers 0-9
            }
        }
        return matrix;
    }

    // g. Display a matrix
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }

    // b. Transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // c. Determinant of 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // d. Determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // e. Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular; inverse does not exist.");
        }
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1]/det;
        inv[0][1] = -m[0][1]/det;
        inv[1][0] = -m[1][0]/det;
        inv[1][1] = m[0][0]/det;
        return inv;
    }

    // f. Inverse of 3x3 matrix using adjoint method
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular; inverse does not exist.");
        }

        double[][] inv = new double[3][3];
        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1])/det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1])/det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1])/det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0])/det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0])/det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0])/det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0])/det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0])/det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0])/det;

        return inv;
    }

    public static void main(String[] args) {
        // Example usage for 3x3 matrix
        double[][] matrix = generateRandomMatrix(3,3);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose:");
        printMatrix(transpose(matrix));

        double det = determinant3x3(matrix);
        System.out.println("\nDeterminant: " + det);

        try {
            System.out.println("\nInverse:");
            double[][] inv = inverse3x3(matrix);
            printMatrix(inv);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
