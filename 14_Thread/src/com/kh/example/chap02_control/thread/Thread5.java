package com.kh.example.chap02_control.thread;

public class Thread5 implements Runnable{

	// interrupt() : 스레드의 작업을 취소시키는 메소드
	// void interrupt() 
	//		현재 스레드 내부에 interrupted라는 필드 값을 true로 바꿔줌으로써
	//		스레드에 현재 작업을 취소하라고 요청
	
	// boolean inInterrupter()
	//		현재 스레드의 interrupted필드 반환
	
	// static boolean interrupted()
	//		현재 스레드의 interrupted상태를 반환하고 false로 초기화
	
	
	@Override
	public void run() {
		int count = 0;
		while(count < 10 && !Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000); //interrupt의 상태를 true에서 false로 sleep이 계속 바꿔주기 때문에 안바뀐다.
				System.out.println((++count) + "초");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println(count + "초에 종료");
				Thread.currentThread().interrupt();
			}
		}
		
	}

	
}
