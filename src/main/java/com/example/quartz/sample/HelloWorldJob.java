package com.example.quartz.sample;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by krishna_hotha on 5/8/15 2015.
 */
public class HelloWorldJob implements Job {
	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

		System.out.println("Hello world from Krishna");
	}
}
