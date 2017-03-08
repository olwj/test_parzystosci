package com.sdajava.kalkulator;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracja numer: " + i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Iteracja numer: " + i);
        }


        int suma = 0;
        int mnozenie = 1;

        for (int i = 0; i < 10; i++) {
            suma = suma + i;
            System.out.println("Zmienna suma wynosi: " + suma);
        }
        System.out.println("Zmienna suma wynosi: " + suma);

        for (int i = 0; i < 10; i++) {
            mnozenie = mnozenie * i;
            System.out.println("iloczyn wszystkich elementow: " + mnozenie);
        }
        for (int i = 1; i < 30; i++) {
            if ((i % 2) == 0) {
                System.out.println("Liczba: " + i);
            }
        }

        for (int i = 55; i <= 155; i++) {
            System.out.println("Liczby od 55 do 155 to: " + i);
        }

        for (int i = 155; i >= 55; i--)
            System.out.println("Liczby w przedziale od 55 do 155 to " + i);

        for (int i=1; i <=300; i++) {

            suma = suma + i;

            System.out.println("Suma: "+i);
        }
        System.out.println("Wartosc suma wynosi: " +suma);





    }
}
