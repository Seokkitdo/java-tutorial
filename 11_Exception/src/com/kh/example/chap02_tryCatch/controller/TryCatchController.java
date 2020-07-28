package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	
	public void method1() {
		System.out.println("method1() 호출됨...");
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception으로 잡음");
		} finally {
			//에러발생여부와 상관없이 무조건 실행해야 하는 구문
			System.out.println("예외 여부와 상관없이 무조건 수행");
		}
		System.out.println("method1() 종료됨...");
		
	}
	
	public void method2() throws IOException{
		System.out.println("method2() 호출됨...");
		
//		throw new NullPointerException("null이 들어왔다!!"); //어떤 경우에 에러가 발생했는지 에러메시지와 함께 출력
		//uncheckedException 예외처리 필요 x
		throw new IOException("강제로 IOException을 발생시켰습니다.");
//		System.out.println("method2() 종료됨...");
	}
}
