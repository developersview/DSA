package com.developersview.recursion_backtracking;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * @author pranoy.chakraborty
 * @Date 21/06/2023
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        reverse(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        reverseUsingOnePointer(arr2, 0);
        System.out.println(Arrays.toString(arr2));
    }

    static void reverse(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverse(arr, l + 1, r - 1);
    }

    static void reverseUsingOnePointer(int[] arr, int i) {
        int n = arr.length;
        if (i >= n / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        reverseUsingOnePointer(arr, i + 1);
    }

}
