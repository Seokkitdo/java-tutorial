package com.kh.practive1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void inputString() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String inputStr = sc.nextLine();
		char firstStr = inputStr.charAt(0);
		char secondStr = inputStr.charAt(1);
		char thirdStr = inputStr.charAt(2);
		
		System.out.println("ù ���� ���� : "+firstStr);
		System.out.println("�� ���� ���� : "+secondStr);
		System.out.println("�� ���� ���� : "+thirdStr);
	}
}
