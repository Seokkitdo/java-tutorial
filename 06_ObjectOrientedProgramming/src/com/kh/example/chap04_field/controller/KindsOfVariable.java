package com.kh.example.chap04_field.controller;

public class KindsOfVariable { // <== Ŭ���� ������ ����
	// Ŭ���� ������ �ۼ��ϴ� ���� : �ʵ�
	// �ʵ� == ��� ���� == ��� �ʵ� == ���� ����
	
	
	private int globalNum; // ��� �ʵ�
	
	public void method1(int num) { // <==�޼ҵ� ������ ����
		//				 �Ű�������(int num) ��������
		int localNum;   //���� ����
		
//		System.out.println(localNum);
		// The local variable localNum may not have been initialized
		//���������� ���� �ܿ� �ٽ� ����ϱ� ���ؼ��� �ݵ�� �ʱ�ȭ�� �Ǿ��־����
		
		System.out.println(num);
		System.out.println(globalNum);
	} // <== �޼ҵ� ������ ��
	
	
	public void method2() {
//		System.out.println(localNum); //���� ������ �ش� ����(������ �޼ҵ� ��) �ȿ����� ��밡��
		System.out.println(globalNum);
	}
} // <== Ŭ���� ������ ��
//Ŭ���� ������ �޼ҵ� ������ �����ϰ� �ִ�.