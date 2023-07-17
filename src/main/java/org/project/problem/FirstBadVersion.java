package org.project.problem;

public class FirstBadVersion {

    public static void main(String[] args) {
        System.out.println(new FirstBadVersion().firstBadVersion(5));


    }

    public int firstBadVersion(int n) {
        int r = 0;
        int l = n;
        while (r <= l) {
            int m = r + (l - r) / 2;
            if (isBadVersion(m)) {
                l = m - 1;

            } else {
                r = m + 1;
            }
        }
        return r + (l - r) / 2;
    }

    private boolean isBadVersion(int m) {
        return true;
    }
}
