package com.kh.practive1.func;

import java.util.Scanner;

public class VariablePractive1 {
	public void scannerInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(��/��) : ");
		String genderStr = sc.nextLine();
		char gender = genderStr.charAt(0);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		System.out.print("Ű "+height+"cm�� "+age+"�� "+gender+"�� "+name+"�� �ݰ����ϴ� ^^");
		
	}
}
