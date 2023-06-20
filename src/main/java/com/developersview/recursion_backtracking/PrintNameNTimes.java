package com.developersview.recursion_backtracking;

/**
 * @author pranoy.chakraborty
 * @Date 18/06/2023
 */
public class PrintNameNTimes {

    public static void main(String[] args) {
        print(1, 10);
    }

    static void print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i++ + " Pranoy");
        print(i, n);
    }
}

