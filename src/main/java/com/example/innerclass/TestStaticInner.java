package com.example.innerclass;

/**
 * Created by krishna_hotha on 7/10/15 2015.
 */
public class TestStaticInner {

    private int i=0;
    private static int j=0;

    private static class StaticInner{

        public void print(){

            System.out.println("hello" + " " + j);

        }
    }

    class NonStatic{


        public void print(){
            printMe();
        }
    }
    public void printMe(){

        System.out.println("heelo"+i);
    }

    public static void main(String[] args) {

        TestStaticInner nonStatic=new TestStaticInner();


    }
}
