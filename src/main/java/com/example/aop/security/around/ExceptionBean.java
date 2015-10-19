package com.example.aop.security.around;

/**
 * Created by krishna_hotha on 4/22/15.
 */
public class ExceptionBean {

	public void throwError() {

		int i = 1 / 0;
	}

	public void throwInvalidError() {

		throw new IllegalArgumentException("i will throw exception");
	}
}
