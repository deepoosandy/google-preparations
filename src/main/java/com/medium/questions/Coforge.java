package com.medium.questions;

import java.util.Arrays;
import java.util.stream.Collectors;

//Input: "Hello this is the ADMIN user"
//Output: "user NIMDA eht si siht Hello"
//Output: user NIMDA eht si siht Hello
public class Coforge {
    public static void main(String[] args) {
        System.out.println(reverseMiddleAndSwepOrders("Hello this is the ADMIN user"));
    }

    public static String reverseMiddleAndSwepOrders(String input){

        String[] inputArr=input.split("\\s+");
        int i=0;
        int j=inputArr.length-1;
        while(i< j){
            String temp=inputArr[j];
            inputArr[j]=inputArr[i];
            inputArr[i]=temp;
            i++;
            j--;

        }
        for(int k=1;k<inputArr.length-1;k++){
            String currentString=inputArr[k];
            inputArr[k]=reverseString(currentString, new StringBuilder());

        }

       return Arrays.stream(inputArr).collect(Collectors.joining(" "));

    }
    public static String reverseString(String input, StringBuilder builder){
        if(input.length() > 0){
            String subString=input.substring(input.length()-1, input.length());
            builder.append(subString);
            reverseString( input.substring(0,input.length()-1), builder);
        }
      return builder.toString();
    }

}
/*
* select e1.salary from employee e1 where 1= (select count(e2.salary) where e2.salary > e1.salary)
*
*
*
* */



