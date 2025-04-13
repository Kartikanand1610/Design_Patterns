package org.spring.creationalDesignPattern.factoryDesignPattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType){
        if(vehicleType.equals("Car")){
            return new Car();
        }
        else if(vehicleType.equals("Bike")){
            return new Bike();
        }
        else{
            throw new IllegalArgumentException("unknown vehicle type");
        }
    }
}
