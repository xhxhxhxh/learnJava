package com.test;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.brand = "小米";
        phone.price = 1000;

        System.out.println(phone.brand);
        System.out.println(phone.price);

        phone.call();
        phone.sendMessage();
    }
}
