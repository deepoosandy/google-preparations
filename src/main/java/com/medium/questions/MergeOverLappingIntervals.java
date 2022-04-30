package com.medium.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeOverLappingIntervals {
    public static void main(String[] args) {
        mergeOverLapping(new int[][]
                {
                        {0, 0},
                        {0, 0},
                        {0, 0},
                        {0, 0},
                        {0, 0},
                        {0, 0},
                        {0, 0}
                }
        );
    }

    public static void mergeOverLapping(int[][] array) {
        Stack<int[]> mergedIntervals = new Stack<>();

        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
                if(first[0] > second[0]) return 1;
                else return -1;
            }
        });
        mergedIntervals.push(array[0]);
        for (int i = 1; i < array.length; i++) {
            int[] current = array[i];
            int[] stackTopArray = mergedIntervals.peek();
            if (current[0] <= stackTopArray[1]) {
                int[] stackTopEntry = mergedIntervals.pop();
                stackTopEntry[1] = Math.max(current[1],stackTopArray[1]);
                mergedIntervals.push(stackTopEntry);
            } else {
                mergedIntervals.push(current);
            }
        }
        int[][] mergedArraries = new int[mergedIntervals.size()][2];
        for (int i = 0; i < mergedIntervals.size(); i++) {
            mergedArraries[i] = mergedIntervals.get(i);
        }
        for (int[] arr : mergedArraries) {
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}
