package com.developersview;

/**
 * @author pranoy.chakraborty
 * @Date 08/07/22
 */

/*Given an integer array nums and an integer k, return the kth largest element in the array.

        Note that it is the kth largest element in the sorted order, not the kth distinct element.



        Example 1:

        Input: nums = [3,2,1,5,6,4], k = 2
        Output: 5
        Example 2:

        Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
        Output: 4*/

public class KthElementOfArray {
    public static int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        //sorting the unsorted array
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        //return the kth largest element
        return nums[n-k];
    }

    public static void main(String[] args) {
        int[] array1={3,2,1,5,6,4};
        System.out.println(findKthLargest(array1,2));
        int[] array2={3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(array2,4));
    }
}
