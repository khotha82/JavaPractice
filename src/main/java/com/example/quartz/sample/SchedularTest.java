package com.example.quartz.sample;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by krishna_hotha on 5/8/15 2015.
 */
public class SchedularTest {

	public static void main(String[] args) {

		try {
			Scheduler schedular = StdSchedulerFactory.getDefaultScheduler();
			schedular.start();

			JobDetail jobDetail = newJob(HelloWorldJob.class).withIdentity("myjob").build();
			JobDetail dummyJobDetail=newJob(DumpWorldJob.class).usingJobData("name","krishna").withIdentity("job2","group2").
					usingJobData("greeting", "saw your ass").build();

            Trigger trigger = newTrigger().withIdentity("myTrigger1")
					.withSchedule(simpleSchedule().withIntervalInSeconds(5).repeatForever()).build();


			Trigger trigger2 = newTrigger().withIdentity("myTrigger2")
					.withSchedule(simpleSchedule().withIntervalInSeconds(10).repeatForever()).build();

			schedular.scheduleJob(jobDetail,trigger);
            schedular.scheduleJob(dummyJobDetail,trigger2);



            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

			schedular.shutdown();

        } catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
}
