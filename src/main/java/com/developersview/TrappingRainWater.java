package com.developersview;

/**
 * @author pranoy.chakraborty
 * @Date 09/07/22
 */

/*Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.



        Example 1:


        Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
        Output: 6
        Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
        Example 2:

        Input: height = [4,2,0,3,2,5]
        Output: 9


        Constraints:

        n == height.length
        1 <= n <= 2 * 104
        0 <= height[i] <= 105*/

public class TrappingRainWater {
    public static int trap(int[] arr) {
        int n = arr.length;
        int sum = 0;
        //traverse the array except for the 1st and last element
        for (int i = 1; i < n - 1; i++) {

            //find max element on its left
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            //find max element on its left
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }

            //calculate tolal water trappes inside
            sum += Math.min(left, right) - arr[i];
        }
        return sum;
    }

   /* public static void main(String[] args) {
        int[] height={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));

    }*/
}
