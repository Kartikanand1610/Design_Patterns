package org.spring;

import org.spring.creationalDesignPattern.factoryDesignPattern.Vehicle;
import org.spring.creationalDesignPattern.factoryDesignPattern.VehicleFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vehicle vehicle1= VehicleFactory.getVehicle("Car");
        vehicle1.move();
        vehicle1.stop();
        Vehicle vehicle2=VehicleFactory.getVehicle("Bike");
        vehicle2.move();
        vehicle2.stop();



    }
}
