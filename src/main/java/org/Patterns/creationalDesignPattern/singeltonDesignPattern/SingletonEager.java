package org.Patterns.creationalDesignPattern.singeltonDesignPattern;

public class SingletonEager {
    private static final SingletonEager single=new SingletonEager();
    private SingletonEager(){

    }
    public static SingletonEager getInstance(){
           return single;
    }
    public void showMessage(){
        System.out.println("Singelton eager method is working ");
    }
}
