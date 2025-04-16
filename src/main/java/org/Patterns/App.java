package org.Patterns;

import org.Patterns.behavioralDesignPattern.ObserverDesignPattern.YoutubeChannelImpl;
import org.Patterns.behavioralDesignPattern.ObserverDesignPattern.YoutubeSubscriber;
import org.Patterns.creationalDesignPattern.abstarctFactoryDesignPattern.BMWAbstractFactory;
import org.Patterns.creationalDesignPattern.abstarctFactoryDesignPattern.HondaAbstractFactory;
import org.Patterns.creationalDesignPattern.abstarctFactoryDesignPattern.VehicleAbstract;
import org.Patterns.creationalDesignPattern.abstarctFactoryDesignPattern.VehicleAbstractFactory;
import org.Patterns.creationalDesignPattern.builderDesignPattern.Car2;
import org.Patterns.creationalDesignPattern.factoryDesignPattern.Vehicle;
import org.Patterns.creationalDesignPattern.factoryDesignPattern.VehicleFactory;
import org.Patterns.creationalDesignPattern.prototypeDesignPattern.Address;
import org.Patterns.creationalDesignPattern.prototypeDesignPattern.Person;
import org.Patterns.creationalDesignPattern.singeltonDesignPattern.SingletonEager;
import org.Patterns.creationalDesignPattern.singeltonDesignPattern.SingletonLazy;
import org.Patterns.creationalDesignPattern.singeltonDesignPattern.SingletonThreadSafe;


public class App 
{
    public static void main( String[] args ) throws CloneNotSupportedException {
        //Structural Design Pattern
        //Factory Creational pattern
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
        System.out.println("    ");


        //prototype design pattern
        //shallow copy
        Address address =new Address("New York");
        Person p1= new Person("Kartik",address);
        Person p2= (Person)p1.clone();
        p2.name="Kanishk";
        p2.address.city = "Los Angeles"; // changes original!
        p1.showInfo();
        p2.showInfo();

        //Behavioural design pattern
        //Observer Design Patterns
        //create a YouTube channel
        YoutubeChannelImpl channel=new YoutubeChannelImpl();
        //create subscriber
        YoutubeSubscriber alice=new YoutubeSubscriber("Alice");
        YoutubeSubscriber bob =new YoutubeSubscriber("Bob");
        //subscribe to the channel
        channel.addSubscriber(alice);
        channel.addSubscriber(bob);
        //upload a new video and notify subscribers
        channel.uploadNewVideo(" Java design patterns tutorial");

        channel.removeSubscriber(bob);
        channel.uploadNewVideo(" Observer Pattern in Action");





    }
}
