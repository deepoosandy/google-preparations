package com.medium.questions;

import java.util.Arrays;

public class SamellestSum {
    public static void main(String[] args) {
        int[]arrayOne= {-1, 5, 10, 20, 28, 3};
        int[]arrayTwo= {26, 134, 135, 15, 17};
        Arrays.stream(smallestDifference(arrayOne, arrayTwo)).forEach(System.out::println);
    }
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int j=0;
        int k=0;
        int diff=Integer.MAX_VALUE;
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int[] result= new int[2];
        while (j< arrayOne.length && k <arrayTwo.length){
            if(arrayOne[j] == arrayTwo[k]){
                result[0]=arrayOne[j];
                result[1]=arrayTwo[k];
                return  result;
            }else if(arrayOne[j] > arrayTwo[k]){

                if(diff > Math.abs(arrayOne[j]- arrayTwo[k]) ){
                    result[0]=arrayOne[j];
                    result[1]=arrayTwo[k];
                    diff=Math.abs(arrayOne[j]- arrayTwo[k]);
                }
                k++;
            }else if(arrayOne[j]< arrayTwo[k]){

                if(diff > Math.abs(arrayTwo[k]- arrayOne[j]) ){
                    result[0]=arrayOne[j];
                    result[1]=arrayTwo[k];
                    diff=Math.abs(arrayTwo[k]- arrayOne[j]);
                }
                j++;
            }
        }
        return result;
    }
}
