package org.Patterns.creationalDesignPattern.singeltonDesignPattern;

public class SingletonThreadSafe {
    private static SingletonThreadSafe single;
    private SingletonThreadSafe(){

    }
    public static SingletonThreadSafe getInstance(){
        if(single==null){
            synchronized(SingletonThreadSafe.class){
                if(single==null){
                    single=new SingletonThreadSafe();
                }
            }
        }
        return single;
    }
    public void showMessage(){
        System.out.println("Singleton thread safe double checked method is working ");
    }

}
