package org.project.problem;

public class UglyNumber {


//    An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
//    Given an integer n, return true if n is an ugly number.

    public static void main(String[] args) {
        System.out.println(new UglyNumber().isUgly(14));

    }

    public boolean isUgly(int n) {

        for (int i = 2; i < n; i++)
            while (n % i == 0)
                n /= i;
        return n == 1;
    }
}
