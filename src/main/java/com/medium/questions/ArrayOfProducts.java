package com.medium.questions;

import java.util.Arrays;

public class ArrayOfProducts {
    public static void main(String[] args) {
        arrayOfProducts(new int[]{5, 1, 4, 2});
    }

    public static int[] arrayOfProducts(int[] arr) {
        int[] leftProductArr = new int[arr.length];
        int[] rightProductArr = new int[arr.length];
        int[] result = new int[arr.length];
        Arrays.fill(leftProductArr, 1);
        Arrays.fill(rightProductArr, 1);
        int j = arr.length - 1;

        int leftProduct = 1;
        int rightProduct = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0)
                leftProduct = arr[i - 1] * leftProduct;
            leftProductArr[i] = leftProduct;

            if (j < arr.length - 1)
                rightProduct = arr[j+1] * rightProduct;
            rightProductArr[j] = rightProduct;
            j--;
        }
        for (int i = 0; i < arr.length; i++) {
            result[i] = leftProductArr[i] * rightProductArr[i];
        }
        return result;
    }
}
