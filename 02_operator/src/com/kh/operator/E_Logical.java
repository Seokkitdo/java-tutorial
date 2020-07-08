package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	public void method1() {
		// 입력한 정수 값이 1~100 사이의 숫자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		boolean result = 1<= num && 100 >= num;
		System.out.println("입력한 숫자가 1과 100 사이에 있나요? " + result);
	}
	
	public void method2() {
		//입력한 문자 값이 대문자인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 문자가 A보다 크거나 같고 Z보다는 작거나 같다.
		boolean result = 'A' <= ch && 'Z' >= ch;
		System.out.println("입력한 값이 대문자 인가요? " + result);
		
		
		System.out.println("계속 하시려면 y 혹은 Y를 입력하세요.");
		System.out.println("계속 하시겠습니까?(Y/y) : ");
		char answer  = sc.nextLine().charAt(0);
		boolean result1 = answer == 'Y' || answer == 'y';
		System.out.println(result1);
		
	}
}
