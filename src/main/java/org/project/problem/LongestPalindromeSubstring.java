package org.project.problem;

public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        System.out.println(new LongestPalindromeSubstring().longestPalindrome("babad"));
    }

    public String longestPalindrome(String s) {
        String result = "";
        int resultLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int r = i;
            int l = i;
            while (r >= 0 && l < s.length() && s.charAt(r) == s.charAt(l)) {
                if (resultLength < (l - r + 1)) {
                    result = s.substring(r, l + 1);
                    resultLength = l - r + 1;
                }
                r -= 1;
                l += 1;
            }

            r = i;
            l = i + 1;
            while (r >= 0 && l < s.length() && s.charAt(r) == s.charAt(l)) {
                if (resultLength < (l - r + 1)) {
                    result = s.substring(r, l + 1);
                    resultLength = l - r + 1;
                }
                r -= 1;
                l += 1;
            }
        }

        return result;
    }
}
