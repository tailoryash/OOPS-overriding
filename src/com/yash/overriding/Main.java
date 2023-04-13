package com.yash.overriding;

import com.yash.overriding.payment.NetBanking;
import com.yash.overriding.payment.PaymentType;
import com.yash.overriding.payment.Upi;

public class Main {
    public static void main(String[] args) {
        PaymentType types = new PaymentType();
        types.paymentMethod();

        PaymentType upi = new Upi();
        upi.paymentMethod();

        PaymentType netBanking = new NetBanking();
        netBanking.paymentMethod();
    }
}
