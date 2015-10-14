package com.example.java8.functions;

import java.util.function.Function;

import com.example.java8.lamda.Person;

/**
 * Created by krishna_hotha on 6/3/15 2015.
 */
public class PrintFunctionTest {

	private void print(Function<Person, String> function, Person person) {

		String s = function.apply(person);
		System.out.println(s);
	}

	public static void main(String[] args) {

        Function<Person,String>westernStyle=(person)->{

            return person.getName()+"in western style";
        };

        Function<Person,String>easternStyle=(person)->{

            return person.getName()+"in eastern style";
        };

        Person person=new Person("krishna",10);

        PrintFunctionTest printFunctionTest=new PrintFunctionTest();
        printFunctionTest.print(westernStyle,person);
        printFunctionTest.print(easternStyle,person);

    }
}
