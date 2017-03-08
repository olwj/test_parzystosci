package com.sdajava.abstractclass;

/**
 * Created by lukas on 27.02.2017.
 */
public class ImplementingClass extends AbstractClass {

    @Override
    public void abstractMethod() {
        System.out.println("Metoda abstrakcyjna");
    }

    @Override
    public void implementMethod(){
        System.out.println("Nadpisanie metody implementMethod()" +
            " z klasy AbstractClass");
    }

}
