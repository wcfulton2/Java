package com.company;

import com.company.Animal;

public class Dog extends Animal {

    private String sound;

    public Dog() {

    }

    public Dog(String sound){
        this.sound = sound;
    }

    //@Override
//    public void makeNoise() {
//        System.out.println("Bark bark");
//    }

    public void makeNoise(){

        if(sound == null){
            super.makeNoise();
        }
        else
            System.out.println(sound);
    }


}
