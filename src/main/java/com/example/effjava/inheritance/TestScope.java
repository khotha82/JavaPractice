package com.example.effjava.inheritance;

import com.example.effjava.scopetest.*;

/**
 * Created by krishna_hotha on 9/20/15 2015.
 */
public class TestScope {

    public static void main(String[] args) {


       ParentTest parentTest=ParentTest.getParent("child1");
        parentTest.printMe();
    }
}
