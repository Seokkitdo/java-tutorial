package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	public void method1() {
		// Ű����� ���ڿ� ���� �Է� �޾� ��� �ݺ� ����
		// exit�� ���� ������ �ݺ�
		Scanner sc = new Scanner(System.in);
		
		// 1. while
//		String str = " ";
//		String str = null; //NullPointerException �߻�
//		while(!str.equals("exit")) {
//			System.out.print("���ڿ� �Է� : ");
//			str = sc.nextLine();
//			System.out.println("���� �Է��� ���ڿ� : " + str);
//		
//		}	
		
		// 2.do~while
		String str = null; //�Ʒ��ʿ��� str�� ���� �������־��� ������ �������Ϳ����� �ȳ��´�.
		do {
			System.out.print("���ڿ� �Է� : ");
			str = sc.nextLine();
			System.out.println("���� �Է��� ���ڿ� : " + str);
		} while(!str.equals("exit"));

	}
	
}
