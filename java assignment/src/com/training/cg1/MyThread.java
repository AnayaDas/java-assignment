package com.training.cg1;

public class MyThread extends Thread{
	MyThread() {
		super("Child Thread");
		start();
		
	}
	public void run() {
		System.out.println("Child Thread is running....");
		for(int i = 0; i<= 5; i++) {
			System.out.println("No. "+i+" Child Thread is exiting");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
