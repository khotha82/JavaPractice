package com.example.threads.jt3;

/**
 * Created by krishna_hotha on 8/19/15 2015.
 */
public class CorruptWrite {

    private String firstName;

    private String lastName;

    public synchronized  void setNames(String firstName,String lastName)  {

        this.firstName=firstName;

        if(this.firstName.length()>5){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.lastName=lastName;

        print("Leaving setName FirstName"+this.firstName+"LastName "+this.lastName);
    }

    public static void print(String msg){

        System.out.println(Thread.currentThread().getName()+" "+msg);
    }

    public static void main(String[] args) throws InterruptedException {

        CorruptWrite corruptWrite=new CorruptWrite();

        new Thread(()->{corruptWrite.setNames("Krishna","Hotha");},"ThreadA").start();

        Thread.sleep(200);
        new Thread(()->{corruptWrite.setNames("Arnavd","Pranav");},"ThreadA").start();
    }
}
