package com.kh.example.chap01_thread.thread;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		// Runnable 인터페이스가 Thread클래스의 setName메소드를 사용하려면 아래와 같은 방법을 써야한다.
		Thread.currentThread().setName("멋진 Thread2");
		// TODO Auto-generated method stub
		for(int i=0; i<10; ++i) {
			System.out.println(Thread.currentThread().getName() + "ON...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
