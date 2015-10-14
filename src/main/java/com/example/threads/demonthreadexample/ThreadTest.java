package com.example.threads.demonthreadexample;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by krishna_hotha on 6/2/15 2015.
 */
public class ThreadTest {



    public static void main(String[] args) {

        Deque<Event>deque=new ArrayDeque<Event>();

        WriterTask writerTask=new WriterTask(deque);

        Thread thread=new Thread(writerTask);
        thread.start();

        ClearTask clearTask=new ClearTask(deque);
        clearTask.start();

    }
}
