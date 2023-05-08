package org.project.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FizzBuzzProb412 {

    public static void main(String[] args) {
        System.out.println(new FizzBuzzProb412().fizzBuzz(15));
    }

    public List<String> fizzBuzz(int n) {


        List<String> strings = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if (i % 3 == 0) {
                s = "Fizz";
            }
            if (i % 5 == 0) {
                s = "Buzz";
            }
            if (i % 3 == 0 && i % 5 == 0) {
                s = "FizzBuzz";
            }
            strings.add(s);

        }
        return strings;
//        List<String> strings = new ArrayList<>();
//        for (int i = 1, fizz = 0, buzz = 0; i <= n; i++) {
//            String s = String.valueOf(i);
//            buzz++;
//            fizz++;
//            if (fizz == 3 && buzz == 5) {
//                s = "FizzBuzz";
//                fizz = buzz = 0;
//            } else if (buzz == 5) {
//                s = "Buzz";
//                buzz = 0;
//            } else if (fizz == 3) {
//                s = "Fizz";
//                fizz = 0;
//            }
//            strings.add(s);
//
//        }
//        return strings;
    }
}
