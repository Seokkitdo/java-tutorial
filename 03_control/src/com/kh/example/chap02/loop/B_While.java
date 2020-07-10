package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	// while(���ǽ�){
	//		���๮��;
	//		[������ or �б⹮;]
	// }
	// ���ǽ� Ȯ�� -> (���ǽ� true �� ��) ���๮�� ���� -> ���ǽ� Ȯ�� -> (�ݺ�)
	public void method1() {
		// 1���� 5���� ���
		int i = 1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
	}
	
	public void method1_1() {
		// �ڱ�Ұ� 5���ϱ� : �� �̸��� �ڽſ��
		int i=0;
		while(i<5) {
			System.out.println("�� �̸��� �ڽſ��");
			i++;
		}
	}
	
	public void method2() {
		// 5����  1���� ���
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void method3() {
		// 1���� 10 ������ Ȧ���� ���
		int i =1;
		while(i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
	}
	
	public void method4() {
		// ���� �� ���� �Է¹޾� �� ���� ���� ���
		//����ڰ� ù ��° ���ڸ� �� ũ�� �Է� �ص� ����� ��µǰ� �����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 �Է� : ");
		int start = sc.nextInt();
		
		System.out.print("���� 2 �Է� : ");
		int end = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(end <= start) {
			max = start;
			min = end;
		} else {
			max = end;
			min = start;
		}
		while(min <= max) {
			System.out.print(min + " ");
			++min;
		}
		
	}
	
	public void method4_1() {
		// ���� �ϳ��� �Է� �޾� �� ���� 1~9 ������ ���϶��� �� ���� ������ ���
		// ������ ���� ������ 1~9 ������ ����� �Է��Ͽ��� �մϴ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int dan = sc.nextInt();
		if(dan <= 0 || dan >=10) {
			System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�");
		}else {
			int i = 1;
			while( i <= 9) {
				
				System.out.println(dan + " X " + i + "=" + dan * i);
				++i;
			}
		}
	}
	
	public void method5() {
		// 1���� 10 ������ ������ ������ ���� 1���� ���������� ���� �հ�
		int random = (int)(Math.random() * 10 + 1);
		int i = 1;
		int sum = 0;
		System.out.println("���� �Է� : " + random);
		while(i <= random) {
			sum += i;
			
			
			System.out.print(i);
			if(i < random) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
			++i;
		}System.out.println(sum);
	}
}
