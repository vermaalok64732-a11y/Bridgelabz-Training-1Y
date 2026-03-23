package com.gla.exception_assignment.q4;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        try {
            int index = 5;
            System.out.println("Value: " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}