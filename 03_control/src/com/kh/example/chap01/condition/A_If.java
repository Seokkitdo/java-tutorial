package com.kh.example.chap01.condition;

import java.util.Scanner;

public class A_If {
		//�ܵ� if ��
		//if(���ǽ�) {
		// ������ ����;
		//}
		// ���ǽ��� ��� ���� ��(true)�� { }�ȿ� �ִ� �ڵ� ����
		// ���ǽ��� ��� ���� ����(false)�̸� { } �ȿ� �ִ� �ڵ�� �����ϰ� �Ѿ
		
	public void method() {	
		//�Է��� ���ڰ� ������� �������� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		
		int num1 = sc.nextInt();
		
		if(num1 > 0) {
			System.out.print("����Դϴ�");
		}
		else if (num1 == 0) {
			System.out.print("0�Դϴ�");
		}
		else {
			System.out.print("�����Դϴ�");
		}
		
		System.out.println("���α׷� ����");
			
	}
	
	public void method2() {
		//�Է��� ���ڰ� ¦������ ��������
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		if(num1 % 2 == 0) {
			System.out.println("¦���Դϴ�");
		}
		else {
			System.out.println("Ȧ���Դϴ�");
		}
	}
	
	public void method3() {
		// �Է��� ���ڰ� 1~10������ �������� Ȯ��
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		
		int num1 = sc.nextInt();
		if(num1 >= 1 && num1 <= 10) {
			System.out.println("1~10������ �����Դϴ�");
		}
		else {
			System.out.println("1~10������ ���ڰ� �ƴմϴ�");
		}
	}
	
	public void method4() {
		//���ڿ� ���ϱ�
		//�̸��� �Է¹޾� ���� �̸��� ������ �����Դϴ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		String myName = "������";
		
		//���ڿ� �񱳴� StringŬ���� �ȿ� �ִ� equals()�޼ҵ�� ��
		if(name.equals(myName)) {  //���ڿ��� �񱳴� ==�δ� �ȵȴ�.
			System.out.println("�����Դϴ�");
		}
		else {
			System.out.println("������ �ƴմϴ�");
		}
		
	}
}
