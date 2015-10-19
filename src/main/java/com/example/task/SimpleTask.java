package com.example.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by krishna_hotha on 5/13/15 2015.
 */
@Component("simpleTask")
public class SimpleTask {

	@Scheduled(fixedDelay = 100)
	public void sayHello() {

		System.out.println("This is the simple task for ever");
	}

}
