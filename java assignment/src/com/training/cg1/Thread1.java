package com.training.cg1;

public class Thread1 implements Runnable{
	private Thread t;
	 private String threadName;
	 
	 
	 Thread1(String name) {
		 threadName = name;
	 }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(threadName +":is running");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread "+threadName +" exiting");
		}
		

	public void go() {
		t = new Thread(this, threadName);
		t.start();
		}
	}


