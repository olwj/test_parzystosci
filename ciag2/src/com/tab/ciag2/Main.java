package com.tab.ciag2;

public class Main {

    public static int funkcja(int n) {

        if(n==1){
            return -1;
        }
        return -funkcja(n-1)*n-3;
    }

    public static void main(String[] args) {

        System.out.println("funkcja: "+funkcja(7));
    }

}
