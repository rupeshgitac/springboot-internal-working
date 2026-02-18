package com.coding.youtube.internalWorkingOfSpringBootApp;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue = "razorpay")
public class RazorPaymentService implements PaymentService {

    @Override
    public String pay(){
        String payment  = "Razorpay Payment";
        System.out.println("Payment from: "+payment);

        return payment;
    }
}
