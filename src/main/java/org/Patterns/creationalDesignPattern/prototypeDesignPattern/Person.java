package org.Patterns.creationalDesignPattern.prototypeDesignPattern;

public class Person implements Cloneable {
    public String name;
    public Address address;
    public Person(String name,Address address){
        this.name=name;
        this.address=address;
    }
    //shallow copy
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public void showInfo() {
        System.out.println("Name: " + name + ", City: " + address.city);
    }
}
