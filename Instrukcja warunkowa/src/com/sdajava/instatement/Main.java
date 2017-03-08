package com.sdajava.instatement;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int a = 23;
        int b = 24;
        int c = 23;

        if (a>=b && a>=c) {
            System.out.println("Największa " + a);

        }else if(b>=a && b>=c ){
            System.out.println("Największa " +b);
        }
        else{
            System.out.println("Najwieksza "+c);
        }
    }}



