package com.medium.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstDuplicateValue {
    public static void main(String[] args) {

    }
    public static int firstDuplicateValue(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
         for(int i: arr){
             map.put(i,7);
         }



        return -1;
    }
}
class Parent{
    int x;
    public static void show(){
        System.out.println("Sandeep");
    }
}
class Child extends Parent{
    int x;
    public static void show(){
        System.out.println("Kumar");
    }
}
class Child2 extends Child{
    int x;
}