package org.project.problem;


import java.util.Arrays;

/***
 Given an array arr of 4 digits, find the latest 24-hour time that can be made using each digit exactly once.

 24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:59.

 Return the latest 24-hour time in "HH:MM" format. If no valid time can be made, return an empty string.

 Example 1:

 Input: arr = [1,2,3,4]
 Output: "23:41"
 Explanation: The valid 24-hour times are "12:34", "12:43", "13:24", "13:42", "14:23", "14:32", "21:34", "21:43", "23:14", and "23:41". Of these times, "23:41" is the latest.
 Example 2:

 Input: arr = [5,5,5,5]
 Output: ""
 Explanation: There are no valid 24-hour times as "55:55" is not valid.


 Constraints:

 arr.length == 4
 0 <= arr[i] <= 9
 ***/
public class TheLatest24HourTime {

    public static void main(String[] args) {
        System.out.println(new TheLatest24HourTime().largestTimeFromDigits(new int[]{1, 2, 3, 4}));
    }

    public String largestTimeFromDigits(int[] arr) {
        String largestStringCanReformed = "23:59";

        String stringBuilder = "";
        for (int i = 0; i < largestStringCanReformed.length(); i++) {
            if (largestStringCanReformed.charAt(i) == ':')
                continue;
            System.out.println(arr[binary_Search(arr, 0, arr.length - 1, Character.getNumericValue(largestStringCanReformed.charAt(i)))]);
        }

        return stringBuilder;

    }

    public static int binary_Search(int[] intArray, int low, int high, int key) {
        //if array is in order then perform binary search on the array
        if (high >= low) {
            //calculate mid
            int mid = low + (high - low) / 2;
            //if key =intArray[mid] return mid
            if (intArray[mid] == key) {
                return mid;
            }
            //if intArray[mid] > key then key is in left half of array
            if (intArray[mid] > key) {
                return binary_Search(intArray, low, mid - 1, key);//recursively search for key
            } else       //key is in right half of the array
            {
                return binary_Search(intArray, mid + 1, high, key);//recursively search for key
            }
        }
        int max = 0;
        for (int i = 0; i < intArray.length; i++) {
            max = Math.max(Math.abs(intArray[i] - key), max);
            System.out.println(max);
        }
        return Arrays.binarySearch(intArray, max);
    }
}


