package com.brunoyam.unit_1;

import com.brunoyam.unit_1.utils.Generator;

import java.util.Arrays;

import static java.util.Arrays.deepToString;

public class Main {


    private static int[] oneDimensionArray = Generator.getOneDimensionArray();


    private static void level1() {

        int minValue = findMinValue(oneDimensionArray);
        int maxValue = findMaxValue(oneDimensionArray);
        int sumOfValues = sumValues(oneDimensionArray);
        int firstPositiveIndex = getFirstPositiveIndex(oneDimensionArray);
        int firstNegativeIndex = getFirstNegativeIndex(oneDimensionArray);


        System.out.println("First part");

        System.out.println("min: " + minValue);
        System.out.println("max: " + maxValue);
        System.out.println("sum: " + sumOfValues);

        System.out.println();
        System.out.println("length: " + oneDimensionArray.length);
        System.out.println("first positive index: " + firstPositiveIndex);
        System.out.println("first negative index: " + firstNegativeIndex);

        System.out.println(Arrays.toString(oneDimensionArray));
    }

    private static void level2() {


        int lastPositiveIndex = getLastPositiveIndex(oneDimensionArray);
        int lastNegativeIndex = getLastNegativeIndex(oneDimensionArray);
        byte[] positiveNegativeNumber = countPositiveNegative(oneDimensionArray);

        System.out.println("last positive index: " + lastPositiveIndex);
        System.out.println("last negative index: " + lastNegativeIndex);
        System.out.println("total positives: " + positiveNegativeNumber[0]);
        System.out.println("total negatives: " + positiveNegativeNumber[1]);
    }

    private static void level3() {
        int[][] twoDimensionsArray = Generator.getTwoDimensionsArray();
        long[] arrayOfSums = sumSubArrays(twoDimensionsArray);

        System.out.println();
        System.out.println("Second part");
        System.out.println("result: " + Arrays.toString(arrayOfSums));

          System.out.println(deepToString(twoDimensionsArray));
    }


    private static int findMinValue(int[] arrayOfValues) {
        int minValue = arrayOfValues[0];
        for (int i = 0; i < oneDimensionArray.length; i++) {
            if (arrayOfValues[i] < minValue) {
                minValue = arrayOfValues[i];
            }
        }
        return minValue;
    }


    private static int findMaxValue(int[] arrayOfValues) {

        int maxValue = arrayOfValues[0];
        for (int i = 0; i < oneDimensionArray.length; i++) {
            if (arrayOfValues[i] > maxValue) {
                arrayOfValues[i] = maxValue;
            }

        }
        return maxValue;
    }


    private static int sumValues(int[] arrayOfValues) {

        int sum = 0;
        for (int i = 0; i < oneDimensionArray.length; i++) {
            sum += arrayOfValues[i];

        }
        return sum;
    }


    private static int getFirstPositiveIndex(int[] arrayOfValues) {

        int firstPositiveIndex = 0;
        for (int i = 0; i < oneDimensionArray.length; i++) {
            if (arrayOfValues[i] > 0) {
                firstPositiveIndex = arrayOfValues[i];
                break;
            }

        }
        return firstPositiveIndex;
    }


    private static int getFirstNegativeIndex(int[] arrayOfValues) {

        int firstNegativeIndex = 0;
        for (int i = 0; i < oneDimensionArray.length; i++) {
            if (arrayOfValues[i] < 0) {
                firstNegativeIndex = arrayOfValues[i];
                break;

            }
        }
        return firstNegativeIndex;
    }


    private static int getLastPositiveIndex(int[] arrayOfValues) {

        int lastPositiveIndex = 0;
        for (int i = 0; i < oneDimensionArray.length; i++) {
            while (arrayOfValues[i] > 0) {
                lastPositiveIndex = arrayOfValues[i];
                break;
            }

        }

        return lastPositiveIndex;
    }


    private static int getLastNegativeIndex(int[] arrayOfValues) {

        int lastNegativeValue = 0;
        for (int i = 0; i < oneDimensionArray.length; i++) {
            while (arrayOfValues[i] < 0) {
                lastNegativeValue = arrayOfValues[i];
                break;

            }

        }

        return lastNegativeValue;
    }

    private static byte[] countPositiveNegative(int[] arrayOfValues) {
        byte[] result = new byte[2];
        byte countPositive = 0;
        byte countNegative = 0;

        for (int i = 0; i < oneDimensionArray.length; i++) {

            if (arrayOfValues[i] > 0)
                countPositive++;
            if (arrayOfValues[i] < 0)
                countNegative++;
        }
        result[0] = countPositive;
        result[1] = countNegative;


        return result;
    }


    private static long[] sumSubArrays(int[][] arrayOfValues) {

        long[] arrayOfSum = new long[arrayOfValues.length];

        for (int i = 0; i < arrayOfValues.length; i++) {
            for (int j = 0; j < arrayOfValues[i].length; j++) {
                arrayOfSum[i] = arrayOfSum[i] + arrayOfValues[i][j];
            }

        }
        return arrayOfSum;
    }

    public static void main(String[] args) {
        level1();
        level2();
        level3();
    }

}
