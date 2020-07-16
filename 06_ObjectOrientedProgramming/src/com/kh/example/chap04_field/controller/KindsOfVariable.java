package com.kh.example.chap04_field.controller;

public class KindsOfVariable { // <== 클래스 영역의 시작
	// 클래스 영역에 작성하는 변수 : 필드
	// 필드 == 멤버 변수 == 멤버 필드 == 전역 변수
	
	
	private int globalNum; // 멤버 필드
	
	public void method1(int num) { // <==메소드 영역의 시작
		//				 매개변수도(int num) 지역변수
		int localNum;   //지역 변수
		
//		System.out.println(localNum);
		// The local variable localNum may not have been initialized
		//지역변수는 선언 외에 다시 사용하기 위해서는 반드시 초기화가 되어있어야함
		
		System.out.println(num);
		System.out.println(globalNum);
	} // <== 메소드 영역의 끝
	
	
	public void method2() {
//		System.out.println(localNum); //지역 변수는 해당 지역(선언한 메소드 내) 안에서만 사용가능
		System.out.println(globalNum);
	}
} // <== 클래스 영역의 끝
//클래스 영역은 메소드 영역을 포함하고 있다.