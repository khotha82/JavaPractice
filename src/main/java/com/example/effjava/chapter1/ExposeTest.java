package com.example.effjava.chapter1;

/**
 * Created by krishna_hotha on 9/30/15 2015.
 */

class ParentExpose{


    public String printMe(){
        return "Hello";
    }
}
public class ExposeTest {


    public ParentExpose getParent(){

        return new ParentExpose();
    }
}
