package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
		// ���ǽ��� ��� ���� case���� ã�� ����� �����ϴ� ���ǹ�
		// �ش��ϴ� ���� case�� ���� ��쿡�� default�� ��ɹ� ����
		
		// case�� ���๮ ���̿��� �ݷ�(:)�� �����
		// break�� ������ ������ �ʰ� ��� ����
		
		
		// switch(����){
		// case ��1: ���๮1; break; //������ ���� ��1�̸� ����
		// case ��2: ���๮2; break  //������ ���� ��2�̸� ����
		// default : ���๮3; 	   //������ ���� case���� ������ ����
		//}
	public void method1() {
		// ���� �� ���� �����ȣ ���� 1���� �Է� �޾�
		// ���� ��ȣ ���ڿ� �ش��ϴ� ����� �����ϰ� ����Ͻÿ�
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		int first = sc.nextInt();
		
		System.out.print("�� ��° �� : ");
		int second = sc.nextInt();
		
		System.out.print("������(+, -, *, /) : ");
		char op = sc.next().charAt(0);
		
		
		int result = 0;
		
		switch(op) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first * second;
			break;
		default:
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			
				
		}	
		System.out.println(first + " " + op + " " + second + " = " + result);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****�ſ�� ���ϰ����Դϴ�!^^*****");
		System.out.println("���, �ٳ���, ������, Ű�� �ֽ��ϴ�~ ���� ���ϰ� �������!");
		System.out.print("� ������ ������ �ñ��ϼ���? : ");
		String fruit = sc.nextLine();
		
		int price = 0;
		
		switch(fruit) {
		case "���": 
			price = 1000;
			break;
		case "�ٳ���":
			price = 3000;
			break;
		case "������":
			price = 2000;
			break;
		case "Ű��":
			price = 5000;
			break;
		default:
			System.out.println("�� ������ �ſ�� ���ϰ��Կ��� �����ϴ٤Ф� ���� �ſ츶Ʈ�� ��������!");
		}
		System.out.printf(fruit + "�� ������ " + price + "���Դϴ�");
	}
	
	public void method3() {
		// 1������ 12������ �Է¹޾� �ش��ϴ� ���� ������ ��¥�� ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("1�� ~ 12������ �� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
//		switch(num) {
//		case 1:
//			System.out.println("31�ϱ����Դϴ�");
//			break;
//		case 2:
//			System.out.println("29�ϱ����Դϴ�");
//			break;
//		case 3:
//			System.out.println("31�ϱ����Դϴ�");
//			break;
//		case 4:
//			System.out.println("30�ϱ����Դϴ�");
//			break;
//		case 5:
//			System.out.println("31�ϱ����Դϴ�");
//			break;
//		case 6:
//			System.out.println("30�ϱ����Դϴ�");
//			break;
//		case 7:
//			System.out.println("31�ϱ����Դϴ�");
//			break;
//		case 8:
//			System.out.println("31�ϱ����Դϴ�");
//			break;
//		case 9:
//			System.out.println("30�ϱ����Դϴ�");
//			break;
//		case 10:
//			System.out.println("31�ϱ����Դϴ�");
//			break;
//		case 11:
//			System.out.println("30�ϱ����Դϴ�");
//			break;
//		case 12:
//			System.out.println("31�ϱ����Դϴ�");
//			break;
//		default:
//			System.out.println("1���� 12������ �Է����ּ���.");
//		}
		
		switch(num) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31�ϱ����Դϴ�.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30�ϱ����Դϴ�.");
			break;
		case 2:
			System.out.println("28�ϱ����Դϴ�.");
		default:
			System.out.println("1���� 12 ������ ���ڸ� �Է��ϼ���.");
		}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***** GŬ���� �츮�� �޴��Դϴ�. *****");
		System.out.println("1.�����ϰ� ����ϱ�");
		System.out.println("2.�ſ�� ���� ����");
		System.out.println("3.���� ���� ����ϱ�");
		System.out.print("�޴� ��ȣ : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
//			System.out.println("���� ���");
			method1();
			break;
		case 2:
//			System.out.println("�ſ��");
			method2();
			break;
		case 3:
//			System.out.println("����");
			method3();
			break;
		default:
//			System.out.println("�޴� ��ȣ�� �ٽ� �Է����ּ���");
			method4();
			
		}
		
	}
}
