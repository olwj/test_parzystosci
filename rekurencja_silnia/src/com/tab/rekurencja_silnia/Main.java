package com.tab.rekurencja_silnia;

public class Main {

    public static int silnia(int n){

        if(n<2){
            return 1;
        }

        return n * silnia(n-1);
    }

    public static int fibbonaci (int n){
        if(n<3){
            return 1;
        }

        return fibbonaci(n-2) + fibbonaci(n-1);
    }

    public static void main(String[] args) {

        int liczba=8, wynik=1;
        System.out.println("Fib: " + fibbonaci(3));

        //silnia 4 *3 *2 *1
        for (int i=1; i<=liczba; i++)
        {
            wynik = wynik * i;
        }

        System.out.println("Silnia z liczby 8 wynosi: " + wynik);

    }
}
