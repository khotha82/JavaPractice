package com.example.task.taskexe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

/**
 * Created by krishna_hotha on 5/14/15 2015.
 */
@Component("taskToExecute")
public class TaskToExecute {

	@Autowired
	private TaskExecutor taskExecutor;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-taskexe.xml");
		TaskToExecute taskToExecute = (TaskToExecute) context.getBean("taskToExecute");

		taskToExecute.execute();
	}

	public void execute() {

		taskExecutor.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World from" + Thread.currentThread());
			}
		});
	}
}
