package com.developersview.recursion_backtracking;

/**
 * @author pranoy.chakraborty
 * @Date 21/06/2023
 */
public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        sum(10, 0);
        System.out.println(sumMethod2(10));
    }

    static void sum(int n, int result) {
        if (n < 1) {
            System.out.println(result);
            return;
        }
        sum(n - 1, result + n);
    }

    static int sumMethod2(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumMethod2(n - 1);
    }
}
