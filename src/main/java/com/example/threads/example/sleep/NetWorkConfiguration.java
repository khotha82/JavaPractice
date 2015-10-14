package com.example.threads.example.sleep;

import java.util.concurrent.TimeUnit;

/**
 * Created by krishna_hotha on 5/28/15 2015.
 */
public class NetWorkConfiguration implements Runnable {

    @Override
    public void run() {

        System.out.println("Starting the network method");
        try {
            TimeUnit.SECONDS.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ending the network method ");
    }
}
