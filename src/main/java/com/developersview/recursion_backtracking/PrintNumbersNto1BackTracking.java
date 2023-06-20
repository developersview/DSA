package com.developersview.recursion_backtracking;

/**
 * @author pranoy.chakraborty
 * @Date 21/06/2023
 */
public class PrintNumbersNto1BackTracking {
    public static void main(String[] args) {
        print(1, 5);
    }

    static void print(int i, int n) {
        if (i > n) {
            return;
        }
        print(i + 1, n);
        System.out.println(i);
    }
}
