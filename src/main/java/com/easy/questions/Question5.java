package com.easy.questions;

import java.util.Arrays;

/**
 * Non-Constructible Change
 * Given an array of positive integers representing the values of coins in your
 * possession, write a function that returns the minimum amount of change
 * (the minimum sum of money) that you cannot create. The given coins can
 * have any positive integer value and aren't necessarily unique (i.e., you can
 * have multiple coins of the same value).
 * For example, if you're given coins = [1, 2, 5] , the minimum
 * amount of change that you can't create is 4 . If you're given no coins, the
 * minimum amount of change that you can't create is 1 .
 * Sample Input
 * coins = [5, 7, 1, 1, 2, 3, 22]
 * Sample Output
 * 20
 */

//time complexity O(n)
// space complexity O(1)
public class Question5 {


    public int nonConstructibleChange(int[] coins) {
        int changed = 0;
        int current = 0;
        Arrays.sort(coins);
        for (int coin : coins) {
            if (coin > changed + 1) {
                return changed + 1;
            }
            changed = changed + coin;
        }

        return changed+1;
    }
}
