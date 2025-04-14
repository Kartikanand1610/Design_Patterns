package org.Patterns.creationalDesignPattern.abstarctFactoryDesignPattern;

public class HondaAbstractFactory implements VehicleAbstractFactory{
    public VehicleAbstract createVehicle(){
        return new Honda();
    }
}
