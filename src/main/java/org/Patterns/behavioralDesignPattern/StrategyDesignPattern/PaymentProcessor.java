package org.Patterns.behavioralDesignPattern.StrategyDesignPattern;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    public PaymentProcessor( PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    public void processPayment() {
        paymentStrategy
                .ProcessPayment();
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
