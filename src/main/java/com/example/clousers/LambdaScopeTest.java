package com.example.clousers;

import java.util.function.Consumer;

/**
 * Created by krishna_hotha on 6/17/15 2015.
 */

public class LambdaScopeTest {

	public int x = 0;

	public static void main(String... args) {
		LambdaScopeTest st = new LambdaScopeTest();
		LambdaScopeTest.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}

	class FirstLevel {

		public int x = 1;

		void methodInFirstLevel(int x) {

			// The following statement causes the compiler to generate
			// the error "local variables referenced from a lambda expression
			// must be final or effectively final" in statement A:
			//
			// x = 99;

			Consumer<Integer> myConsumer = (y) ->
			{
				System.out.println("x = " + x); // Statement A
				System.out.println("y = " + y);
				System.out.println("this.x = " + this.x);
				System.out.println("LambdaScopeTest.this.x = " +
						LambdaScopeTest.this.x);
			};

			myConsumer.accept(x);

		}
	}
}
