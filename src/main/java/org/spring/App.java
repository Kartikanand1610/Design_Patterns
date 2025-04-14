package org.spring;

import org.spring.creationalDesignPattern.abstarctFactoryDesignPattern.BMWAbstractFactory;
import org.spring.creationalDesignPattern.abstarctFactoryDesignPattern.HondaAbstractFactory;
import org.spring.creationalDesignPattern.abstarctFactoryDesignPattern.VehicleAbstract;
import org.spring.creationalDesignPattern.abstarctFactoryDesignPattern.VehicleAbstractFactory;
import org.spring.creationalDesignPattern.factoryDesignPattern.Vehicle;
import org.spring.creationalDesignPattern.factoryDesignPattern.VehicleFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {  //Factory Creational pattern
        Vehicle vehicle1= VehicleFactory.getVehicle("Car");
        vehicle1.move();
        vehicle1.stop();
        Vehicle vehicle2=VehicleFactory.getVehicle("Bike");
        vehicle2.move();
        vehicle2.stop();
        System.out.println("    ");
        //Abstract Factory pattern
        VehicleAbstractFactory hondaFactory =new HondaAbstractFactory();
        VehicleAbstract honda= hondaFactory.createVehicle();
        VehicleAbstractFactory bmwFactory=new BMWAbstractFactory();
        VehicleAbstract bmw=bmwFactory.createVehicle();

        honda.start();
        honda.stop();
        bmw.start();
        bmw.stop();
        System.out.println("    ");
        //Builder Design pattern




    }
}
