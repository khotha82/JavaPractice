package com.example.threads.example.sleep;

/**
 * Created by krishna_hotha on 5/28/15 2015.
 */
public class SleepExample {


    public static void main(String[] args) throws InterruptedException {

        DataBaseConfiguration baseConfiguration=new DataBaseConfiguration();
        NetWorkConfiguration netWorkConfiguration=new NetWorkConfiguration();

        Thread dbConfigThread=new Thread(baseConfiguration);
        Thread netConfigThread=new Thread(netWorkConfiguration);
        dbConfigThread.start();
        netConfigThread.start();
        dbConfigThread.join();
        netConfigThread.join();
        System.out.println("Exiting Main Thread");
    }

}
