package org.project.problem;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
//        10101
        StringBuilder builder = new StringBuilder();

        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;


            if (i >= 0) {
                sum += Character.getNumericValue(a.charAt(i));
                i--;
            }
            if (j >= 0) {
                sum += Character.getNumericValue(b.charAt(j));
                j--;
            }

            builder.append(sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            return  builder.append(carry).reverse().toString();
        }
        return builder.reverse().toString();
    }
}

