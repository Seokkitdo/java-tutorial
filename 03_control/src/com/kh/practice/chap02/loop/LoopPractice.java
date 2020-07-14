package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		if(num1 > 1) {
			for(int i = 1; i<= num1; ++i) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		if(num1 > 1) {
			for(int i = 1; i<= num1; ++i) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			practice2();
		}
		
		
		
		
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		if(num1 >= 1) {
			for(int i = num1; i>=1; --i) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���. ");
		}
	}
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		if(num1 >= 1) {
			for(int i = num1; i>=1; --i) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���. ");
			practice4();
		}
		
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=num1; ++i) {
			sum += i;
			if(i != num1) {
				System.out.print(i + "+");
			}else {
				System.out.print(i + "=");
			}
		}System.out.println(sum);
	}
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(num1 < num2) {
			max = num2;
			min = num1;
		}else {
			max = num1;
			min = num2;
		}
		if(num1 >= 1  && num2 >=1 ) {

			for(int i = min; i<= max; ++i) {
				System.out.print(i + " ");
			}
	
		}else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		
		}
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int max = 0;
		int min = 0;
		
		if(num1 < num2) {
			max = num2;
			min = num1;
		}else {
			max = num1;
			min = num2;
		}
		if(num1 >= 1  && num2 >=1 ) {

			for(int i = min; i<= max; ++i) {
				System.out.print(i + " ");
			}
	
		}else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			practice7();
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		System.out.println("===== "+dan+"�� =====");
		for(int i = 1; i <= 9; ++i) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
	
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		if(dan >=1 && dan <=9) {
			for(int i = dan; i<=9; ++i) {
				System.out.println("===== "+ i +"�� =====");
				for(int j = 1; j <= 9; ++j) {
					System.out.println(i + " * " + j + " = " + i*j);
				}	
			}
		}else {
			System.out.println("9 ������ ���ڸ� �Է����ּ���");
		}
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		if(dan >=1 && dan <=9) {
			for(int i = dan; i<=9; ++i) {
				System.out.println("===== "+ i +"�� =====");
				for(int j = 1; j <= 9; ++j) {
					System.out.println(i + " * " + j + " = " + i*j);
				}	
			}
		}else {
			System.out.println("9 ������ ���ڸ� �Է����ּ���");
			practice10();
		}
	}
	
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� : ");
		int plus = sc.nextInt();
		
		int sum = num1;
		for(int i = 0; i<10; ++i) {
			System.out.print(sum +" ");
			sum += plus;
			
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		String str ="";
		do {
			System.out.print("������(+, -, *, /, %) : ");
			str = sc.next();
			char op = str.charAt(0);
			
			if(str.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			
			if(op == '/' && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				practice12();
			}
			
			switch(op) {
			case '+' : System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); break;
			case '-' : System.out.println(num1 + " - " + num2 + " = " + (num1-num2)); break;
			case '*' : System.out.println(num1 + " * " + num2 + " = " + (num1*num2)); break;
			case '/' : System.out.println(num1 + " / " + num2 + " = " + (num1/num2)); break;	
			default: System.out.println("���� �������Դϴ�.");
			}
		} while(!str.equals("exit"));	
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();
		
		for(int i = 1; i<=num1; ++i) {
			
			for(int j =0; j <i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		for(int i = num-1; i >= 0; i--) {
			for(int j = 0; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
