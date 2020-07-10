package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	// for(�ʱ��; ���ǽ�; ������){
	//		���� ����;
	// }
	// ���� ���� : �ʱ�� -> ���ǽ� Ȯ�� -> (���ǽ� true�� ��) ���๮�� ���� -> ������ -> ���ǽ� Ȯ�� -> (�ݺ�)
	// ���ǽ��� ����� false�� �� ������ �ݺ�
	
	// for�� �տ� �ִ� �ʱ��, ���ǽ� ,������ ���� ����
	// �ʱ���� ��������, ������ ��������, ������ �󸶳� �Ǵ��� �Ұ�ȣ ���� �ƴϾ ��򰡿��� ǥ���ؾ� ��
	// ��� for() �ȿ����� ������ �� ��� �ʿ��� ���
	
	public void method1() {
		// 1���� 5���� ���
		for(int i=0; i<=10; i++) {
			System.out.println(i + "��° �ݺ��� ����");
		}
	}
	
	public void method1_1() {
		// �ڱ�Ұ� �ټ��� �ϱ� : �� �̸��� �ڽſ��
		for(int i=0; i<5; i++) {
			System.out.println("�� �̸��� �ڽſ��");
		}
	}
	
	public void method2() {
		// 5���� 1���� ���
		for(int i=5; i >= 1; i--) {
			System.out.println(i);
		}
	}
	
	public void method2_1() {
		// 8���� 3���� ���
		for(int i=8; i>=3; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {
		// 1���� 10 ������ Ȧ���� ��� 
//		for(int i =1; i<=10; ++i) {
//			if(i % 2 == 1) {
//				System.out.print(i+" ");
//			}
//		}
		
		for(int i =1; i <= 10; i += 2) {  //������ �ٲٱ�
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		// ���� �� ���� �Է� �޾� �� ���� ���� ��� 
		
		// ���� �� ���� �Է��ϼ���.
		// ��, ù ��° ���ڸ� �� ��° ���ں��� �۰� �Է����ּ���
		// ù ��° ���� : 5
		// �� ��° ���� : 8
		// 5 6 7 8
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ΰ��� �Է��ϼ���.");
		System.out.println("��, ù ��° ���ڸ� �� ��° ���ں��� �۰� �Է����ּ���");
		System.out.print("ù ��° ���� : ");
//		int num1 = sc.nextInt();
		int start = sc.nextInt(); //start�� �� �������̹Ƿ� start�� �ϴ°� �´� �� ����
		
		System.out.print("�� ���� ���� : ");
//		int num2 = sc.nextInt();
		int end = sc.nextInt(); //end�� �� �������̹Ƿ� end�� ��ü 
		// �ڵ带 © �� �� ȥ�ڸ��� �����ϴ� ���� �ƴ� �ٸ� ����� ���� ������ �� �ִ� �������� ����ϵ��� �������.
		
//		for(int i = start; i <= end; i++) {
//			System.out.print(i + " ");
			
		int max = 0; //�� ���� �� ū ���ڸ� ������ ����
		int min = 0; //�� ���� �� ���� ���ڸ� ������ ����
		
		if(start <= end) {
			max = end;
			min = start;
		} else {
			max = start;
			min = end;
		}
		
		for(; min <= max; min++) { //�ʱ���� ������ �� �ִ�. �� ��° ���ǽİ� �� ��° �����ε� �ذ� ����
			System.out.print(min + " ");
			System.out.println();
		}
	}
	
	public void method4_1() {
		//������ �ϳ� �Է� �޾� �� ���� 1~9 ������ �����϶��� �� ���� ������ ���
		// ������ ���� ������ "1~9 ������ ����� �Է��ؾ��մϴ�" ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9������ ����� �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if(num <=0 || num >=10) {
			System.out.println("1~9������ ����� �Է��ؾ��մϴ�");
		} else {
			for(int i = 1; i < 10; ++i) {
				System.out.println(num + " X " + i + " = " + num * i);
			}
		}
	}
	
	public void method5() {
		// 1���� 10 ������ ������ ������ ���� 1���� ���������� �հ� ���� : ������ ����
		// ���� �� ���� �޼ҵ� : Math.random()
		// o�̻� 1�̸��� �Ǽ��� �������� ��ȯ(double)
//		System.out.println(Math.random()); 
		// (0�ܰ�)  0 <= Math.random() < 1 (�Ǽ�)
		// (1�ܰ�)  0 <= Math.random() * 10 < 10			 : 0 ~ 9.999999999999999999
		// (2�ܰ�)  1 <= Math.random() * 10 + 1 < 11 		 : 1 ~ 10.99999999999
		// (3�ܰ�)  1 <= (int)(Math.random() * 10 + 1) < 11 : 1 ~ 10
		
		System.out.println("1���� 10 ������ ������ �Է��ϼ���");
		
		int random = (int)(Math.random() * 10 + 1);
		System.out.println("���� : " + random);
		
		int sum = 0;
		for(int i = 1; i <= random; ++i) {
			sum += i;	
		}
		
		System.out.print("1���� " + random + "������ �� : " + sum);
	}
	
	public void method6() {
		// ��ø for�� : for�� �ȿ� for�� ��� ����
		// 2�ܺ��� 9�ܱ��� ���
		//2����� �Ʒ���   3����� �Ʒ���   4����� �Ʒ���
		for(int i =2; i<=9; i++) {
			System.out.println(" ");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}

		}
	}
	
	public void method7() {
		// �Ƴ��α� �ð� : 0��0��~ 23�� 39��
		for(int i =0; i < 24; i++) {
			for(int j = 0; j<= 59; ++j) {
				System.out.print(i+"�� " + j + "��");
			}
		}
	}
	
	public void method8() {
		// �� �ٿ� �� ǥ(*) �� 5�� ��µǴµ� �� ���� ����ڰ� �Է��� ����ŭ ���
		// ����� �� �� : 3
		// *****
		// *****
		// *****
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� �� : ");
		int input = sc.nextInt();
		for(int i = 0; i<input; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void method9() {
		// �� �ٿ� ��ǥ ���ڸ� �Է��� �� ���� ĭ ����ŭ �Է�
		// ��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ���� ���
		// �� �� : 4
		// ĭ �� : 5
		//	1****
		//	*2***
		//	**3**
		//	***4*
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� �� : ");
		int zul = sc.nextInt();
		
		System.out.print("����� ĭ �� : ");
		int kan = sc.nextInt();
		
		for(int i = 1; i <= zul; ++i) {
			for(int j = 1; j <= kan; ++j) {
				if(i == j) {
					System.out.printf("%d", i);
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
	}
}
