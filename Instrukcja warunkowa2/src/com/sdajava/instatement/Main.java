package com.sdajava.instatement;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int a = 98; //waga
        float b = 1.89f; //wzrost w metrach
        float c = a / (b * b);

        if (c >= 18.5 && c < 24.5) {
            System.out.println("Waga prawidłowa");

        } else if (c < 18.5) {
            System.out.println("Niedowaga");
        } else {
            System.out.println("Nadwaga");
        }
    }