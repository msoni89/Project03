package org.project.problem;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(7));
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1) {
            if (!set.add(n)) {
                return false; // Detected a cycle, not a happy number
            }

            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return true; // Found a happy number (n == 1)
    }
}
