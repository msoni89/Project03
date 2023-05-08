package org.project.problem;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToIntV2("III"));
    }

    public int integerValue(Character c){
        int num = 0;
        switch(c) {
            case 'I': num = 1; break;
            case 'V': num = 5; break;
            case 'X': num = 10; break;
            case 'L': num = 50; break;
            case 'C': num = 100; break;
            case 'D': num = 500; break;
            case 'M': num = 1000; break;
        }
        return num;
    }

    public int romanToInt(String s) {
        int currentIndex = 0;
        int ans = 0;
        if (s.length() == 1) return integerValue(s.charAt(0));
        while (currentIndex < s.length() - 1) {
            if (integerValue(s.charAt(currentIndex)) > integerValue(s.charAt(currentIndex + 1))) {
                ans +=integerValue(s.charAt(currentIndex));
                currentIndex++;
            } else if (integerValue(s.charAt(currentIndex)) <integerValue(s.charAt(currentIndex + 1))) {
                ans += (integerValue(s.charAt(currentIndex + 1)) -integerValue(s.charAt(currentIndex)));
                currentIndex += 2;
            } else {
                ans += integerValue(s.charAt(currentIndex)) * 2;
                currentIndex += 2;
            }
        }
        if (currentIndex < s.length()) {
            ans += integerValue(s.charAt(s.length() - 1));
        }
        return ans;
    }

    public int romanToIntV2(String s) {
        int ans = 0;
        int num = 0;
        int prev  = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (num < prev) {
                ans -= num;
            }
            else {
                ans += num;
            }
                prev = num;
        }
        return ans;
    }
}
