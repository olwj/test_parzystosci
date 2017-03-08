package com.sdajava.figury;

import java.util.Scanner;

/**
 * Created by lukas on 20.02.2017.
 */
public class Pola {

    public int a;
    public int b;

    public Pola(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    //konstruktor bezparametrowy

    public int poleKwadratu()
    {
        return a*a;
    }

    public int poleProstokata()
    {
        return a*b;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public Pola()
    {

    }

    public void czytajDane()
    {
        Scanner wejscie = new Scanner(System.in);

        this.a = wejscie.nextInt();
        this.b = wejscie.nextInt();

    }

}
