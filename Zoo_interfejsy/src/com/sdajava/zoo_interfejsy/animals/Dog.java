package com.sdajava.zoo_interfejsy.animals;

/**
 * Created by lukas on 23.02.2017.
 */
public class Dog implements Animal {

    @Override
    public String eat() {

        return "Jem sniadanie";

    }

    @Override
    public void growhUp(int kg) {

    }

    @Override
    public Dog populate() {
        return null;
    }

    @Override
    public void run() {
        System.out.println("biegam");

    }

    @Override
    public void goToSleep() {
        System.out.println("Ide spac");
        System.exit(0);

    }

}
