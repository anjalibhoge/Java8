package com.demo.lambda;

public class RunnableExample {

	public static void main(String[] args) {
//Runnable traditional way
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				int sum =0;
				for (int i = 0; i < 10; i++) {
					sum += i;
				}
				System.out.println("Traditional : "+sum);
			}
			
		};
		new Thread(runnable).start();
		
		//implement usoing lambda
		
		Runnable runnable1= () ->{
			int sum =0 ;
			for (int i = 0; i < 10; i++) {
				sum += i;
			}
			System.out.println("runnable using lambda : "+sum);
		};
		new Thread(runnable1).start();
	
		//implement using thread with lambda
		new Thread( ()->{
			int sum =0 ;
			for (int i = 0; i < 10; i++) {
				sum += i;
			}
			System.out.println("Thread using lambda : "+sum);
		}).start();
		
	
	
	}
	

}
