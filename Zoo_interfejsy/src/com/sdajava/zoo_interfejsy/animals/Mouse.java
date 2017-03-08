package com.sdajava.zoo_interfejsy.animals;

/**
 * Created by lukas on 23.02.2017.
 */
public class Mouse implements Animal {

    public int kg;


    public Mouse(int kg){
        this.kg = kg;
    }
    public Mouse populate(){
        Mouse m1 = new Mouse(12);
        return m1;
    }

    @Override
    public void growhUp(int kg) {
        this.kg = kg;
    }

    @Override
    public String eat() {

            return "Jem robaki";

    }

    @Override
    public void run() {
        System.out.println("Biegam po kanalach");
    }

    @Override
    public void goToSleep() {
        System.out.println("Ide spac");
        System.exit(0);
    }
}
