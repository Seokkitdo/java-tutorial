package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	public void method1() {
		// �Է��� ���� ���� 1~100 ������ �������� Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		boolean result = 1<= num && 100 >= num;
		System.out.println("�Է��� ���ڰ� 1�� 100 ���̿� �ֳ���? " + result);
	}
	
	public void method2() {
		//�Է��� ���� ���� �빮������ Ȯ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		// ���ڰ� A���� ũ�ų� ���� Z���ٴ� �۰ų� ����.
		boolean result = 'A' <= ch && 'Z' >= ch;
		System.out.println("�Է��� ���� �빮�� �ΰ���? " + result);
		
		
		System.out.println("��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ���.");
		System.out.println("��� �Ͻðڽ��ϱ�?(Y/y) : ");
		char answer  = sc.nextLine().charAt(0);
		boolean result1 = answer == 'Y' || answer == 'y';
		System.out.println(result1);
		
	}
}
