package com.kh.variable;

import java.util.Scanner;

public class E_KeyboardInput {
	public void input1() {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("���ϴ� ���� �Է��ϼ���: ");
//		String value = sc.next();
//		System.out.println("���� �Է��� ��: "+value);
		
		System.out.print("�̸��� �Է��ϼ���: ");
//		String name = sc.next();
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���(�Ҽ��� ù°�ڸ�����) :");
		double height = sc.nextDouble();
		System.out.println(name + "���� "+ age + "���̸�, Ű��" +height+"cm�Դϴ�");
	}
	
	public void input2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ���: ");
//		int age = sc.nextInt();
//		
//		System.out.print("�ּҸ� �Է��ϼ���: ");
//		String address = sc.nextLine();
		
		// 1. �ּҸ� next()�� �ޱ�
//		String address = sc.next();
		// next() : ���� �Է� �Ұ�, ���⸦ �����ڷ� �ν�
		
		// 2. ���̸� �޴� nextInt�� �ּҸ� �޴� nextLine() ���̿� nextLine() �߰�
//		sc.nextLine();
//		String address = sc.nextLine();
		
		// 3. ���̸� ���� �� ���Ͱ� ���� �ʵ��� nextLine()�� �� �� �Ľ�(String �ڷ����� �ٸ� �ڷ������� ����)�ϱ�
//		int age = Integer.parseInt(sc.nextLine());
		String ageStr = sc.nextLine();
		int age = Integer.parseInt(ageStr);
		System.out.print("�ּҸ� �Է��ϼ���: ");
	
		String address = sc.nextLine();
		System.out.println(name + "���� "+age+"���̸�, ��� ���� " + address + "�Դϴ�.");
		
		System.out.print("����! ����� ������ �����ΰ���?(M/F) : ");
		String genderStr = sc.nextLine();
		char gender = genderStr.charAt(0);
		System.out.println("�� ������"+gender+"�Դϴ�");
	}
}
