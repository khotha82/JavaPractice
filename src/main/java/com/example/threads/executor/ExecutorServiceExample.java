package com.example.threads.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by krishna_hotha on 8/10/15 2015.
 */
public class ExecutorServiceExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.execute(() -> {
			System.out.println("ExecutorServiceExample.main");
		});
	}
}
