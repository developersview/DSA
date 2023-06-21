package com.developersview.recursion_backtracking;

/**
 * @author pranoy.chakraborty
 * @Date 21/06/2023
 */
public class CheckPalindrome {
    public static void main(String[] args) {
        String s= "MADAM";
        System.out.println(palindrome(s,0));
    }

    static boolean palindrome(String s, int i) {
        int n = s.length();
        if (i >= n / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return palindrome(s,i+1);
    }
}
