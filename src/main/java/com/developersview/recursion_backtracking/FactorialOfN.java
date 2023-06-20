package com.developersview.recursion_backtracking;

/**
 * @author pranoy.chakraborty
 * @Date 21/06/2023
 */
public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
