// cschumacher_07052026_mod4_2_csd402
// https://github.com/LittleIowaBoy/csd-402/tree/main

import java.util.Arrays;

public class OverloadMethods {

    // Returns the average of a short array as a short.
    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    // Returns the average of an int array as an int.
    public static int average(int[] array) {
        long sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (int) (sum / array.length);
    }

    // Returns the average of a long array as a long.
    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Returns the average of a double array as a double.
    public static double average(double[] array) {
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Each array is a different size to confirm the methods work independently.
        short[] shortArray = {10, 20, 30};                       // 3 elements
        int[] intArray = {5, 15, 25, 35};                        // 4 elements
        long[] longArray = {100L, 200L, 300L, 400L, 500L};       // 5 elements
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};   // 6 elements

        System.out.println("Overloaded average() Method Results");
        System.out.println("===================================");

        System.out.printf("%-8s | size %d | elements %s%n", "short", shortArray.length, Arrays.toString(shortArray));
        System.out.printf("         average = %d%n%n", average(shortArray));

        System.out.printf("%-8s | size %d | elements %s%n", "int", intArray.length, Arrays.toString(intArray));
        System.out.printf("         average = %d%n%n", average(intArray));

        System.out.printf("%-8s | size %d | elements %s%n", "long", longArray.length, Arrays.toString(longArray));
        System.out.printf("         average = %d%n%n", average(longArray));

        System.out.printf("%-8s | size %d | elements %s%n", "double", doubleArray.length, Arrays.toString(doubleArray));
        System.out.printf("         average = %.2f%n", average(doubleArray));
    }
}
