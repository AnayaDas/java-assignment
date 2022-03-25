package com.training.cg1;

public class MyThreadTest {
	public static void main(String args[]) {
		MyThread mainThread = new MyThread();
		
		System.out.println("Main Thread is running");
		
		for(int i = 0; i<=5; i++) {
			System.out.println("No. "+i+" Main Thread is exiting");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
