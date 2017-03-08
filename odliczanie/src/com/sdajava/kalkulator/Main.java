package com.sdajava.kalkulator;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a,b, suma=0;

        Scanner wejscie = new Scanner(System.in);
        System.out.println("Podaj poczatek przedzialu: ");

        a=wejscie.nextInt();
        b=0;


            for (int i = a; i > b; i--) {

                System.out.println("Odliczam: "+i);
            }



        System.out.println("Wartosc suma wynosi: " +suma);


    }
}
