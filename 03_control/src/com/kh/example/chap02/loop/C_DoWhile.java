package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	public void method1() {
		// 키보드로 문자열 값을 입력 받아 출력 반복 실행
		// exit가 들어올 때까지 반복
		Scanner sc = new Scanner(System.in);
		
		// 1. while
//		String str = " ";
//		String str = null; //NullPointerException 발생
//		while(!str.equals("exit")) {
//			System.out.print("문자열 입력 : ");
//			str = sc.nextLine();
//			System.out.println("내가 입력한 문자열 : " + str);
//		
//		}	
		
		// 2.do~while
		String str = null; //아래쪽에서 str에 값을 대입해주었기 때문에 널포인터오류가 안나온다.
		do {
			System.out.print("문자열 입력 : ");
			str = sc.nextLine();
			System.out.println("내가 입력한 문자열 : " + str);
		} while(!str.equals("exit"));

	}
	
}
