package org.project.problem;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(new ValidAnagram().isAnagram("ab", "ba"));
    }

    public boolean isAnagram(String s, String t) {
        int[] indexes = new int[26];
        for (int i = 0; i < s.length(); i++) {
            indexes[s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < t.length(); i++) {
            indexes[t.charAt(i) - 'a'] -= 1;
        }
        System.out.println(Arrays.toString(indexes));
        for (int index : indexes) {
            if (index != 0) {
                return false;
            }
        }
        return true;
    }

}
