package org.project.problem;

public class StringToInteger {

    public static void main(String[] args) {
        System.out.println(new StringToInteger().myAtoi("91283472332"));
    }


    public int myAtoi(String s) {
        Integer result = 0;
        boolean isNegative = false;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                continue;
            }

            if (result == 0 && s.charAt(i) == '-') {
                isNegative = true;
                continue;
            }

            if (result == 0 && (s.charAt(i) >= 'a' || s.charAt(i) >= 'z')) {
                break;
            }

            if (result < result * 10 + Character.getNumericValue(s.charAt(i))) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    if(s.charAt(i) == '.'){
                        break;
                    }
                    result = result * 10 + Character.getNumericValue(s.charAt(i));
                }
            } else {
                return isNegative ? Integer.MIN_VALUE  - 1 : Integer.MAX_VALUE - 1;
            }
        }

        return isNegative ? result * -1 : result;
    }
}
