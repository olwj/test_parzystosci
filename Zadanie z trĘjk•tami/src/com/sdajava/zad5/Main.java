package com.sdajava.zad5;

public class Main {

    public static void main(String[] args) {
        // Sprawdzamy twierdzenie Pitagorasa
        int a = 2;
        int b = 4;
        int c = 5;

        a = a * a;
        b = b * b;
        c = c * c;

        int d = a + b;

        if (c == d){
            System.out.println("Trójkąt jest prostokątny");
    }       else  {
        System.out.println("Trójkąt nie jest prostokątny");
    }
}}
