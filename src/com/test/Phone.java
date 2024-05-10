package com.test;

public class Phone {
    String brand;
    int price;

    public void call() {
        System.out.println("调用call");
        sendMessage();
    }

    public void sendMessage() {
        System.out.println("调用sendMessage");
    }
}
