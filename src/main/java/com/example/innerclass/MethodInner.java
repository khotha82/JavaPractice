package com.example.innerclass;

/**
 * Created by krishna_hotha on 7/13/15 2015.
 */
public class MethodInner {

    public void print(){

        int k=0;
        class PrintTest{


            public void print(){
                System.out.println("hello"+k);
            }
        }
        new PrintTest().print();
    }

    public static void main(String[] args) {

        MethodInner methodInner=new MethodInner();
        methodInner.print();
    }
}
