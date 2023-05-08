package org.project.problem;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("0P"));
    }

    public boolean isPalindrome(String s) {

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {

            if (!((s.charAt(l) >= 'a' && s.charAt(l) <= 'z') || (s.charAt(l) >= 'A' && s.charAt(l) <= 'Z') || (s.charAt(l) >= '0' && s.charAt(l) <= '9'))) {
                l++;
                continue;
            }

            if (!((s.charAt(r) >= 'a' && s.charAt(r) <= 'z') || (s.charAt(r) >= 'A' && s.charAt(r) <= 'Z') || (s.charAt(r) >= '0' && s.charAt(r) <= '9'))) {
                r--;
                continue;
            }

            if (Character.toUpperCase(s.charAt(l)) != Character.toUpperCase(s.charAt(r))) {
                return false;
            }
            r--;
            l++;
        }

        return true;
    }
}
