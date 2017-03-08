package com.sdajava.watki;

/**
 * Created by lukas on 28.02.2017.
 */
public class MultiThread extends Thread {

    public int id;
    public int number;

    public MultiThread(int id, int number){
        this.number = number;
        this.id = id;
    }


    @Override
    public void run(){

        for(int i=0; i<number; i++){}
        try {
            Thread.sleep(number);
        }catch (InterruptedException e) {}
        System.out.println("Thread is running..... " + id);
    }


}
