package com.easy.questions;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Question1Test {

    private final Question1 question1 = new Question1();

    public boolean areArraysEqual(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    @Test
    public void test() {

        Assert.assertTrue(areArraysEqual(new int[]{11, -1}, question1.findSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10)));
        Assert.assertTrue(areArraysEqual(new int[]{4, 6}, question1.findSum(new int[]{4, 6}, 10)));
        Assert.assertTrue(areArraysEqual(new int[]{1, 4}, question1.findSum(new int[]{4, 6, 1}, 5)));
        Assert.assertTrue(areArraysEqual(new int[]{6, -3}, question1.findSum(new int[]{4, 6, 1, -3}, 3)));
        Assert.assertTrue(areArraysEqual(new int[]{8, 9}, question1.findSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 17)));
        Assert.assertTrue(areArraysEqual(new int[]{15, 3}, question1.findSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 15}, 18)));
        Assert.assertTrue(areArraysEqual(new int[]{-5, 0}, question1.findSum(new int[]{-7, -5, -3, -1, 0, 1, 3, 5, 7}, -5)));
        Assert.assertTrue(areArraysEqual(new int[]{210, -47}, question1.findSum(new int[]{-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 163)));
        Assert.assertTrue(areArraysEqual(new int[]{}, question1.findSum(new int[]{-21, 301, 12, 4, 65, 56, 210, 356, 9, -47}, 164)));
        Assert.assertTrue(areArraysEqual(new int[]{}, question1.findSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 15)));
        Assert.assertTrue(areArraysEqual(new int[]{}, question1.findSum(new int[]{14}, 15)));
        Assert.assertTrue(areArraysEqual(new int[]{}, question1.findSum(new int[]{15}, 15)));


    }

}