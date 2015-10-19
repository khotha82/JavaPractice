package com.example.task.async;

import java.util.concurrent.Future;

/**
 * Created by krishna_hotha on 5/13/15 2015.
 */
public interface AsyncTask {

	public void asyncTask();

	public Future<String> asyncTaskWithReturn();
}
