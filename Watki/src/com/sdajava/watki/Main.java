package com.sdajava.watki;

public class Main {

    public static void main(String[] args) {


        MultiThread m1 = new MultiThread(0,923847);
        m1.start();

        MultiThread m2 = new MultiThread(1,23222223);
        m2.start();

        MultiThread m3 = new MultiThread(2,9485);
        m3.start();

        MultiThread m4 = new MultiThread(3,23874);
        m4.start();



    }
}
