package org.project.problem;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("  "));
    }


    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (length > 0 && s.charAt(i) == ' ') {
                break;
            } else if (s.charAt(i) != ' ' || length > 0) {
                length++;
            }
        }
        return length;
    }
}
