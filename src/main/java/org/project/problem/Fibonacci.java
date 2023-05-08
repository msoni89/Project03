package org.project.problem;

import java.util.Arrays;

public class Fibonacci {


    public static void main(String[] args) {
        System.out.println(new Fibonacci().fib(10));
        System.out.println(new Fibonacci().fib(5));
        System.out.println(new Fibonacci().fib(3));
        System.out.println(new Fibonacci().fib(0));
        System.out.println(new Fibonacci().fib(50));
    }

    long[] memo = new long[]{0, 1};

    public long fib(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        for (int i = 1; i < x; i++) {
            long temp = memo[0] + memo[1];
            memo[0] = memo[1];
            memo[1] = temp;
        }
        return memo[1];

//        if (hashMap.containsKey(x)) {
//            return hashMap.get(x);
//        }
//        if (x == 0) return 0;
//        if (x <= 2) return 1;
//
//
//        var r = fib(x - 1) + fib(x - 2);
//        hashMap.put(x, r);
//        return r;
    }
}
