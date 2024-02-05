package com.in28minutes.java_8;

import java.util.Arrays;

public class KaprekarConstant {

    public static int kaprekarSteps(int number) {
        final int KAPREKAR_CONSTANT = 6174;
        int steps = 0;

        while (number != KAPREKAR_CONSTANT) {
            int descending = getDescendingNumber(number);
            int ascending = getAscendingNumber(number);
            number = descending - ascending;
            steps++;
        }

        return steps;
    }

    private static int getDescendingNumber(int num) {
        char[] digits = String.format("%04d", num).toCharArray();
        Arrays.sort(digits);
        return Integer.parseInt(new StringBuilder(new String(digits)).reverse().toString());
    }

    private static int getAscendingNumber(int num) {
        char[] digits = String.format("%04d", num).toCharArray();
        Arrays.sort(digits);
        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i <= 9999; i++) {
            int steps = kaprekarSteps(i);
            if (steps != 0) {
                System.out.println("Number: " + i + ", Steps: " + steps);
                count++;
            }
        }
        System.out.println("Total numbers that reach 6174: " + count);
    }
}
