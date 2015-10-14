package com.example.threads.jt3;

/**
 * Created by krishna_hotha on 8/12/15 2015.
 */
public class TwoThread extends  Thread{

    @Override
    public void run() {

        for(int i=0;i<10;i++)
        System.out.println("running first thread");
    }

    public static void main(String[] args) {

        Thread fist=new TwoThread();
        fist.start();

        for(int i=0;i<10;i++){
            System.out.println("main thread");
        }
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
