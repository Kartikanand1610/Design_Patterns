package org.Patterns.structuralDesignPattern.adapterDesignPattern;

public class AirConditionerAdapter implements SmartDevice{
    private AirConditioner airconditioner;
    public AirConditionerAdapter(AirConditioner airconditioner){
        this.airconditioner=airconditioner;
    }
    @Override
    public void turnOn() {
         airconditioner.connectedViaBluetooth();
         airconditioner.startCooling();
    }

    @Override
    public void turnOff() {
        airconditioner.disconnectedViaBluetooth();
        airconditioner.stopCooling();
    }

}
