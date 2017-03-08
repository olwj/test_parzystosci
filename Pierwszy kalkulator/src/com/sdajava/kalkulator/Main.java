package com.sdajava.kalkulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char znak = '-';
        double a = 23, b = 12, wynik = 0;

        System.out.println("Zmienna " + (double) znak);

        Scanner wejscie = new Scanner(System.in);

        System.out.println("Podaj liczbę");

        a = wejscie.nextInt();

        System.out.println("Podaj znak: ");

        znak = wejscie.next().charAt(0);

        System.out.println("Podaj drugą liczbę");

        b = wejscie.nextInt();

        switch (znak)
        {
            case '+':
                System.out.println("Wykonuje operacje dodawania ");
                wynik=a+b;
                break;
            case '-':
                System.out.println("Wykonuje odejmowanie ");
                wynik=a-b;
                break;
            case '*':
                System.out.println("Wykonuje mnożenie ");
                wynik=a*b;
                break;
            case '/':
                System.out.println("Wykonuje dzielenie ");
                if (b==0){
                    System.out.println("Nie dzielimy przez 0");}
                else {
                    wynik=a/b;
                }


        }
        if( !(b == 0 && znak == '/') ) {
            System.out.println("Wynik: " + wynik);
        }
    }
}
