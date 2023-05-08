package org.project.problem;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("]"));
    }


    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    characters.push(s.charAt(i));
                    break;
                case ')':
                    if (characters.isEmpty() || characters.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (characters.isEmpty() || characters.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (characters.isEmpty() || characters.pop() != '[') {
                        return false;
                    }

                    break;
            }
        }
        return characters.size() == 0;
    }
}
