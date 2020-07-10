package com.kh.example.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
		break;
		default:
			System.out.println("1,2,3,4,7 �߿� �ϳ��� �Է����ּ���");
				
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if(num % 2 == 0 && num > 0) {
			System.out.println("¦����");
			
		}else if (num % 2 == 1) {
			System.out.println("Ȧ����");
		}else {
			System.out.println("����� �Է����ּ���");
		}
		
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int kscore = sc.nextInt();
		
		System.out.print("�������� : ");
		int mscore = sc.nextInt();
		
		System.out.print("�������� : ");
		int escore = sc.nextInt();
		
		int total = kscore + mscore + escore;
		double average = total / 3;
		
		if(kscore >= 40 && mscore >= 40 && escore >= 40 && average >= 60) {
			System.out.println("���� : " + kscore);
			System.out.println("���� : " + mscore);
			System.out.println("���� : " + escore);
			System.out.println("�հ� : " + total);
			System.out.println("��� : " + average);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1���� 12������ ���� �Է� : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 2: case 12:
			System.out.println(month + "���� �ܿ��Դϴ�");
			break;
		
		case 3: case 4: case 5:
			System.out.println(month + "���� ���Դϴ�");
			break;
			
		case 6: case 7: case 8:
			System.out.println(month + "���� �����Դϴ�");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "���� �����Դϴ�");
			break;
			default:
				System.out.println(month + "���� �߸� �Էµ� ���Դϴ�");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String password = sc.nextLine();
		
		String myId = "myId";
		String myPassword = "myPassword12";
		
		if(id.equals(myId) && password.equals(myPassword)) {
			System.out.println("�α��� ����");
		}else if(!id.equals(myId)){
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}else if(!password.equals(myPassword)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȯ�� Ȯ���ϰ��� �ϴ� ��� : ");
		String user = sc.next();
		
		if(user.equals("������")) {
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, �Խ�Ŭ ��ȸ");
		}else if(user.equals("ȸ��")) {
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
		}else {
			System.out.println("�Խñ� ��ȸ");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double BMI = weight /(height * height);
		
		System.out.println("BMI ���� : " + BMI);
		if(BMI >= 30) {
			System.out.println("�� ��");
		} else if(BMI >= 25 ) {
			System.out.println("��");
		}else if(BMI >= 23 ) {
			System.out.println("��ü��");
		}else if(BMI >= 18.5 ) {
			System.out.println("����ü��");
		}else {
			System.out.println("��ü��");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ǿ�����1 �Է� : ");
		double num1 = sc.nextDouble();
		System.out.print("�ǿ����� 2 �Է� : ");
		double num2 = sc.nextDouble();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char op = sc.next().charAt(0);
		
		double result = 0;
		
		if(num1 > 0 && num2 > 0) {
			switch(op) {
			case '+':
				result = num1 + num2;
				
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				break;
				
			}
			System.out.printf(num1 + " " + op +" "+ num2 + " = " + "%.6f",result);
		}else {
			System.out.println("����� �Է����ּ���.");
		}
	}
	
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
