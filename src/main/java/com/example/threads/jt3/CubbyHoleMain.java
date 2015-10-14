package com.example.threads.jt3;

/**
 * Created by krishna_hotha on 9/4/15 2015.
 */
public class CubbyHoleMain {

    public static void main(String[] args) {

        final CubbyHole cubbyHole=new CubbyHole();

        Runnable r=()->{

            String str;
            try {
                Thread.sleep(1000);


                cubbyHole.putIn("multi");


                cubbyHole.putIn("programming");


                cubbyHole.putIn("java");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };


        Runnable r1=()->{

            String str;
            try {

                System.out.println(cubbyHole.getOut());
                Thread.sleep(1000);
                System.out.println(cubbyHole.getOut());

                System.out.println(cubbyHole.getOut());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread=new Thread(r);
        Thread thread1=new Thread(r1);

        thread.start();
        thread1.start();

    }
}
