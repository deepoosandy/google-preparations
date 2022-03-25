package com.medium.questions;

import java.util.ArrayList;
import java.util.List;

public class VanEckSequence {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        printVanEckSequence(arr, 36);
        arr.stream().forEach(x -> System.out.print(" " + x + ","));
    }

    public static void printVanEckSequence(List<Integer> arr, int n) {

        if (arr.size() > n) return;
        int lastNumber = arr.get(arr.size() - 1);
        int lastIndex = arr.size() - 1;
        int distance = 0;
        if (lastIndex > 0) {
            for (int i = 0; i < arr.size() - 1; i++) {
                if (lastNumber == arr.get(i)) {
                    distance = lastIndex - i;
                }
            }
            arr.add(distance);
        } else {
            arr.add(distance);
        }
        printVanEckSequence(arr, n);
    }
}
