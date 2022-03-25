package com.training.cg1;

public class Thread1Test {
	public static void main(String args[]) {
		Thread1 thread1 = new Thread1("Thread-1");
		Thread1 thread2 = new Thread1("Thread-2");

		thread1.go();
		thread2.go();
	}

}
