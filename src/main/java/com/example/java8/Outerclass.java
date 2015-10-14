package com.example.java8;

/**
 * Created by krishna_hotha on 4/16/15.
 */

class StaticOuter{

    private static int i=24;

    static class StaticInner{

        public void printSomething(){
            System.out.println(i);
        }
    }
}
public class Outerclass {

    int x;

    public Outerclass(int x) {
        this.x = x;
    }
    class InnerClass{

        public void print(){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {

        Outerclass on=new Outerclass(12);

        Outerclass.InnerClass ik=on.new InnerClass();
        ik.print();

        StaticOuter.StaticInner so=new StaticOuter.StaticInner();
        so.printSomething();

    }
}
