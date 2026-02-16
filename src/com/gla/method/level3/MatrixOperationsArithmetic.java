package com.gla.methods.level3;

import java.util.Random;

public class MatrixOperationsArithmetic {

    // a. Generate a random matrix with rows and columns
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // random integers 0-9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%5d", val);
            }
            System.out.println();
        }
    }

    // b. Add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        if (b.length != rows || b[0].length != cols) {
            throw new IllegalArgumentException("Matrices must have same dimensions for addition.");
        }
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // c. Subtract two matrices
    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        if (b.length != rows || b[0].length != cols) {
            throw new IllegalArgumentException("Matrices must have same dimensions for subtraction.");
        }
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // d. Multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int aRows = a.length;
        int aCols = a[0].length;
        int bRows = b.length;
        int bCols = b[0].length;

        if (aCols != bRows) {
            throw new IllegalArgumentException("Number of columns of A must equal number of rows of B for multiplication.");
        }

        int[][] result = new int[aRows][bCols];

        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bCols; j++) {
                int sum = 0;
                for (int k = 0; k < aCols; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example: A 2x3 matrix, B 3x2 matrix
        int[][] A = generateRandomMatrix(2, 3);
        int[][] B = generateRandomMatrix(3, 2);

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        // Multiplication AB
        System.out.println("\nMatrix A * B:");
        int[][] AB = multiplyMatrices(A, B);
        printMatrix(AB);

        // Multiplication BA
        System.out.println("\nMatrix B * A:");
        int[][] BA = multiplyMatrices(B, A);
        printMatrix(BA);

        // For addition and subtraction, matrices must be same dimension
        int[][] C = generateRandomMatrix(2, 3);
        System.out.println("\nMatrix C:");
        printMatrix(C);

        System.out.println("\nMatrix A + C:");
        int[][] add = addMatrices(A, C);
        printMatrix(add);

        System.out.println("\nMatrix A - C:");
        int[][] sub = subtractMatrices(A, C);
        printMatrix(sub);
    }
}
