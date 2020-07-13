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
				System.out.print(" + ");
			}else {
				System.out.print(" = ");
			}
			++i;
		}System.out.println(sum);
		
	}
	public void method6() {
		// ���ڿ��� �Է� �޾� �ε��� ���� ���� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		System.out.println("���� �Է��� ���ڿ� : " + str);
		for(int i = 0; i < str.length(); i++) { // str.length() ��ȯ���� int�̸� ���� �Է��� ���ڿ��� ���̰� �� ��ȯ���̴�. apple�� 5�� ��ȯ��.
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
		}
		
		int i = 0;
		while(i < str.length()) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}
	}
	
	public void method7() {
		// 2�ܤ����� 9�ܱ��� ���
		int i = 2;
		
		while(i <= 9) {
			int j = 1;
			while(j <= 9) {
				System.out.println(i + " X " + j + " = " + i * j);
				j++;
			}
			i++;
		}
	}
	
	public void method8() {
		// �Ƴ��α� �ð�
		int i = 0;
		while( i <= 23) {
			int j = 0;
			while(j <= 59) {
				System.out.println(i + "��" + j + "���Դϴ�");
				j++;
			}i++;
		}
	}
	
	public void method9() {
		
	}
	
	public void method10() {
		
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		while(menu != 9) {
			System.out.println("1. 1~5���");
			System.out.println("2. 5~1���");
			System.out.println("3. 1~10���� Ȧ�� ���");
			System.out.println("9. ����");
			System.out.print("�޴���ȣ : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 9:
				System.out.println("�����մϴ�.");
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
		
		
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
//		while(true) { //���� �ݺ���
//
//			System.out.println("1. 1~5 ���");
//			System.out.println("2. 5~1 ���");
//			System.out.println("3. 1~10 �� Ȧ���� ���");
//			System.out.println("9. ����");
//			System.out.print("�޴� ���� : ");
//			int menu = sc.nextInt();
//			
//			switch(menu) {
//			case 1: method1(); break;
//			case 2: method2(); break;
//			case 3: method3(); break;
//			case 9: System.out.println("�����մϴ�"); return; //���� �ҷ��� �޼ҵ�� �ǵ��ư��� ���⼭�� run�� �ִ� main �޼ҵ�
//			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//			}
//		}
//		System.out.println("��2");  �� �ڵ尡 ������ ���� ������ ���� while���� ���� �ݺ��̱� ������
		//���� �ڵ���� ������ �� �� ���� �����̴�
		int menu = 0;
		do { //���� �ݺ���

			System.out.println("1. 1~5 ���");
			System.out.println("2. 5~1 ���");
			System.out.println("3. 1~10 �� Ȧ���� ���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 9: System.out.println("�����մϴ�"); return; //���� �ҷ��� �޼ҵ�� �ǵ��ư��� ���⼭�� run�� �ִ� main �޼ҵ�
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}while(menu != 0);
	}
}
