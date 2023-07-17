package org.project.problem;

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(new PowerOfTwo().isPowerOfTwo(256 * 2 * 2 * 2 * 2));
    }

    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }
}
