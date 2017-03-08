package com.sdajava.zoo_interfejsy;

import com.sdajava.zoo_interfejsy.animals.Animal;
import com.sdajava.zoo_interfejsy.animals.Dog;
import com.sdajava.zoo_interfejsy.animals.Mouse;

public class Main {

    public static void main(String[] args) {

        Animal mouse = new Mouse(12);
        Animal dog = new Dog();

        System.out.println("Mysz je: " + mouse.eat());
        mouse.growhUp(12);
        mouse.populate();


    }

}
