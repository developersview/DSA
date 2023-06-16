package com.developersview.dsasheet;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author pranoy.chakraborty
 * @Date 10/06/22
 */

/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



        Example 1:

        Input: nums = [1,2,3,1]
        Output: true
        Example 2:

        Input: nums = [1,2,3,4]
        Output: false
        Example 3:

        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true


        Constraints:

        1 <= nums.length <= 105
        -109 <= nums[i] <= 109*/

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int element : arr){
            if(hashSet.contains(element)){
                return true;
            }
            hashSet.add(element);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={34,2,2,57,29};
        System.out.println(containsDuplicate(arr));
    }
}
