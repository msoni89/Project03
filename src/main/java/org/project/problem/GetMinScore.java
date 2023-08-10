package org.project.problem;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GetMinScore {

    public static void main(String[] args) {
        System.out.println(new GetMinScore().getMaximumScore("(())"));
    }

    public long getMaximumScore(String s) {

        // Write your code here
        int n = s.length();
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' ) {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            if (s.charAt(i) == ')' && queue.isEmpty() ) {
                queue.offer(i);
            } else {
                if (!queue.isEmpty() && s.charAt(i) != '(') {
                    queue.remove();
                }
            }
        }
        System.out.println(queue);
        System.out.println(stack);

        return queue.peek() - stack.peek();
    }


}
