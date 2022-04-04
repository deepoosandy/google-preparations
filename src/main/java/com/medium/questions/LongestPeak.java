package com.medium.questions;

public class LongestPeak {
    public static void main(String[] args) {
        System.out.println(longestPeak(new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3}));
    }

    public static int longestPeak(int[] array) {
        int peekLength = 0;
        int i = 1;
        while (i < array.length - 1) {
            boolean isPeek = (array[i - 1] < array[i]) && (array[i] > array[i + 1]);
            if (!isPeek) {
                i++;
                continue;
            }

            int j = i - 2;
            while (j >= 0 && array[j] < array[j + 1]) {

                j--;
            }
            int k = i + 2;
            while (k < array.length && array[k] < array[k - 1]) {
                k++;
            }
            int currentPeekLenght = k - j - 1;
            if (currentPeekLenght > peekLength) {
                peekLength = currentPeekLenght;
            }
            i = k;

        }
        return peekLength;
    }
}
