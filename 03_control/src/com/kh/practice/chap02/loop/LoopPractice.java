package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		if(num1 > 1) {
			for(int i = 1; i<= num1; ++i) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}
	
	

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		if(num1 > 1) {
			for(int i = 1; i<= num1; ++i) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
			practice1();
		}
		
		
		
		
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		if(num1 >= 1) {
			for(int i = num1; i>=1; --i) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요. ");
		}
	}
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		if(num1 >= 1) {
			for(int i = num1; i>=1; --i) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요. ");
			practice3();
		}
		
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
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
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
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
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
		}
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
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
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice5();
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		System.out.println("===== "+dan+"단 =====");
		for(int i = 1; i <= 9; ++i) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
	
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan >=1 && dan <=9) {
			for(int i = dan; i<=9; ++i) {
				System.out.println("===== "+ i +"단 =====");
				for(int j = 1; j <= 9; ++j) {
					System.out.println(i + " * " + j + " = " + i*j);
				}	
			}
		}else {
			System.out.println("9 이하의 숫자만 입력해주세요");
		}
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if(dan >=1 && dan <=9) {
			for(int i = dan; i<=9; ++i) {
				System.out.println("===== "+ i +"단 =====");
				for(int j = 1; j <= 9; ++j) {
					System.out.println(i + " * " + j + " = " + i*j);
				}	
			}
		}else {
			System.out.println("9 이하의 숫자만 입력해주세요");
			practice9();
		}
	}
	
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int plus = sc.nextInt();
		
		int sum = num1;
		for(int i = 0; i<10; ++i) {
			System.out.print(sum +" ");
			sum += plus;
			
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자(+, -, *, /, %) : ");
		String op = sc.nextLine();
		
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		switch(op) {
		case "+":
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case "-":
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case "/":
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			break;
		case "%":
			System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
			break;
		
		default:
			break;
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		for(int i = 1; i<=num1; ++i) {
			
			for(int j =0; j <i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		
	}
}
