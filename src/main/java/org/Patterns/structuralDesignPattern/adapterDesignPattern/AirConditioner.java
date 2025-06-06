package org.Patterns.structuralDesignPattern.adapterDesignPattern;

public class AirConditioner {
    public void connectedViaBluetooth(){
        System.out.println("Ac connects by bluetooth");
    }
    public void disconnectedViaBluetooth(){
        System.out.println("Bluetooth is disconnected");
    }
    public void startCooling(){
        System.out.println("Air conditioner is cooling");
    }
    public void stopCooling(){
        System.out.println("Air conditioner stop cooling");
    }
}
