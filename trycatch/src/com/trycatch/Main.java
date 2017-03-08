package com.trycatch;

public class Main {

    public static void main(String[] args) {
        try {
            int[] tab = new int[3];
            tab[0] = 5;
            tab[2] = 4;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
    }
}
