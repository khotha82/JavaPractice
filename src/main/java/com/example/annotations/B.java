package com.example.annotations;

import org.springframework.stereotype.Component;

/**
 * Created by krishna_hotha on 5/4/15 2015.
 */
@Component("b")
public class B {

    public B() {

        System.out.println("Creating the constructor B");
    }
}
