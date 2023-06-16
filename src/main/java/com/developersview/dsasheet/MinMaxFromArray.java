package com.developersview.dsasheet;

/**
 * @author pranoy.chakraborty
 * @Date 25/05/22
 */
public class MinMaxFromArray {
    /* Class Pair is used to return two values from getMinMax() */
    static class Pair {
        int min;
        int max;
    }

    /*method to get min and max value*/
    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        /*if there is only 1 element in the array*/
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        /*if there is more than 1 element in the array*/
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for (int i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 56, 89, 23, 754, 569, 4589, 23};
        int arr_size = 10;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.println("Minimum element is : " + minmax.min);
        System.out.println("Maximum element is : " + minmax.max);
    }
}
