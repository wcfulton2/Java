package com.company;

/**
 * Created by Bfult on 12/19/2016.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){ return instance; }

    public static void sayHello(){
        System.out.println("Hello World");
    }

    String message;

    public void setMessage(String message){
        this.message = message;
    }

    public void displayMessage(){
        System.out.println(message);
    }
}
