package com.medium.questions;

public class IsMonotonicArray {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11} ));
    }

    public static boolean isMonotonic(int[] array) {
        if(array.length==0)  return true;
        boolean isMonotonic=false;
        if(array.length==1) return true;
        else{
            if(array[0] > array[1]){
                for(int i=0;i< array.length-1;i++){
                    if(array[i] >= array[i+1]){
                        isMonotonic= true;
                    }else{
                        return false;
                    }
                }
            }
            if(array[0] < array[1]){
                for(int i=0;i< array.length-1;i++){
                    if(array[i] <= array[i+1]){
                        isMonotonic= true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return isMonotonic;
    }

}
