package com.kh.example.chap01_thread.thread;

public class Thread3 extends Thread{
	
	@Override
	public void run() {
		setName("»ç¶û½º·¯¿î Thread3");
		for(int i=0; i<10; ++i) {
			System.out.println(getName() + "ON...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
