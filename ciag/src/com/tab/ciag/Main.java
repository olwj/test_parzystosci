package com.tab.ciag;

public class Main {

    public static int fib(int n) {

        if (n < 3) {
            return 1;
        }
        return fib(n-1)+(n-2);
    }



    public static void main(String[] args) {
        System.out.println("fib: " +fib(6));

    }
}
