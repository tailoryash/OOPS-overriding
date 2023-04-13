package com.yash.overriding.payment;

import com.yash.overriding.payment.PaymentType;

public class NetBanking extends PaymentType {
    @Override
    public void paymentMethod() {
        System.out.println("Net-Banking accepted here!");
    }
}
