package com.medium.questions;

import java.util.Arrays;

public class CapgeminDistanceQuestion1 {
    public static void main(String[] args) {
        int[] arr = {-7,-1, 2, 3, -5, 0, 5, 6, -6,7};
        System.out.println(longestDistance(arr));
    }

    public static int longestDistance(int[] arr) {
        int[] result = new int[2];
        Arrays.fill(result, Integer.MIN_VALUE);
        int longestDistance = Integer.MIN_VALUE;
        for (int i : arr) {

            int currentDistance = Math.abs(i);

            if (currentDistance > longestDistance) {
                longestDistance = currentDistance;
                result[0] = i;
            } else if (currentDistance == longestDistance) {
                result[1] = i;
            }
        }
        if (result[0] != Integer.MIN_VALUE && result[1] != Integer.MIN_VALUE) {

            if (result[0] > result[1]) {
                return result[0];
            } else {
                return result[1];
            }
        } else {
            return result[0];
        }

    }
}
