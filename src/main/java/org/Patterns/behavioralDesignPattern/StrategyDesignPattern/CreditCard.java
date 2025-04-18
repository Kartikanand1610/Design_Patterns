package org.Patterns.behavioralDesignPattern.StrategyDesignPattern;

public class CreditCard implements PaymentStrategy{

    @Override
    public void ProcessPayment() {
        System.out.println("credit card is working...");
    }
}
