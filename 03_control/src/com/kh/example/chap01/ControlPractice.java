package com.kh.example.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		double mtest = sc.nextDouble();
		
		System.out.print("�⸻ ��� ���� : ");
		double ltest = sc.nextDouble();
		
		System.out.print("���� ���� : ");
		double ascore = sc.nextDouble();
		
		System.out.print("�⼮ ȸ�� : ");
		double attend = sc.nextDouble();
		
		System.out.println("=============== �� �� ===============");
		
		double mtotal = mtest * 0.2;
		double ltotal = ltest * 0.3;
		double atotal = ascore * 0.3;
		
		double alltotal = mtotal + ltotal + atotal + attend;
		
		
		
		if(alltotal >= 70 && attend >= 15) {
			System.out.println("�߰� ��� ����(20) : " + mtest * 0.2);
			System.out.println("�⸻ ��� ����(30) : " + ltest * 0.3);
			System.out.println("���� ���� (30) : " + ascore * 0.3);
			System.out.println("�⼮ ���� (20) : " + attend);
			System.out.println("���� : " + alltotal);
			System.out.println("PASS");
		} else if(20-attend >= 6) {
			System.out.printf("Fail [�⼮ ȸ�� ���� (%d/20)]", (int)attend);
		}else if(alltotal < 70 ) {
			System.out.println("�߰� ��� ����(20) : " + mtest * 0.2);
			System.out.println("�⸻ ��� ����(30) : " + ltest * 0.3);
			System.out.println("���� ���� (30) : " + ascore * 0.3);
			System.out.println("�⼮ ���� (20) : " + attend);
			System.out.println("���� : " + alltotal);
			System.out.print("Fail [���� �̴�]");
		} 
	}
}
