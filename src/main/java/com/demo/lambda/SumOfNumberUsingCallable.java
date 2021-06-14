package com.demo.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class SumOfNumberUsingCallable {

	public static int[] array = IntStream.rangeClosed(0, 5000).toArray();
	public static int total = IntStream.rangeClosed(0, 5000).sum();

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable callable = () -> {
			int sum = 0;
			for (int i = 0; i < array.length/2; i++) {
				sum = sum + array[i];
			}
			return sum;
		};
		Callable callable1 =()->{
			int sum =0;
			for (int i = array.length/2; i < args.length; i++) {
				sum =sum+array[i];
 			}
			return sum;
		};
		ExecutorService executor =Executors.newFixedThreadPool(2);
		List<Callable<Integer>> tasklist =Arrays.asList(callable,callable1);
		List<Future<Integer>> results= executor.invokeAll(tasklist);
		int k = 0;int sum=0;
		for(Future<Integer> result : results) {
			sum =sum+result.get();
			System.out.println("sum of " + ++k + "is : "+result.get()); 
		}
		System.out.println("Total callble sum : "+ sum);
		System.out.println("correct sum from intStream  : "+ total);
		
		executor.shutdown();
	}

}
