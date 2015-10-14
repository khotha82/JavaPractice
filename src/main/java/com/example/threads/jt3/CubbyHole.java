package com.example.threads.jt3;

/**
 * Created by krishna_hotha on 9/4/15 2015.
 */
public class CubbyHole {

    private Object slot;

    public CubbyHole() {
        this.slot = null;
    }

    public synchronized void putIn(Object object) throws InterruptedException {


            while(slot!=null){

                this.wait();
            }
        slot=object;
        System.out.println("Put in "+object);



        notify();


    }

    public synchronized Object getOut() throws InterruptedException {



        while(slot==null){

            wait();
        }

        Object object=slot;
        slot=null;

        notifyAll();
        System.out.println("cleaning cub hole");
        return object;

    }
}
