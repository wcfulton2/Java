package com.company;

public class Main {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();

        System.out.println("In Main");
        instance.sayHello();

        instance.setMessage("Hi There");
        instance.displayMessage();

        AnotherClass Class1 = new AnotherClass();


        Class1.displaySingletonMessage();

    }
}
