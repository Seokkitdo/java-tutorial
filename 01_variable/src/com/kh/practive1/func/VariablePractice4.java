package com.kh.practive1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void inputString() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String inputStr = sc.nextLine();
		char firstStr = inputStr.charAt(0);
		char secondStr = inputStr.charAt(1);
		char thirdStr = inputStr.charAt(2);
		
		System.out.println("첫 번쨰 문자 : "+firstStr);
		System.out.println("두 번쨰 문자 : "+secondStr);
		System.out.println("세 번쨰 문자 : "+thirdStr);
	}
}
