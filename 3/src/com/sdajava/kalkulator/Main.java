package com.sdajava.kalkulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long iloczyn=1; //deklaracja zmiennej

        for (int i=2; i<=12; i++) {
            iloczyn = iloczyn * i; // domnazanie
        }
        System.out.println("Iloczyn: " +iloczyn); //wyswietlenie wyniku


    }



}