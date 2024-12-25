package com.romish.Singleton;
//Singleton class means you can create a single object of the class;

public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;

    public  static Singleton getInstance() {
        if(instance==null) {
            instance =new Singleton();
            System.out.println("instance is created");
        }

        return instance;
    }
}
