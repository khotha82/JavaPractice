package com.example.methodInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StopWatch;

/**
 * Created by krishna_hotha on 4/10/15.
 */
public class LookupTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-methodreplacement.xml");

		AbstractBean ab = (AbstractBean) context.getBean("abstractBean");
        StandardDemoBean sb=(StandardDemoBean)context.getBean("standardBean");

		System.out.println("Calling with demo bean");
		printInfo(ab);

		System.out.println("Done with demo bean");

		System.out.println("Calling with full bean");
		printInfo(sb);

		System.out.println("Done with full bean");

	}

	private static void printInfo(DemoBean ab) {

		HelperBean hb = ab.getHelperBean();
		HelperBean hb1 = ab.getHelperBean();

		System.out.println(hb == hb1);

		StopWatch stopWatch = new StopWatch();
		stopWatch.start("lookupDemo");

		for (int x = 0; x < 100000; x++) {
			HelperBean helper = ab.getHelperBean();
		//	helper.doSomethingUseful();
		}

		stopWatch.stop();
		System.out.println("total time" + stopWatch.getTotalTimeMillis());

	}
}
