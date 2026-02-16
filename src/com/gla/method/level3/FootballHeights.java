package com.gla.methods.level3;

import java.util.Random;

public class FootballHeights {

    static int[] heights = new int[11];

    static void generateHeights() {
        Random r = new Random();
        for (int i = 0; i < heights.length; i++)
            heights[i] = 150 + r.nextInt(101); //150–250
    }

    static int sum() {
        int s = 0;
        for (int h : heights) s += h;
        return s;
    }

    static double mean() {
        return (double) sum() / heights.length;
    }

    static int shortest() {
        int min = heights[0];
        for (int h : heights) if (h < min) min = h;
        return min;
    }

    static int tallest() {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        generateHeights();

        System.out.println("Heights:");
        for (int h : heights) System.out.print(h + " ");

        System.out.println("\nMean: " + mean());
        System.out.println("Shortest: " + shortest());
        System.out.println("Tallest: " + tallest());
    }
}
