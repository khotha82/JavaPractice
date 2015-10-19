package com.example.aop.pointcut.performace;

/**
 * Created by krishna_hotha on 4/24/15.
 */
public class SimpleBeanImpl implements SimpleBean {

	private long dummy;

	@Override
	public void advised() {

		dummy = System.currentTimeMillis();
	}

	@Override
	public void unAdvised() {

		dummy = System.currentTimeMillis();
	}
}
