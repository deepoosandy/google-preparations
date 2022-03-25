package com.easy.questions;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Question3Test {

    private final Question3 question3 = new Question3();

    @Test
    public void test() {
        assertArrayEquals(new int[]{1, 4, 9, 25, 36, 64, 81}, question3.sortedSquaredArray(new int[]{1, 2, 3, 5, 6, 8, 9}));

        assertArrayEquals(new int[]{1}, question3.sortedSquaredArray(new int[]{1}));

        assertArrayEquals(new int[]{1, 4}, question3.sortedSquaredArray(new int[]{1,2}));

        assertArrayEquals(new int[]{1, 4, 4, 25}, question3.sortedSquaredArray(new int[]{-5, -2, -2, -1}));

        assertArrayEquals(new int[]{1, 4, 9, 16, 25}, question3.sortedSquaredArray(new int[]{1, 2, 3, 4, 5}));

        assertArrayEquals(new int[]{0}, question3.sortedSquaredArray(new int[]{0}));

        assertArrayEquals(new int[]{100}, question3.sortedSquaredArray(new int[]{10}));

        assertArrayEquals(new int[]{1}, question3.sortedSquaredArray(new int[]{-1}));

        assertArrayEquals(new int[]{1, 4}, question3.sortedSquaredArray(new int[]{-2, -1}));

        assertArrayEquals(new int[]{1, 4, 9, 16, 25}, question3.sortedSquaredArray(new int[]{-5, -4, -3, -2, -1}));

        assertArrayEquals(new int[]{100}, question3.sortedSquaredArray(new int[]{-10}));

        assertArrayEquals(new int[]{0, 25, 25, 100, 100}, question3.sortedSquaredArray(new int[]{-10, -5, 0, 5, 10}));

        assertArrayEquals(new int[]{1, 9, 49, 81, 484, 900}, question3.sortedSquaredArray(new int[]{-7, -3, 1, 9, 22, 30}));

        assertArrayEquals(new int[]{0, 0, 1, 1, 1, 4, 4, 9, 169, 361, 400, 2500},
                question3.sortedSquaredArray(new int[]{-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20}));

        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, question3.sortedSquaredArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

        assertArrayEquals(new int[]{1, 1, 4, 9, 9, 9, 16}, question3.sortedSquaredArray(new int[]{-1, -1, 2, 3, 3, 3, 4}));

        assertArrayEquals(new int[]{1, 4, 9}, question3.sortedSquaredArray(new int[]{-3, -2, -1}));

        assertArrayEquals(new int[]{1, 4, 9}, question3.sortedSquaredArray(new int[]{-3, -2, -1}));
    }

}