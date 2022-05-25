package com.developersview;

/**
 * @author pranoy.chakraborty
 * @Date 25/05/22
 */
public class ReverseArray {
    /*method to reverse the array*/
    public static void reverse(int[] arr) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 56, 89, 23, 754, 569, 4589, 23};
        reverse(arr);
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
