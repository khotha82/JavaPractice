package com.example.task.async;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

/**
 * Created by krishna_hotha on 5/13/15 2015.
 */
@Service("asyncTask")
public class AsyncTaskImpl implements AsyncTask {

	@Async
	@Override
	public void asyncTask() {

		System.out.println("Async task is starting");

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed the task");
	}

	@Async
	@Override
	public Future<String> asyncTaskWithReturn() {
		System.out.println("Task With return is executed");

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new AsyncResult<String>("hello`");
	}
}
