package org.project.problem;

public class AddDigits {

    public static void main(String[] args) {
        System.out.println(new AddDigits().addDigits(138));
    }

    public int addDigits(int num) {
        while (num> 9) {
            int x  =  (num % 10);
            num = (num / 10) + x;
        }
        return num;
    }

}
