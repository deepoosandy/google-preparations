package com.medium.questions;

import java.util.Arrays;
import java.util.Collections;

/*Rearrange following array elements. Keep all negative integers in beginning and positive numbers at the endexecuted
input {4,8,-7,3,-2,1,-5}
output {-7,-2,-5,4,8,3,1}




*/
public class OracleTest {
    public static void main(String[] args) {
        int[] arr = {4, 8, -7, 3, -2, 1, -5};
        MyImmetable myarr= new MyImmetable(arr);
        int arr2[]=myarr.getArr();


        System.out.println( myarr.getArr()[1]);

        System.out.println("=========");
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] < 0) {
                i++;
            } else if (arr[j] > 0) {
                j--;
            } else if (arr[i] > 0 && (arr[j] < 0)) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }

        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}

final class MyImmetable {
    private final int[] arr;

    MyImmetable(int arr[]) {
        this.arr = arr;
    }

    public int[] getArr() {
        int[] copy = new int[arr.length];
        int count = 0;
        for (int i : arr) {
            copy[count] = i;
            count++;
        }

        return copy;
    }


}