package org.project.problem;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {
//    Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
//    You can use each character in text at most once. Return the maximum number of instances that can be formed.

    public static void main(String[] args) {
        System.out.println(new MaximumNumberOfBalloons().maxNumberOfBalloons("ballon"));
    }

    public int maxNumberOfBalloons(String text) {

        int[] frequency = new int[26];
        String str = "balloon";
        if(text.length() < str.length()){
            return 0;
        }
        for (int i = 0; i < text.length(); i++) {
            ++frequency[text.charAt(i) - '0'];
        }

        for (int i = 0; i < str.length(); i++) {
            --frequency[str.charAt(i) - '0'];
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i]);

        }
        return result;
    }
}

