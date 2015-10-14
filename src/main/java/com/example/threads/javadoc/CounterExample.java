package com.example.threads.javadoc;

/**
 * Created by krishna_hotha on 8/11/15 2015.
 */

 class Counter{

    int c=1;



    public int value(){
        return c++;
    }
}
public class CounterExample implements Runnable {

    Counter counter;

    public CounterExample(Counter counter) {
        this.counter = counter;

    }

    @Override
    public void run() {


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.value());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        Counter counter=new Counter();
        new Thread(new CounterExample(counter)).start();
        new Thread(new CounterExample(counter)).start();
        new Thread(new CounterExample(counter)).start();
        new Thread(new CounterExample(counter)).start();
    }
}
