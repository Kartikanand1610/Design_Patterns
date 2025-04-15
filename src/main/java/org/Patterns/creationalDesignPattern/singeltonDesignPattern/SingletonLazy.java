package org.Patterns.creationalDesignPattern.singeltonDesignPattern;

public class SingletonLazy {
    private static SingletonLazy single;
    private SingletonLazy(){

    }
    public static SingletonLazy getInstance(){
        if (single == null) {
            single = new SingletonLazy();
        }
        return single;
    }
    public void showMessageLazy(){
        System.out.println("Singelton lazy method is working ");
    }
}
