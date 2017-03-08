package com.sdajava.zad7;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 1;
        int b = 2;
        int c = 1;

        int d = b*b;
        int e = d - 4*(a*c); // wzór na delte
        double e1 = Math.sqrt(e);

        // Delta >=0

        double delta= ((-b-(e1))/(2*a));


           if(e1 >= 0) {
               System.out.println("Delta jest równa " +delta);}
            else{
                   System.out.println("Delta jest mniejsza od 0");
               }
           }}


