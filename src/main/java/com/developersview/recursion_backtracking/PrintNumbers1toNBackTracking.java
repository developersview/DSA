package com.developersview.recursion_backtracking;

/**
 * @author pranoy.chakraborty
 * @Date 21/06/2023
 */
public class PrintNumbers1toNBackTracking {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        if (n < 1) {
            return;
        }
        print(n - 1);
        System.out.println(n);
    }
}
