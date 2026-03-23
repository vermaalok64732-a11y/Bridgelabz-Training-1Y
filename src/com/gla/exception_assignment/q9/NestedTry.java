package com.gla.exception_assignment.q9;

public class NestedTry {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        try {
            int index = 2;

            try {
                int result = arr[index] / 0;
                System.out.println(result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}