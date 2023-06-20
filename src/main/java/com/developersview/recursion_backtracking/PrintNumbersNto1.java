package com.developersview.recursion_backtracking;

/**
 * @author pranoy.chakraborty
 * @Date 18/06/2023
 */
public class PrintNumbersNto1 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }
}
