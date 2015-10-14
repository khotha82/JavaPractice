package com.example.threads;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by krishna_hotha on 4/14/15.
 */
public class ForkJoinExample extends RecursiveTask<Integer> {

	private final int[] data;
	private final int start;
	private final int end;

	public ForkJoinExample(int[] data, int start, int end) {
		this.data = data;
		this.start = start;
		this.end = end;
	}

	public ForkJoinExample(int[] data) {
		this(data, 0, data.length);
	}

	@Override
	protected Integer compute() {

		final int length = end - start;
		if (length < 5) {
			return computeDirectly();

		}
		else {

			int split = length / 2;

			final ForkJoinExample left = new ForkJoinExample(data, start, start + split);
            System.out.println("left division with "+start +" "+(start+split));
            left.fork();
			final ForkJoinExample right = new ForkJoinExample(data, split + start, end);
			return Math.max(right.compute(), left.join());
		}
	}

	private Integer computeDirectly() {
        System.out.println(Thread.currentThread() + " computing: " + start+ " to"  + end);

        int max=0;
        for(int i=start;i<end;i++){
            if(data[i]>max){
                max=data[i];
            }
        }
        return max;
    }

	public static void main(String[] args) {

		final int[] data = new int[50];
		final Random random = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(50);
		}
		final ForkJoinPool pool = new ForkJoinPool(4);
		final ForkJoinExample find = new ForkJoinExample(data, 0, data.length);
		System.out.println(pool.invoke(find));
	}
}
