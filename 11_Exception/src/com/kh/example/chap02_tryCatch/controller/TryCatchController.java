package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	
	public void method1() {
		System.out.println("method1() ȣ���...");
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception���� ����");
		} finally {
			//�����߻����ο� ������� ������ �����ؾ� �ϴ� ����
			System.out.println("���� ���ο� ������� ������ ����");
		}
		System.out.println("method1() �����...");
		
	}
	
	public void method2() throws IOException{
		System.out.println("method2() ȣ���...");
		
//		throw new NullPointerException("null�� ���Դ�!!"); //� ��쿡 ������ �߻��ߴ��� �����޽����� �Բ� ���
		//uncheckedException ����ó�� �ʿ� x
		throw new IOException("������ IOException�� �߻����׽��ϴ�.");
//		System.out.println("method2() �����...");
	}
}
