package com.medium.questions;

import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
    public static void main(String[] args) {
        System.out.println(moveElementToEnd(Arrays.asList(new Integer[]{2, 1, 2, 2, 2, 3, 4, 2}), 2));
        System.out.println(moveElementToEnd2(Arrays.asList(new Integer[]{2, 1, 2, 2, 2, 3, 4, 2}), 2));
    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        Integer[] arr = new Integer[array.size()];
        Arrays.fill(arr, toMove);
        int j = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != toMove) {
                arr[j] = array.get(i);
                j++;
            }
        }
        return Arrays.asList(arr);
    }

    public static List<Integer> moveElementToEnd2(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size() - 1;
        while (i < j) {
            if (array.get(j) == toMove) {
                j--;
            }
            if (array.get(i) == toMove && array.get(j) != toMove) {
                int temp = array.get(j);
                array.set(j, new Integer(array.get(i)));
                array.set(i, new Integer(temp));
                j--;

            }
            if (array.get(i) != toMove) {
                i++;
            }
        }

        return array;
    }
}
