package org.project.problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReverseVowelsOfAString {

    public static void main(String[] args) {

        System.out.println(new ReverseVowelsOfAString().reverseVowels("leetcode"));
    }

    public String reverseVowels(String s) {
        Map<Character, Character> vovelsMap = new HashMap<>();
        vovelsMap.put('a', 'u');
        vovelsMap.put('e', 'o');
        vovelsMap.put('u', 'a');
        vovelsMap.put('o', 'e');
        vovelsMap.put('i', 'i');
        vovelsMap.put('I', 'I');
        vovelsMap.put('A', 'U');
        vovelsMap.put('E', 'O');
        vovelsMap.put('U', 'A');
        vovelsMap.put('O', 'E');
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (vovelsMap.containsKey(chars[i])) {
                chars[i] = vovelsMap.get(chars[i]);
            }
        }
        return String.valueOf(chars);
    }
}
