package com.medium.questions;

class AB {
    public static void main(String[] args) {
        System.out.println(checkString("abab"));
    }
    public static boolean checkString(String s) {
        
        if(s.contains("b")&& !s.contains("a")) return true;
        if(s.contains("a")&& !s.contains("b")) return true;
        
       int bStartIdx=  s.indexOf("b");
       String subString= s.substring(bStartIdx);
        
        if(subString.contains("a")) return false;
        else return true;
        
        
    }
}