package com.developersview;

import java.util.*;

/**
 * @author pranoy.chakraborty
 * @Date 11/06/22
 */

/*
You are given a read only array of n integers from 1 to n.

        Each integer appears exactly once except A which appears twice and B which is missing.

        Return A and B.

        Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

        Note that in your output A should precede B.

        Example:

        Input:[3 1 2 5 3]

        Output:[3, 4]

        A = 3, B = 4
*/

public class RepeatMissingNumber {
    public static int[] repeatedNumber(final int[] A) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(A);
        for (int i = 0; i <= A.length; i++) {
            if (i == A.length - 1) break;

            if (A[i] == A[i + 1]) {
                set.add(A[i]);
            }
            if (A[i + 1] - A[i] != 1) {
                set.add(i + 1);
            }
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 9, 10, 11, 13, 7, 8};

        // get the start time
        long start = System.currentTimeMillis();

        System.out.println(Arrays.toString(repeatedNumber(arr)));
        // get the end time
        long end = System.currentTimeMillis();

        // execution time
        long execution = end - start;
        System.out.println("Execution time: " + execution + " ms");

    }
}
