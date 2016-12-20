package com.company;

/**
 * Created by Bfult on 12/19/2016.
 */
public class AnotherClass {

    public AnotherClass(){}

    Singleton instance = Singleton.getInstance();

    public void displaySingletonMessage(){
        System.out.println("In AnotherClass");
        instance.displayMessage();
    }

}
