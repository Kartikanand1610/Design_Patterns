package org.spring.creationalDesignPattern.abstarctFactoryDesignPattern;

public class BMW implements VehicleAbstract{

  public void start(){
      System.out.println("Bmw is starting");
  }
  public void stop(){
      System.out.println("Bmw is stopping");
  }

}
