package com.easy.questions;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Question2Test {

    private final Question2 question2 = new Question2();

    private List<Integer> arrayToArrayList(Integer[] a) {

        return Arrays.asList(a);
    }

    @Test
    public void test() {

        Assert.assertTrue(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{1, 6, -1, 10})));
        Assert.assertTrue(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10})));

        Assert.assertTrue(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{5, 1, 22, 6, -1, 8, 10})));

        Assert.assertTrue(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{22, 25, 6})));

        Assert.assertTrue(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{1, 6, 10})));

        Assert.assertTrue(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{5, 1, 22, 10})));

        Assert.assertTrue(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{5, -1, 8, 10})));

        Assert.assertTrue(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{25})));

        Assert.assertTrue(question2.isValidSubsequence(arrayToArrayList(new Integer[]{1, 1, 1, 1, 1}),
                arrayToArrayList(new Integer[]{1, 1, 1})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10, 12})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{4, 5, 1, 22, 25, 6, -1, 8, 10})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{5, 1, 22, 23, 6, -1, 8, 10})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{5, 1, 22, 22, 25, 6, -1, 8, 10})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{5, 1, 22, 22, 6, -1, 8, 10})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{1, 6, -1, -1})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{1, 6, -1, -1, 10})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{1, 6, -1, -2})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{26})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{5, 1, 25, 22, 6, -1, 8, 10})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{5, 26, 22, 8})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{1, 1, 6, 1}),
                arrayToArrayList(new Integer[]{1, 1, 1, 6})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{1, 6, -1, 10, 11, 11, 11, 11})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10, 10})));

        Assert.assertFalse(question2.isValidSubsequence(arrayToArrayList(new Integer[]{5, 1, 22, 25, 6, -1, 8, 10}),
                arrayToArrayList(new Integer[]{1, 6, -1, 5})));


    }
}