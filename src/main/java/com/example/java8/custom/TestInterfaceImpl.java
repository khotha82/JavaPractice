package com.example.java8.custom;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public class TestInterfaceImpl implements TestInterface2 {


    public static void main(String[] args) {

        TestInterface2 t=new TestInterfaceImpl();
        TestInterface2.printName();
    }
}
