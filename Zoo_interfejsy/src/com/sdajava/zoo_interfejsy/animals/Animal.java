package com.sdajava.zoo_interfejsy.animals;

import java.util.List;

/**
 * Created by lukas on 23.02.2017.
 */
public interface Animal<T> {

    String eat();
    void run();
    void goToSleep();
    void growhUp(int kg);
     T populate();

}
