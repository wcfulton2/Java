package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal lion = new Lion();

        ArrayList<Animal> myList = new ArrayList<>();


        dog.makeNoise();

        dog = new Dog("Woof");
        dog.makeNoise();

        cat.makeNoise();
        lion.makeNoise();

        makeSounds(dog);

        myList.add(dog);
        myList.add(cat);
        myList.add(lion);
        System.out.println("In list");
        for(Animal b : myList){
            b.makeNoise();
        }

    }

    public static void makeSounds(Animal a){
        a.makeNoise();
    }


}
