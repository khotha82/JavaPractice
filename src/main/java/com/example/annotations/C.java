package com.example.annotations;

import org.springframework.stereotype.Component;

/**
 * Created by krishna_hotha on 5/4/15 2015.
 */
@Component("c")
public class C {

	public C() {

		System.out.println("creating the constructor C");
	}

}
