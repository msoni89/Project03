package org.project.problem;

public class ReverseString {
    public static void main(String[] args) {
        new ReverseString().reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    public void reverseString(char[] chars) {
        int l = 0;
        int r = chars.length - 1;
        while (l < r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
    }
}
