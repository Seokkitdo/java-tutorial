package com.kh.example.chap01_thread.run;

import com.kh.example.chap01_thread.thread.Thread1;
import com.kh.example.chap01_thread.thread.Thread2;
import com.kh.example.chap01_thread.thread.Thread3;

public class Run {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		thread1.start();
		//start는 스레드 클래스안에 들어있는 메소드이다
		
		// Runnable 인터페이스가 start메소드를 사용하고 싶으면 
		// Thread 자료형을 갖는 새로운 객체를 만들고 그 안에 Runnalbe로 만든 객체를 넣어주면 된다.
		Thread2 t2 = new Thread2();
		Thread thread2 = new Thread(t2);
		thread2.start();
		
		
		Thread3 thread3 = new Thread3();
		thread3.start();
	}
}
