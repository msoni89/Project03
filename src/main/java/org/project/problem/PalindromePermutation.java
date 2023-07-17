package org.project.problem;

public class PalindromePermutation {


//    Given a string, determine if a permutation of the string could form a palindrome.
//
//    Example 1:
//    Input: "code"
//    Output: false

//    Example 3:
//    Input: "carerac"
//    Output: true


    public static void main(String[] args) {
        System.out.println(new PalindromePermutation().isPalindromePermutation("carerac"));
    }


    public boolean isPalindromePermutation(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s.substring(i) + s.substring(0, i))) {
                return true;
            }
        }
        return false;
    }


    public boolean isPalindrome(String s) {
        int right = 0;
        int left = s.length() - 1;
        while (right < left) {
            if (s.charAt(right) != s.charAt(left)) {
                return false;
            }
            right++;
            left--;
        }
        return true;
    }
}
