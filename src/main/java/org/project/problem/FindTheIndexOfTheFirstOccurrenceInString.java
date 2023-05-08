package org.project.problem;

public class FindTheIndexOfTheFirstOccurrenceInString {

    public static void main(String[] args) {
        System.out.println(new FindTheIndexOfTheFirstOccurrenceInString().strStr("mississippi", "issip"));
    }


    public int strStr(String haystack, String needle) {
        int currentIndex = 0;
        int searchIndex = 0;
        if (haystack.length() < needle.length()) return -1;
        while (currentIndex < haystack.length() && searchIndex < needle.length()) {
            if (haystack.charAt(currentIndex) == needle.charAt(searchIndex)) {
                searchIndex++;
            } else {
                currentIndex = (currentIndex - searchIndex);
                searchIndex = 0;
            }
            currentIndex++;
        }
        if (searchIndex < needle.length()) {
            return -1;
        }
        return currentIndex - searchIndex;
    }
}
