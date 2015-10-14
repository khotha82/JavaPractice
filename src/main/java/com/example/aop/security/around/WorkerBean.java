package com.example.aop.security.around;

import groovy.ui.SystemOutputInterceptor;

/**
 * Created by krishna_hotha on 4/22/15.
 */
public class WorkerBean {


    public void doWork(int noOfTimes){

        for(int i=0;i< noOfTimes;i++){

            work();
        }


    }

    private void work() {

        System.out.println();
    }

}
