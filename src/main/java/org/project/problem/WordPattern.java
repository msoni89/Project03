package org.project.problem;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {


//    Given a pattern and a string s, find if s follows the same pattern.
//    Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
//

    public static void main(String[] args) {
        System.out.
                println(new WordPattern().wordPattern("abba", "dog dog dog dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map index = new HashMap();
        for (int i = 0; i < pattern.length(); i++) {
            if (index.put(pattern.charAt(i) , words[i]) != index.put(words[i], i )) {
                return false;
            }
        }
        return true;
    }

}
