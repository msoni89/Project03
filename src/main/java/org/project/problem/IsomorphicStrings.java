package org.project.problem;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(new IsomorphicStrings().isIsomorphic("paper", "title"));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> isomorphicMapping = new HashMap<>();

        return false;
    }

}

