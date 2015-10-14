package com.example.java8.lamda;

/**
 * Created by krishna_hotha on 9/15/15 2015.
 */

class PersonTest{

    String firstName;
    String lastName;

    public PersonTest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

interface PersonFactory<P extends PersonTest>{

    P create(String firstName,String lastName);

}
public class ConstructorReference {


    public static void main(String[] args) {
        PersonFactory<PersonTest> personFactory = PersonTest::new;
        PersonTest person = personFactory.create("Peter", "Parker");
        System.out.println(person);
    }
}
