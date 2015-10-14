package com.example.quartz.sample;

import org.quartz.*;

/**
 * Created by krishna_hotha on 5/11/15 2015.
 */
public class DumpWorldJob implements Job {

    private String name;
    public void setName(String name){

        this.name=name;
        System.out.println("setting job name");
    }

	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

		JobKey key = jobExecutionContext.getJobDetail().getKey();
		JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();



        String greeting=jobExecutionContext.getMergedJobDataMap().getString("greeting");

        System.out.println("name :"+name+" "+"greeting"+" "+greeting+" key"+key);
    }
}
