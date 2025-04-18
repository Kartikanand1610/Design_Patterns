package org.Patterns.behavioralDesignPattern.StrategyDesignPattern;

public class DebitCard implements PaymentStrategy{

    @Override
    public void ProcessPayment() {
        System.out.println("Debit card is working...");
    }
}
