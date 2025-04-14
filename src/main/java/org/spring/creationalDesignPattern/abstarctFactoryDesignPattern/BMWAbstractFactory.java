package org.spring.creationalDesignPattern.abstarctFactoryDesignPattern;

public class BMWAbstractFactory implements VehicleAbstractFactory{
    public VehicleAbstract createVehicle(){
        return new BMW();
    }
}
