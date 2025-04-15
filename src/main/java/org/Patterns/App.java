package org.Patterns;

import org.Patterns.creationalDesignPattern.abstarctFactoryDesignPattern.BMWAbstractFactory;
import org.Patterns.creationalDesignPattern.abstarctFactoryDesignPattern.HondaAbstractFactory;
import org.Patterns.creationalDesignPattern.abstarctFactoryDesignPattern.VehicleAbstract;
import org.Patterns.creationalDesignPattern.abstarctFactoryDesignPattern.VehicleAbstractFactory;
import org.Patterns.creationalDesignPattern.builderDesignPattern.Car2;
import org.Patterns.creationalDesignPattern.factoryDesignPattern.Vehicle;
import org.Patterns.creationalDesignPattern.factoryDesignPattern.VehicleFactory;
import org.Patterns.creationalDesignPattern.singeltonDesignPattern.SingletonEager;
import org.Patterns.creationalDesignPattern.singeltonDesignPattern.SingletonLazy;
import org.Patterns.creationalDesignPattern.singeltonDesignPattern.SingletonThreadSafe;


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
        Car2.CarBuilder builder= new Car2.CarBuilder();
        Car2 car1=builder.setEngine("VB").setColor("Black").setSeats(4).build();
        System.out.println(car1);
        Car2 car2=builder.setEngine("roylce").setColor("Blue").setSeats(3).build();
        System.out.println(car2);

        System.out.println("    ");
        //Singleton design pattern
        //singleton eager initialization
        SingletonEager singelton= SingletonEager.getInstance();
        singelton.showMessage();
        System.out.println("   ");
        //singleton lazy initialization
        SingletonLazy singletonLazy= SingletonLazy.getInstance();
        singletonLazy.showMessageLazy();
        System.out.println("     ");
        //singelton thread safe doublechecked method
        SingletonThreadSafe single=SingletonThreadSafe.getInstance();
        single.showMessage();



    }
}
