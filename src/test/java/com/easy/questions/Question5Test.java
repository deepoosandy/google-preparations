package com.easy.questions;

import com.easy.questions.model.test4.com.Test4.Example;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import utils.CustomFileReader;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Question5Test {

    private final Question5 question5 = new Question5();

    @Test
    public void test1() throws IOException {

        assertEquals(20, question5.nonConstructibleChange(new int[]{5, 7, 1, 1, 2, 3, 22}));
    }

    @Test
    public void test2() throws IOException {

        assertEquals(6, question5.nonConstructibleChange(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void test3() throws IOException {
        assertEquals(55, question5.nonConstructibleChange(new int[]{1, 5, 1, 1, 1, 10, 15, 20, 100}));
    }

    @Test
    public void test4() throws IOException {
        assertEquals(3, question5.nonConstructibleChange(new int[]{6, 4, 5, 1, 1, 8, 9}));
    }

    @Test
    public void test5() throws IOException {
        assertEquals(1, question5.nonConstructibleChange(new int[]{}));
    }

    @Test
    public void test6() throws IOException {
        assertEquals(1, question5.nonConstructibleChange(new int[]{87}));
    }

    @Test
    public void test7() throws IOException {
        assertEquals(32, question5.nonConstructibleChange(new int[]{5, 6, 1, 1, 2, 3, 4, 9}));
    }

    @Test
    public void test8() throws IOException {
        assertEquals(19, question5.nonConstructibleChange(new int[]{5, 6, 1, 1, 2, 3, 43}));
    }

    @Test
    public void test9() throws IOException {
        assertEquals(3, question5.nonConstructibleChange(new int[]{1, 1}));
    }

    @Test
    public void test10() throws IOException {
        assertEquals(1, question5.nonConstructibleChange(new int[]{2}));
    }

    @Test
    public void test11() throws IOException {
        assertEquals(2, question5.nonConstructibleChange(new int[]{1}));
    }

    @Test
    public void test12() throws IOException {
        assertEquals(87, question5.nonConstructibleChange(new int[]{109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4}));
    }

    @Test
    public void test13() throws IOException {
        assertEquals(29, question5.nonConstructibleChange(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }


}
