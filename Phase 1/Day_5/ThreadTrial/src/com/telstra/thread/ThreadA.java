package com.telstra.thread;

public class ThreadA implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000); //millisecond
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
