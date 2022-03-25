package com.easy.questions;

import java.util.*;

/***

 Two Number Sum *
 Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. If any two numbers in the input array sum up to the target sum, the function should return them in an array. in any order. If no two numbers sum up to the target sum, the function should return an empty array.
 Note that the target sum has to be obtained by summing two different integers in the array; you can't add a single integer to itself in order to obtain the target
 SUM.
 You can assume that there will be at most one pair of numbers summing up to the target sum.
 Sample Input 1
 array = [3, 5, -4, 8, 11, 1, -1, 6]
 targetSum = 10

 Sample Input 2
 array = [4, 6]
 targetSum = 10

 Sample Input
 array = [1, 4]
 targetSum = 5

 Sample Input
 array = [3, 5, -4, 8, 11, 1, -1, 6]
 targetSum = 10

 Sample Input
 array = [3, 5, -4, 8, 11, 1, -1, 6]
 targetSum = 10


 //Solution time complexity is O(n)
 // And space complexity is O(n)
 * */
public class Question1 {
    public static void main(String[] args) {
        System.out.println("hi");
    }
    public int[] findSum(int arr[], int targetSum) {

        Map<Integer, Boolean> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {

            int number = targetSum - arr[i];
            result[0] = arr[i];
            if (!map.containsKey(number)) {
                map.put(arr[i], false);
            } else {
                result[1] = number;
                return result;
            }

        }
        return new int[]{};

    }
}
