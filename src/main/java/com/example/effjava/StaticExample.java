package com.example.effjava;

import com.example.effjava.chapter1.Operation;
import com.example.effjava.enumtest.DriverManager;

/**
 * Created by krishna_hotha on 6/22/15 2015.
 */

public class StaticExample {

    public static void main(String[] args) {

        Operation operation=new Operation();
        Operation operation1=operation.typeOperation("Krishna");
        operation1.operate();
        DriverManager.INSTANCE.print();

    }
}
