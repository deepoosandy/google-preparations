package com.easy.questions;

/***
 Sorted Squared Array *
 Write a function that takes in a non-empty array of integers that are sorted in ascending order and returns a new array of the same length with the squares of the original integers also sorted in ascending order.
 Sample Input
 = [1, 2, 3, 5, 6, 8, 9]
 Sample Output
 [1, 4, 9, 25, 36, 64, 81]
 *
 */

//time complexity O(n)
// space complexity O(n)
public class Question3 {
    public int[] sortedSquaredArray(int[] array) {

        int[] result = new int[array.length];
        int start = 0;
        int end = array.length - 1;
        int idx = end;
        while (idx >= 0) {
            if (Math.abs(array[start]) > Math.abs(array[end])) {
                result[idx] = array[start] * array[start];
                start++;
            } else {
                result[idx] = array[end] * array[end];
                end--;
            }
            idx--;
        }


        return result;
    }
}
