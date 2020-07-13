package com.kh.test.controller;

public class TestController {
	public void methodA() {
		System.out.println("methodA() 호출됨...");
		methodB();
		System.out.println("methodA() 종료됨...");
	}
	
	public void methodB() {
		System.out.println("methodB() 호출됨...");
		methodC();
		System.out.println("methodB() 종료됨...");
	}
	
	public void methodC() {
		
		System.out.println("methodC() 호출됨...");
		System.out.println("methodC() 종료됨..."); //메소드가 종료되면 자신을 호출한 메소드로 돌아간다
		//모든 메소드에는 return이 숨어있기 때문에 자신을 불러준 곳으로 되돌아 간 것.
	}
}
