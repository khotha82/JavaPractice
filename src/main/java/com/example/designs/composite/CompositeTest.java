package com.example.designs.composite;

/**
 * Created by krishna_hotha on 4/22/15.
 */
public class CompositeTest {


    public static void main(String[] args) {

        Employee devloper1=new Developer("krishna","1000","lead");
        Employee devloper2=new Developer("sri kiran","1000","lead");
        Employee manager=new Manager("Manepalli","2000","manager");

        Employee director=new Manager("Srini","3000","director");
        Employee devloper3=new Developer("Denis","1200","lead");

        System.out.println("Small Tree Starting");

        ((Manager)manager).add(devloper1);
        ((Manager)manager).add(devloper2);
         manager.print();


        System.out.println("Big tree");
        ((Manager)director).add(devloper3);
        ((Manager)director).add(manager);
        ((Manager)director).print();

    }
}
