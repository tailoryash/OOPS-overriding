package com.yash.overriding.payment;

public class Upi extends PaymentType {
    @Override
    public void paymentMethod() {
        System.out.println("UPI payment accepted!");
    }

}
