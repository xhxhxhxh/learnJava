package com.test;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = "c";
        String s4 = s2 + s3;
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
    }
}
