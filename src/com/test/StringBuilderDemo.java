package com.test;

public class StringBuilderDemo {
    public static void main(String[] args) {
        testString();
        testStringBuilder();
    }

    public static void testStringBuilder() {
        long start = System.currentTimeMillis();

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            s.append(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("消耗时间：" + (end - start) + "ms");
    }

    public static void testString() {
        long start = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i < 50000; i++) {
            s = s + i;
        }

        long end = System.currentTimeMillis();
        System.out.println("消耗时间：" + (end - start) + "ms");
    }
}
