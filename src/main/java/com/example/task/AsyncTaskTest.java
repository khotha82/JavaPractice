package com.example.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.task.async.AsyncTask;

/**
 * Created by krishna_hotha on 5/13/15 2015.
 */
public class AsyncTaskTest {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-asynctask.xml");
        AsyncTask asyncTask=(AsyncTask)applicationContext.getBean("asyncTask");

        for(int i=0;i<5;i++){
            asyncTask.asyncTask();
        }
        System.out.println("i am done  this");
        return ;

    }
}
