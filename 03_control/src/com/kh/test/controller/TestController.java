package com.kh.test.controller;

public class TestController {
	public void methodA() {
		System.out.println("methodA() ȣ���...");
		methodB();
		System.out.println("methodA() �����...");
	}
	
	public void methodB() {
		System.out.println("methodB() ȣ���...");
		methodC();
		System.out.println("methodB() �����...");
	}
	
	public void methodC() {
		
		System.out.println("methodC() ȣ���...");
		System.out.println("methodC() �����..."); //�޼ҵ尡 ����Ǹ� �ڽ��� ȣ���� �޼ҵ�� ���ư���
		//��� �޼ҵ忡�� return�� �����ֱ� ������ �ڽ��� �ҷ��� ������ �ǵ��� �� ��.
	}
}
