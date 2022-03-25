package com.medium.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeNumbersSum {
    public static void main(String[] args) {
        threeNumberSum(new int[]{12, 3, 1, 2, -6, 5, -8, 6}, 0).stream()
                .flatMap(x -> Arrays.stream(x)).forEach(System.out::println);
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<>();
        int currentSum = 0;
        for (int i = 0; i < array.length; i++) {
            int cn = array[i];
            int j = i + 1;
            int k = array.length - 1;
            while (j < k) {
                currentSum = cn + array[j] + array[k];
                if (currentSum == targetSum) {
                    Integer[] triplet = new Integer[3];
                    triplet[0] = cn;
                    triplet[1] = array[j];
                    triplet[2] = array[k];
                    j++;
                    k--;
                    result.add(triplet);
                }
                if (currentSum < targetSum) j++;
                if (currentSum > targetSum) k--;
            }
        }


        return result;
    }
}
