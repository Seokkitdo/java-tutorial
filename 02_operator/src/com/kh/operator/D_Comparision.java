package com.kh.operator;

public class D_Comparision {
	public void method() {
		int a = 10;
		int b = 25;
		
		boolean result1, result2, result3;
		
		result1 = a == b; //false
		result2 = a <= b; //true
		result3 = a > b; //false
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		// 홀수 짝수 판별
		// 2로 나누었을 때 나머지가 0이면 짝수 1이면 홀수
		
		System.out.println("b가 짝수인가? : " + (b % 2 == 0));
		System.out.println("b가 홀수인가? : " + (b % 2 == 1));
	}
}
