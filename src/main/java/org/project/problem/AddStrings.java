package org.project.problem;

public class AddStrings {

    public static void main(String[] args) {
        System.out.println(new AddStrings().addStrings("119", "913"));
    }

    public String addStrings(String num1, String num2) {
        int carry = 0;

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        String ans = "";

        while (i >= 0 || j >= 0) {
            int digit1 = getIndexOrDefaultZero(num1, i);
            int digit2 = getIndexOrDefaultZero(num2, j);
            int sum = digit1 + digit2 + carry;
            ans =  (sum % 10) + ans;
            carry = sum / 10;
            i--;
            j--;
        }
        if (carry > 0) {
            return carry + ans;
        }

        return ans;
    }

    private static int getIndexOrDefaultZero(String ch, int index) {
        return index >= 0  ? Character.getNumericValue(ch.charAt(index)) : 0;
    }
}

