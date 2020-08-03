package com.kh.example.chap02_control.thread;

public class Thread5 implements Runnable{

	// interrupt() : �������� �۾��� ��ҽ�Ű�� �޼ҵ�
	// void interrupt() 
	//		���� ������ ���ο� interrupted��� �ʵ� ���� true�� �ٲ������ν�
	//		�����忡 ���� �۾��� ����϶�� ��û
	
	// boolean inInterrupter()
	//		���� �������� interrupted�ʵ� ��ȯ
	
	// static boolean interrupted()
	//		���� �������� interrupted���¸� ��ȯ�ϰ� false�� �ʱ�ȭ
	
	
	@Override
	public void run() {
		int count = 0;
		while(count < 10 && !Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000); //interrupt�� ���¸� true���� false�� sleep�� ��� �ٲ��ֱ� ������ �ȹٲ��.
				System.out.println((++count) + "��");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println(count + "�ʿ� ����");
				Thread.currentThread().interrupt();
			}
		}
		
	}

	
}
