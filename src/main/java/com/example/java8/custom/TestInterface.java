package com.example.java8.custom;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by krishna_hotha on 4/20/15.
 */
public interface TestInterface {


    default void printName()  {

        System.out.println("hohtth"+this.toString());
    }

    static String printHello(){

        return "krsihhna";
    }
}
