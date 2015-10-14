package com.example.threads.interrupt;

/**
 * Created by krishna_hotha on 5/28/15 2015.
 */
public class PrimeGenerator  implements Runnable{
    @Override
    public void run() {

        int number=1;

        while(true){

            if(isPrimeNumber(number)){
                System.out.println(number);
            }
            if(Thread.currentThread().isInterrupted()){
                System.out.println("killing me ");
                return;
            }
            number++;
        }
    }

    private boolean isPrimeNumber(int number) {
        int j=2;
        while(j<=(number/2)){

            if(number%j==0){
                return false;
            }
            j++;
        }
        return true;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread=new Thread(new PrimeGenerator());
        thread.start();

        Thread.sleep(50000);

        thread.interrupt();
    }
}
