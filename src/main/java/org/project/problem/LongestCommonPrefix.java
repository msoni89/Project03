package org.project.problem;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flow", "flight","flower" }));
    }

    public String longestCommonPrefix(String[] strings) {
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        String first = strings[0];
        String last = strings[strings.length - 1];
        int i = 0;
        while (i < first.length()) {
            if (first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return i == 0 ? "" : first.substring(0, i);
    }
}
